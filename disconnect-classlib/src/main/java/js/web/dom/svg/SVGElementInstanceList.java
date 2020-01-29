package js.web.dom.svg;

import js.lang.Any;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;


public interface SVGElementInstanceList extends Any {
    @JSBody(script = "return SVGElementInstanceList.prototype")
    static SVGElementInstanceList prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new SVGElementInstanceList()")
    static SVGElementInstanceList create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @Deprecated
    @JSProperty
    int getLength();

    @Deprecated
    SVGElementInstance item(int index);

}
