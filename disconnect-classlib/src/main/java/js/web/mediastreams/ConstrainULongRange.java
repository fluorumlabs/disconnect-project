package js.web.mediastreams.mediastreams;


import js.web.mediastreams.ULongRange;
import org.teavm.jso.JSProperty;


public interface ConstrainULongRange extends ULongRange {
    @JSProperty
    int getExact();

    @JSProperty
    void setExact(int exact);

    @JSProperty
    int getIdeal();

    @JSProperty
    void setIdeal(int ideal);

}
