package js.web.webrtc;


import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


public interface RTCIceCandidateAttributes extends RTCStats {
    @JSProperty
    @Nullable
    String getAddressSourceUrl();

    @JSProperty
    void setAddressSourceUrl(String addressSourceUrl);

    @JSProperty
    @Nullable
    RTCStatsIceCandidateType getCandidateType();

    @JSProperty
    void setCandidateType(RTCStatsIceCandidateType candidateType);

    @JSProperty
    @Nullable
    String getIpAddress();

    @JSProperty
    void setIpAddress(String ipAddress);

    @JSProperty
    int getPortNumber();

    @JSProperty
    void setPortNumber(int portNumber);

    @JSProperty
    int getPriority();

    @JSProperty
    void setPriority(int priority);

    @JSProperty
    @Nullable
    String getTransport();

    @JSProperty
    void setTransport(String transport);

}
