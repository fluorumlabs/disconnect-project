package js.web.webcrypto;

import org.teavm.jso.JSProperty;


public interface AesCmacParams extends Algorithm {
    @JSProperty
    int getLength();

    @JSProperty
    void setLength(int length);

}
