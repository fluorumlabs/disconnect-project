package js.web.credentialmanagement.webauthn;

import org.teavm.jso.JSProperty;

import js.lang.Any;
import js.lang.Unknown;
import js.web.webcrypto.Algorithm;


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
