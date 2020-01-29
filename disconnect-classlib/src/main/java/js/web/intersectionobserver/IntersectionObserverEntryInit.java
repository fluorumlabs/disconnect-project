package js.web.intersectionobserver;

import js.lang.Any;
import js.web.dom.DOMRectInit;
import js.web.dom.Element;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


public interface IntersectionObserverEntryInit extends Any {
    @JSProperty
    DOMRectInit getBoundingClientRect();

    @JSProperty
    void setBoundingClientRect(DOMRectInit boundingClientRect);

    @JSProperty
    double getIntersectionRatio();

    @JSProperty
    void setIntersectionRatio(double intersectionRatio);

    @JSProperty
    DOMRectInit getIntersectionRect();

    @JSProperty
    void setIntersectionRect(DOMRectInit intersectionRect);

    @JSProperty
    boolean isIsIntersecting();

    @JSProperty
    void setIsIntersecting(boolean isIntersecting);

    @JSProperty
    @Nullable
    DOMRectInit getRootBounds();

    @JSProperty
    void setRootBounds(DOMRectInit rootBounds);

    @JSProperty
    Element getTarget();

    @JSProperty
    void setTarget(Element target);

    @JSProperty
    double getTime();

    @JSProperty
    void setTime(double time);

}
