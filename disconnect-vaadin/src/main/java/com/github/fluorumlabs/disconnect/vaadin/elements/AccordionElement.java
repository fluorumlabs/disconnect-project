package com.github.fluorumlabs.disconnect.vaadin.elements;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.vaadin.Vaadin;
import com.github.fluorumlabs.disconnect.vaadin.elements.mixins.ElementMixin;
import com.github.fluorumlabs.disconnect.vaadin.elements.mixins.ThemableMixin;
import js.util.collections.Array;
import js.web.dom.HTMLElement;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * <code>&lt;vaadin-accordion&gt;</code> is a Web Component implementing accordion widget —
 * a vertically stacked set of expandable panels. The component should be
 * used as a wrapper for two or more <code>&lt;vaadin-accordion-panel&gt;</code> components.
 * <p>
 * Panel headings function as controls that enable users to open (expand)
 * or hide (collapse) their associated sections of content. The user can
 * toggle panels by mouse click, Enter and Space keys.
 * <p>
 * Only one panel can be opened at a time, opening a new one forces
 * previous panel to close and hide its content.
 *
 * <pre><code>&lt;vaadin-accordion&gt;
 *   &lt;vaadin-accordion-panel&gt;
 *     &lt;div slot=&quot;summary&quot;&gt;Panel 1&lt;/div&gt;
 *     This panel is opened, so the text is visible by default.
 *   &lt;/vaadin-accordion-panel&gt;
 *   &lt;vaadin-accordion-panel&gt;
 *     &lt;div slot=&quot;summary&quot;&gt;Panel 2&lt;/div&gt;
 *     After opening this panel, the first one becomes closed.
 *   &lt;/vaadin-accordion-panel&gt;
 * &lt;/vaadin-accordion&gt;
 * </code></pre>
 * <h3>Styling</h3>
 * See the <a href="#/elements/vaadin-accordion-panel"><code>&lt;vaadin-accordion-panel&gt;</code></a>
 * documentation for the available state attributes and stylable shadow parts.
 *
 * <strong>Note:</strong> You can apply the theme to <code>&lt;vaadin-accordion&gt;</code> component itself,
 * especially by using the following CSS selector:
 *
 * <pre><code>:host ::slotted(vaadin-accordion-panel) {
 *   margin-bottom: 5px;
 * }
 * </code></pre>
 * See
 * <a href="https://github.com/vaadin/vaadin-themable-mixin/wiki">ThemableMixin – how to apply styles for shadow parts</a>
 */
@NpmPackage(
		name = "@vaadin/vaadin",
		version = Vaadin.VERSION
)
@Import(
		module = "@vaadin/vaadin-accordion/vaadin-accordion.js"
)
public interface AccordionElement extends HTMLElement, ElementMixin, ThemableMixin {
	static String TAGNAME() {
		return "vaadin-accordion";
	}

	/**
	 * The index of currently opened panel. First panel is opened by
	 * default. Only one panel can be opened at the same time.
	 * Setting null or undefined closes all the accordion panels.
	 */
	@JSProperty
	int getOpened();

	/**
	 * The index of currently opened panel. First panel is opened by
	 * default. Only one panel can be opened at the same time.
	 * Setting null or undefined closes all the accordion panels.
	 */
	@JSProperty
	void setOpened(int opened);

	/**
	 * The list of <code>&lt;vaadin-accordion-panel&gt;</code> child elements.
	 * It is populated from the elements passed to the light DOM,
	 * and updated dynamically when adding or removing panels.
	 */
	@Nullable
	@JSProperty
	Array<AccordionPanelElement> getItems();
}
