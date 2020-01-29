package js.web.webrtc;


import org.teavm.jso.JSProperty;


public interface RTCRtpSynchronizationSource extends RTCRtpContributingSource {
    @JSProperty
    boolean isVoiceActivityFlag();

    @JSProperty
    void setVoiceActivityFlag(boolean voiceActivityFlag);

}
