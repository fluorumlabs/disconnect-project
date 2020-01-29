package js.web.webaudio;

import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;import js.lang.Unknown;
import js.util.buffers.Float32Array;

import org.teavm.jso.JSByRef;


public interface PeriodicWaveOptions extends PeriodicWaveConstraints {
    @JSProperty
    @Nullable
    Unknown getImag();

    @JSProperty
    void setImag(@JSByRef double[] imag);

    @JSProperty
    void setImag(Float32Array imag);

    @JSProperty
    @Nullable
    Unknown getReal();

    @JSProperty
    void setReal(@JSByRef double[] real);

    @JSProperty
    void setReal(Float32Array real);

}
