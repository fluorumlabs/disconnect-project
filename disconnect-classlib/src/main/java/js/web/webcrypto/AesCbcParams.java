package js.web.webcrypto;

import js.web.dom.BufferSource;
import org.teavm.jso.JSProperty;


public interface AesCbcParams extends Algorithm {
    @JSProperty
    BufferSource getIv();

    @JSProperty
    void setIv(BufferSource iv);


}
