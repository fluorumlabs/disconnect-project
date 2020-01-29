package js.web.webrtc;


import org.teavm.jso.JSProperty;


public interface RTCInboundRTPStreamStats extends RTCRTPStreamStats {
    @JSProperty
    int getBytesReceived();

    @JSProperty
    void setBytesReceived(int bytesReceived);

    @JSProperty
    double getFractionLost();

    @JSProperty
    void setFractionLost(double fractionLost);

    @JSProperty
    double getJitter();

    @JSProperty
    void setJitter(double jitter);

    @JSProperty
    int getPacketsLost();

    @JSProperty
    void setPacketsLost(int packetsLost);

    @JSProperty
    int getPacketsReceived();

    @JSProperty
    void setPacketsReceived(int packetsReceived);

}
