package com.github.fluorumlabs.disconnect.core.components.html;

import com.github.fluorumlabs.disconnect.core.annotations.Tag;
import com.github.fluorumlabs.disconnect.core.components.Component;
import com.github.fluorumlabs.disconnect.core.components.HtmlComponent;
import com.github.fluorumlabs.disconnect.core.components.WindowEvents;
import js.web.dom.HTMLBodyElement;

@Tag("body")
public class Body extends HtmlComponent<HTMLBodyElement> implements WindowEvents<HTMLBodyElement> {
    public Body() {
        super();
    }

    public Body(String textContent) {
        super(textContent);
    }

    public Body(Component<?>... components) {
        super(components);
    }
}
