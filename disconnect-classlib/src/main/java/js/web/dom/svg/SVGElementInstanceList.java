package js.web.dom.svg;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import js.lang.Any;


public interface SVGElementInstanceList extends Any {
        @Deprecated
        @JSProperty
        int getLength();

        @Deprecated
        SVGElementInstance item(int index);

        @JSBody(script = "return SVGElementInstanceList.prototype")
        static SVGElementInstanceList prototype() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(script = "return new SVGElementInstanceList()")
        static SVGElementInstanceList create() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        }
