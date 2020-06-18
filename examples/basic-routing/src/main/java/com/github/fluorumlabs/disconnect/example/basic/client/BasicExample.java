package com.github.fluorumlabs.disconnect.example.basic.client;

import com.github.fluorumlabs.disconnect.core.Application;
import com.github.fluorumlabs.disconnect.core.annotations.EntryPoint;
import com.github.fluorumlabs.disconnect.core.router.Router;

@EntryPoint
public class BasicExample implements Runnable {

    public void run() {
        Application.render(Router.getDefault());
    }
}
