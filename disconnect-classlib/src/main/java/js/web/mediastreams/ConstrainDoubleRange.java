package js.web.mediastreams.mediastreams;


import js.web.mediastreams.DoubleRange;
import org.teavm.jso.JSProperty;


public interface ConstrainDoubleRange extends DoubleRange {
    @JSProperty
    double getExact();

    @JSProperty
    void setExact(double exact);

    @JSProperty
    double getIdeal();

    @JSProperty
    void setIdeal(double ideal);

}
