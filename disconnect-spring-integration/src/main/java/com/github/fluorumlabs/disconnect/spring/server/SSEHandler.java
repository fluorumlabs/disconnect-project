package com.github.fluorumlabs.disconnect.spring.server;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.fluorumlabs.disconnect.core.RPC;
import com.github.fluorumlabs.disconnect.core.annotations.AllowClientCalls;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import java.util.concurrent.*;
import java.util.stream.Stream;

import static com.github.fluorumlabs.disconnect.core.internals.CamelCaseUtils.toCamelCase;


@Controller
public class SSEHandler {
    private final ApplicationContext applicationContext;
    private final CopyOnWriteArrayList<SseEmitter> emitters = new CopyOnWriteArrayList<>();
    private final ScheduledExecutorService keepAliveExecutor = Executors.newScheduledThreadPool(1);
    private final Logger logger = LoggerFactory.getLogger(SSEHandler.class);

    public SSEHandler(@Qualifier("applicationContext") ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
        keepAliveExecutor.scheduleAtFixedRate(this::sendKeepAliveMarkers, 15, 15, TimeUnit.SECONDS);
    }

    @GetMapping(value = RPC.ENDPOINT + "/stream/{service}/{method}", produces = "text/event-stream")
    public SseEmitter sse(@PathVariable("service") String kebabService,
                          @PathVariable("method") String kebabMethod,
                          @RequestParam("payload") String payload) throws IOException, InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode unparsedRequest = objectMapper.readTree(Base64.getUrlDecoder().decode(payload));

        return handleSse(kebabService, kebabMethod, objectMapper, unparsedRequest);
    }

    private SseEmitter handleSse(String kebabService, String kebabMethod,
                                 ObjectMapper objectMapper, JsonNode unparsedRequest) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, IOException {
        String serviceBean = toCamelCase(kebabService);
        String methodName = toCamelCase(kebabMethod);
        List<JsonNode> nodes = new ArrayList<>();
        unparsedRequest.forEach(nodes::add);

        Object instance = applicationContext.getBean(serviceBean);

        Class<?> service = instance.getClass();
        Method target = Stream.of(service.getMethods())
                .filter(method -> method.getName().equals(methodName))
                .findFirst()
                .orElseThrow(NoSuchMethodException::new);

        if (AnnotationUtils.findAnnotation(target, AllowClientCalls.class)==null) {
            throw new IllegalAccessException();
        }

        if (!Stream.class.isAssignableFrom(target.getReturnType())) {
            throw new IllegalArgumentException("SSE method should return Stream");
        }

        List<Object> arguments = new ArrayList<>();
        for (int i = 0; i < target.getParameterTypes().length; i++) {
            Class<?> type = target.getParameterTypes()[i];
            arguments.add(objectMapper.treeToValue(nodes.get(i), type));
        }

        SseEmitter emitter = new SseEmitter(-1L);
        ExecutorService executor = Executors.newSingleThreadExecutor();

        executor.execute(() -> {
            RPCResultHolder errorHolder = new RPCResultHolder();
            try(Stream<Object> resultStream = (Stream<Object>) target.invoke(instance, arguments.toArray())) {
                resultStream.map(RPCResultHolder::new).forEach(o -> {
                    try {
                        emitter.send(SseEmitter.event().data(o, MediaType.APPLICATION_JSON_UTF8));
                    } catch (IOException e) {
                        throw new EmitterException();
                    }
                });
                emitter.complete();
            } catch (EmitterException ignore) {
                // already handled
            } catch (Exception e) {
                logger.error("Exception during SSE", e);
                errorHolder.exceptionClass = e.getClass().getName();
                errorHolder.exceptionMessage = e.getMessage();
                try {
                    emitter.send(SseEmitter.event().data(errorHolder, MediaType.APPLICATION_JSON_UTF8));
                    emitter.complete();
                } catch (Exception ignore) {
                    // ignore;
                }
            }
        });
        executor.shutdown();

        emitters.add(emitter);

        emitter.onCompletion(() -> emitters.remove(emitter));
        emitter.onTimeout(() -> emitters.remove(emitter));

        return emitter;
    }


    static class EmitterException extends RuntimeException {}

    private void sendKeepAliveMarkers() {
        List<SseEmitter> deadEmitters = new ArrayList<>();
        emitters.forEach(emitter -> {
            try {
                emitter.send(SseEmitter.event().comment(""));
            } catch (IOException e) {
                deadEmitters.add(emitter);
            }
        });
        emitters.removeAll(deadEmitters);
    }

}
