package js.web.webaudio;

import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;import js.lang.Any;


public interface AudioNodeOptions extends Any {
    @JSProperty
    int getChannelCount();

    @JSProperty
    void setChannelCount(int channelCount);

    @JSProperty
    @Nullable
    ChannelCountMode getChannelCountMode();

    @JSProperty
    void setChannelCountMode(ChannelCountMode channelCountMode);

    @JSProperty
    @Nullable
    ChannelInterpretation getChannelInterpretation();

    @JSProperty
    void setChannelInterpretation(ChannelInterpretation channelInterpretation);

}
