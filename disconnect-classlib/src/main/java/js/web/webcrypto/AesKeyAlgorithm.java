package js.web.webcrypto;

import org.teavm.jso.JSProperty;


public interface AesKeyAlgorithm extends KeyAlgorithm {
    @JSProperty
    int getLength();

    @JSProperty
    void setLength(int length);

}
