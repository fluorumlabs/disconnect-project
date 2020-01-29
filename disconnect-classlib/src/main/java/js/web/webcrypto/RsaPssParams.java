package js.web.webcrypto;

import org.teavm.jso.JSProperty;


public interface RsaPssParams extends Algorithm {
    @JSProperty
    int getSaltLength();

    @JSProperty
    void setSaltLength(int saltLength);

}
