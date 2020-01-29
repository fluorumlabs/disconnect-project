package js.web.webrtc;


import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


public interface RTCIceCandidatePairStats extends RTCStats {
    @JSProperty
    int getAvailableIncomingBitrate();

    @JSProperty
    void setAvailableIncomingBitrate(int availableIncomingBitrate);

    @JSProperty
    int getAvailableOutgoingBitrate();

    @JSProperty
    void setAvailableOutgoingBitrate(int availableOutgoingBitrate);

    @JSProperty
    int getBytesReceived();

    @JSProperty
    void setBytesReceived(int bytesReceived);

    @JSProperty
    int getBytesSent();

    @JSProperty
    void setBytesSent(int bytesSent);

    @JSProperty
    @Nullable
    String getLocalCandidateId();

    @JSProperty
    void setLocalCandidateId(String localCandidateId);

    @JSProperty
    boolean isNominated();

    @JSProperty
    void setNominated(boolean nominated);

    @JSProperty
    int getPriority();

    @JSProperty
    void setPriority(int priority);

    @JSProperty
    boolean isReadable();

    @JSProperty
    void setReadable(boolean readable);

    @JSProperty
    @Nullable
    String getRemoteCandidateId();

    @JSProperty
    void setRemoteCandidateId(String remoteCandidateId);

    @JSProperty
    double getRoundTripTime();

    @JSProperty
    void setRoundTripTime(double roundTripTime);

    @JSProperty
    @Nullable
    RTCStatsIceCandidatePairState getState();

    @JSProperty
    void setState(RTCStatsIceCandidatePairState state);

    @JSProperty
    @Nullable
    String getTransportId();

    @JSProperty
    void setTransportId(String transportId);

    @JSProperty
    boolean isWritable();

    @JSProperty
    void setWritable(boolean writable);

}
