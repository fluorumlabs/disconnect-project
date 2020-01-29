package js.web.webaudio;

import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;import js.lang.Any;


public interface AudioBufferSourceOptions extends Any {
    @JSProperty
    @Nullable
    AudioBuffer getBuffer();

    @JSProperty
    void setBuffer(AudioBuffer buffer);

    @JSProperty
    double getDetune();

    @JSProperty
    void setDetune(double detune);

    @JSProperty
    boolean isLoop();

    @JSProperty
    void setLoop(boolean loop);

    @JSProperty
    int getLoopEnd();

    @JSProperty
    void setLoopEnd(int loopEnd);

    @JSProperty
    int getLoopStart();

    @JSProperty
    void setLoopStart(int loopStart);

    @JSProperty
    double getPlaybackRate();

    @JSProperty
    void setPlaybackRate(double playbackRate);

}
