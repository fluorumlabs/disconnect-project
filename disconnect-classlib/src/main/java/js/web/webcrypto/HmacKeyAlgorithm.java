package js.web.webcrypto;

import org.teavm.jso.JSProperty;


public interface HmacKeyAlgorithm extends KeyAlgorithm {
    @JSProperty
    KeyAlgorithm getHash();

    @JSProperty
    void setHash(KeyAlgorithm hash);

    @JSProperty
    double getLength();

    @JSProperty
    void setLength(double length);

}
