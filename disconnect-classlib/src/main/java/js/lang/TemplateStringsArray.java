package js.lang;

import js.util.collections.ReadonlyArray;
import org.teavm.jso.JSProperty;


public interface TemplateStringsArray extends ReadonlyArray<JsString> {
    @JSProperty
    String[] getRaw();
}
