package js.web.encoding;

import js.web.streams.GenericTransformStream;
import org.teavm.jso.JSBody;


public interface TextDecoderStream extends GenericTransformStream, TextDecoderCommon {
    @JSBody(script = "return TextDecoderStream.prototype")
    static TextDecoderStream prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new TextDecoderStream()")
    static TextDecoderStream create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = {"label", "options"}, script = "return new TextDecoderStream(label, options)")
    static TextDecoderStream create(String label, TextDecoderOptions options) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = {"label"}, script = "return new TextDecoderStream(label)")
    static TextDecoderStream create(String label) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

}
