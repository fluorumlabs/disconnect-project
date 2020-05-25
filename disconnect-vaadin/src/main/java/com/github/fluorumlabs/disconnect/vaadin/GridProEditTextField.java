package com.github.fluorumlabs.disconnect.vaadin;

import com.github.fluorumlabs.disconnect.core.annotations.WebComponent;
import com.github.fluorumlabs.disconnect.vaadin.elements.GridProEditTextFieldElement;
import com.github.fluorumlabs.disconnect.zero.component.AbstractComponent;
import com.github.fluorumlabs.disconnect.core.components.HasElement;
import com.github.fluorumlabs.disconnect.zero.component.HasComponents;
import com.github.fluorumlabs.disconnect.zero.component.HasStyle;

/**
 * The cell editor text-field element.
 *
 * <h3>Styling</h3>
 * See
 * <a href="https://github.com/vaadin/vaadin-text-field/blob/master/src/vaadin-text-field.html"><code>&lt;vaadin-text-field&gt;</code> documentation</a>
 * for <code>&lt;vaadin-text-field&gt;</code> parts.
 * <p>
 * See
 * <a href="https://github.com/vaadin/vaadin-themable-mixin/wiki">ThemableMixin – how to apply styles for shadow parts</a>
 */
@WebComponent
public class GridProEditTextField extends AbstractComponent<GridProEditTextFieldElement>
		implements HasStyle<GridProEditTextFieldElement, GridProEditTextField>, HasComponents<GridProEditTextFieldElement, GridProEditTextField, HasElement<?>> {
	public GridProEditTextField() {
		super(GridProEditTextFieldElement.TAGNAME());
	}
}
