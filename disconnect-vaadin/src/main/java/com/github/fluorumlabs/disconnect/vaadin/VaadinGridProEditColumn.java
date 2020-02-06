package com.github.fluorumlabs.disconnect.vaadin;

import com.github.fluorumlabs.disconnect.polymer.types.PropertyChangeEvent;
import com.github.fluorumlabs.disconnect.vaadin.constants.EditorType;
import com.github.fluorumlabs.disconnect.vaadin.elements.GridProEditColumnElement;
import com.github.fluorumlabs.disconnect.vaadin.renderers.EditModeRenderer;
import com.github.fluorumlabs.disconnect.zero.component.AbstractComponent;
import com.github.fluorumlabs.disconnect.zero.component.Component;
import com.github.fluorumlabs.disconnect.zero.component.HasComponents;
import com.github.fluorumlabs.disconnect.zero.observable.ObservableEvent;
import js.lang.Any;

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
public class VaadinGridProEditColumn<ITEM extends Any> extends AbstractComponent<GridProEditColumnElement<ITEM>>
		implements HasComponents<GridProEditColumnElement<ITEM>, VaadinGridProEditColumn<ITEM>, Component<?>> {
	public VaadinGridProEditColumn() {
		super(GridProEditColumnElement.TAGNAME());
	}

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
	public EditModeRenderer<ITEM> editModeRenderer() {
		return getNode().getEditModeRenderer();
	}

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
	public VaadinGridProEditColumn<ITEM> editModeRenderer(EditModeRenderer<ITEM> editModeRenderer) {
		getNode().setEditModeRenderer(editModeRenderer);
		return this;
	}

	/**
	 * The list of options which should be passed to cell editor component.
	 * Used with the <code>select</code> editor type, to provide a list of items.
	 */
	@Nullable
	public String[] editorOptions() {
		return getNode().getEditorOptions();
	}

	/**
	 * The list of options which should be passed to cell editor component.
	 * Used with the <code>select</code> editor type, to provide a list of items.
	 */
	public VaadinGridProEditColumn<ITEM> editorOptions(String... editorOptions) {
		getNode().setEditorOptions(editorOptions);
		return this;
	}

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
	public EditorType editorType() {
		return getNode().getEditorType();
	}

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
	public VaadinGridProEditColumn<ITEM> editorType(EditorType editorType) {
		getNode().setEditorType(editorType);
		return this;
	}

	/**
	 * Path of the property used for the value of the editor component.
	 */
	@Nullable
	public String editorValuePath() {
		return getNode().getEditorValuePath();
	}

	/**
	 * Path of the property used for the value of the editor component.
	 */
	public VaadinGridProEditColumn<ITEM> editorValuePath(String editorValuePath) {
		getNode().setEditorValuePath(editorValuePath);
		return this;
	}

	/**
	 * JS Path of the property in the item used for the editable content.
	 */
	@Nullable
	public String path() {
		return getNode().getPath();
	}

	/**
	 * JS Path of the property in the item used for the editable content.
	 */
	public VaadinGridProEditColumn<ITEM> path(String path) {
		getNode().setPath(path);
		return this;
	}

	/**
	 * Fired when the <code>editorType</code> property changes.
	 */
	public ObservableEvent<PropertyChangeEvent<EditorType>> editorTypeChangedEvent() {
		return createEvent("editor-type-changed");
	}
}
