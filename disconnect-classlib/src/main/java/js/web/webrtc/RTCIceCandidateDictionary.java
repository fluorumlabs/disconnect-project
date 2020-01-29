package js.web.webrtc;

import js.lang.Any;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


public interface RTCIceCandidateDictionary extends Any, RTCIceGatherCandidate {
    @JSProperty
    @Nullable
    String getFoundation();

    @JSProperty
    void setFoundation(String foundation);

    @JSProperty
    @Nullable
    String getIp();

    @JSProperty
    void setIp(String ip);

    @JSProperty
    @Nullable
    String getMsMTurnSessionId();

    @JSProperty
    void setMsMTurnSessionId(String msMTurnSessionId);

    @JSProperty
    int getPort();

    @JSProperty
    void setPort(int port);

    @JSProperty
    int getPriority();

    @JSProperty
    void setPriority(int priority);

    @JSProperty
    @Nullable
    RTCIceProtocol getProtocol();

    @JSProperty
    void setProtocol(RTCIceProtocol protocol);

    @JSProperty
    @Nullable
    String getRelatedAddress();

    @JSProperty
    void setRelatedAddress(String relatedAddress);

    @JSProperty
    int getRelatedPort();

    @JSProperty
    void setRelatedPort(int relatedPort);

    @JSProperty
    @Nullable
    RTCIceTcpCandidateType getTcpType();

    @JSProperty
    void setTcpType(RTCIceTcpCandidateType tcpType);

    @JSProperty
    @Nullable
    RTCIceCandidateType getType();

    @JSProperty
    void setType(RTCIceCandidateType type);

}
