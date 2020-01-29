package js.web.mediastreams;

import js.lang.Any;
import org.teavm.jso.JSProperty;


public interface MediaStreamTrackAudioSourceOptions extends Any {
    @JSProperty
    MediaStreamTrack getMediaStreamTrack();

    @JSProperty
    void setMediaStreamTrack(MediaStreamTrack mediaStreamTrack);

}
