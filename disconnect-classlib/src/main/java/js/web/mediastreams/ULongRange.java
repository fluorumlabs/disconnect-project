package js.web.mediastreams;

import org.teavm.jso.JSProperty;

import js.lang.Any;


public interface ULongRange extends Any {
    @JSProperty
    int getMax();

    @JSProperty
    void setMax(int max);

    @JSProperty
    int getMin();

    @JSProperty
    void setMin(int min);

}
