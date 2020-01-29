package js.web.webcrypto;

import org.teavm.jso.JSProperty;


public interface AesKeyGenParams extends Algorithm {
    @JSProperty
    int getLength();

    @JSProperty
    void setLength(int length);

}
