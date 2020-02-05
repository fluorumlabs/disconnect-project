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
public class VaadinGridProEditColumn<ITEM extends Any> extends AbstractComponent<GridProEditColumnElement<ITEM>>
        implements HasComponents<GridProEditColumnElement<ITEM>, VaadinGridProEditColumn<ITEM>, Component<?>> {
    public VaadinGridProEditColumn() {
        super("vaadin-grid-pro-edit-column");
    }

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
    public EditModeRenderer<ITEM> editModeRenderer() {
        return getNode().getEditModeRenderer();
    }

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
    public VaadinGridProEditColumn<ITEM> editModeRenderer(EditModeRenderer<ITEM> editModeRenderer) {
        getNode().setEditModeRenderer(editModeRenderer);
        return this;
    }

    /**
     * The list of options which should be passed to cell editor component.
     * Used with the `select` editor type, to provide a list of items.
     */
    @Nullable
    public String[] editorOptions() {
        return getNode().getEditorOptions();
    }

    /**
     * The list of options which should be passed to cell editor component.
     * Used with the `select` editor type, to provide a list of items.
     */
    public VaadinGridProEditColumn<ITEM> editorOptions(String... editorOptions) {
        getNode().setEditorOptions(editorOptions);
        return this;
    }

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
    public EditorType editorType() {
        return getNode().getEditorType();
    }

    /**
     * Type of the cell editor component to be rendered. Allowed values:
     * - `text` (default) - renders a text field
     * - `checkbox` - renders a checkbox
     * - `select` - renders a select with a list of items passed as `editorOptions`
     * <p>
     * Editor type is set to `custom` when either `editModeRenderer` is set,
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
     * Fired when the `editorType` property changes.
     */
    public ObservableEvent<PropertyChangeEvent<EditorType>> editorTypeChangedEvent() {
        return createEvent("editor-type-changed");
    }
}
