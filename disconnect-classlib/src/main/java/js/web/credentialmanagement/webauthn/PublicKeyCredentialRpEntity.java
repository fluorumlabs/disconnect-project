package js.web.credentialmanagement.webauthn;


import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


public interface PublicKeyCredentialRpEntity extends PublicKeyCredentialEntity {
    @JSProperty
    @Nullable
    String getId();

    @JSProperty
    void setId(String id);

}
