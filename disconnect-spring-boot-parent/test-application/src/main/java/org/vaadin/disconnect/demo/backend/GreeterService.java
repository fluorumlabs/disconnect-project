package org.vaadin.disconnect.demo.backend;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.vaadin.disconnect.core.annotations.AllowClientCalls;


@Service
public class GreeterService {
    private static final Logger log = LoggerFactory.getLogger(GreeterService.class);

    @AllowClientCalls
    public String hello(String userName) {
        log.info("Received message from client: [" + userName + "]");
        sleep(1000);
        return "Hello " + userName + ", I'm Java " + System.getProperty("java.version");
    }

    private void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException ignore) {
            // ignore
        }
    }
}
