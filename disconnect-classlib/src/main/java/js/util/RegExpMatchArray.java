package js.util;

import js.lang.JsString;
import js.util.collections.Array;

import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


public interface RegExpMatchArray extends Array<JsString> {
    @JSProperty
     int getIndex();

    @JSProperty
     void setIndex(int value);

    @Nullable
    @JSProperty
     String getInput();

    @JSProperty
     void setInput(String value);
}
