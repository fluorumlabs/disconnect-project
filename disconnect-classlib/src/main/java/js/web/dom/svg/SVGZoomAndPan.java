package js.web.dom.svg;

import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * Used to reflect the zoomAndPan attribute, and is mixed in to other interfaces for elements that support this attribute.
 */
public interface SVGZoomAndPan extends Any {
    @JSProperty
    SVGSVGElement.ZoomAndPan getZoomAndPan();

}
