package js.web.webaudio;


import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


public interface ConvolverOptions extends AudioNodeOptions {
    @JSProperty
    @Nullable
    AudioBuffer getBuffer();

    @JSProperty
    void setBuffer(AudioBuffer buffer);

    @JSProperty
    boolean isDisableNormalization();

    @JSProperty
    void setDisableNormalization(boolean disableNormalization);

}
