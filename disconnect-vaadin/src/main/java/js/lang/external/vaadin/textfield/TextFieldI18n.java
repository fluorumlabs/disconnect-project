package js.lang.external.vaadin.textfield;

import js.lang.Any;
import org.teavm.jso.JSBody;

/**
 * Created by Artem Godin on 7/3/2020.
 */
public interface TextFieldI18n extends Any {
    @JSBody(params = "value", script = "this.clear = value; return this;")
    TextFieldI18n clear(String value);
}
