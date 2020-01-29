package js.web.credentialmanagement;

import js.lang.Any;
import js.web.dom.AbortSignal;
import js.web.credentialmanagement.webauthn.PublicKeyCredentialCreationOptions;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


public interface CredentialCreationOptions extends Any {
    @JSProperty
    @Nullable
    PublicKeyCredentialCreationOptions getPublicKey();

    @JSProperty
    void setPublicKey(PublicKeyCredentialCreationOptions publicKey);

    @JSProperty
    @Nullable
    AbortSignal getSignal();

    @JSProperty
    void setSignal(AbortSignal signal);

}
