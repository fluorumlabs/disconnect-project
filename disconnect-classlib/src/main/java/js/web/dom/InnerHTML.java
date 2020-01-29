package js.web.dom;

import js.lang.Any;
import org.teavm.jso.JSProperty;


public interface InnerHTML extends Any {
    @JSProperty
    String getInnerHTML();

    @JSProperty
    void setInnerHTML(String innerHTML);

}
