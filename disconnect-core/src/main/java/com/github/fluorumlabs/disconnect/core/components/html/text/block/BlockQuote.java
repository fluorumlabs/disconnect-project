package com.github.fluorumlabs.disconnect.core.components.html.text.block;

import com.github.fluorumlabs.disconnect.core.annotations.Tag;
import com.github.fluorumlabs.disconnect.core.components.Component;
import com.github.fluorumlabs.disconnect.core.components.html.text.HtmlQuoteComponent;

@Tag("blockquote")
public class BlockQuote extends HtmlQuoteComponent {
    public BlockQuote() {
        super();
    }

    public BlockQuote(String textContent) {
        super(textContent);
    }

    public BlockQuote(Component<?>... components) {
        super(components);
    }
}
