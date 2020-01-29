package js.web.webrtc;


import org.teavm.jso.JSProperty;


public interface RTCOfferOptions extends RTCOfferAnswerOptions {
    @JSProperty
    boolean isIceRestart();

    @JSProperty
    void setIceRestart(boolean iceRestart);

    @JSProperty
    boolean isOfferToReceiveAudio();

    @JSProperty
    void setOfferToReceiveAudio(boolean offerToReceiveAudio);

    @JSProperty
    boolean isOfferToReceiveVideo();

    @JSProperty
    void setOfferToReceiveVideo(boolean offerToReceiveVideo);

}
