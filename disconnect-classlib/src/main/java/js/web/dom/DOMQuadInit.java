package js.web.dom;

import js.lang.Any;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


public interface DOMQuadInit extends Any {
    @JSProperty
    @Nullable
    DOMPointInit getP1();

    @JSProperty
    void setP1(DOMPointInit p1);

    @JSProperty
    @Nullable
    DOMPointInit getP2();

    @JSProperty
    void setP2(DOMPointInit p2);

    @JSProperty
    @Nullable
    DOMPointInit getP3();

    @JSProperty
    void setP3(DOMPointInit p3);

    @JSProperty
    @Nullable
    DOMPointInit getP4();

    @JSProperty
    void setP4(DOMPointInit p4);

}
