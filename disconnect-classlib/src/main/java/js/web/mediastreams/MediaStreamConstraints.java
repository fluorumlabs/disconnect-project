package js.web.mediastreams;

import js.lang.Any;
import js.lang.Unknown;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


public interface MediaStreamConstraints extends Any {
    @JSProperty
    @Nullable
    Unknown isAudio();

    @JSProperty
    void setAudio(boolean audio);
    @JSProperty
    void setAudio(MediaTrackConstraints audio);

    @JSProperty
    @Nullable
    String getPeerIdentity();

    @JSProperty
    void setPeerIdentity(String peerIdentity);

    @JSProperty
    @Nullable
    Unknown isVideo();

    @JSProperty
    void setVideo(boolean video);
    @JSProperty
    void setVideo(MediaTrackConstraints video);

}
