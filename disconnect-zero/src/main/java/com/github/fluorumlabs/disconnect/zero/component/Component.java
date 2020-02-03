package com.github.fluorumlabs.disconnect.zero.component;

import js.web.dom.Node;


public interface Component<X extends Node> extends EventInitializer<X> {
    X getNode();

    Node getRenderedNode();
}
