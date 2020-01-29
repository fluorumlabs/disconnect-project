package js.web.mediastreams;

import js.lang.Promise;
import js.util.collections.Array;
import js.web.dom.*;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * Provides access to connected media input devices like cameras and microphones, as well as screen sharing. In essence, it lets you obtain access to any hardware source of media data.
 */
public interface MediaDevices extends EventTarget {

    @JSBody(script = "return MediaDevices.prototype")
    static MediaDevices prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new MediaDevices()")
    static MediaDevices create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    @Nullable
    EventListener<Event> getOndevicechange();

    @JSProperty
    void setOndevicechange(EventListener<Event> ondevicechange);

    default void addDeviceChangeEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
        addEventListener("devicechange", listener, options);
    }

    default void addDeviceChangeEventListener(EventListener<Event> listener, boolean options) {
        addEventListener("devicechange", listener, options);
    }

    default void addDeviceChangeEventListener(EventListener<Event> listener) {
        addEventListener("devicechange", listener);
    }

    default void removeDeviceChangeEventListener(EventListener<Event> listener, EventListenerOptions options) {
        removeEventListener("devicechange", listener, options);
    }

    default void removeDeviceChangeEventListener(EventListener<Event> listener, boolean options) {
        removeEventListener("devicechange", listener, options);
    }

    default void removeDeviceChangeEventListener(EventListener<Event> listener) {
        removeEventListener("devicechange", listener);
    }

    Promise<Array<MediaDeviceInfo>> enumerateDevices();

    MediaTrackSupportedConstraints getSupportedConstraints();

    Promise<MediaStream> getUserMedia(MediaStreamConstraints constraints);

    Promise<MediaStream> getUserMedia();

}
