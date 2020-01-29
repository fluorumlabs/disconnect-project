package com.github.fluorumlabs.disconnect.zero.component;

import static js.web.dom.Window.WINDOW;


public class Text extends Component {
    public Text(String textContent) {
        super(WINDOW.getDocument().createTextNode(textContent));
    }

    public Text text(String textContent) {
        getNode().setNodeValue(textContent);
        return this;
    }
}
