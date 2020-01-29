package js.web.webcrypto;

import js.extras.JsEnum;
import js.lang.Any;
import js.lang.BooleanPromiseLike;
import js.lang.PromiseLike;
import js.lang.Unknown;
import js.util.buffers.ArrayBuffer;
import js.web.dom.BufferSource;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSByRef;

/**
 * This Web Crypto API interface provides a number of low-level cryptographic functions. It is accessed via the Crypto.subtle properties available in a window context (via Window.crypto).
 */
public interface SubtleCrypto extends Any {
    @JSBody(script = "return SubtleCrypto.prototype")
    static SubtleCrypto prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new SubtleCrypto()")
    static SubtleCrypto create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    PromiseLike<ArrayBuffer> decrypt(String algorithm, CryptoKey key, BufferSource data);

    PromiseLike<ArrayBuffer> decrypt(Algorithm algorithm, CryptoKey key, BufferSource data);

    PromiseLike<ArrayBuffer> deriveBits(String algorithm, CryptoKey baseKey, int length);

    PromiseLike<ArrayBuffer> deriveBits(Algorithm algorithm, CryptoKey baseKey, int length);

    PromiseLike<CryptoKey> deriveKey(String algorithm, CryptoKey baseKey, String derivedKeyType, boolean extractable, @JSByRef String... keyUsages);

    PromiseLike<CryptoKey> deriveKey(Algorithm algorithm, CryptoKey baseKey, String derivedKeyType, boolean extractable, @JSByRef String... keyUsages);

    PromiseLike<CryptoKey> deriveKey(String algorithm, CryptoKey baseKey, Algorithm derivedKeyType, boolean extractable, @JSByRef String... keyUsages);

    PromiseLike<CryptoKey> deriveKey(Algorithm algorithm, CryptoKey baseKey, Algorithm derivedKeyType, boolean extractable, @JSByRef String... keyUsages);

    PromiseLike<ArrayBuffer> digest(String algorithm, BufferSource data);

    PromiseLike<ArrayBuffer> digest(Algorithm algorithm, BufferSource data);

    PromiseLike<ArrayBuffer> encrypt(String algorithm, CryptoKey key, BufferSource data);

    PromiseLike<ArrayBuffer> encrypt(Algorithm algorithm, CryptoKey key, BufferSource data);

    PromiseLike<JsonWebKey> exportKey(FormatJwk format, CryptoKey key);

    PromiseLike<ArrayBuffer> exportKey(Format format, CryptoKey key);

    PromiseLike<Unknown> exportKey(String format, CryptoKey key);

    PromiseLike<Unknown> generateKey(String algorithm, boolean extractable, @JSByRef String... keyUsages);

    PromiseLike<Unknown> generateKey(Algorithm algorithm, boolean extractable, @JSByRef String... keyUsages);

    PromiseLike<CryptoKey> importKey(FormatJwk format, JsonWebKey keyData, String algorithm, boolean extractable, @JSByRef String... keyUsages);

    PromiseLike<CryptoKey> importKey(FormatJwk format, JsonWebKey keyData, Algorithm algorithm, boolean extractable, @JSByRef String... keyUsages);

    PromiseLike<CryptoKey> importKey(Format format, BufferSource keyData, String algorithm, boolean extractable, @JSByRef String... keyUsages);

    PromiseLike<CryptoKey> importKey(Format format, BufferSource keyData, Algorithm algorithm, boolean extractable, @JSByRef String... keyUsages);

    PromiseLike<CryptoKey> importKey(String format, JsonWebKey keyData, String algorithm, boolean extractable, @JSByRef String... keyUsages);

    PromiseLike<CryptoKey> importKey(String format, BufferSource keyData, String algorithm, boolean extractable, @JSByRef String... keyUsages);

    PromiseLike<CryptoKey> importKey(String format, JsonWebKey keyData, Algorithm algorithm, boolean extractable, @JSByRef String... keyUsages);

    PromiseLike<CryptoKey> importKey(String format, BufferSource keyData, Algorithm algorithm, boolean extractable, @JSByRef String... keyUsages);

    PromiseLike<ArrayBuffer> sign(String algorithm, CryptoKey key, BufferSource data);

    PromiseLike<ArrayBuffer> sign(Algorithm algorithm, CryptoKey key, BufferSource data);

    PromiseLike<CryptoKey> unwrapKey(String format, BufferSource wrappedKey, CryptoKey unwrappingKey, String unwrapAlgorithm, String unwrappedKeyAlgorithm, boolean extractable, @JSByRef String... keyUsages);

    PromiseLike<CryptoKey> unwrapKey(String format, BufferSource wrappedKey, CryptoKey unwrappingKey, Algorithm unwrapAlgorithm, String unwrappedKeyAlgorithm, boolean extractable, @JSByRef String... keyUsages);

    PromiseLike<CryptoKey> unwrapKey(String format, BufferSource wrappedKey, CryptoKey unwrappingKey, String unwrapAlgorithm, Algorithm unwrappedKeyAlgorithm, boolean extractable, @JSByRef String... keyUsages);

    PromiseLike<CryptoKey> unwrapKey(String format, BufferSource wrappedKey, CryptoKey unwrappingKey, Algorithm unwrapAlgorithm, Algorithm unwrappedKeyAlgorithm, boolean extractable, @JSByRef String... keyUsages);

    BooleanPromiseLike verify(String algorithm, CryptoKey key, BufferSource signature, BufferSource data);

    BooleanPromiseLike verify(Algorithm algorithm, CryptoKey key, BufferSource signature, BufferSource data);

    PromiseLike<ArrayBuffer> wrapKey(String format, CryptoKey key, CryptoKey wrappingKey, String wrapAlgorithm);

    PromiseLike<ArrayBuffer> wrapKey(String format, CryptoKey key, CryptoKey wrappingKey, Algorithm wrapAlgorithm);

    abstract class FormatJwk extends JsEnum {
        public static final FormatJwk JWK = JsEnum.of("jwk");

    }

    abstract class Format extends JsEnum {
        public static final Format RAW = JsEnum.of("raw");

        public static final Format PKCS8 = JsEnum.of("pkcs8");

        public static final Format SPKI = JsEnum.of("spki");

    }

}
