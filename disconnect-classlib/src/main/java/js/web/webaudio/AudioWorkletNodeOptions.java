package js.web.webaudio;

import js.lang.Any;
import org.teavm.jso.JSByRef;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


public interface AudioWorkletNodeOptions extends AudioNodeOptions {
    @JSProperty
    int getNumberOfInputs();

    @JSProperty
    void setNumberOfInputs(int numberOfInputs);

    @JSProperty
    int getNumberOfOutputs();

    @JSProperty
    void setNumberOfOutputs(int numberOfOutputs);

    @JSProperty
    @Nullable
    int[] getOutputChannelCount();

    @JSProperty
    void setOutputChannelCount(@JSByRef int[] outputChannelCount);

    //FIXME Record<string, number> parameterData?;

    @JSProperty
    @Nullable
    Any getProcessorOptions();

    @JSProperty
    void setProcessorOptions(Any processorOptions);

}
