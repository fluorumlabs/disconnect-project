package js.web.webcrypto;

import js.lang.Unknown;
import js.web.dom.BufferSource;
import org.teavm.jso.JSProperty;


public interface HkdfParams extends Algorithm {
    @JSProperty
    Unknown getHash();

    @JSProperty
    void setHash(String hash);

    @JSProperty
    void setHash(Algorithm hash);

    @JSProperty
    BufferSource getInfo();

    @JSProperty
    void setInfo(BufferSource info);

    @JSProperty
    BufferSource getSalt();

    @JSProperty
    void setSalt(BufferSource salt);

}
