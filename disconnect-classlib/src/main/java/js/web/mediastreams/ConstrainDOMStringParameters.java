package js.web.mediastreams.mediastreams;

import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;import js.lang.Any;
import js.lang.Unknown;

import org.teavm.jso.JSByRef;


public interface ConstrainDOMStringParameters extends Any {
    @JSProperty
    @Nullable
    Unknown getExact();

    @JSProperty
    void setExact(String exact);

    @JSProperty
    void setExact(@JSByRef String... exact);

    @JSProperty
    @Nullable
    Unknown getIdeal();

    @JSProperty
    void setIdeal(String ideal);

    @JSProperty
    void setIdeal(@JSByRef String... ideal);

}
