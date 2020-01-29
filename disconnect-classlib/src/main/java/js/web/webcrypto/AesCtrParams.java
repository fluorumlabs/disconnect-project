package js.web.webcrypto;

import org.teavm.jso.JSProperty;

import js.web.dom.BufferSource;


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
