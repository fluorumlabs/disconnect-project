package js.web.credentialmanagement.webauthn;

import js.lang.Any;
import js.web.webcrypto.CryptoKey;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;


public interface ScopedCredentialInfo extends Any {
    @JSBody(script = "return ScopedCredentialInfo.prototype")
    static ScopedCredentialInfo prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new ScopedCredentialInfo()")
    static ScopedCredentialInfo create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    ScopedCredential getCredential();

    @JSProperty
    CryptoKey getPublicKey();

}
