package js.util;

import js.lang.JsString;
import js.util.collections.Array;
import org.teavm.jso.JSProperty;


public interface RegExpExecArray extends Array<JsString> {
    @JSProperty
    int getIndex();

    @JSProperty
    void setIndex(int value);

    @JSProperty
    String getInput();

    @JSProperty
    void setInput(String value);
}
