package js.web.webaudio;

import org.teavm.jso.JSBody;

/** The ChannelSplitterNode interface, often used in conjunction with its opposite, ChannelMergerNode, separates the different channels of an audio source into a set of mono outputs. This is useful for accessing each channel separately, e.g. for performing channel mixing where gain must be separately controlled on each channel. */
public interface ChannelSplitterNode extends AudioNode {
    @JSBody(script = "return ChannelSplitterNode.prototype")
    static ChannelSplitterNode prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params={"context","options"}, script = "return new ChannelSplitterNode(context, options)")
    static ChannelSplitterNode create(BaseAudioContext context, ChannelSplitterOptions options) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params="context", script = "return new ChannelSplitterNode(context)")
    static ChannelSplitterNode create(BaseAudioContext context) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

}
