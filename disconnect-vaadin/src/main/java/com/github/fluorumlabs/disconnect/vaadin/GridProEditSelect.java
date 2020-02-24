package com.github.fluorumlabs.disconnect.vaadin;

import com.github.fluorumlabs.disconnect.core.annotations.WebComponent;
import com.github.fluorumlabs.disconnect.vaadin.elements.GridProEditSelectElement;
import com.github.fluorumlabs.disconnect.zero.component.AbstractComponent;
import com.github.fluorumlabs.disconnect.zero.component.Component;
import com.github.fluorumlabs.disconnect.zero.component.HasComponents;
import com.github.fluorumlabs.disconnect.zero.component.HasStyle;

import javax.annotation.Nullable;

/**
 * The cell editor select element.
 *
 * <h3>Styling</h3>
 * See
 * <a href="https://github.com/vaadin/vaadin-select/blob/master/src/vaadin-select.html"><code>&lt;vaadin-select&gt;</code> documentation</a>
 * for <code>&lt;vaadin-grid-pro-edit-select&gt;</code> parts.
 * <p>
 * See
 * <a href="https://github.com/vaadin/vaadin-themable-mixin/wiki">ThemableMixin – how to apply styles for shadow parts</a>
 */
@WebComponent
public class GridProEditSelect extends AbstractComponent<GridProEditSelectElement>
		implements HasStyle<GridProEditSelectElement, GridProEditSelect>, HasComponents<GridProEditSelectElement, GridProEditSelect, Component<?>> {
	public GridProEditSelect() {
		super(GridProEditSelectElement.TAGNAME());
	}

	@Nullable
	public String[] options() {
		return getNode().getOptions();
	}

	public GridProEditSelect options(String... options) {
		getNode().setOptions(options);
		return this;
	}
}
