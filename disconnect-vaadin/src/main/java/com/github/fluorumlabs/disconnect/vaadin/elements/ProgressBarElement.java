package com.github.fluorumlabs.disconnect.vaadin.elements;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.vaadin.Vaadin;
import com.github.fluorumlabs.disconnect.vaadin.elements.mixins.ProgressMixin;
import com.github.fluorumlabs.disconnect.vaadin.elements.mixins.ThemableMixin;
import js.web.dom.HTMLElement;

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
@NpmPackage(
		name = "@vaadin/vaadin",
		version = Vaadin.VERSION
)
@Import(

		module = "@vaadin/vaadin-progress-bar/vaadin-progress-bar.js"
)
public interface ProgressBarElement extends HTMLElement, ProgressMixin, ThemableMixin {
	static String TAGNAME() {
		return "vaadin-progress-bar";
	}
}
