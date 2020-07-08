package com.github.fluorumlabs.disconnect.vaadin.orderedlayout;

import com.github.fluorumlabs.disconnect.core.annotations.CustomElement;
import com.github.fluorumlabs.disconnect.core.components.Component;
import com.github.fluorumlabs.disconnect.core.components.HtmlComponent;
import com.github.fluorumlabs.disconnect.core.utils.LowerCase;
import com.github.fluorumlabs.disconnect.vaadin.theme.Themable;
import js.lang.Unknown;
import js.lang.external.vaadin.orderedlayout.ScrollerElement;
import js.util.JS;

/**
 * <code>&lt;vaadin-scroller&gt;</code> provides a simple way to enable scrolling when its content is overflowing.
 *
 * <pre><code>&lt;vaadin-scroller&gt;
 *    &lt;div&gt;Content&lt;/div&gt;
 * &lt;/vaadin-scroller&gt;
 * </code></pre>
 * <strong>Mixins:</strong> ElementMixin, ThemableMixin, ElementMixin
 */
@CustomElement(tagName = "vaadin-scroller", external = true)
public class Scroller extends HtmlComponent<ScrollerElement> implements Themable<ScrollerElement> {

    public Scroller() {
    }

    public Scroller(String textContent) {
        super(textContent);
    }

    public Scroller(Component<?>... components) {
        super(components);
    }

    // !wca! get scrollDirection: !ScrollerScrollDirection
    /**
     * This property indicates the scroll direction. Supported values are <code>vertical</code>, <code>horizontal</code>, <code>none</code>.
     * When <code>scrollDirection</code> is undefined scrollbars will be shown in both directions.
     */
    public ScrollDirection getScrollDirection() {
        if (JS.nullify(getElement().getScrollDirection()) == null) {
            return ScrollDirection.BOTH;
        } else {
            return LowerCase.parse(ScrollDirection.class, getElement().getScrollDirection().stringValue());
        }
    }

    // !wca! set scrollDirection: !ScrollerScrollDirection
    /**
     * This property indicates the scroll direction. Supported values are <code>vertical</code>, <code>horizontal</code>, <code>none</code>.
     * When <code>scrollDirection</code> is undefined scrollbars will be shown in both directions.
     */
    public void setScrollDirection(ScrollDirection value) {
        if (value == ScrollDirection.BOTH) {
            getElement().setScrollDirection(Unknown.undefined());
        } else {
            getElement().setScrollDirection(Unknown.of(LowerCase.of(value)));
        }
    }

    // !wca! observe scrollDirection: !ScrollerScrollDirection

    // !wca! get theme: string | null | undefined

    // !wca! observe theme: string | null | undefined

    public enum ScrollDirection {
        HORIZONTAL, VERTICAL, BOTH, NONE
    }
}
