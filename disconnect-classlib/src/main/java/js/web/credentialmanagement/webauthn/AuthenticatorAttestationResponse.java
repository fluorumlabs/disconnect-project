package js.web.credentialmanagement.webauthn;

import js.util.buffers.ArrayBuffer;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;


public interface AuthenticatorAttestationResponse extends AuthenticatorResponse {
    @JSBody(script = "return AuthenticatorAttestationResponse.prototype")
    static AuthenticatorAttestationResponse prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new AuthenticatorAttestationResponse()")
    static AuthenticatorAttestationResponse create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    ArrayBuffer getAttestationObject();

}
