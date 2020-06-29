package com.github.fluorumlabs.disconnect.vaadin;

import com.github.fluorumlabs.disconnect.core.annotations.CustomElement;
import com.github.fluorumlabs.disconnect.core.components.Component;
import com.github.fluorumlabs.disconnect.core.components.HtmlComponent;
import com.github.fluorumlabs.disconnect.vaadin.theme.ThemeVariant;
import com.github.fluorumlabs.disconnect.vaadin.theme.Themeable;
import js.extras.JsEnum;
import js.lang.external.vaadin.vaadin_ordered_layout.VerticalLayoutElement;

/**
 * Created by Artem Godin on 6/26/2020.
 */
@CustomElement(tagName = "vaadin-vertical-layout", external = true)
public class VerticalLayout extends HtmlComponent<VerticalLayoutElement> implements Themeable<VerticalLayout.Variant, VerticalLayoutElement> {
    public VerticalLayout() {
        super();
    }

    public VerticalLayout(String textContent) {
        super(textContent);
    }

    public VerticalLayout(Component<?>... components) {
        super(components);
    }

    public abstract static class Variant extends ThemeVariant {
        public static final Variant MARGIN = JsEnum.of("margin");
        public static final Variant PADDING = JsEnum.of("padding");
        public static final Variant SPACING_XS = JsEnum.of("spacing-xs");
        public static final Variant SPACING_S = JsEnum.of("spacing-s");
        public static final Variant SPACING = JsEnum.of("spacing");
        public static final Variant SPACING_L = JsEnum.of("spacing-l");
        public static final Variant SPACING_XL = JsEnum.of("spacing-xl");
    }
}
