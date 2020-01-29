package js.web.dom;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/** TextTrackCues represent a string of text that will be displayed for some duration of time on a TextTrack. This includes the start and end times that the cue will be displayed. A TextTrackCue cannot be used directly, instead one of the derived types (e.g. VTTCue) must be used. */
        public interface TextTrackCue extends EventTarget {
        @JSProperty
        double getEndTime();

        @JSProperty
        void setEndTime(double endTime);

        @JSProperty
        String getId();

        @JSProperty
        void setId(String id);

        @JSProperty
        @Nullable
        EventListener<Event> getOnenter();

        @JSProperty
        void setOnenter(EventListener<Event> onenter);

        default void addEnterEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
            addEventListener("enter", listener, options);
        }
        default void addEnterEventListener(EventListener<Event> listener, boolean options) {
            addEventListener("enter", listener, options);
        }
        default void addEnterEventListener(EventListener<Event> listener) {
            addEventListener("enter", listener);
        }

        default void removeEnterEventListener(EventListener<Event> listener, EventListenerOptions options) {
            removeEventListener("enter", listener, options);
        }
        default void removeEnterEventListener(EventListener<Event> listener, boolean options) {
            removeEventListener("enter", listener, options);
        }
        default void removeEnterEventListener(EventListener<Event> listener) {
            removeEventListener("enter", listener);
        }
        @JSProperty
        @Nullable
        EventListener<Event> getOnexit();

        @JSProperty
        void setOnexit(EventListener<Event> onexit);

        default void addExitEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
            addEventListener("exit", listener, options);
        }
        default void addExitEventListener(EventListener<Event> listener, boolean options) {
            addEventListener("exit", listener, options);
        }
        default void addExitEventListener(EventListener<Event> listener) {
            addEventListener("exit", listener);
        }

        default void removeExitEventListener(EventListener<Event> listener, EventListenerOptions options) {
            removeEventListener("exit", listener, options);
        }
        default void removeExitEventListener(EventListener<Event> listener, boolean options) {
            removeEventListener("exit", listener, options);
        }
        default void removeExitEventListener(EventListener<Event> listener) {
            removeEventListener("exit", listener);
        }
        @JSProperty
        boolean isPauseOnExit();

        @JSProperty
        void setPauseOnExit(boolean pauseOnExit);

        @JSProperty
        double getStartTime();

        @JSProperty
        void setStartTime(double startTime);

        @JSProperty
        String getText();

        @JSProperty
        void setText(String text);

        @JSProperty
        TextTrack getTrack();

        @JSBody(script = "return TextTrackCue.prototype")
        static TextTrackCue prototype() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(params={"startTime","endTime","text"}, script = "return new TextTrackCue(startTime, endTime, text)")
        static TextTrackCue create(double startTime, double endTime, String text) {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        }
