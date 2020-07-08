package js.lang.external.vaadin.combobox;

import org.teavm.jso.JSFunctor;
import org.teavm.jso.JSObject;

/**
 * Created by Artem Godin on 7/2/2020.
 */
@FunctionalInterface
@JSFunctor
public interface CheckValidityHandler extends JSObject {
    boolean checkValidity();
}
