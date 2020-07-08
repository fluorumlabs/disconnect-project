package js.lang.external.vaadin.combobox;

import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * Created by Artem Godin on 7/2/2020.
 */
public interface ComboBoxDataProviderParams extends Any {
    @JSProperty
    int getPage();

    @JSProperty
    int getPageSize();

    @JSProperty
    String getFilter();
}
