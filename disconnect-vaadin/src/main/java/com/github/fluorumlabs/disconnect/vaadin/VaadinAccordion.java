package com.github.fluorumlabs.disconnect.vaadin;

import com.github.fluorumlabs.disconnect.polymer.types.IntPropertyChangeEvent;
import com.github.fluorumlabs.disconnect.polymer.types.PropertyChangeEvent;
import com.github.fluorumlabs.disconnect.vaadin.elements.AccordionElement;
import com.github.fluorumlabs.disconnect.vaadin.elements.AccordionPanelElement;
import com.github.fluorumlabs.disconnect.vaadin.mixins.HasElementMixin;
import com.github.fluorumlabs.disconnect.vaadin.mixins.HasThemableMixin;
import com.github.fluorumlabs.disconnect.zero.component.AbstractComponent;
import com.github.fluorumlabs.disconnect.zero.component.Component;
import com.github.fluorumlabs.disconnect.zero.component.HasComponents;
import com.github.fluorumlabs.disconnect.zero.observable.ObservableEvent;
import js.util.collections.Array;

import javax.annotation.Nullable;

/**
 * `<vaadin-accordion>` is a Web Component implementing accordion widget —
 * a vertically stacked set of expandable panels. The component should be
 * used as a wrapper for two or more `<vaadin-accordion-panel>` components.
 * <p>
 * Panel headings function as controls that enable users to open (expand)
 * or hide (collapse) their associated sections of content. The user can
 * toggle panels by mouse click, Enter and Space keys.
 * <p>
 * Only one panel can be opened at a time, opening a new one forces
 * previous panel to close and hide its content.
 * <p>
 * ```
 * <vaadin-accordion>
 * <vaadin-accordion-panel>
 * <div slot="summary">Panel 1</div>
 * This panel is opened, so the text is visible by default.
 * </vaadin-accordion-panel>
 * <vaadin-accordion-panel>
 * <div slot="summary">Panel 2</div>
 * After opening this panel, the first one becomes closed.
 * </vaadin-accordion-panel>
 * </vaadin-accordion>
 * ```
 * <p>
 * ### Styling
 * <p>
 * See the [`<vaadin-accordion-panel>`](#/elements/vaadin-accordion-panel)
 * documentation for the available state attributes and stylable shadow parts.
 * <p>
 * **Note:** You can apply the theme to `<vaadin-accordion>` component itself,
 * especially by using the following CSS selector:
 * <p>
 * ```
 * :host ::slotted(vaadin-accordion-panel) {
 * margin-bottom: 5px;
 * }
 * ```
 * <p>
 * See [ThemableMixin – how to apply styles for shadow parts](https://github.com/vaadin/vaadin-themable-mixin/wiki)
 */
public class VaadinAccordion extends AbstractComponent<AccordionElement> implements
		HasElementMixin<AccordionElement, VaadinAccordion>,
		HasThemableMixin<AccordionElement, VaadinAccordion>,
		HasComponents<AccordionElement, VaadinAccordion, Component<?>> {
	public VaadinAccordion() {
		super("vaadin-accordion");
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
	 * The list of `<vaadin-accordion-panel>` child elements.
	 * It is populated from the elements passed to the light DOM,
	 * and updated dynamically when adding or removing panels.
	 */
	@Nullable
	public Array<AccordionPanelElement> items() {
		return getNode().getItems();
	}

	/**
	 * Fired when the `opened` property changes.
	 */
	public ObservableEvent<IntPropertyChangeEvent> openedChangedEvent() {
		return createEvent("opened-changed");
	}

	/**
	 * Fired when the `items` property changes.
	 */
	public ObservableEvent<PropertyChangeEvent<Array<AccordionPanelElement>>> itemsChangedEvent() {
		return createEvent("items-changed");
	}
}
