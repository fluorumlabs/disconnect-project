package org.vaadin.disconnect.demo.backend;

import org.vaadin.disconnect.core.annotations.AllowClientCalls;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by Artem Godin on 8/20/2019.
 */
@Service
public class ExampleService {
    @AllowClientCalls
    public String getCurrentDate() {
        return new Date().toString();
    }
}
