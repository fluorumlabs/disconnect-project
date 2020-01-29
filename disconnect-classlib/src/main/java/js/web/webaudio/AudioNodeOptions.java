package js.web.webaudio;

import js.lang.Any;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


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
