package com.github.fluorumlabs.disconnect.vaadin;

import com.github.fluorumlabs.disconnect.core.annotations.WebComponent;
import com.github.fluorumlabs.disconnect.vaadin.elements.HorizontalLayoutElement;
import com.github.fluorumlabs.disconnect.vaadin.mixins.HasThemableMixin;
import com.github.fluorumlabs.disconnect.vaadin.types.ThemeVariant;
import com.github.fluorumlabs.disconnect.zero.component.AbstractComponent;
import com.github.fluorumlabs.disconnect.core.components.HasElement;
import com.github.fluorumlabs.disconnect.zero.component.HasComponents;
import com.github.fluorumlabs.disconnect.zero.component.HasStyle;
import js.extras.JsEnum;

/**
 * <code>&lt;vaadin-horizontal-layout&gt;</code> provides a simple way to horizontally align your HTML elements.
 *
 * <pre><code>&lt;vaadin-horizontal-layout&gt;
 *   &lt;div&gt;Item 1&lt;/div&gt;
 *   &lt;div&gt;Item 2&lt;/div&gt;
 * &lt;/vaadin-horizontal-layout&gt;
 * </code></pre>
 * <h3>Built-in Theme Variations</h3>
 * <code>&lt;vaadin-horizontal-layout&gt;</code> supports the following theme variations:
 *
 * <table>
 * <thead>
 * <tr><th>Theme variation</th><th>Description</th></tr>
 * </thead>
 * <tbody>
 * <tr><td><code>theme=&quot;margin&quot;</code></td><td>Applies the default amount of CSS margin for the host
 * element (specified by the theme)</td></tr>
 * <tr><td><code>theme=&quot;padding&quot;</code></td><td>Applies the default amount of CSS padding for the host
 * element (specified by the theme)</td></tr>
 * <tr><td><code>theme=&quot;spacing&quot;</code></td><td>Applies the default amount of CSS margin between items
 * (specified by the theme)</td></tr>
 * </tbody>
 * </table>
 */
@WebComponent
public class HorizontalLayout extends AbstractComponent<HorizontalLayoutElement>
		implements HasThemableMixin<HorizontalLayout.Variant, HorizontalLayoutElement, HorizontalLayout>,
		HasStyle<HorizontalLayoutElement, HorizontalLayout>, HasComponents<HorizontalLayoutElement, HorizontalLayout, HasElement<?>> {
	public HorizontalLayout() {
		super(HorizontalLayoutElement.TAGNAME());
	}

	public HorizontalLayout(HasElement<?>... components) {
		this();
		add(components);
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
