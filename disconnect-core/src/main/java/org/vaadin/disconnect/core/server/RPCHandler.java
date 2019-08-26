package org.vaadin.disconnect.core.server;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.vaadin.disconnect.core.annotations.AllowClientCalls;
import org.vaadin.disconnect.core.client.RPC;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by Artem Godin on 8/19/2019.
 */
@Controller
public class RPCHandler {
    private final ApplicationContext applicationContext;

    public RPCHandler(@Qualifier("applicationContext") ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    @PostMapping(value = RPC.ENDPOINT, produces = "application/json")
    public void test(HttpServletRequest request, HttpServletResponse response) throws IOException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode unparsedRequest = objectMapper.readTree(request.getReader());

        String serviceClassName = unparsedRequest.get("service").asText();
        String methodName = unparsedRequest.get("method").asText();
        List<JsonNode> nodes = new ArrayList<>();
        unparsedRequest.get("arguments").forEach(nodes::add);

        Class<?> service = Class.forName(serviceClassName);
        Method target = Stream.of(service.getDeclaredMethods())
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

        Object instance = applicationContext.getBean(service);
        Object result = target.invoke(instance, arguments.toArray());

        try (PrintWriter printWriter = response.getWriter()) {
            objectMapper.writeValue(printWriter, result);
        }
    }

}
