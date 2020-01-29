package js.web.dom;

import js.lang.Any;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;


public interface DOMQuad extends Any {
    @JSBody(script = "return DOMQuad.prototype")
    static DOMQuad prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new DOMQuad()")
    static DOMQuad create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = {"p1", "p2", "p3", "p4"}, script = "return new DOMQuad(p1,p2,p3,p4)")
    static DOMQuad create(DOMPointInit p1, DOMPointInit p2, DOMPointInit p3, DOMPointInit p4) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = {"p1", "p2", "p3"}, script = "return new DOMQuad(p1,p2,p3)")
    static DOMQuad create(DOMPointInit p1, DOMPointInit p2, DOMPointInit p3) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = {"p1", "p2"}, script = "return new DOMQuad(p1,p2)")
    static DOMQuad create(DOMPointInit p1, DOMPointInit p2) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = {"p1"}, script = "return new DOMQuad(p1)")
    static DOMQuad create(DOMPointInit p1) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = {"other"}, script = "return DOMQuad.fromQuad(other)")
    static DOMQuad fromQuad(DOMQuadInit other) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return DOMQuad.fromQuad()")
    static DOMQuad fromQuad() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = {"other"}, script = "return DOMQuad.fromRect(other)")
    static DOMQuad fromRect(DOMRectInit other) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return DOMQuad.fromRect()")
    static DOMQuad fromRect() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    DOMPoint getP1();

    @JSProperty
    DOMPoint getP2();

    @JSProperty
    DOMPoint getP3();

    @JSProperty
    DOMPoint getP4();

    DOMRect getBounds();

    Any toJSON();

}
