package js.web.dom;


import js.extras.JsEnum;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


@Deprecated
public interface ApplicationCache extends EventTarget {
    @JSBody(script = "return ApplicationCache.prototype")
    static ApplicationCache prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new ApplicationCache()")
    static ApplicationCache create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @Deprecated
    @JSProperty
    @Nullable
    EventListener<Event> getOncached();

    @Deprecated
    @JSProperty
    void setOncached(EventListener<Event> oncached);

    @Deprecated
    default void addCachedEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
        addEventListener("cached", listener, options);
    }

    @Deprecated
    default void addCachedEventListener(EventListener<Event> listener, boolean options) {
        addEventListener("cached", listener, options);
    }

    @Deprecated
    default void addCachedEventListener(EventListener<Event> listener) {
        addEventListener("cached", listener);
    }

    @Deprecated
    default void removeCachedEventListener(EventListener<Event> listener, EventListenerOptions options) {
        removeEventListener("cached", listener, options);
    }

    @Deprecated
    default void removeCachedEventListener(EventListener<Event> listener, boolean options) {
        removeEventListener("cached", listener, options);
    }

    @Deprecated
    default void removeCachedEventListener(EventListener<Event> listener) {
        removeEventListener("cached", listener);
    }

    @Deprecated
    @JSProperty
    @Nullable
    EventListener<Event> getOnchecking();

    @Deprecated
    @JSProperty
    void setOnchecking(EventListener<Event> onchecking);

    @Deprecated
    default void addCheckingEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
        addEventListener("checking", listener, options);
    }

    @Deprecated
    default void addCheckingEventListener(EventListener<Event> listener, boolean options) {
        addEventListener("checking", listener, options);
    }

    @Deprecated
    default void addCheckingEventListener(EventListener<Event> listener) {
        addEventListener("checking", listener);
    }

    @Deprecated
    default void removeCheckingEventListener(EventListener<Event> listener, EventListenerOptions options) {
        removeEventListener("checking", listener, options);
    }

    @Deprecated
    default void removeCheckingEventListener(EventListener<Event> listener, boolean options) {
        removeEventListener("checking", listener, options);
    }

    @Deprecated
    default void removeCheckingEventListener(EventListener<Event> listener) {
        removeEventListener("checking", listener);
    }

    @Deprecated
    @JSProperty
    @Nullable
    EventListener<Event> getOndownloading();

    @Deprecated
    @JSProperty
    void setOndownloading(EventListener<Event> ondownloading);

    @Deprecated
    default void addDownloadingEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
        addEventListener("downloading", listener, options);
    }

    @Deprecated
    default void addDownloadingEventListener(EventListener<Event> listener, boolean options) {
        addEventListener("downloading", listener, options);
    }

    @Deprecated
    default void addDownloadingEventListener(EventListener<Event> listener) {
        addEventListener("downloading", listener);
    }

    @Deprecated
    default void removeDownloadingEventListener(EventListener<Event> listener, EventListenerOptions options) {
        removeEventListener("downloading", listener, options);
    }

    @Deprecated
    default void removeDownloadingEventListener(EventListener<Event> listener, boolean options) {
        removeEventListener("downloading", listener, options);
    }

    @Deprecated
    default void removeDownloadingEventListener(EventListener<Event> listener) {
        removeEventListener("downloading", listener);
    }

    @Deprecated
    @JSProperty
    @Nullable
    EventListener<Event> getOnerror();

    @Deprecated
    @JSProperty
    void setOnerror(EventListener<Event> onerror);

    @Deprecated
    default void addErrorEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
        addEventListener("error", listener, options);
    }

    @Deprecated
    default void addErrorEventListener(EventListener<Event> listener, boolean options) {
        addEventListener("error", listener, options);
    }

    @Deprecated
    default void addErrorEventListener(EventListener<Event> listener) {
        addEventListener("error", listener);
    }

    @Deprecated
    default void removeErrorEventListener(EventListener<Event> listener, EventListenerOptions options) {
        removeEventListener("error", listener, options);
    }

    @Deprecated
    default void removeErrorEventListener(EventListener<Event> listener, boolean options) {
        removeEventListener("error", listener, options);
    }

    @Deprecated
    default void removeErrorEventListener(EventListener<Event> listener) {
        removeEventListener("error", listener);
    }

    @Deprecated
    @JSProperty
    @Nullable
    EventListener<Event> getOnnoupdate();

    @Deprecated
    @JSProperty
    void setOnnoupdate(EventListener<Event> onnoupdate);

    @Deprecated
    default void addNoUpdateEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
        addEventListener("noupdate", listener, options);
    }

    @Deprecated
    default void addNoUpdateEventListener(EventListener<Event> listener, boolean options) {
        addEventListener("noupdate", listener, options);
    }

    @Deprecated
    default void addNoUpdateEventListener(EventListener<Event> listener) {
        addEventListener("noupdate", listener);
    }

    @Deprecated
    default void removeNoUpdateEventListener(EventListener<Event> listener, EventListenerOptions options) {
        removeEventListener("noupdate", listener, options);
    }

    @Deprecated
    default void removeNoUpdateEventListener(EventListener<Event> listener, boolean options) {
        removeEventListener("noupdate", listener, options);
    }

    @Deprecated
    default void removeNoUpdateEventListener(EventListener<Event> listener) {
        removeEventListener("noupdate", listener);
    }

    @Deprecated
    @JSProperty
    @Nullable
    EventListener<Event> getOnobsolete();

    @Deprecated
    @JSProperty
    void setOnobsolete(EventListener<Event> onobsolete);

    @Deprecated
    default void addObsoleteEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
        addEventListener("obsolete", listener, options);
    }

    @Deprecated
    default void addObsoleteEventListener(EventListener<Event> listener, boolean options) {
        addEventListener("obsolete", listener, options);
    }

    @Deprecated
    default void addObsoleteEventListener(EventListener<Event> listener) {
        addEventListener("obsolete", listener);
    }

    @Deprecated
    default void removeObsoleteEventListener(EventListener<Event> listener, EventListenerOptions options) {
        removeEventListener("obsolete", listener, options);
    }

    @Deprecated
    default void removeObsoleteEventListener(EventListener<Event> listener, boolean options) {
        removeEventListener("obsolete", listener, options);
    }

    @Deprecated
    default void removeObsoleteEventListener(EventListener<Event> listener) {
        removeEventListener("obsolete", listener);
    }

    @Deprecated
    @JSProperty
    @Nullable
    EventListener<ProgressEvent<ApplicationCache>> getOnprogress();

    @Deprecated
    @JSProperty
    void setOnprogress(EventListener<ProgressEvent<ApplicationCache>> onprogress);

    @Deprecated
    default void addProgressEventListener(EventListener<ProgressEvent<ApplicationCache>> listener, AddEventListenerOptions options) {
        addEventListener("progress", listener, options);
    }

    @Deprecated
    default void addProgressEventListener(EventListener<ProgressEvent<ApplicationCache>> listener, boolean options) {
        addEventListener("progress", listener, options);
    }

    @Deprecated
    default void addProgressEventListener(EventListener<ProgressEvent<ApplicationCache>> listener) {
        addEventListener("progress", listener);
    }

    @Deprecated
    default void removeProgressEventListener(EventListener<ProgressEvent<ApplicationCache>> listener, EventListenerOptions options) {
        removeEventListener("progress", listener, options);
    }

    @Deprecated
    default void removeProgressEventListener(EventListener<ProgressEvent<ApplicationCache>> listener, boolean options) {
        removeEventListener("progress", listener, options);
    }

    @Deprecated
    default void removeProgressEventListener(EventListener<ProgressEvent<ApplicationCache>> listener) {
        removeEventListener("progress", listener);
    }

    @Deprecated
    @JSProperty
    @Nullable
    EventListener<Event> getOnupdateready();

    @Deprecated
    @JSProperty
    void setOnupdateready(EventListener<Event> onupdateready);

    @Deprecated
    default void addUpdateReadyEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
        addEventListener("updateready", listener, options);
    }

    @Deprecated
    default void addUpdateReadyEventListener(EventListener<Event> listener, boolean options) {
        addEventListener("updateready", listener, options);
    }

    @Deprecated
    default void addUpdateReadyEventListener(EventListener<Event> listener) {
        addEventListener("updateready", listener);
    }

    @Deprecated
    default void removeUpdateReadyEventListener(EventListener<Event> listener, EventListenerOptions options) {
        removeEventListener("updateready", listener, options);
    }

    @Deprecated
    default void removeUpdateReadyEventListener(EventListener<Event> listener, boolean options) {
        removeEventListener("updateready", listener, options);
    }

    @Deprecated
    default void removeUpdateReadyEventListener(EventListener<Event> listener) {
        removeEventListener("updateready", listener);
    }

    @Deprecated
    @JSProperty
    Status getStatus();

    @Deprecated
    void abort();

    @Deprecated
    void swapCache();

    @Deprecated
    void update();

    abstract class Status extends JsEnum {
        public static final Status CHECKING = JsEnum.from("return ApplicationCache.CHECKING");

        public static final Status DOWNLOADING = JsEnum.from("return ApplicationCache.DOWNLOADING");

        public static final Status IDLE = JsEnum.from("return ApplicationCache.IDLE");

        public static final Status OBSOLETE = JsEnum.from("return ApplicationCache.OBSOLETE");

        public static final Status UNCACHED = JsEnum.from("return ApplicationCache.UNCACHED");

        public static final Status UPDATEREADY = JsEnum.from("return ApplicationCache.UPDATEREADY");
    }


}
