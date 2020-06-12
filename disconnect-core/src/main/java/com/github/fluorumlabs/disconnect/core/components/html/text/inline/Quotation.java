package com.github.fluorumlabs.disconnect.core.components.html.text.inline;

import com.github.fluorumlabs.disconnect.core.annotations.Tag;
import com.github.fluorumlabs.disconnect.core.components.Component;
import com.github.fluorumlabs.disconnect.core.components.html.text.HtmlQuoteComponent;

@Tag("q")
public class Quotation extends HtmlQuoteComponent {
    public Quotation() {
        super();
    }

    public Quotation(String textContent) {
        super(textContent);
    }

    public Quotation(Component<?>... components) {
        super(components);
    }
}
