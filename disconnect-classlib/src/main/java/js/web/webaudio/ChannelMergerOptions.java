package js.web.webaudio;


import org.teavm.jso.JSProperty;


public interface ChannelMergerOptions extends AudioNodeOptions {
    @JSProperty
    int getNumberOfInputs();

    @JSProperty
    void setNumberOfInputs(int numberOfInputs);

}
