package js.web.webaudio;

import js.lang.Unknown;
import js.util.buffers.Float32Array;
import org.teavm.jso.JSByRef;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


public interface WaveShaperOptions extends AudioNodeOptions {
    @JSProperty
    @Nullable
    Unknown getCurve();

    @JSProperty
    void setCurve(@JSByRef double... curve);
    @JSProperty
    void setCurve(Float32Array curve);

    @JSProperty
    @Nullable
    OverSampleType getOversample();

    @JSProperty
    void setOversample(OverSampleType oversample);

}
