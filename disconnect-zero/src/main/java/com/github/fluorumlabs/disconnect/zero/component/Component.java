package com.github.fluorumlabs.disconnect.zero.component;

import js.web.dom.EventTarget;
import js.web.dom.Node;


public interface Component<X extends EventTarget & Node> extends EventInitializer<X> {
    X getNode();

    Node render();
}
