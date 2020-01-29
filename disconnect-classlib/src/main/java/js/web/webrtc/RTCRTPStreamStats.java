package js.web.webrtc;


import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


public interface RTCRTPStreamStats extends RTCStats {
    @JSProperty
    @Nullable
    String getAssociateStatsId();

    @JSProperty
    void setAssociateStatsId(String associateStatsId);

    @JSProperty
    @Nullable
    String getCodecId();

    @JSProperty
    void setCodecId(String codecId);

    @JSProperty
    int getFirCount();

    @JSProperty
    void setFirCount(int firCount);

    @JSProperty
    boolean isIsRemote();

    @JSProperty
    void setIsRemote(boolean isRemote);

    @JSProperty
    @Nullable
    String getMediaTrackId();

    @JSProperty
    void setMediaTrackId(String mediaTrackId);

    @JSProperty
    @Nullable
    String getMediaType();

    @JSProperty
    void setMediaType(String mediaType);

    @JSProperty
    int getNackCount();

    @JSProperty
    void setNackCount(int nackCount);

    @JSProperty
    @Nullable
    double getPliCount();

    @JSProperty
    void setPliCount(double pliCount);

    @JSProperty
    int getSliCount();

    @JSProperty
    void setSliCount(int sliCount);

    @JSProperty
    @Nullable
    String getSsrc();

    @JSProperty
    void setSsrc(String ssrc);

    @JSProperty
    @Nullable
    String getTransportId();

    @JSProperty
    void setTransportId(String transportId);

}
