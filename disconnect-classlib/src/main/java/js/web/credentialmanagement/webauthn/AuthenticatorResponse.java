package js.web.credentialmanagement.webauthn;

import js.lang.Any;
import js.util.buffers.ArrayBuffer;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;


public interface AuthenticatorResponse extends Any {
    @JSBody(script = "return AuthenticatorResponse.prototype")
    static AuthenticatorResponse prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new AuthenticatorResponse()")
    static AuthenticatorResponse create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    ArrayBuffer getClientDataJSON();
}
