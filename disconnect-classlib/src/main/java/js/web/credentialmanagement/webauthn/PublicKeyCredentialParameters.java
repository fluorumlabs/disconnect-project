package js.web.credentialmanagement.webauthn;

import org.teavm.jso.JSProperty;

import js.lang.Any;


public interface PublicKeyCredentialParameters extends Any {
    @JSProperty
    int getAlg();

    @JSProperty
    void setAlg(int alg);

    @JSProperty
    PublicKeyCredentialType getType();

    @JSProperty
    void setType(PublicKeyCredentialType type);

}
