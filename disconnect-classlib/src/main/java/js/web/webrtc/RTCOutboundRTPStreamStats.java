package js.web.webrtc;


import org.teavm.jso.JSProperty;


public interface RTCOutboundRTPStreamStats extends RTCRTPStreamStats {
    @JSProperty
    int getBytesSent();

    @JSProperty
    void setBytesSent(int bytesSent);

    @JSProperty
    int getPacketsSent();

    @JSProperty
    void setPacketsSent(int packetsSent);

    @JSProperty
    double getRoundTripTime();

    @JSProperty
    void setRoundTripTime(double roundTripTime);

    @JSProperty
    int getTargetBitrate();

    @JSProperty
    void setTargetBitrate(int targetBitrate);

}
