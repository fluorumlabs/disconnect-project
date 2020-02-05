package com.github.fluorumlabs.disconnect.vaadin.elements;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.vaadin.Vaadin;
import com.github.fluorumlabs.disconnect.vaadin.constants.EditorType;
import com.github.fluorumlabs.disconnect.vaadin.renderers.EditModeRenderer;
import js.lang.Any;
import org.teavm.jso.JSByRef;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * `<vaadin-grid-pro-edit-column>` is a helper element for the `<vaadin-grid-pro>`
 * that provides default inline editing for the items.
 * <p>
 * __Note that the `path` property must be explicitly specified for edit column.__
 * <p>
 * #### Example:
 * ```html
 * <vaadin-grid-pro items="[[items]]">
 * <vaadin-grid-pro-edit-column path="name.first"></vaadin-grid-pro-edit-column>
 * <p>
 * <vaadin-grid-column>
 * ...
 * ```
 */
@NpmPackage(
		name = "@vaadin/vaadin",
		version = Vaadin.VERSION
)
@Import(
		symbols = "GridProEditColumnElement",
		module = "@vaadin/vaadin-grid-pro/src/vaadin-grid-pro-edit-column.js"
)
public interface GridProEditColumnElement<ITEM extends Any> extends GridColumnElement<ITEM> {
	/**
	 * Custom function for rendering the cell content in edit mode.
	 * Receives three arguments:
	 * <p>
	 * - `root` The cell content DOM element. Append your editor component to it.
	 * - `column` The `<vaadin-grid-pro-edit-column>` element.
	 * - `rowData` The object with the properties related with
	 * the rendered item, contains:
	 * - `rowData.index` The index of the item.
	 * - `rowData.item` The item.
	 * - `rowData.expanded` Sublevel toggle state.
	 * - `rowData.level` Level of the tree represented with a horizontal offset of the toggle button.
	 * - `rowData.selected` Selected state.
	 */
	@Nullable
	@JSProperty
	EditModeRenderer<ITEM> getEditModeRenderer();

	/**
	 * Custom function for rendering the cell content in edit mode.
	 * Receives three arguments:
	 * <p>
	 * - `root` The cell content DOM element. Append your editor component to it.
	 * - `column` The `<vaadin-grid-pro-edit-column>` element.
	 * - `rowData` The object with the properties related with
	 * the rendered item, contains:
	 * - `rowData.index` The index of the item.
	 * - `rowData.item` The item.
	 * - `rowData.expanded` Sublevel toggle state.
	 * - `rowData.level` Level of the tree represented with a horizontal offset of the toggle button.
	 * - `rowData.selected` Selected state.
	 */
	@JSProperty
	void setEditModeRenderer(EditModeRenderer<ITEM> editModeRenderer);

	/**
	 * The list of options which should be passed to cell editor component.
	 * Used with the `select` editor type, to provide a list of items.
	 */
	@Nullable
	@JSProperty
	String[] getEditorOptions();

	/**
	 * The list of options which should be passed to cell editor component.
	 * Used with the `select` editor type, to provide a list of items.
	 */
	@JSProperty
	void setEditorOptions(@JSByRef String... editorOptions);

	/**
	 * Type of the cell editor component to be rendered. Allowed values:
	 * - `text` (default) - renders a text field
	 * - `checkbox` - renders a checkbox
	 * - `select` - renders a select with a list of items passed as `editorOptions`
	 * <p>
	 * Editor type is set to `custom` when either `editModeRenderer` is set,
	 * or editor template provided for the column.
	 */
	@Nullable
	@JSProperty
	EditorType getEditorType();

	/**
	 * Type of the cell editor component to be rendered. Allowed values:
	 * - `text` (default) - renders a text field
	 * - `checkbox` - renders a checkbox
	 * - `select` - renders a select with a list of items passed as `editorOptions`
	 * <p>
	 * Editor type is set to `custom` when either `editModeRenderer` is set,
	 * or editor template provided for the column.
	 */
	@JSProperty
	void setEditorType(EditorType editorType);

	/**
	 * Path of the property used for the value of the editor component.
	 */
	@Nullable
	@JSProperty
	String getEditorValuePath();

	/**
	 * Path of the property used for the value of the editor component.
	 */
	@JSProperty
	void setEditorValuePath(String editorValuePath);
}
