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
 * <code>&lt;vaadin-grid-pro-edit-column&gt;</code> is a helper element for the <code>&lt;vaadin-grid-pro&gt;</code>
 * that provides default inline editing for the items.
 *
 * <strong>Note that the <code>path</code> property must be explicitly specified for edit column.</strong>
 *
 * <h4>Example:</h4>
 * <pre><code class="language-html">&lt;vaadin-grid-pro items=&quot;[[items]]&quot;&gt;
 *  &lt;vaadin-grid-pro-edit-column path=&quot;name.first&quot;&gt;&lt;/vaadin-grid-pro-edit-column&gt;
 *
 *  &lt;vaadin-grid-column&gt;
 *    ...
 * </code></pre>
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
	 *
	 * <ul>
	 * <li><code>root</code> The cell content DOM element. Append your editor component to it.</li>
	 * <li><code>column</code> The <code>&lt;vaadin-grid-pro-edit-column&gt;</code> element.</li>
	 * <li><code>rowData</code> The object with the properties related with
	 * the rendered item, contains:
	 * <ul>
	 * <li><code>rowData.index</code> The index of the item.</li>
	 * <li><code>rowData.item</code> The item.</li>
	 * <li><code>rowData.expanded</code> Sublevel toggle state.</li>
	 * <li><code>rowData.level</code> Level of the tree represented with a horizontal offset of the toggle button.</li>
	 * <li><code>rowData.selected</code> Selected state.</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	@Nullable
	@JSProperty
	EditModeRenderer<ITEM> getEditModeRenderer();

	/**
	 * Custom function for rendering the cell content in edit mode.
	 * Receives three arguments:
	 *
	 * <ul>
	 * <li><code>root</code> The cell content DOM element. Append your editor component to it.</li>
	 * <li><code>column</code> The <code>&lt;vaadin-grid-pro-edit-column&gt;</code> element.</li>
	 * <li><code>rowData</code> The object with the properties related with
	 * the rendered item, contains:
	 * <ul>
	 * <li><code>rowData.index</code> The index of the item.</li>
	 * <li><code>rowData.item</code> The item.</li>
	 * <li><code>rowData.expanded</code> Sublevel toggle state.</li>
	 * <li><code>rowData.level</code> Level of the tree represented with a horizontal offset of the toggle button.</li>
	 * <li><code>rowData.selected</code> Selected state.</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	@JSProperty
	void setEditModeRenderer(EditModeRenderer<ITEM> editModeRenderer);

	/**
	 * The list of options which should be passed to cell editor component.
	 * Used with the <code>select</code> editor type, to provide a list of items.
	 */
	@Nullable
	@JSProperty
	String[] getEditorOptions();

	/**
	 * The list of options which should be passed to cell editor component.
	 * Used with the <code>select</code> editor type, to provide a list of items.
	 */
	@JSProperty
	void setEditorOptions(@JSByRef String... editorOptions);

	/**
	 * Type of the cell editor component to be rendered. Allowed values:
	 *
	 * <ul>
	 * <li><code>text</code> (default) - renders a text field</li>
	 * <li><code>checkbox</code> - renders a checkbox</li>
	 * <li><code>select</code> - renders a select with a list of items passed as <code>editorOptions</code></li>
	 * </ul>
	 * Editor type is set to <code>custom</code> when either <code>editModeRenderer</code> is set,
	 * or editor template provided for the column.
	 */
	@Nullable
	@JSProperty
	EditorType getEditorType();

	/**
	 * Type of the cell editor component to be rendered. Allowed values:
	 *
	 * <ul>
	 * <li><code>text</code> (default) - renders a text field</li>
	 * <li><code>checkbox</code> - renders a checkbox</li>
	 * <li><code>select</code> - renders a select with a list of items passed as <code>editorOptions</code></li>
	 * </ul>
	 * Editor type is set to <code>custom</code> when either <code>editModeRenderer</code> is set,
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
