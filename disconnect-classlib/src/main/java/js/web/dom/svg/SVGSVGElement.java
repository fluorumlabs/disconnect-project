package js.web.dom.svg;

import js.extras.JsEnum;
import js.web.cssom.CSSStyleDeclaration;
import js.web.dom.*;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * Provides access to the properties of <svg> elements, as well as methods to manipulate them. This interface contains also various miscellaneous commonly-used utility methods, such as matrix operations and the ability to control the time of redraw on visual rendering devices.
 */
public interface SVGSVGElement extends SVGGraphicsElement, DocumentEvent, SVGFitToViewBox, SVGZoomAndPan {
    @JSBody(script = "return SVGSVGElement.prototype")
    static SVGSVGElement prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new SVGSVGElement()")
    static SVGSVGElement create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @Deprecated
    @JSProperty
    String getContentScriptType();

    @JSProperty
    void setContentScriptType(String contentScriptType);

    @Deprecated
    @JSProperty
    String getContentStyleType();

    @JSProperty
    void setContentStyleType(String contentStyleType);

    @JSProperty
    double getCurrentScale();

    @JSProperty
    void setCurrentScale(double currentScale);

    @JSProperty
    SVGPoint getCurrentTranslate();

    @JSProperty
    SVGAnimatedLength getHeight();

    @JSProperty
    @Nullable
    EventListener<Event> getOnunload();

    @JSProperty
    void setOnunload(EventListener<Event> onunload);

    default void addUnloadEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
        addEventListener("unload", listener, options);
    }

    default void addUnloadEventListener(EventListener<Event> listener, boolean options) {
        addEventListener("unload", listener, options);
    }

    default void addUnloadEventListener(EventListener<Event> listener) {
        addEventListener("unload", listener);
    }

    default void removeUnloadEventListener(EventListener<Event> listener, EventListenerOptions options) {
        removeEventListener("unload", listener, options);
    }

    default void removeUnloadEventListener(EventListener<Event> listener, boolean options) {
        removeEventListener("unload", listener, options);
    }

    default void removeUnloadEventListener(EventListener<Event> listener) {
        removeEventListener("unload", listener);
    }

    @JSProperty
    @Nullable
    EventListener<SVGZoomEvent> getOnzoom();

    @JSProperty
    void setOnzoom(EventListener<SVGZoomEvent> onzoom);

    default void addZoomEventListener(EventListener<SVGZoomEvent> listener, AddEventListenerOptions options) {
        addEventListener("zoom", listener, options);
    }

    default void addZoomEventListener(EventListener<SVGZoomEvent> listener, boolean options) {
        addEventListener("zoom", listener, options);
    }

    default void addZoomEventListener(EventListener<SVGZoomEvent> listener) {
        addEventListener("zoom", listener);
    }

    default void removeZoomEventListener(EventListener<SVGZoomEvent> listener, EventListenerOptions options) {
        removeEventListener("zoom", listener, options);
    }

    default void removeZoomEventListener(EventListener<SVGZoomEvent> listener, boolean options) {
        removeEventListener("zoom", listener, options);
    }

    default void removeZoomEventListener(EventListener<SVGZoomEvent> listener) {
        removeEventListener("zoom", listener);
    }

    @Deprecated
    @JSProperty
    double getPixelUnitToMillimeterX();

    @Deprecated
    @JSProperty
    double getPixelUnitToMillimeterY();

    @Deprecated
    @JSProperty
    double getScreenPixelToMillimeterX();

    @Deprecated
    @JSProperty
    double getScreenPixelToMillimeterY();

    @Deprecated
    @JSProperty
    SVGRect getViewport();

    @JSProperty
    SVGAnimatedLength getWidth();

    @JSProperty
    SVGAnimatedLength getX();

    @JSProperty
    SVGAnimatedLength getY();

    boolean animationsPaused();

    boolean checkEnclosure(SVGElement element, SVGRect rect);

    boolean checkIntersection(SVGElement element, SVGRect rect);

    SVGAngle createSVGAngle();

    SVGLength createSVGLength();

    SVGMatrix createSVGMatrix();

    SVGNumber createSVGNumber();

    SVGPoint createSVGPoint();

    SVGRect createSVGRect();

    SVGTransform createSVGTransform();

    SVGTransform createSVGTransformFromMatrix(SVGMatrix matrix);

    void deselectAll();

    @Deprecated
    void forceRedraw();

    CSSStyleDeclaration getComputedStyle(Element elt, @Nullable String pseudoElt);

    CSSStyleDeclaration getComputedStyle(Element elt);

    double getCurrentTime();

    void setCurrentTime(double seconds);

    Element getElementById(String elementId);

    NodeListOf<SVGElement> getEnclosureList(SVGRect rect, SVGElement referenceElement);

    NodeListOf<SVGElement> getIntersectionList(SVGRect rect, SVGElement referenceElement);

    void pauseAnimations();

    @Deprecated
    double suspendRedraw(double maxWaitMilliseconds);

    void unpauseAnimations();

    @Deprecated
    void unsuspendRedraw(int suspendHandleID);

    @Deprecated
    void unsuspendRedrawAll();

    abstract class ZoomAndPan extends JsEnum {
        public static final ZoomAndPan SVG_ZOOMANDPAN_DISABLE = JsEnum.from("return SVGSVGElement.SVG_ZOOMANDPAN_DISABLE");


        public static final ZoomAndPan SVG_ZOOMANDPAN_MAGNIFY = JsEnum.from("return SVGSVGElement.SVG_ZOOMANDPAN_MAGNIFY");


        public static final ZoomAndPan SVG_ZOOMANDPAN_UNKNOWN = JsEnum.from("return SVGSVGElement.SVG_ZOOMANDPAN_UNKNOWN");
    }


}
