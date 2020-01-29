package js.web.dom.svg;

import org.teavm.jso.JSProperty;

import js.lang.Any;

/** Used to reflect the zoomAndPan attribute, and is mixed in to other interfaces for elements that support this attribute. */
        public interface SVGZoomAndPan extends Any {
        @JSProperty
        SVGSVGElement.ZoomAndPan getZoomAndPan();

}
