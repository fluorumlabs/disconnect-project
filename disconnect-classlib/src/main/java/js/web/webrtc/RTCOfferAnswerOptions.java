package js.web.webrtc;

import org.teavm.jso.JSProperty;

import js.lang.Any;


public interface RTCOfferAnswerOptions extends Any {
    @JSProperty
    boolean isVoiceActivityDetection();

    @JSProperty
    void setVoiceActivityDetection(boolean voiceActivityDetection);

}
