package com.github.fluorumlabs.disconnect.core.components.html.demarcation;

import com.github.fluorumlabs.disconnect.core.annotations.Tag;
import com.github.fluorumlabs.disconnect.core.components.Component;

@Tag("del")
public class Deletion extends Modification {
    public Deletion(String textContent) {
        super(textContent);
    }

    public Deletion(Component<?>... components) {
        super(components);
    }

    public Deletion() {
        super();
    }
}
