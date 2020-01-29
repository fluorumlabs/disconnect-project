package js.web.webcrypto;

import org.teavm.jso.JSProperty;


public interface DhKeyDeriveParams extends Algorithm {
    @JSProperty
    CryptoKey getPublic();

    @JSProperty
    void setPublic(CryptoKey publicValue);

}
