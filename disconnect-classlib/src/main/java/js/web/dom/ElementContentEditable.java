package js.web.dom;

import js.lang.Any;
import org.teavm.jso.JSProperty;


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
