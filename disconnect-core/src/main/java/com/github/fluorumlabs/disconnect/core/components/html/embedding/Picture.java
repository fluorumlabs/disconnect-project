package com.github.fluorumlabs.disconnect.core.components.html.embedding;

import com.github.fluorumlabs.disconnect.core.annotations.Tag;
import com.github.fluorumlabs.disconnect.core.components.Component;
import com.github.fluorumlabs.disconnect.core.components.HtmlComponent;
import js.web.dom.HTMLPictureElement;

@Tag("picture")
public class Picture extends HtmlComponent<HTMLPictureElement> {
    public Picture() {
        super();
    }

    public Picture(Component<?>... components) {
        super(components);
    }
}
