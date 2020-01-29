package js.web.dom.svg;

import js.web.cssom.ElementCSSInlineStyle;
import js.web.dom.DocumentAndElementEventHandlers;
import js.web.dom.Element;
import js.web.dom.GlobalEventHandlers;
import js.web.dom.HTMLOrSVGElement;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/** All of the SVG DOM interfaces that correspond directly to elements in the SVG language derive from the SVGElement interface. */
        public interface SVGElement extends Element, DocumentAndElementEventHandlers, ElementCSSInlineStyle, GlobalEventHandlers, HTMLOrSVGElement, SVGElementInstance {
        @Deprecated
        @JSProperty
        String getClassName();

        @JSProperty
        @Nullable
        SVGSVGElement getOwnerSVGElement();

        @JSProperty
        @Nullable
        SVGElement getViewportElement();

        @JSBody(script = "return SVGElement.prototype")
        static SVGElement prototype() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(script = "return new SVGElement()")
        static SVGElement create() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        }
