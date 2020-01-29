package js.web.credentialmanagement.webauthn;

import js.lang.Any;
import js.lang.Promise;
import js.util.collections.Array;
import js.util.iterable.JsIterable;
import js.web.dom.BufferSource;
import js.web.webcrypto.Account;
import js.web.webcrypto.AssertionOptions;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSByRef;

import javax.annotation.Nullable;


public interface WebAuthentication extends Any {
    @JSBody(script = "return WebAuthentication.prototype")
    static WebAuthentication prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new WebAuthentication()")
    static WebAuthentication create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    Promise<WebAuthnAssertion> getAssertion(@Nullable BufferSource assertionChallenge, AssertionOptions options);

    Promise<WebAuthnAssertion> getAssertion(@Nullable BufferSource assertionChallenge);

    Promise<ScopedCredentialInfo> makeCredential(Account accountInformation, Array<ScopedCredentialParameters> cryptoParameters, @Nullable BufferSource attestationChallenge, ScopedCredentialOptions options);

    Promise<ScopedCredentialInfo> makeCredential(Account accountInformation, JsIterable<ScopedCredentialParameters> cryptoParameters, @Nullable BufferSource attestationChallenge, ScopedCredentialOptions options);

    Promise<ScopedCredentialInfo> makeCredential(Account accountInformation, @JSByRef ScopedCredentialParameters[] cryptoParameters, @Nullable BufferSource attestationChallenge, ScopedCredentialOptions options);

    Promise<ScopedCredentialInfo> makeCredential(Account accountInformation, Array<ScopedCredentialParameters> cryptoParameters, @Nullable BufferSource attestationChallenge);

    Promise<ScopedCredentialInfo> makeCredential(Account accountInformation, JsIterable<ScopedCredentialParameters> cryptoParameters, @Nullable BufferSource attestationChallenge);

    Promise<ScopedCredentialInfo> makeCredential(Account accountInformation, @JSByRef ScopedCredentialParameters[] cryptoParameters, @Nullable BufferSource attestationChallenge);

}
