package js.web.webrtc;


import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


public interface RTCTransportStats extends RTCStats {
    @JSProperty
    boolean isActiveConnection();

    @JSProperty
    void setActiveConnection(boolean activeConnection);

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
    String getLocalCertificateId();

    @JSProperty
    void setLocalCertificateId(String localCertificateId);

    @JSProperty
    @Nullable
    String getRemoteCertificateId();

    @JSProperty
    void setRemoteCertificateId(String remoteCertificateId);

    @JSProperty
    @Nullable
    String getRtcpTransportStatsId();

    @JSProperty
    void setRtcpTransportStatsId(String rtcpTransportStatsId);

    @JSProperty
    @Nullable
    String getSelectedCandidatePairId();

    @JSProperty
    void setSelectedCandidatePairId(String selectedCandidatePairId);

}
