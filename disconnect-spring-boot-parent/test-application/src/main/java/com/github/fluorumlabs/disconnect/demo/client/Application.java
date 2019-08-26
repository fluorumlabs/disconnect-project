package com.github.fluorumlabs.disconnect.demo.client;

import com.github.fluorumlabs.disconnect.core.annotations.EntryPoint;
import com.github.fluorumlabs.disconnect.preact.client.Elements;
import com.github.fluorumlabs.disconnect.preact.client.React;

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
        React.render("app-root", () -> {
            return Elements.create(TestComponent.CLASS);
        });
    }
}
