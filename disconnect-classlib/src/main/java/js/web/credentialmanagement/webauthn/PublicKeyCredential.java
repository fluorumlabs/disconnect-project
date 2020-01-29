package js.web.credentialmanagement.webauthn;

import js.lang.BooleanPromise;
import js.util.buffers.ArrayBuffer;
import js.web.credentialmanagement.Credential;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;


public interface PublicKeyCredential extends Credential {
    @JSBody(script = "return PublicKeyCredential.prototype")
    static PublicKeyCredential prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new PublicKeyCredential()")
    static PublicKeyCredential create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return PublicKeyCredential.isUserVerifyingPlatformAuthenticatorAvailable()")
    static BooleanPromise isUserVerifyingPlatformAuthenticatorAvailable() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    ArrayBuffer getRawId();

    @JSProperty
    AuthenticatorResponse getResponse();

    AuthenticationExtensionsClientOutputs getClientExtensionResults();
}
