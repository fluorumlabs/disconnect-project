package js.web.encoding;

import js.web.streams.GenericTransformStream;
import org.teavm.jso.JSBody;


public interface TextEncoderStream extends GenericTransformStream, TextEncoderCommon {
    @JSBody(script = "return TextEncoderStream.prototype")
    static TextEncoderStream prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new TextEncoderStream()")
    static TextEncoderStream create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

}
