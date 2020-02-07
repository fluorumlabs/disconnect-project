package com.github.fluorumlabs.disconnect.vaadin;

import com.github.fluorumlabs.disconnect.polymer.types.IntPropertyChangeEvent;
import com.github.fluorumlabs.disconnect.polymer.types.PropertyChangeEvent;
import com.github.fluorumlabs.disconnect.vaadin.elements.AccordionElement;
import com.github.fluorumlabs.disconnect.vaadin.elements.AccordionPanelElement;
import com.github.fluorumlabs.disconnect.vaadin.mixins.HasElementMixin;
import com.github.fluorumlabs.disconnect.zero.component.AbstractComponent;
import com.github.fluorumlabs.disconnect.zero.component.Component;
import com.github.fluorumlabs.disconnect.zero.component.HasComponents;
import com.github.fluorumlabs.disconnect.zero.observable.ObservableEvent;
import js.util.collections.Array;

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
public class VaadinAccordion extends AbstractComponent<AccordionElement> implements
		HasElementMixin<AccordionElement, VaadinAccordion>,
		HasComponents<AccordionElement, VaadinAccordion, Component<?>> {
	public VaadinAccordion() {
		super(AccordionElement.TAGNAME());
	}

	/**
	 * The index of currently opened panel. First panel is opened by
	 * default. Only one panel can be opened at the same time.
	 * Setting null or undefined closes all the accordion panels.
	 */
	public int opened() {
		return getNode().getOpened();
	}

	/**
	 * The index of currently opened panel. First panel is opened by
	 * default. Only one panel can be opened at the same time.
	 * Setting null or undefined closes all the accordion panels.
	 */
	public VaadinAccordion opened(int opened) {
		getNode().setOpened(opened);
		return this;
	}

	/**
	 * The list of <code>&lt;vaadin-accordion-panel&gt;</code> child elements.
	 * It is populated from the elements passed to the light DOM,
	 * and updated dynamically when adding or removing panels.
	 */
	@Nullable
	public Array<AccordionPanelElement> items() {
		return getNode().getItems();
	}

	/**
	 * Fired when the <code>opened</code> property changes.
	 */
	public ObservableEvent<IntPropertyChangeEvent> openedChangedEvent() {
		return createEvent("opened-changed");
	}

	/**
	 * Fired when the <code>items</code> property changes.
	 */
	public ObservableEvent<PropertyChangeEvent<Array<AccordionPanelElement>>> itemsChangedEvent() {
		return createEvent("items-changed");
	}
}
