package js.web.webcrypto;

import js.web.dom.BufferSource;
import org.teavm.jso.JSProperty;


public interface AesCtrParams extends Algorithm {
    @JSProperty
    BufferSource getCounter();

    @JSProperty
    void setCounter(BufferSource counter);

    @JSProperty
    int getLength();

    @JSProperty
    void setLength(int length);

}
