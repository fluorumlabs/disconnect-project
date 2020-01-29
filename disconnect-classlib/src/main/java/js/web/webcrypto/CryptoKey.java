package js.web.webcrypto;

import js.util.collections.Array;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import js.lang.Any;

/** The CryptoKey dictionary of the Web Crypto API represents a cryptographic key. */
public interface CryptoKey extends Any {
    @JSProperty
    KeyAlgorithm getAlgorithm();

    @JSProperty
    boolean isExtractable();

    @JSProperty
    KeyType getType();

    @JSProperty
    Array<KeyUsage> getUsages();

    @JSBody(script = "return CryptoKey.prototype")
    static CryptoKey prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new CryptoKey()")
    static CryptoKey create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

}
