package js.web.mediastreams.mediastreams;

import js.lang.Any;
import org.teavm.jso.JSProperty;


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
