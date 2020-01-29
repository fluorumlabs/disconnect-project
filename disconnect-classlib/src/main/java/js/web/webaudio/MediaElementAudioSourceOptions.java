package js.web.webaudio;

import js.lang.Any;
import js.web.dom.HTMLMediaElement;
import org.teavm.jso.JSProperty;


public interface MediaElementAudioSourceOptions extends Any {
    @JSProperty
    HTMLMediaElement getMediaElement();

    @JSProperty
    void setMediaElement(HTMLMediaElement mediaElement);

}
