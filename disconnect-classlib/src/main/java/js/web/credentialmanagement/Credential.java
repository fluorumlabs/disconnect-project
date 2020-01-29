package js.web.credentialmanagement;

import js.lang.Any;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;


public interface Credential extends Any {
    @JSBody(script = "return Credential.prototype")
    static Credential prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new Credential()")
    static Credential create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    String getId();

    @JSProperty
    String getType();

}
