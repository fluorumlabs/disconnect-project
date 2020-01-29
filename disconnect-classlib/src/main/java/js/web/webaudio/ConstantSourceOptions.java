package js.web.webaudio;

import js.lang.Any;
import org.teavm.jso.JSProperty;


public interface ConstantSourceOptions extends Any {
    @JSProperty
    double getOffset();

    @JSProperty
    void setOffset(double offset);

}
