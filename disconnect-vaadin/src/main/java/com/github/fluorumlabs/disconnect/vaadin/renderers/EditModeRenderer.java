package com.github.fluorumlabs.disconnect.vaadin.renderers;

import com.github.fluorumlabs.disconnect.vaadin.elements.GridProEditColumnElement;
import js.lang.Any;
import org.teavm.jso.JSFunctor;
import org.teavm.jso.JSProperty;

/**
 * Created by Artem Godin on 2/4/2020.
 */
@JSFunctor
@FunctionalInterface
public interface EditModeRenderer<ITEM extends Any> extends Any {
    void render(GridProEditColumnElement<ITEM> column, RowData<ITEM> rowData);

    interface RowData<ITEM> extends Any {
        @JSProperty
        int getIndex();

        @JSProperty
        ITEM getItem();

        @JSProperty
        boolean getExpanded();

        @JSProperty
        int getLevel();

        @JSProperty
        boolean getSelected();
    }
}
