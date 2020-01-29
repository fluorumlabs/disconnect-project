package js.web.credentialmanagement.webauthn;

import js.util.collections.Array;
import js.web.dom.BufferSource;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;import js.lang.Any;

import org.teavm.jso.JSByRef;


public interface PublicKeyCredentialCreationOptions extends Any {
    @JSProperty
    @Nullable
    AttestationConveyancePreference getAttestation();

    @JSProperty
    void setAttestation(AttestationConveyancePreference attestation);

    @JSProperty
    @Nullable
    AuthenticatorSelectionCriteria getAuthenticatorSelection();

    @JSProperty
    void setAuthenticatorSelection(AuthenticatorSelectionCriteria authenticatorSelection);

    @JSProperty
    BufferSource getChallenge();

    @JSProperty
    void setChallenge(BufferSource challenge);

    @JSProperty
    @Nullable
    Array<PublicKeyCredentialDescriptor> getExcludeCredentials();

    @JSProperty
    void setExcludeCredentials(@JSByRef PublicKeyCredentialDescriptor... excludeCredentials);
    @JSProperty
    void setExcludeCredentials(Array<PublicKeyCredentialDescriptor> excludeCredentials);

    @JSProperty
    @Nullable
    AuthenticationExtensionsClientInputs getExtensions();

    @JSProperty
    void setExtensions(AuthenticationExtensionsClientInputs extensions);

    @JSProperty
    Array<PublicKeyCredentialParameters> getPubKeyCredParams();

    @JSProperty
    void setPubKeyCredParams(@JSByRef PublicKeyCredentialParameters... pubKeyCredParams);
    @JSProperty
    void setPubKeyCredParams(Array<PublicKeyCredentialParameters> pubKeyCredParams);

    @JSProperty
    PublicKeyCredentialRpEntity getRp();

    @JSProperty
    void setRp(PublicKeyCredentialRpEntity rp);

    @JSProperty
    double getTimeout();

    @JSProperty
    void setTimeout(double timeout);

    @JSProperty
    PublicKeyCredentialUserEntity getUser();

    @JSProperty
    void setUser(PublicKeyCredentialUserEntity user);

}
