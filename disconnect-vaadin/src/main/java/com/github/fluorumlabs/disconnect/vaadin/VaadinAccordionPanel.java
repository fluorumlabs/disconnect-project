package com.github.fluorumlabs.disconnect.vaadin;

import com.github.fluorumlabs.disconnect.vaadin.elements.AccordionPanelElement;
import com.github.fluorumlabs.disconnect.zero.component.AbstractComponent;
import com.github.fluorumlabs.disconnect.zero.component.Component;
import com.github.fluorumlabs.disconnect.zero.component.HasComponents;

/**
 * The accordion panel element.
 * <p>
 * ### Styling
 * <p>
 * The following shadow DOM parts are exposed for styling:
 * <p>
 * Part name        | Description
 * -----------------|----------------
 * `summary`        | The element used to open and close collapsible content.
 * `toggle`         | The element used as indicator, can represent an icon.
 * `summary-content`| The wrapper for the slotted summary content.
 * `content`        | The wrapper for the collapsible panel content.
 * <p>
 * The following attributes are exposed for styling:
 * <p>
 * Attribute    | Description
 * -------------| -----------
 * `opened`     | Set when the collapsible content is expanded and visible.
 * `disabled`   | Set when the element is disabled.
 * `focus-ring` | Set when the element is focused using the keyboard.
 * `focused`    | Set when the element is focused.
 * <p>
 * See [ThemableMixin – how to apply styles for shadow parts](https://github.com/vaadin/vaadin-themable-mixin/wiki)
 */
public class VaadinAccordionPanel extends AbstractComponent<AccordionPanelElement>
		implements HasComponents<AccordionPanelElement, VaadinAccordionPanel, Component<?>> {
	public VaadinAccordionPanel() {
		super("vaadin-accordion-panel");
	}
}
