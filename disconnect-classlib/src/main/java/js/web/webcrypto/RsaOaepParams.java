package js.web.webcrypto;

import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

import js.web.dom.BufferSource;


public interface RsaOaepParams extends Algorithm {
    @JSProperty
    @Nullable
    BufferSource getLabel();

    @JSProperty
    void setLabel(BufferSource label);

}
