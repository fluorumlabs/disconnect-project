package js.lang.external.vaadin.combobox;

import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * Created by Artem Godin on 7/2/2020.
 */
public interface ComboBoxItemModel<T extends Any> extends Any {
    @JSProperty
    int getIndex();

    @JSProperty
    T getItem();
}
