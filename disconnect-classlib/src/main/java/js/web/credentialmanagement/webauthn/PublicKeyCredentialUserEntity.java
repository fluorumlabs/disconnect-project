package js.web.credentialmanagement.webauthn;

import js.web.dom.BufferSource;
import org.teavm.jso.JSProperty;


public interface PublicKeyCredentialUserEntity extends PublicKeyCredentialEntity {
    @JSProperty
    String getDisplayName();

    @JSProperty
    void setDisplayName(String displayName);

    @JSProperty
    BufferSource getId();

    @JSProperty
    void setId(BufferSource id);

}
