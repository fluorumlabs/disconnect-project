package js.web.webrtc;

import js.lang.Any;
import org.teavm.jso.JSProperty;


public interface RTCOfferAnswerOptions extends Any {
    @JSProperty
    boolean isVoiceActivityDetection();

    @JSProperty
    void setVoiceActivityDetection(boolean voiceActivityDetection);

}
