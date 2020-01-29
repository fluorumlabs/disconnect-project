package js.web.webcrypto;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import js.lang.Any;
import js.util.buffers.ArrayBufferView;

/** Basic cryptography features available in the current context. It allows access to a cryptographically strong random number generator and to cryptographic primitives. */
public interface Crypto extends Any {
    @JSProperty
    SubtleCrypto getSubtle();

    <T extends ArrayBufferView> T getRandomValues(T array);

    @JSBody(script = "return Crypto.prototype")
    static Crypto prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new Crypto()")
    static Crypto create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

}
