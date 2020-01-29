package js.web.webrtc;

import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;import js.lang.Any;


public interface RTCDtlsFingerprint extends Any {
    @JSProperty
    @Nullable
    String getAlgorithm();

    @JSProperty
    void setAlgorithm(String algorithm);

    @JSProperty
    @Nullable
    String getValue();

    @JSProperty
    void setValue(String value);

}
