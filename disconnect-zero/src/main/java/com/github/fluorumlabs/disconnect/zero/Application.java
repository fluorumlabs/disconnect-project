package com.github.fluorumlabs.disconnect.zero;

import com.github.fluorumlabs.disconnect.zero.component.AbstractComponent;

import static js.web.dom.Window.DOCUMENT;


public final class Application extends LazyEventInitializer {
    private final static Application INSTANCE = new Application();

    public void render(AbstractComponent component) {
        DOCUMENT.appendChild(component.render());
    }


    private Application() {
    }
}
