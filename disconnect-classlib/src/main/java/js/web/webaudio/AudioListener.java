package js.web.webaudio;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import js.lang.Any;

/** The position and orientation of the unique person listening to the audio scene, and is used in audio spatialization. All PannerNodes spatialize in relation to the AudioListener stored in the BaseAudioContext.listener attribute. */
public interface AudioListener extends Any {
    @JSProperty
    AudioParam getForwardX();

    @JSProperty
    AudioParam getForwardY();

    @JSProperty
    AudioParam getForwardZ();

    @JSProperty
    AudioParam getPositionX();

    @JSProperty
    AudioParam getPositionY();

    @JSProperty
    AudioParam getPositionZ();

    @JSProperty
    AudioParam getUpX();

    @JSProperty
    AudioParam getUpY();

    @JSProperty
    AudioParam getUpZ();

    @Deprecated
    void setOrientation(double x, double y, double z, double xUp, double yUp, double zUp);
    @Deprecated
    void setPosition(double x, double y, double z);

    @JSBody(script = "return AudioListener.prototype")
    static AudioListener prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new AudioListener()")
    static AudioListener create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

}
