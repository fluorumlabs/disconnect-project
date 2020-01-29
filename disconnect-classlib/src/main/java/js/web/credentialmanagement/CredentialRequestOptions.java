package js.web.credentialmanagement;

import js.lang.Any;
import js.web.dom.AbortSignal;
import js.web.credentialmanagement.webauthn.PublicKeyCredentialRequestOptions;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


public interface CredentialRequestOptions extends Any {
    @JSProperty
    @Nullable
    CredentialMediationRequirement getMediation();

    @JSProperty
    void setMediation(CredentialMediationRequirement mediation);

    @JSProperty
    @Nullable
    PublicKeyCredentialRequestOptions getPublicKey();

    @JSProperty
    void setPublicKey(PublicKeyCredentialRequestOptions publicKey);

    @JSProperty
    @Nullable
    AbortSignal getSignal();

    @JSProperty
    void setSignal(AbortSignal signal);

}
