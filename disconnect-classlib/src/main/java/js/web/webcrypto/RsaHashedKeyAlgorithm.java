package js.web.webcrypto;

import org.teavm.jso.JSProperty;


public interface RsaHashedKeyAlgorithm extends RsaKeyAlgorithm {
    @JSProperty
    KeyAlgorithm getHash();

    @JSProperty
    void setHash(KeyAlgorithm hash);

}
