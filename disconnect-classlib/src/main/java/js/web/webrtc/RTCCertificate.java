package js.web.webrtc;

import js.lang.Any;
import js.lang.Unknown;
import js.util.collections.Array;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;


public interface RTCCertificate extends Any {
    @JSBody(script = "return RTCCertificate.prototype")
    static RTCCertificate prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new RTCCertificate()")
    static RTCCertificate create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return RTCCertificate.getSupportedAlgorithms()")
    static Array<Unknown> getSupportedAlgorithms() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    double getExpires();

    Array<RTCDtlsFingerprint> getFingerprints();
}
