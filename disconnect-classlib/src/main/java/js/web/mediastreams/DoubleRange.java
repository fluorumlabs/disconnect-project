package js.web.mediastreams;

import js.lang.Any;
import org.teavm.jso.JSProperty;


public interface DoubleRange extends Any {
    @JSProperty
    double getMax();

    @JSProperty
    void setMax(double max);

    @JSProperty
    double getMin();

    @JSProperty
    void setMin(double min);

}
