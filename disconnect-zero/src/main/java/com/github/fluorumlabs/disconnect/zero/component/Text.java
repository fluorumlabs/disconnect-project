package com.github.fluorumlabs.disconnect.zero.component;

import static js.web.dom.Window.DOCUMENT;


public class Text extends AbstractComponent {
    public Text(String textContent) {
        super(DOCUMENT.createTextNode(textContent));
    }

    public Text text(String textContent) {
        getNode().setNodeValue(textContent);
        return this;
    }
}
