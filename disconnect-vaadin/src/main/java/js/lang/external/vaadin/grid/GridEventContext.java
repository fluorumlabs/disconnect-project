package js.lang.external.vaadin.grid;

import js.lang.Any;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * Created by Artem Godin on 7/2/2020.
 */
public interface GridEventContext<T extends Any> extends Any {
    @JSProperty
    String getSection(); // body | header | footer | details

    @Nullable
    @JSProperty
    T getItem();

    @Nullable
    @JSProperty
    GridColumnElement<T> getColumn();
    
    @JSProperty
    int getIndex();
    
    @JSProperty
    boolean isSelected();

    @JSProperty
    boolean isDetailsOpened();

    @JSProperty
    boolean isExpanded();

    @JSProperty
    int getLevel();
}
