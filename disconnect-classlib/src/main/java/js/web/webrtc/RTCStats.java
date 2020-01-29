package js.web.webrtc;

import org.teavm.jso.JSProperty;

import js.lang.Any;


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
