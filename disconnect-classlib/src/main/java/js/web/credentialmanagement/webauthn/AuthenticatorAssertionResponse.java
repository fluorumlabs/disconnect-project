package js.web.credentialmanagement.webauthn;

import js.util.buffers.ArrayBuffer;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


public interface AuthenticatorAssertionResponse extends AuthenticatorResponse {
    @JSBody(script = "return AuthenticatorAssertionResponse.prototype")
    static AuthenticatorAssertionResponse prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new AuthenticatorAssertionResponse()")
    static AuthenticatorAssertionResponse create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    ArrayBuffer getAuthenticatorData();

    @JSProperty
    ArrayBuffer getSignature();

    @JSProperty
    @Nullable
    ArrayBuffer getUserHandle();

}
