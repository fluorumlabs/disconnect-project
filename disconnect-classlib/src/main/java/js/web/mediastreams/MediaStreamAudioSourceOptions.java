package js.web.mediastreams;

import org.teavm.jso.JSProperty;

import js.lang.Any;


public interface MediaStreamAudioSourceOptions extends Any {
    @JSProperty
    MediaStream getMediaStream();

    @JSProperty
    void setMediaStream(MediaStream mediaStream);

}
