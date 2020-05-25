package com.github.fluorumlabs.disconnect.vaadin;

import com.github.fluorumlabs.disconnect.core.annotations.WebComponent;
import com.github.fluorumlabs.disconnect.vaadin.elements.ProgressBarElement;
import com.github.fluorumlabs.disconnect.vaadin.mixins.HasProgressMixin;
import com.github.fluorumlabs.disconnect.vaadin.mixins.HasThemableMixin;
import com.github.fluorumlabs.disconnect.vaadin.types.ThemeVariant;
import com.github.fluorumlabs.disconnect.zero.component.AbstractComponent;
import com.github.fluorumlabs.disconnect.zero.component.HasElement;
import com.github.fluorumlabs.disconnect.zero.component.HasComponents;
import com.github.fluorumlabs.disconnect.zero.component.HasStyle;
import js.extras.JsEnum;

/**
 * <code>&lt;vaadin-progress-bar&gt;</code> is a Web Component for progress bars.
 *
 * <pre><code class="language-html">&lt;vaadin-progress-bar min=&quot;0&quot; max=&quot;1&quot; value=&quot;0.5&quot;
 * &gt;
 * &lt;/vaadin-progress-bar&gt;
 * </code></pre>
 * <h3>Styling</h3>
 * The following shadow DOM parts are available for styling:
 *
 * <table>
 * <thead>
 * <tr><th>Part name</th><th>Description</th></tr>
 * </thead>
 * <tbody>
 * <tr><td><code>bar</code></td><td>Progress-bar's background</td></tr>
 * <tr><td><code>value</code></td><td>Progress-bar's foreground</td></tr>
 * </tbody>
 * </table>
 * See
 * <a href="https://github.com/vaadin/vaadin-themable-mixin/wiki">ThemableMixin – how to apply styles for shadow parts</a>
 * <p>
 * The following custom properties are available:
 *
 * <table>
 * <thead>
 * <tr><th>Custom property</th><th>Description</th><th>Default</th></tr>
 * </thead>
 * <tbody>
 * <tr><td><code>--vaadin-progress-value</code></td><td>current progress value (between 0 and 1)</td><td>0</td></tr>
 * </tbody>
 * </table>
 * The following state attributes are available for styling:
 *
 * <table>
 * <thead>
 * <tr><th>Attribute</th><th>Description</th><th>Part name</th></tr>
 * </thead>
 * <tbody>
 * <tr><td><code>indeterminate</code></td><td>Set to an indeterminate progress bar</td><td>:host</td></tr>
 * </tbody>
 * </table>
 */
@WebComponent
public class ProgressBar extends AbstractComponent<ProgressBarElement>
		implements HasProgressMixin<ProgressBarElement, ProgressBar>,
		HasThemableMixin<ProgressBar.Variant, ProgressBarElement, ProgressBar>,
		HasStyle<ProgressBarElement, ProgressBar>, HasComponents<ProgressBarElement, ProgressBar, HasElement<?>> {
	public ProgressBar() {
		super(ProgressBarElement.TAGNAME());
	}

	public abstract static class Variant extends ThemeVariant {
		public static final Variant CONTRAST = JsEnum.of("contrast");
		public static final Variant ERROR = JsEnum.of("error");
		public static final Variant SUCCESS = JsEnum.of("success");
	}

}
