package js.web.webrtc;

import js.lang.Any;
import org.teavm.jso.JSProperty;


public interface RTCRtpContributingSource extends Any {
    @JSProperty
    double getAudioLevel();

    @JSProperty
    void setAudioLevel(double audioLevel);

    @JSProperty
    int getSource();

    @JSProperty
    void setSource(int source);

    @JSProperty
    double getTimestamp();

    @JSProperty
    void setTimestamp(double timestamp);

}
