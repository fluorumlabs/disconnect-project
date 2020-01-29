package js.web.webcrypto;

import js.lang.Any;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/**
 * The CryptoKeyPair dictionary of the Web Crypto API represents a key pair for an asymmetric cryptography algorithm, also known as a public-key algorithm.
 */
public interface CryptoKeyPair extends Any {
    @JSBody(script = "return CryptoKeyPair.prototype")
    static CryptoKeyPair prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new CryptoKeyPair()")
    static CryptoKeyPair create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    CryptoKey getPrivateKey();

    @JSProperty
    void setPrivateKey(CryptoKey privateKey);

    @JSProperty
    CryptoKey getPublicKey();

    @JSProperty
    void setPublicKey(CryptoKey publicKey);

}
