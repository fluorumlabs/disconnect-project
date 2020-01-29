package js.web.webrtc;

import js.lang.Any;
import org.teavm.jso.JSProperty;


public interface RTCStats extends Any {
    @JSProperty
    String getId();

    @JSProperty
    void setId(String id);

    @JSProperty
    double getTimestamp();

    @JSProperty
    void setTimestamp(double timestamp);

    @JSProperty
    RTCStatsType getType();

    @JSProperty
    void setType(RTCStatsType type);

}
