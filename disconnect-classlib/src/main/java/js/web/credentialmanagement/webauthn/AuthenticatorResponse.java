package js.web.credentialmanagement.webauthn;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import js.lang.Any;
import js.util.buffers.ArrayBuffer;


public interface AuthenticatorResponse extends Any {
    @JSProperty
    ArrayBuffer getClientDataJSON();

    @JSBody(script = "return AuthenticatorResponse.prototype")
    static AuthenticatorResponse prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new AuthenticatorResponse()")
    static AuthenticatorResponse create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }
}
