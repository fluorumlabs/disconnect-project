package js.web.mediastreams;

import org.teavm.jso.JSProperty;

import js.lang.Any;


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
