package js.web.credentialmanagement.webauthn;

import js.util.buffers.ArrayBuffer;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import js.lang.Any;


public interface ScopedCredential extends Any {
        @JSProperty
        ArrayBuffer getId();

        @JSProperty
        ScopedCredentialType getType();

        @JSBody(script = "return ScopedCredential.prototype")
        static ScopedCredential prototype() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(script = "return new ScopedCredential()")
        static ScopedCredential create() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }


        }
