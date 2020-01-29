package js.web.credentialmanagement.webauthn;

import js.lang.Any;
import js.util.buffers.ArrayBuffer;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;


public interface WebAuthnAssertion extends Any {
    @JSBody(script = "return WebAuthnAssertion.prototype")
    static WebAuthnAssertion prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new WebAuthnAssertion()")
    static WebAuthnAssertion create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    ArrayBuffer getAuthenticatorData();

    @JSProperty
    ArrayBuffer getClientData();

    @JSProperty
    ScopedCredential getCredential();

    @JSProperty
    ArrayBuffer getSignature();


}
