package js.web.credentialmanagement.webauthn;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import js.util.buffers.ArrayBuffer;


public interface AuthenticatorAttestationResponse extends AuthenticatorResponse {
    @JSProperty
    ArrayBuffer getAttestationObject();

    @JSBody(script = "return AuthenticatorAttestationResponse.prototype")
    static AuthenticatorAttestationResponse prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new AuthenticatorAttestationResponse()")
    static AuthenticatorAttestationResponse create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

}
