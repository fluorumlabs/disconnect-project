package js.web.webaudio;


import org.teavm.jso.JSProperty;


public interface ChannelSplitterOptions extends AudioNodeOptions {
    @JSProperty
    int getNumberOfOutputs();

    @JSProperty
    void setNumberOfOutputs(int numberOfOutputs);

}
