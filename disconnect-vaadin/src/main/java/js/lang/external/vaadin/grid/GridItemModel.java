package js.lang.external.vaadin.grid;

import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * Created by Artem Godin on 7/2/2020.
 */
public interface GridItemModel<T extends Any> extends Any {
    @JSProperty
    int getIndex();

    @JSProperty
    T getItem();

    @JSProperty
    boolean isSelected();

    @JSProperty
    boolean isExpanded();

    @JSProperty
    int getLevel();

    @JSProperty
    boolean isDetailsOpened();
}
