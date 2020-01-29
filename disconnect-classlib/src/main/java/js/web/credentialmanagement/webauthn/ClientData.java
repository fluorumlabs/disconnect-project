package js.web.credentialmanagement.webauthn;

import js.lang.Any;
import js.lang.Unknown;
import js.web.webcrypto.Algorithm;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


public interface ClientData extends Any {
    @JSProperty
    String getChallenge();

    @JSProperty
    void setChallenge(String challenge);

    @JSProperty
    @Nullable
    WebAuthnExtensions getExtensions();

    @JSProperty
    void setExtensions(WebAuthnExtensions extensions);

    @JSProperty
    Unknown getHashAlg();

    @JSProperty
    void setHashAlg(String hashAlg);
    @JSProperty
    void setHashAlg(Algorithm hashAlg);

    @JSProperty
    String getOrigin();

    @JSProperty
    void setOrigin(String origin);

    @JSProperty
    String getRpId();

    @JSProperty
    void setRpId(String rpId);

    @JSProperty
    @Nullable
    String getTokenBinding();

    @JSProperty
    void setTokenBinding(String tokenBinding);

}
