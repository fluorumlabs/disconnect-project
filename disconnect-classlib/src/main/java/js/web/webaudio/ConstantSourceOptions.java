package js.web.webaudio;

import org.teavm.jso.JSProperty;

import js.lang.Any;


public interface ConstantSourceOptions extends Any {
    @JSProperty
    double getOffset();

    @JSProperty
    void setOffset(double offset);

}
