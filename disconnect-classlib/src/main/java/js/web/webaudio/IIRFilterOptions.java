package js.web.webaudio;

import org.teavm.jso.JSProperty;

import org.teavm.jso.JSByRef;


public interface IIRFilterOptions extends AudioNodeOptions {
    @JSProperty
    double[] getFeedback();

    @JSProperty
    void setFeedback(@JSByRef double[] feedback);

    @JSProperty
    double[] getFeedforward();

    @JSProperty
    void setFeedforward(@JSByRef double[] feedforward);

}
