package js.web.webaudio;

import js.web.dom.HTMLMediaElement;
import org.teavm.jso.JSProperty;

import js.lang.Any;


public interface MediaElementAudioSourceOptions extends Any {
    @JSProperty
    HTMLMediaElement getMediaElement();

    @JSProperty
    void setMediaElement(HTMLMediaElement mediaElement);

}
