package js.web.dom;

import js.lang.Any;
import org.teavm.jso.JSBody;


@Deprecated
public interface Option extends Any {
                @JSBody(script = "return new Option()")
                static HTMLOptionElement create() {
                    throw new UnsupportedOperationException("Available only in JavaScript");
                }

                @JSBody(params="text", script = "return new Option(text)")
                static HTMLOptionElement create(String text) {
                    throw new UnsupportedOperationException("Available only in JavaScript");
                }

                @JSBody(params={"text","value"}, script = "return new Option(text, value)")
                static HTMLOptionElement create(String text, String value) {
                    throw new UnsupportedOperationException("Available only in JavaScript");
                }

                @JSBody(params={"text","value","defaultSelected"}, script = "return new Option(text, value, defaultSelected)")
                static HTMLOptionElement create(String text, String value, boolean defaultSelected) {
                    throw new UnsupportedOperationException("Available only in JavaScript");
                }
                @JSBody(params={"text","value","defaultSelected", "selected"}, script = "return new Option(text, value, defaultSelected)")
                static HTMLOptionElement create(String text, String value, boolean defaultSelected, boolean selected) {
                    throw new UnsupportedOperationException("Available only in JavaScript");
                }


}
