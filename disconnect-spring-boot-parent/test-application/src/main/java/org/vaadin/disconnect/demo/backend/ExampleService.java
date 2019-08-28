package org.vaadin.disconnect.demo.backend;

import org.vaadin.disconnect.core.annotations.AllowClientCalls;
import org.springframework.stereotype.Service;
import org.vaadin.disconnect.core.annotations.EnableCache;

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

    @AllowClientCalls(method = AllowClientCalls.Method.GET)
    @EnableCache(strategy = EnableCache.CachingStrategy.CACHE_FIRST)
    public void showState(Boolean state) {
        System.out.println(state);
    }

}
