package js.web.dom.svg;

import js.web.dom.UIEvent;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;


public interface SVGZoomEvent extends UIEvent {
    @JSBody(script = "return SVGZoomEvent.prototype")
    static SVGZoomEvent prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new SVGZoomEvent()")
    static SVGZoomEvent create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    double getNewScale();

    @JSProperty
    SVGPoint getNewTranslate();

    @JSProperty
    double getPreviousScale();

    @JSProperty
    SVGPoint getPreviousTranslate();

    @JSProperty
    SVGRect getZoomRectScreen();

}
