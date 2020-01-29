package js.web.credentialmanagement;

import js.lang.Any;
import js.lang.Promise;
import js.lang.VoidPromise;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSMethod;


public interface CredentialsContainer extends Any {
    Promise<Credential> create(CredentialCreationOptions options);
    @JSMethod("create")
    Promise<Credential> createDefault();
    Promise<Credential> get(CredentialRequestOptions options);
    Promise<Credential> get();
    VoidPromise preventSilentAccess();
    Promise<Credential> store(Credential credential);

    @JSBody(script = "return CredentialsContainer.prototype")
    static CredentialsContainer prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new CredentialsContainer()")
    static CredentialsContainer create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

}
