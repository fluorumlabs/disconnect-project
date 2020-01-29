package js.web.webaudio;

import org.teavm.jso.JSBody;

/** The ChannelMergerNode interface, often used in conjunction with its opposite, ChannelSplitterNode, reunites different mono inputs into a single output. Each input is used to fill a channel of the output. This is useful for accessing each channels separately, e.g. for performing channel mixing where gain must be separately controlled on each channel. */
public interface ChannelMergerNode extends AudioNode {
    @JSBody(script = "return ChannelMergerNode.prototype")
    static ChannelMergerNode prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params={"context","options"}, script = "return new ChannelMergerNode(context, options)")
    static ChannelMergerNode create(BaseAudioContext context, ChannelMergerOptions options) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params="context", script = "return new ChannelMergerNode(context)")
    static ChannelMergerNode create(BaseAudioContext context) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }


}
