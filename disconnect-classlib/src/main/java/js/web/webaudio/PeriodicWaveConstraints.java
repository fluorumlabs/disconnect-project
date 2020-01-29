package js.web.webaudio;

import org.teavm.jso.JSProperty;

import js.lang.Any;


public interface PeriodicWaveConstraints extends Any {
    @JSProperty
    boolean isDisableNormalization();

    @JSProperty
    void setDisableNormalization(boolean disableNormalization);

}
