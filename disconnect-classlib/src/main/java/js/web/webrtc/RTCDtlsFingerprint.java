package js.web.webrtc;

import js.lang.Any;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


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
