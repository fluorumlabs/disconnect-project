package js.web.encoding;

import js.util.buffers.Uint8Array;
import org.teavm.jso.JSBody;

/**
 * TextEncoder takes a stream of code points as input and emits a stream of bytes. For a more scalable, non-native library, see StringView – a C-like representation of strings based on typed arrays.
 */
public interface TextEncoder extends TextEncoderCommon {
    /**
     * Returns the result of running UTF-8's encoder.
     */
    Uint8Array encode(String input);

    Uint8Array encode();

    /**
     * Runs the UTF-8 encoder on source, stores the result of that operation into destination, and returns the progress made as a dictionary whereby read is the number of converted code units of source and written is the number of bytes modified in destination.
     */
    TextEncoderEncodeIntoResult encodeInto(String source, Uint8Array destination);

    @JSBody(script = "return TextEncoder.prototype")
    static TextEncoder prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new TextEncoder()")
    static TextEncoder create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

}
