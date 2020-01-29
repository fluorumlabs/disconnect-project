package js.web.credentialmanagement.webauthn;

import js.util.buffers.ArrayBuffer;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import js.lang.Any;


public interface WebAuthnAssertion extends Any {
        @JSProperty
        ArrayBuffer getAuthenticatorData();

        @JSProperty
        ArrayBuffer getClientData();

        @JSProperty
        ScopedCredential getCredential();

        @JSProperty
        ArrayBuffer getSignature();

        @JSBody(script = "return WebAuthnAssertion.prototype")
        static WebAuthnAssertion prototype() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(script = "return new WebAuthnAssertion()")
        static WebAuthnAssertion create() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }


        }
