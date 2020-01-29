package js.web.mediastreams;

import js.lang.Any;
import org.teavm.jso.JSProperty;


public interface MediaStreamAudioSourceOptions extends Any {
    @JSProperty
    MediaStream getMediaStream();

    @JSProperty
    void setMediaStream(MediaStream mediaStream);

}
