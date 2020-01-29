package js.web.mediastreams.mediastreams;

import org.teavm.jso.JSProperty;

import js.lang.Any;


public interface ConstrainBooleanParameters extends Any {
    @JSProperty
    boolean isExact();

    @JSProperty
    void setExact(boolean exact);

    @JSProperty
    boolean isIdeal();

    @JSProperty
    void setIdeal(boolean ideal);

}
