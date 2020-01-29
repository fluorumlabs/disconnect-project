package js.web.credentialmanagement;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import js.lang.Any;


public interface Credential extends Any {
    @JSProperty
    String getId();

    @JSProperty
    String getType();

    @JSBody(script = "return Credential.prototype")
    static Credential prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new Credential()")
    static Credential create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

}
