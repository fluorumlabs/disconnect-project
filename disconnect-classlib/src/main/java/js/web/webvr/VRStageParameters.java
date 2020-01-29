package js.web.webvr;

import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;import js.lang.Any;
import js.util.buffers.Float32Array;


public interface VRStageParameters extends Any {
    @JSProperty
    @Nullable
    Float32Array getSittingToStandingTransform();

    @JSProperty
    void setSittingToStandingTransform(Float32Array sittingToStandingTransform);

    @JSProperty
    double getSizeX();

    @JSProperty
    void setSizeX(double sizeX);

    @JSProperty
    double getSizeY();

    @JSProperty
    void setSizeY(double sizeY);

}
