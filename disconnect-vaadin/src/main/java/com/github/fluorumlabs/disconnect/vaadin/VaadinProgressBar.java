package com.github.fluorumlabs.disconnect.vaadin;

import com.github.fluorumlabs.disconnect.vaadin.elements.ProgressBarElement;
import com.github.fluorumlabs.disconnect.vaadin.mixins.HasProgressMixin;
import com.github.fluorumlabs.disconnect.vaadin.mixins.HasThemableMixin;
import com.github.fluorumlabs.disconnect.zero.component.AbstractComponent;
import com.github.fluorumlabs.disconnect.zero.component.Component;
import com.github.fluorumlabs.disconnect.zero.component.HasComponents;

/**
 * `<vaadin-progress-bar>` is a Web Component for progress bars.
 * <p>
 * ```html
 * <vaadin-progress-bar min="0" max="1" value="0.5">
 * </vaadin-progress-bar>
 * ```
 * <p>
 * ### Styling
 * <p>
 * The following shadow DOM parts are available for styling:
 * <p>
 * Part name | Description
 * ----------------|----------------
 * `bar` | Progress-bar's background
 * `value` | Progress-bar's foreground
 * <p>
 * See [ThemableMixin – how to apply styles for shadow parts](https://github.com/vaadin/vaadin-themable-mixin/wiki)
 * <p>
 * The following custom properties are available:
 * <p>
 * Custom property | Description | Default
 * ----------------|-------------|-------------
 * `--vaadin-progress-value` | current progress value (between 0 and 1) | 0
 * <p>
 * The following state attributes are available for styling:
 * <p>
 * Attribute       | Description | Part name
 * ----------------|-------------|------------
 * `indeterminate` | Set to an indeterminate progress bar | :host
 */
public class VaadinProgressBar extends AbstractComponent<ProgressBarElement>
		implements HasProgressMixin<ProgressBarElement, VaadinProgressBar>,
		HasThemableMixin<ProgressBarElement, VaadinProgressBar>,
		HasComponents<ProgressBarElement, VaadinProgressBar, Component<?>> {
	public VaadinProgressBar() {
		super("vaadin-progress-bar");
	}
}
