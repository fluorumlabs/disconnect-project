package com.github.fluorumlabs.disconnect.vaadin.elements.mixins;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.vaadin.Vaadin;
import js.web.dom.Element;
import org.teavm.jso.JSProperty;

@NpmPackage(
		name = "@vaadin/vaadin",
		version = Vaadin.VERSION
)
@Import(
		symbols = "InlineEditingMixin",
		module = "@vaadin/vaadin-grid-pro/src/vaadin-grid-pro-inline-editing-mixin.js"
)
public interface InlineEditingMixin extends Element {
	/**
	 * When true, pressing Enter while in cell edit mode
	 * will move focus to the editable cell in the next row
	 * (Shift + Enter - same, but for previous row).
	 */
	@JSProperty
	boolean isEnterNextRow();

	/**
	 * When true, pressing Enter while in cell edit mode
	 * will move focus to the editable cell in the next row
	 * (Shift + Enter - same, but for previous row).
	 */
	@JSProperty
	void setEnterNextRow(boolean enterNextRow);

	/**
	 * When true, after moving to next or previous editable cell using
	 * Tab / Shift+Tab, it will be focused without edit mode.
	 * <p>
	 * When <code>enterNextRow</code> is true, pressing Enter will also
	 * preserve edit mode, otherwise, it will have no effect.
	 */
	@JSProperty
	boolean isSingleCellEdit();

	/**
	 * When true, after moving to next or previous editable cell using
	 * Tab / Shift+Tab, it will be focused without edit mode.
	 * <p>
	 * When <code>enterNextRow</code> is true, pressing Enter will also
	 * preserve edit mode, otherwise, it will have no effect.
	 */
	@JSProperty
	void setSingleCellEdit(boolean singleCellEdit);
}
