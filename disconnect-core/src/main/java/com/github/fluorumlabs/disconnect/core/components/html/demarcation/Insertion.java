package com.github.fluorumlabs.disconnect.core.components.html.demarcation;

import com.github.fluorumlabs.disconnect.core.annotations.Tag;
import com.github.fluorumlabs.disconnect.core.components.Component;


@Tag("ins")
public class Insertion extends Modification {
    public Insertion(String textContent) {
        super(textContent);
    }

    public Insertion(Component<?>... components) {
        super(components);
    }

    public Insertion() {
        super();
    }
}
