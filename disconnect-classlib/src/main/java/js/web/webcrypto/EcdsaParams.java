package js.web.webcrypto;

import org.teavm.jso.JSProperty;

import js.lang.Unknown;


public interface EcdsaParams extends Algorithm {
    @JSProperty
    Unknown getHash();

    @JSProperty
    void setHash(String hash);
    @JSProperty
    void setHash(Algorithm hash);

}
