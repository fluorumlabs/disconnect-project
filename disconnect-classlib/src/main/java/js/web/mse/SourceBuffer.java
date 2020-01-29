package js.web.mse;


import js.web.dom.BufferSource;
import js.web.dom.EventListener;
import js.web.dom.AddEventListenerOptions;
import js.web.dom.Event;
import js.web.dom.EventListenerOptions;
import js.web.dom.EventTarget;
import js.web.dom.AudioTrackList;
import js.web.dom.TimeRanges;
import js.web.dom.VideoTrackList;
import js.web.dom.TextTrackList;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/** A chunk of media to be passed into an HTMLMediaElement and played, via a MediaSource object. This can be made up of one or several media segments. */
        public interface SourceBuffer extends EventTarget {
        @JSProperty
        double getAppendWindowEnd();

        @JSProperty
        void setAppendWindowEnd(double appendWindowEnd);

        @JSProperty
        double getAppendWindowStart();

        @JSProperty
        void setAppendWindowStart(double appendWindowStart);

        @JSProperty
        AudioTrackList getAudioTracks();

        @JSProperty
        TimeRanges getBuffered();

        @JSProperty
        AppendMode getMode();

        @JSProperty
        void setMode(AppendMode mode);

        @JSProperty
        @Nullable
        EventListener<Event> getOnabort();

        @JSProperty
        void setOnabort(EventListener<Event> onabort);

        default void addAbortEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
            addEventListener("abort", listener, options);
        }
        default void addAbortEventListener(EventListener<Event> listener, boolean options) {
            addEventListener("abort", listener, options);
        }
        default void addAbortEventListener(EventListener<Event> listener) {
            addEventListener("abort", listener);
        }

        default void removeAbortEventListener(EventListener<Event> listener, EventListenerOptions options) {
            removeEventListener("abort", listener, options);
        }
        default void removeAbortEventListener(EventListener<Event> listener, boolean options) {
            removeEventListener("abort", listener, options);
        }
        default void removeAbortEventListener(EventListener<Event> listener) {
            removeEventListener("abort", listener);
        }
        @JSProperty
        @Nullable
        EventListener<Event> getOnerror();

        @JSProperty
        void setOnerror(EventListener<Event> onerror);

        default void addErrorEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
            addEventListener("error", listener, options);
        }
        default void addErrorEventListener(EventListener<Event> listener, boolean options) {
            addEventListener("error", listener, options);
        }
        default void addErrorEventListener(EventListener<Event> listener) {
            addEventListener("error", listener);
        }

        default void removeErrorEventListener(EventListener<Event> listener, EventListenerOptions options) {
            removeEventListener("error", listener, options);
        }
        default void removeErrorEventListener(EventListener<Event> listener, boolean options) {
            removeEventListener("error", listener, options);
        }
        default void removeErrorEventListener(EventListener<Event> listener) {
            removeEventListener("error", listener);
        }
        @JSProperty
        @Nullable
        EventListener<Event> getOnupdate();

        @JSProperty
        void setOnupdate(EventListener<Event> onupdate);

        default void addUpdateEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
            addEventListener("update", listener, options);
        }
        default void addUpdateEventListener(EventListener<Event> listener, boolean options) {
            addEventListener("update", listener, options);
        }
        default void addUpdateEventListener(EventListener<Event> listener) {
            addEventListener("update", listener);
        }

        default void removeUpdateEventListener(EventListener<Event> listener, EventListenerOptions options) {
            removeEventListener("update", listener, options);
        }
        default void removeUpdateEventListener(EventListener<Event> listener, boolean options) {
            removeEventListener("update", listener, options);
        }
        default void removeUpdateEventListener(EventListener<Event> listener) {
            removeEventListener("update", listener);
        }
        @JSProperty
        @Nullable
        EventListener<Event> getOnupdateend();

        @JSProperty
        void setOnupdateend(EventListener<Event> onupdateend);

        default void addUpdateEndEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
            addEventListener("updateend", listener, options);
        }
        default void addUpdateEndEventListener(EventListener<Event> listener, boolean options) {
            addEventListener("updateend", listener, options);
        }
        default void addUpdateEndEventListener(EventListener<Event> listener) {
            addEventListener("updateend", listener);
        }

        default void removeUpdateEndEventListener(EventListener<Event> listener, EventListenerOptions options) {
            removeEventListener("updateend", listener, options);
        }
        default void removeUpdateEndEventListener(EventListener<Event> listener, boolean options) {
            removeEventListener("updateend", listener, options);
        }
        default void removeUpdateEndEventListener(EventListener<Event> listener) {
            removeEventListener("updateend", listener);
        }
        @JSProperty
        @Nullable
        EventListener<Event> getOnupdatestart();

        @JSProperty
        void setOnupdatestart(EventListener<Event> onupdatestart);

        default void addUpdateStartEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
            addEventListener("updatestart", listener, options);
        }
        default void addUpdateStartEventListener(EventListener<Event> listener, boolean options) {
            addEventListener("updatestart", listener, options);
        }
        default void addUpdateStartEventListener(EventListener<Event> listener) {
            addEventListener("updatestart", listener);
        }

        default void removeUpdateStartEventListener(EventListener<Event> listener, EventListenerOptions options) {
            removeEventListener("updatestart", listener, options);
        }
        default void removeUpdateStartEventListener(EventListener<Event> listener, boolean options) {
            removeEventListener("updatestart", listener, options);
        }
        default void removeUpdateStartEventListener(EventListener<Event> listener) {
            removeEventListener("updatestart", listener);
        }
        @JSProperty
        TextTrackList getTextTracks();

        @JSProperty
        double getTimestampOffset();

        @JSProperty
        void setTimestampOffset(double timestampOffset);

        @JSProperty
        boolean isUpdating();

        @JSProperty
        VideoTrackList getVideoTracks();

        void abort();
        void appendBuffer(BufferSource data);
        void remove(double start, double end);

        @JSBody(script = "return SourceBuffer.prototype")
        static SourceBuffer prototype() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(script = "return new SourceBuffer()")
        static SourceBuffer create() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        }
