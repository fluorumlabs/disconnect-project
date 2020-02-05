package com.github.fluorumlabs.disconnect.vaadin;

import com.github.fluorumlabs.disconnect.vaadin.elements.GridProElement;
import com.github.fluorumlabs.disconnect.vaadin.mixins.HasInlineEditingMixin;
import com.github.fluorumlabs.disconnect.zero.component.AbstractComponent;
import com.github.fluorumlabs.disconnect.zero.component.Component;
import com.github.fluorumlabs.disconnect.zero.component.HasComponents;
import js.lang.Any;

/**
 * `<vaadin-grid-pro>` is a high quality data grid / data table Web Component with extended functionality.
 * It extends `<vaadin-grid>` and adds extra features on top of the basic ones.
 * <p>
 * See [`<vaadin-grid>` documentation](https://github.com/vaadin/vaadin-grid/blob/master/src/vaadin-grid.html)
 * for details.
 * <p>
 * ```
 * <vaadin-grid-pro></vaadin-grid-pro>
 * ```
 */
public class VaadinGridPro<ITEM extends Any> extends AbstractComponent<GridProElement>
		implements HasInlineEditingMixin<ITEM, GridProElement, VaadinGridPro<ITEM>>,
		HasComponents<GridProElement, VaadinGridPro<ITEM>, Component<?>> {
	public VaadinGridPro() {
		super("vaadin-grid-pro");
	}
}
