package com.github.fluorumlabs.disconnect.demo.client;

import com.github.fluorumlabs.disconnect.core.annotations.EntryPoint;
import com.github.fluorumlabs.disconnect.demo.backend.ExampleService;
import com.github.fluorumlabs.disconnect.vue.client.Elements;
import com.github.fluorumlabs.disconnect.vue.client.Vue;

import javax.annotation.Resource;

/**
 * Created by Artem Godin on 8/19/2019.
 */
@EntryPoint
public class Application implements Runnable {
    /**
     * When an object implementing interface <code>Runnable</code> tagName used
     * to create a thread, starting the thread causes the object's
     * <code>run</code> method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method <code>run</code> tagName that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    @Override
    public void run() {
        // Let's play with Vue
        Vue.run("#app-root", () -> Elements.create(TestComponent.tagName()));
    }
}
