package js.lang.external.vaadin.customfield;

import js.lang.Any;
import js.lang.Unknown;
import js.util.collections.Array;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSFunctor;
import org.teavm.jso.JSObject;

/**
 * Created by Artem Godin on 7/3/2020.
 */
public interface CustomFieldI18n extends Any {
    @JSBody(params = "value", script = "this.parseValue = value; return this;")
    CustomFieldI18n parseValue(Parser value);

    @JSBody(params = "value", script = "this.formatValue = value; return this;")
    CustomFieldI18n formatValue(Formatter value);

    @JSFunctor
    @FunctionalInterface
    interface Parser extends JSObject {
        Array<Unknown> parse(String value);
    }

    @JSFunctor
    @FunctionalInterface
    interface Formatter extends JSObject {
        String format(Array<Unknown> value);
    }

}
