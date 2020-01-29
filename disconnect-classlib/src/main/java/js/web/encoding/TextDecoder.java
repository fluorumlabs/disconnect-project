package js.web.encoding;

import js.web.dom.BufferSource;
import org.teavm.jso.JSBody;

/**
 * A decoder for a specific method, that is a specific character encoding, like utf-8, iso-8859-2, koi8, cp1261, gbk, etc. A decoder takes a stream of bytes as input and emits a stream of code points. For a more scalable, non-native library, see StringView – a C-like representation of strings based on typed arrays.
 */
public interface TextDecoder extends TextDecoderCommon {
    /**
     * Returns the result of running encoding's decoder. The method can be invoked zero or more times with options's stream set to true, and then once without options's stream (or set to false), to process a fragmented stream. If the invocation without options's stream (or set to false) has no input, it's clearest to omit both arguments.
     * <p>
     * ```
     * var string = "", decoder = new TextDecoder(encoding), buffer;
     * while(buffer = next_chunk()) {
     * string += decoder.decode(buffer, {true stream});
     * }
     * string += decoder.decode(); // end-of-stream
     * ```
     * <p>
     * If the error mode is "fatal" and encoding's decoder returns error, throws a TypeError.
     */
    String decode(BufferSource input, TextDecodeOptions options);

    String decode(BufferSource input);

    String decode();

    @JSBody(script = "return TextDecoder.prototype")
    static TextDecoder prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new TextDecoder()")
    static TextDecoder create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = "label", script = "return new TextDecoder(label)")
    static TextDecoder create(String label) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = {"label", "options"}, script = "return new TextDecoder(label, options)")
    static TextDecoder create(String label, TextDecoderOptions options) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

}
