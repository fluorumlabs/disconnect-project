package js.web.credentialmanagement.webauthn;

import js.lang.Any;
import js.lang.Unknown;
import js.web.webcrypto.Algorithm;
import org.teavm.jso.JSProperty;


public interface ScopedCredentialParameters extends Any {
    @JSProperty
    Unknown getAlgorithm();

    @JSProperty
    void setAlgorithm(Algorithm algorithm);

    @JSProperty
    void setAlgorithm(String algorithm);

    @JSProperty
    ScopedCredentialType getType();

    @JSProperty
    void setType(ScopedCredentialType type);

}
