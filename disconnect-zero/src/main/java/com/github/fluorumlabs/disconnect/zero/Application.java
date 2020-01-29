package com.github.fluorumlabs.disconnect.zero;

import com.github.fluorumlabs.disconnect.zero.component.Component;

import static js.web.dom.Window.WINDOW;


public final class Application extends LazyEventInitializer {
    private final static Application INSTANCE = new Application();

    public void render(Component component) {
        WINDOW.getDocument().appendChild(component.render());
    }


    private Application() {
    }
}
