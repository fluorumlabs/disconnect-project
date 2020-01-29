package js.web.webcrypto;

import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

import js.web.dom.BufferSource;


public interface AesGcmParams extends Algorithm {
    @JSProperty
    @Nullable
    BufferSource getAdditionalData();

    @JSProperty
    void setAdditionalData(BufferSource additionalData);

    @JSProperty
    BufferSource getIv();

    @JSProperty
    void setIv(BufferSource iv);

    @JSProperty
    int getTagLength();

    @JSProperty
    void setTagLength(int tagLength);

}
