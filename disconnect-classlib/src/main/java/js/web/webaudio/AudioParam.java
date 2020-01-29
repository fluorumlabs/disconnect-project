package js.web.webaudio;

import js.lang.Any;
import js.util.buffers.Float32Array;
import js.util.iterable.DoubleIterable;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSByRef;
import org.teavm.jso.JSProperty;

/**
 * The Web Audio API's AudioParam interface represents an audio-related parameter, usually a parameter of an AudioNode (such as GainNode.gain).
 */
public interface AudioParam extends Any {
    @JSBody(script = "return AudioParam.prototype")
    static AudioParam prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new AudioParam()")
    static AudioParam create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    AutomationRate getAutomationRate();

    @JSProperty
    void setAutomationRate(AutomationRate automationRate);

    @JSProperty
    double getDefaultValue();

    @JSProperty
    double getMaxValue();

    @JSProperty
    double getMinValue();

    @JSProperty
    double getValue();

    @JSProperty
    void setValue(double value);

    AudioParam cancelAndHoldAtTime(double cancelTime);

    AudioParam cancelScheduledValues(double cancelTime);

    AudioParam exponentialRampToValueAtTime(double value, double endTime);

    AudioParam linearRampToValueAtTime(double value, double endTime);

    AudioParam setTargetAtTime(double target, double startTime, double timeConstant);

    AudioParam setValueAtTime(double value, double startTime);

    AudioParam setValueCurveAtTime(@JSByRef double[] values, double startTime, double duration);

    AudioParam setValueCurveAtTime(Float32Array values, double startTime, double duration);

    AudioParam setValueCurveAtTime(DoubleIterable values, double startTime, double duration);

}
