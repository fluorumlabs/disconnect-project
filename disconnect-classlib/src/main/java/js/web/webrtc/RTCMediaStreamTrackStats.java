package js.web.webrtc;


import org.teavm.jso.JSByRef;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


public interface RTCMediaStreamTrackStats extends RTCStats {
    @JSProperty
    double getAudioLevel();

    @JSProperty
    void setAudioLevel(double audioLevel);

    @JSProperty
    double getEchoReturnLoss();

    @JSProperty
    void setEchoReturnLoss(double echoReturnLoss);

    @JSProperty
    double getEchoReturnLossEnhancement();

    @JSProperty
    void setEchoReturnLossEnhancement(double echoReturnLossEnhancement);

    @JSProperty
    double getFrameHeight();

    @JSProperty
    void setFrameHeight(double frameHeight);

    @JSProperty
    double getFrameWidth();

    @JSProperty
    void setFrameWidth(double frameWidth);

    @JSProperty
    int getFramesCorrupted();

    @JSProperty
    void setFramesCorrupted(int framesCorrupted);

    @JSProperty
    int getFramesDecoded();

    @JSProperty
    void setFramesDecoded(int framesDecoded);

    @JSProperty
    int getFramesDropped();

    @JSProperty
    void setFramesDropped(int framesDropped);

    @JSProperty
    @Nullable
    double getFramesPerSecond();

    @JSProperty
    void setFramesPerSecond(double framesPerSecond);

    @JSProperty
    int getFramesReceived();

    @JSProperty
    void setFramesReceived(int framesReceived);

    @JSProperty
    int getFramesSent();

    @JSProperty
    void setFramesSent(int framesSent);

    @JSProperty
    boolean isRemoteSource();

    @JSProperty
    void setRemoteSource(boolean remoteSource);

    @JSProperty
    @Nullable
    String[] getSsrcIds();

    @JSProperty
    void setSsrcIds(String... ssrcIds);

    @JSProperty
    @Nullable
    String getTrackIdentifier();

    @JSProperty
    void setTrackIdentifier(String trackIdentifier);

}
