package js.web.credentialmanagement.webauthn;

import js.lang.Any;
import js.util.buffers.ArrayBuffer;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;


public interface ScopedCredential extends Any {
    @JSBody(script = "return ScopedCredential.prototype")
    static ScopedCredential prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new ScopedCredential()")
    static ScopedCredential create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    ArrayBuffer getId();

    @JSProperty
    ScopedCredentialType getType();


}
