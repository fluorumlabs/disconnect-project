package js.web.intersectionobserver;

import js.web.dom.Element;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;import js.lang.Any;
import js.lang.Unknown;

import org.teavm.jso.JSByRef;


public interface IntersectionObserverInit extends Any {
    @JSProperty
    @Nullable
    Element getRoot();

    @JSProperty
    void setRoot(Element root);

    @JSProperty
    @Nullable
    String getRootMargin();

    @JSProperty
    void setRootMargin(String rootMargin);

    @JSProperty
    @Nullable
    Unknown getThreshold();

    @JSProperty
    void setThreshold(double threshold);

    @JSProperty
    void setThreshold(@JSByRef double... threshold);

}
