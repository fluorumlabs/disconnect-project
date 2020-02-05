package com.github.fluorumlabs.disconnect.spring.server;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.fluorumlabs.disconnect.core.RPC;
import com.github.fluorumlabs.disconnect.core.annotations.AllowClientCalls;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;


@Controller
public class RPCHandler {
    private final ApplicationContext applicationContext;

    public RPCHandler(@Qualifier("applicationContext") ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    @GetMapping(value = RPC.ENDPOINT + "/{service}/{method}", produces = "application/json")
    public void rpc(@PathVariable("service") String kebabService,
                    @PathVariable("method") String kebabMethod,
                    @RequestParam("payload") String payload,
                    HttpServletResponse response) throws IOException, InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode unparsedRequest = objectMapper.readTree(Base64.getUrlDecoder().decode(payload));

        handleRpc(kebabService, kebabMethod, response, objectMapper, unparsedRequest);
    }

    @PostMapping(value = RPC.ENDPOINT + "/{service}/{method}", produces = "application/json")
    public void rpc(@PathVariable("service") String kebabService,
                    @PathVariable("method") String kebabMethod,
                    HttpServletRequest request,
                    HttpServletResponse response) throws IOException, InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode unparsedRequest = objectMapper.readTree(request.getReader());

        handleRpc(kebabService, kebabMethod, response, objectMapper, unparsedRequest);
    }

    private void handleRpc(String kebabService, String kebabMethod, HttpServletResponse response, ObjectMapper objectMapper, JsonNode unparsedRequest) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, IOException {
        String serviceBean = toCamelCase(kebabService);
        String methodName = toCamelCase(kebabMethod);
        List<JsonNode> nodes = new ArrayList<>();
        unparsedRequest.get("arguments").forEach(nodes::add);

        Object instance = applicationContext.getBean(serviceBean);

        Class<?> service = instance.getClass();
        Method target = Stream.of(service.getMethods())
                .filter(method -> method.getName().equals(methodName))
                .findFirst()
                .orElseThrow(NoSuchMethodException::new);

        if (target.getAnnotation(AllowClientCalls.class)==null) {
            throw new IllegalAccessException();
        }

        List<Object> arguments = new ArrayList<>();
        for (int i = 0; i < target.getParameterTypes().length; i++) {
            Class<?> type = target.getParameterTypes()[i];
            arguments.add(objectMapper.treeToValue(nodes.get(i), type));
        }

        Object result = target.invoke(instance, arguments.toArray());

        try (PrintWriter printWriter = response.getWriter()) {
            objectMapper.writeValue(printWriter, result);
        }
    }

    private static final Pattern KEBAB_SPLIT = Pattern.compile("-");

    private static String toCamelCase(String kebabCase) {
        return StringUtils.uncapitalize(Stream.of(KEBAB_SPLIT.split(kebabCase))
                .map(StringUtils::capitalize)
                .collect(Collectors.joining()));
    }

}