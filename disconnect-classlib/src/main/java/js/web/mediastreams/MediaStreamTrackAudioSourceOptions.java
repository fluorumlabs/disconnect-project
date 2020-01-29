package js.web.mediastreams;

import js.web.mediastreams.MediaStreamTrack;
import org.teavm.jso.JSProperty;

import js.lang.Any;


public interface MediaStreamTrackAudioSourceOptions extends Any {
    @JSProperty
    MediaStreamTrack getMediaStreamTrack();

    @JSProperty
    void setMediaStreamTrack(MediaStreamTrack mediaStreamTrack);

}
