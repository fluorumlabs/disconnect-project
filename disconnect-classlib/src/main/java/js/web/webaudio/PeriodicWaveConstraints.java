package js.web.webaudio;

import js.lang.Any;
import org.teavm.jso.JSProperty;


public interface PeriodicWaveConstraints extends Any {
    @JSProperty
    boolean isDisableNormalization();

    @JSProperty
    void setDisableNormalization(boolean disableNormalization);

}
