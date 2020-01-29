package js.web.webrtc;

import js.lang.Any;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


public interface RTCDataChannelInit extends Any {
    @JSProperty
    int getId();

    @JSProperty
    void setId(int id);

    @JSProperty
    double getMaxPacketLifeTime();

    @JSProperty
    void setMaxPacketLifeTime(double maxPacketLifeTime);

    @JSProperty
    int getMaxRetransmits();

    @JSProperty
    void setMaxRetransmits(int maxRetransmits);

    @JSProperty
    boolean isNegotiated();

    @JSProperty
    void setNegotiated(boolean negotiated);

    @JSProperty
    boolean isOrdered();

    @JSProperty
    void setOrdered(boolean ordered);

    @JSProperty
    @Nullable
    RTCPriorityType getPriority();

    @JSProperty
    void setPriority(RTCPriorityType priority);

    @JSProperty
    @Nullable
    String getProtocol();

    @JSProperty
    void setProtocol(String protocol);

}
