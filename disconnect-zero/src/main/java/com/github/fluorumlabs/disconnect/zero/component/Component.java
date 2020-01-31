package com.github.fluorumlabs.disconnect.zero.component;

import js.web.dom.Element;


public interface Component<X extends Element> extends EventInitializer<X> {
    X getElement();

    Element render();
}
