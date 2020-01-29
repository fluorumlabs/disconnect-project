package js.web.credentialmanagement.webauthn;

import js.lang.Any;
import org.teavm.jso.JSProperty;


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
