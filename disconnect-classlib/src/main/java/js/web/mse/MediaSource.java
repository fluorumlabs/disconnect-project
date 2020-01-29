package js.web.mse;

import js.web.dom.EventListener;
import js.web.dom.AddEventListenerOptions;
import js.web.dom.Event;
import js.web.dom.EventListenerOptions;
import js.web.dom.EventTarget;
import js.web.mediastreams.EndOfStreamError;
import js.web.mediastreams.ReadyState;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/** This Media Source Extensions API interface represents a source of media data for an HTMLMediaElement object. A MediaSource object can be attached to a HTMLMediaElement to be played in the user agent. */
        public interface MediaSource extends EventTarget {
        @JSProperty
        SourceBufferList getActiveSourceBuffers();

        @JSProperty
        double getDuration();

        @JSProperty
        void setDuration(double duration);

        @JSProperty
        @Nullable
        EventListener<Event> getOnsourceclose();

        @JSProperty
        void setOnsourceclose(EventListener<Event> onsourceclose);

        default void addSourceCloseEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
            addEventListener("sourceclose", listener, options);
        }
        default void addSourceCloseEventListener(EventListener<Event> listener, boolean options) {
            addEventListener("sourceclose", listener, options);
        }
        default void addSourceCloseEventListener(EventListener<Event> listener) {
            addEventListener("sourceclose", listener);
        }

        default void removeSourceCloseEventListener(EventListener<Event> listener, EventListenerOptions options) {
            removeEventListener("sourceclose", listener, options);
        }
        default void removeSourceCloseEventListener(EventListener<Event> listener, boolean options) {
            removeEventListener("sourceclose", listener, options);
        }
        default void removeSourceCloseEventListener(EventListener<Event> listener) {
            removeEventListener("sourceclose", listener);
        }
        @JSProperty
        @Nullable
        EventListener<Event> getOnonsourceended();

        @JSProperty
        void setOnonsourceended(EventListener<Event> ononsourceended);

        default void addOnsourceEndedEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
            addEventListener("onsourceended", listener, options);
        }
        default void addOnsourceEndedEventListener(EventListener<Event> listener, boolean options) {
            addEventListener("onsourceended", listener, options);
        }
        default void addOnsourceEndedEventListener(EventListener<Event> listener) {
            addEventListener("onsourceended", listener);
        }

        default void removeOnsourceEndedEventListener(EventListener<Event> listener, EventListenerOptions options) {
            removeEventListener("onsourceended", listener, options);
        }
        default void removeOnsourceEndedEventListener(EventListener<Event> listener, boolean options) {
            removeEventListener("onsourceended", listener, options);
        }
        default void removeOnsourceEndedEventListener(EventListener<Event> listener) {
            removeEventListener("onsourceended", listener);
        }

        @JSProperty
        @Nullable
        EventListener<Event> getOnonsourceopen();

        @JSProperty
        void setOnonsourceopen(EventListener<Event> ononsourceopen);

        default void addOnsourceOpenEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
            addEventListener("onsourceopen", listener, options);
        }
        default void addOnsourceOpenEventListener(EventListener<Event> listener, boolean options) {
            addEventListener("onsourceopen", listener, options);
        }
        default void addOnsourceOpenEventListener(EventListener<Event> listener) {
            addEventListener("onsourceopen", listener);
        }

        default void removeOnsourceOpenEventListener(EventListener<Event> listener, EventListenerOptions options) {
            removeEventListener("onsourceopen", listener, options);
        }
        default void removeOnsourceOpenEventListener(EventListener<Event> listener, boolean options) {
            removeEventListener("onsourceopen", listener, options);
        }
        default void removeOnsourceOpenEventListener(EventListener<Event> listener) {
            removeEventListener("onsourceopen", listener);
        }
        @JSProperty
        ReadyState getReadyState();

        @JSProperty
        SourceBufferList getSourceBuffers();

        SourceBuffer addSourceBuffer(String type);
        void clearLiveSeekableRange();
        void endOfStream(EndOfStreamError error);
        void endOfStream();
        void removeSourceBuffer(SourceBuffer sourceBuffer);
        void setLiveSeekableRange(double start, double end);

        @JSBody(script = "return MediaSource.prototype")
        static MediaSource prototype() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(script = "return new MediaSource()")
        static MediaSource create() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(params="type", script = "return MediaSource.isTypeSupported(type)")
        static boolean isTypeSupported(String type) {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        }
