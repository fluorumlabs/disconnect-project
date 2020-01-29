package js.web.dom;

import org.teavm.jso.JSProperty;

import js.lang.Any;


public interface ElementContentEditable extends Any {
    @JSProperty
    String getContentEditable();

    @JSProperty
    void setContentEditable(String contentEditable);

    @JSProperty
    String getInputMode();

    @JSProperty
    void setInputMode(String inputMode);

    @JSProperty
    boolean isIsContentEditable();

}
