package js.web.webcrypto;

import js.lang.Unknown;
import org.teavm.jso.JSProperty;


public interface RsaHashedKeyGenParams extends RsaKeyGenParams {
    @JSProperty
    Unknown getHash();

    @JSProperty
    void setHash(String hash);

    @JSProperty
    void setHash(Algorithm hash);

}
