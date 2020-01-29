package js.web.credentialmanagement.webauthn;

import js.lang.Any;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


public interface AuthenticatorSelectionCriteria extends Any {
    @JSProperty
    @Nullable
    AuthenticatorAttachment getAuthenticatorAttachment();

    @JSProperty
    void setAuthenticatorAttachment(AuthenticatorAttachment authenticatorAttachment);

    @JSProperty
    boolean isRequireResidentKey();

    @JSProperty
    void setRequireResidentKey(boolean requireResidentKey);

    @JSProperty
    @Nullable
    UserVerificationRequirement getUserVerification();

    @JSProperty
    void setUserVerification(UserVerificationRequirement userVerification);

}
