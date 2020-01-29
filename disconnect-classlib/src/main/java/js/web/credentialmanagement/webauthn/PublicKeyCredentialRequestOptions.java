package js.web.credentialmanagement.webauthn;

import js.web.dom.BufferSource;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;import js.lang.Any;
import js.util.collections.Array;

import org.teavm.jso.JSByRef;


public interface PublicKeyCredentialRequestOptions extends Any {
    @JSProperty
    @Nullable
    Array<PublicKeyCredentialDescriptor> getAllowCredentials();

    @JSProperty
    void setAllowCredentials(@JSByRef PublicKeyCredentialDescriptor... allowCredentials);
    @JSProperty
    void setAllowCredentials(Array<PublicKeyCredentialDescriptor> allowCredentials);

    @JSProperty
    BufferSource getChallenge();

    @JSProperty
    void setChallenge(BufferSource challenge);

    @JSProperty
    @Nullable
    AuthenticationExtensionsClientInputs getExtensions();

    @JSProperty
    void setExtensions(AuthenticationExtensionsClientInputs extensions);

    @JSProperty
    @Nullable
    String getRpId();

    @JSProperty
    void setRpId(String rpId);

    @JSProperty
    double getTimeout();

    @JSProperty
    void setTimeout(double timeout);

    @JSProperty
    @Nullable
    UserVerificationRequirement getUserVerification();

    @JSProperty
    void setUserVerification(UserVerificationRequirement userVerification);

}
