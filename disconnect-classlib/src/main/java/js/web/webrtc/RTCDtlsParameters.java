package js.web.webrtc;

import js.lang.Any;
import js.util.collections.Array;
import org.teavm.jso.JSByRef;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


public interface RTCDtlsParameters extends Any {
    @JSProperty
    @Nullable
    Array<RTCDtlsFingerprint> getFingerprints();

    @JSProperty
    void setFingerprints(RTCDtlsFingerprint... fingerprints);

    @JSProperty
    void setFingerprints(Array<RTCDtlsFingerprint> fingerprints);

    @JSProperty
    @Nullable
    RTCDtlsRole getRole();

    @JSProperty
    void setRole(RTCDtlsRole role);

}
