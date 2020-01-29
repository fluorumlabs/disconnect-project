package js.web.dom;

import js.extras.JsEnum;
import js.lang.Unknown;
import js.web.mse.SourceBuffer;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/** This interface also inherits properties from EventTarget. */
        public interface TextTrack extends EventTarget {
        @JSProperty
        TextTrackCueList getActiveCues();

        @JSProperty
        TextTrackCueList getCues();

        @JSProperty
        String getInBandMetadataTrackDispatchType();

        @JSProperty
        String getKind();

        @JSProperty
        String getLabel();

        @JSProperty
        String getLanguage();

        @JSProperty
        Unknown getMode();

        @JSProperty
        void setMode(TextTrackMode mode);
        @JSProperty
        void setMode(int mode);

        @JSProperty
        @Nullable
        EventListener<Event> getOncuechange();

        @JSProperty
        void setOncuechange(EventListener<Event> oncuechange);

        default void addCueChangeEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
            addEventListener("cuechange", listener, options);
        }
        default void addCueChangeEventListener(EventListener<Event> listener, boolean options) {
            addEventListener("cuechange", listener, options);
        }
        default void addCueChangeEventListener(EventListener<Event> listener) {
            addEventListener("cuechange", listener);
        }

        default void removeCueChangeEventListener(EventListener<Event> listener, EventListenerOptions options) {
            removeEventListener("cuechange", listener, options);
        }
        default void removeCueChangeEventListener(EventListener<Event> listener, boolean options) {
            removeEventListener("cuechange", listener, options);
        }
        default void removeCueChangeEventListener(EventListener<Event> listener) {
            removeEventListener("cuechange", listener);
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
        EventListener<Event> getOnload();

        @JSProperty
        void setOnload(EventListener<Event> onload);

        default void addLoadEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
            addEventListener("load", listener, options);
        }
        default void addLoadEventListener(EventListener<Event> listener, boolean options) {
            addEventListener("load", listener, options);
        }
        default void addLoadEventListener(EventListener<Event> listener) {
            addEventListener("load", listener);
        }

        default void removeLoadEventListener(EventListener<Event> listener, EventListenerOptions options) {
            removeEventListener("load", listener, options);
        }
        default void removeLoadEventListener(EventListener<Event> listener, boolean options) {
            removeEventListener("load", listener, options);
        }
        default void removeLoadEventListener(EventListener<Event> listener) {
            removeEventListener("load", listener);
        }
        @JSProperty
        ReadyState getReadyState();

        @JSProperty
        @Nullable
        SourceBuffer getSourceBuffer();

        void addCue(TextTrackCue cue);
        void removeCue(TextTrackCue cue);

        abstract class ReadyState extends JsEnum {
        public static final ReadyState DISABLED = JsEnum.from("return TextTrack.DISABLED");


        public static final ReadyState ERROR = JsEnum.from("return TextTrack.ERROR");


        public static final ReadyState HIDDEN = JsEnum.from("return TextTrack.HIDDEN");


        public static final ReadyState LOADED = JsEnum.from("return TextTrack.LOADED");


        public static final ReadyState LOADING = JsEnum.from("return TextTrack.LOADING");


        public static final ReadyState NONE = JsEnum.from("return TextTrack.NONE");


        public static final ReadyState SHOWING = JsEnum.from("return TextTrack.SHOWING");}
        @JSBody(script = "return TextTrack.prototype")
        static TextTrack prototype() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(script = "return new TextTrack()")
        static TextTrack create() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }


        }
