package js.web.dom.svg;

import org.teavm.jso.JSProperty;

import js.lang.Any;


public interface SVGBoundingBoxOptions extends Any {
    @JSProperty
    boolean isClipped();

    @JSProperty
    void setClipped(boolean clipped);

    @JSProperty
    boolean isFill();

    @JSProperty
    void setFill(boolean fill);

    @JSProperty
    boolean isMarkers();

    @JSProperty
    void setMarkers(boolean markers);

    @JSProperty
    boolean isStroke();

    @JSProperty
    void setStroke(boolean stroke);

}
