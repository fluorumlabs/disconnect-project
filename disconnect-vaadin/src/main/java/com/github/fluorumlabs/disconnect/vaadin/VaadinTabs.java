package com.github.fluorumlabs.disconnect.vaadin;

import com.github.fluorumlabs.disconnect.vaadin.constants.Orientation;
import com.github.fluorumlabs.disconnect.vaadin.elements.TabsElement;
import com.github.fluorumlabs.disconnect.vaadin.mixins.HasElementMixin;
import com.github.fluorumlabs.disconnect.vaadin.mixins.HasListMixin;
import com.github.fluorumlabs.disconnect.vaadin.mixins.HasThemableMixin;
import com.github.fluorumlabs.disconnect.zero.component.AbstractComponent;
import com.github.fluorumlabs.disconnect.zero.component.Component;
import com.github.fluorumlabs.disconnect.zero.component.HasComponents;

import javax.annotation.Nullable;

/**
 * `<vaadin-tabs>` is a Web Component for easy switching between different views.
 * <p>
 * ```
 * <vaadin-tabs selected="4">
 * <vaadin-tab>Page 1</vaadin-tab>
 * <vaadin-tab>Page 2</vaadin-tab>
 * <vaadin-tab>Page 3</vaadin-tab>
 * <vaadin-tab>Page 4</vaadin-tab>
 * </vaadin-tabs>
 * ```
 * <p>
 * ### Styling
 * <p>
 * The following shadow DOM parts are available for styling:
 * <p>
 * Part name         | Description
 * ------------------|--------------------------------------
 * `back-button`     | Button for moving the scroll back
 * `tabs`            | The tabs container
 * `forward-button`  | Button for moving the scroll forward
 * <p>
 * The following state attributes are available for styling:
 * <p>
 * Attribute  | Description | Part name
 * -----------|-------------|------------
 * `orientation` | Tabs disposition, valid values are `horizontal` and `vertical`. | :host
 * `overflow` | It's set to `start`, `end`, none or both. | :host
 * <p>
 * See [ThemableMixin – how to apply styles for shadow parts](https://github.com/vaadin/vaadin-themable-mixin/wiki)
 */
public class VaadinTabs extends AbstractComponent<TabsElement> implements HasElementMixin<TabsElement, VaadinTabs>,
		HasListMixin<TabsElement, VaadinTabs>,
		HasThemableMixin<TabsElement, VaadinTabs>,
		HasComponents<TabsElement, VaadinTabs, Component<?>> {
	public VaadinTabs() {
		super("vaadin-tabs");
	}

	/**
	 * Set tabs disposition. Possible values are `horizontal|vertical`
	 */
	@Nullable
	public Orientation orientation() {
		return getNode().getOrientation();
	}

	/**
	 * Set tabs disposition. Possible values are `horizontal|vertical`
	 */
	public VaadinTabs orientation(Orientation orientation) {
		getNode().setOrientation(orientation);
		return this;
	}

	/**
	 * The index of the selected tab.
	 */
	public int selected() {
		return getNode().getSelected();
	}

	/**
	 * The index of the selected tab.
	 */
	public VaadinTabs selected(int selected) {
		getNode().setSelected(selected);
		return this;
	}
}
