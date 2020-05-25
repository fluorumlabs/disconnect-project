package com.github.fluorumlabs.disconnect.vaadin;

import com.github.fluorumlabs.disconnect.core.annotations.WebComponent;
import com.github.fluorumlabs.disconnect.vaadin.elements.GridProEditCheckboxElement;
import com.github.fluorumlabs.disconnect.zero.component.AbstractComponent;
import com.github.fluorumlabs.disconnect.zero.component.HasElement;
import com.github.fluorumlabs.disconnect.zero.component.HasComponents;
import com.github.fluorumlabs.disconnect.zero.component.HasStyle;

/**
 * The cell editor checkbox element.
 *
 * <h3>Styling</h3>
 * See
 * <a href="https://github.com/vaadin/vaadin-checkbox/blob/master/src/vaadin-checkbox.html"><code>&lt;vaadin-checkbox&gt;</code> documentation</a>
 * for <code>&lt;vaadin-checkbox&gt;</code> parts.
 * <p>
 * See
 * <a href="https://github.com/vaadin/vaadin-themable-mixin/wiki">ThemableMixin – how to apply styles for shadow parts</a>
 */
@WebComponent
public class GridProEditCheckbox extends AbstractComponent<GridProEditCheckboxElement>
		implements HasStyle<GridProEditCheckboxElement, GridProEditCheckbox>, HasComponents<GridProEditCheckboxElement, GridProEditCheckbox, HasElement<?>> {
	public GridProEditCheckbox() {
		super(GridProEditCheckboxElement.TAGNAME());
	}
}
