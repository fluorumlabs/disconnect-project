package js.web.webcrypto;

import js.web.dom.BufferSource;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


public interface RsaOaepParams extends Algorithm {
    @JSProperty
    @Nullable
    BufferSource getLabel();

    @JSProperty
    void setLabel(BufferSource label);

}
