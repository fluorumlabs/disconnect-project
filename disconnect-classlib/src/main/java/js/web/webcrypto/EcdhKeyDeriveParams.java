package js.web.webcrypto;

import org.teavm.jso.JSProperty;


public interface EcdhKeyDeriveParams extends Algorithm {
    @JSProperty
    CryptoKey getPublic();

    @JSProperty
    void setPublic(CryptoKey publicValue);

}
