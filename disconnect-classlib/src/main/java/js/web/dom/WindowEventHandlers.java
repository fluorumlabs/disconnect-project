package js.web.dom;

import js.web.channelmessaging.MessageEvent;
import js.web.history.PopStateEvent;
import js.web.webstorage.StorageEvent;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * Created by Artem Godin on 1/23/2020.
 */
public interface WindowEventHandlers extends EventTarget {
    @JSProperty
    @Nullable
    EventListener<Event> getOnafterprint();

    @JSProperty
    void setOnafterprint(EventListener<Event> onafterprint);

    default void addAfterPrintEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
        addEventListener("afterprint", listener, options);
    }

    default void addAfterPrintEventListener(EventListener<Event> listener, boolean options) {
        addEventListener("afterprint", listener, options);
    }

    default void addAfterPrintEventListener(EventListener<Event> listener) {
        addEventListener("afterprint", listener);
    }

    default void removeAfterPrintEventListener(EventListener<Event> listener, EventListenerOptions options) {
        removeEventListener("afterprint", listener, options);
    }

    default void removeAfterPrintEventListener(EventListener<Event> listener, boolean options) {
        removeEventListener("afterprint", listener, options);
    }

    default void removeAfterPrintEventListener(EventListener<Event> listener) {
        removeEventListener("afterprint", listener);
    }

    @JSProperty
    @Nullable
    EventListener<Event> getOnbeforeprint();

    @JSProperty
    void setOnbeforeprint(EventListener<Event> onbeforeprint);

    default void addBeforePrintEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
        addEventListener("beforeprint", listener, options);
    }

    default void addBeforePrintEventListener(EventListener<Event> listener, boolean options) {
        addEventListener("beforeprint", listener, options);
    }

    default void addBeforePrintEventListener(EventListener<Event> listener) {
        addEventListener("beforeprint", listener);
    }

    default void removeBeforePrintEventListener(EventListener<Event> listener, EventListenerOptions options) {
        removeEventListener("beforeprint", listener, options);
    }

    default void removeBeforePrintEventListener(EventListener<Event> listener, boolean options) {
        removeEventListener("beforeprint", listener, options);
    }

    default void removeBeforePrintEventListener(EventListener<Event> listener) {
        removeEventListener("beforeprint", listener);
    }

    @JSProperty
    @Nullable
    EventListener<BeforeUnloadEvent> getOnbeforeunload();

    @JSProperty
    void setOnbeforeunload(EventListener<BeforeUnloadEvent> onbeforeunload);

    default void addBeforeUnloadEventListener(EventListener<BeforeUnloadEvent> listener, AddEventListenerOptions options) {
        addEventListener("beforeunload", listener, options);
    }

    default void addBeforeUnloadEventListener(EventListener<BeforeUnloadEvent> listener, boolean options) {
        addEventListener("beforeunload", listener, options);
    }

    default void addBeforeUnloadEventListener(EventListener<BeforeUnloadEvent> listener) {
        addEventListener("beforeunload", listener);
    }

    default void removeBeforeUnloadEventListener(EventListener<BeforeUnloadEvent> listener, EventListenerOptions options) {
        removeEventListener("beforeunload", listener, options);
    }

    default void removeBeforeUnloadEventListener(EventListener<BeforeUnloadEvent> listener, boolean options) {
        removeEventListener("beforeunload", listener, options);
    }

    default void removeBeforeUnloadEventListener(EventListener<BeforeUnloadEvent> listener) {
        removeEventListener("beforeunload", listener);
    }

    @JSProperty
    @Nullable
    EventListener<HashChangeEvent> getOnhashchange();

    @JSProperty
    void setOnhashchange(EventListener<HashChangeEvent> onhashchange);

    default void addHashChangeEventListener(EventListener<HashChangeEvent> listener, AddEventListenerOptions options) {
        addEventListener("hashchange", listener, options);
    }

    default void addHashChangeEventListener(EventListener<HashChangeEvent> listener, boolean options) {
        addEventListener("hashchange", listener, options);
    }

    default void addHashChangeEventListener(EventListener<HashChangeEvent> listener) {
        addEventListener("hashchange", listener);
    }

    default void removeHashChangeEventListener(EventListener<HashChangeEvent> listener, EventListenerOptions options) {
        removeEventListener("hashchange", listener, options);
    }

    default void removeHashChangeEventListener(EventListener<HashChangeEvent> listener, boolean options) {
        removeEventListener("hashchange", listener, options);
    }

    default void removeHashChangeEventListener(EventListener<HashChangeEvent> listener) {
        removeEventListener("hashchange", listener);
    }

    @JSProperty
    @Nullable
    EventListener<Event> getOnlanguagechange();

    @JSProperty
    void setOnlanguagechange(EventListener<Event> onlanguagechange);

    default void addLanguageChangeEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
        addEventListener("languagechange", listener, options);
    }

    default void addLanguageChangeEventListener(EventListener<Event> listener, boolean options) {
        addEventListener("languagechange", listener, options);
    }

    default void addLanguageChangeEventListener(EventListener<Event> listener) {
        addEventListener("languagechange", listener);
    }

    default void removeLanguageChangeEventListener(EventListener<Event> listener, EventListenerOptions options) {
        removeEventListener("languagechange", listener, options);
    }

    default void removeLanguageChangeEventListener(EventListener<Event> listener, boolean options) {
        removeEventListener("languagechange", listener, options);
    }

    default void removeLanguageChangeEventListener(EventListener<Event> listener) {
        removeEventListener("languagechange", listener);
    }

    @JSProperty
    @Nullable
    EventListener<MessageEvent> getOnmessage();

    @JSProperty
    void setOnmessage(EventListener<MessageEvent> onmessage);

    default void addMessageEventListener(EventListener<MessageEvent> listener, AddEventListenerOptions options) {
        addEventListener("message", listener, options);
    }

    default void addMessageEventListener(EventListener<MessageEvent> listener, boolean options) {
        addEventListener("message", listener, options);
    }

    default void addMessageEventListener(EventListener<MessageEvent> listener) {
        addEventListener("message", listener);
    }

    default void removeMessageEventListener(EventListener<MessageEvent> listener, EventListenerOptions options) {
        removeEventListener("message", listener, options);
    }

    default void removeMessageEventListener(EventListener<MessageEvent> listener, boolean options) {
        removeEventListener("message", listener, options);
    }

    default void removeMessageEventListener(EventListener<MessageEvent> listener) {
        removeEventListener("message", listener);
    }

    @JSProperty
    @Nullable
    EventListener<MessageEvent> getOnmessageerror();

    @JSProperty
    void setOnmessageerror(EventListener<MessageEvent> onmessageerror);

    default void addMessageErrorEventListener(EventListener<MessageEvent> listener, AddEventListenerOptions options) {
        addEventListener("messageerror", listener, options);
    }

    default void addMessageErrorEventListener(EventListener<MessageEvent> listener, boolean options) {
        addEventListener("messageerror", listener, options);
    }

    default void addMessageErrorEventListener(EventListener<MessageEvent> listener) {
        addEventListener("messageerror", listener);
    }

    default void removeMessageErrorEventListener(EventListener<MessageEvent> listener, EventListenerOptions options) {
        removeEventListener("messageerror", listener, options);
    }

    default void removeMessageErrorEventListener(EventListener<MessageEvent> listener, boolean options) {
        removeEventListener("messageerror", listener, options);
    }

    default void removeMessageErrorEventListener(EventListener<MessageEvent> listener) {
        removeEventListener("messageerror", listener);
    }

    @JSProperty
    @Nullable
    EventListener<Event> getOnoffline();

    @JSProperty
    void setOnoffline(EventListener<Event> onoffline);

    default void addOfflineEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
        addEventListener("offline", listener, options);
    }

    default void addOfflineEventListener(EventListener<Event> listener, boolean options) {
        addEventListener("offline", listener, options);
    }

    default void addOfflineEventListener(EventListener<Event> listener) {
        addEventListener("offline", listener);
    }

    default void removeOfflineEventListener(EventListener<Event> listener, EventListenerOptions options) {
        removeEventListener("offline", listener, options);
    }

    default void removeOfflineEventListener(EventListener<Event> listener, boolean options) {
        removeEventListener("offline", listener, options);
    }

    default void removeOfflineEventListener(EventListener<Event> listener) {
        removeEventListener("offline", listener);
    }

    @JSProperty
    @Nullable
    EventListener<Event> getOnonline();

    @JSProperty
    void setOnonline(EventListener<Event> ononline);

    default void addOnlineEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
        addEventListener("online", listener, options);
    }

    default void addOnlineEventListener(EventListener<Event> listener, boolean options) {
        addEventListener("online", listener, options);
    }

    default void addOnlineEventListener(EventListener<Event> listener) {
        addEventListener("online", listener);
    }

    default void removeOnlineEventListener(EventListener<Event> listener, EventListenerOptions options) {
        removeEventListener("online", listener, options);
    }

    default void removeOnlineEventListener(EventListener<Event> listener, boolean options) {
        removeEventListener("online", listener, options);
    }

    default void removeOnlineEventListener(EventListener<Event> listener) {
        removeEventListener("online", listener);
    }

    @JSProperty
    @Nullable
    EventListener<PageTransitionEvent> getOnpagehide();

    @JSProperty
    void setOnpagehide(EventListener<PageTransitionEvent> onpagehide);

    default void addPageHideEventListener(EventListener<PageTransitionEvent> listener, AddEventListenerOptions options) {
        addEventListener("pagehide", listener, options);
    }

    default void addPageHideEventListener(EventListener<PageTransitionEvent> listener, boolean options) {
        addEventListener("pagehide", listener, options);
    }

    default void addPageHideEventListener(EventListener<PageTransitionEvent> listener) {
        addEventListener("pagehide", listener);
    }

    default void removePageHideEventListener(EventListener<PageTransitionEvent> listener, EventListenerOptions options) {
        removeEventListener("pagehide", listener, options);
    }

    default void removePageHideEventListener(EventListener<PageTransitionEvent> listener, boolean options) {
        removeEventListener("pagehide", listener, options);
    }

    default void removePageHideEventListener(EventListener<PageTransitionEvent> listener) {
        removeEventListener("pagehide", listener);
    }

    @JSProperty
    @Nullable
    EventListener<PageTransitionEvent> getOnpageshow();

    @JSProperty
    void setOnpageshow(EventListener<PageTransitionEvent> onpageshow);

    default void addPageShowEventListener(EventListener<PageTransitionEvent> listener, AddEventListenerOptions options) {
        addEventListener("pageshow", listener, options);
    }

    default void addPageShowEventListener(EventListener<PageTransitionEvent> listener, boolean options) {
        addEventListener("pageshow", listener, options);
    }

    default void addPageShowEventListener(EventListener<PageTransitionEvent> listener) {
        addEventListener("pageshow", listener);
    }

    default void removePageShowEventListener(EventListener<PageTransitionEvent> listener, EventListenerOptions options) {
        removeEventListener("pageshow", listener, options);
    }

    default void removePageShowEventListener(EventListener<PageTransitionEvent> listener, boolean options) {
        removeEventListener("pageshow", listener, options);
    }

    default void removePageShowEventListener(EventListener<PageTransitionEvent> listener) {
        removeEventListener("pageshow", listener);
    }

    @JSProperty
    @Nullable
    EventListener<PopStateEvent> getOnpopstate();

    @JSProperty
    void setOnpopstate(EventListener<PopStateEvent> onpopstate);

    default void addPopStateEventListener(EventListener<PopStateEvent> listener, AddEventListenerOptions options) {
        addEventListener("popstate", listener, options);
    }

    default void addPopStateEventListener(EventListener<PopStateEvent> listener, boolean options) {
        addEventListener("popstate", listener, options);
    }

    default void addPopStateEventListener(EventListener<PopStateEvent> listener) {
        addEventListener("popstate", listener);
    }

    default void removePopStateEventListener(EventListener<PopStateEvent> listener, EventListenerOptions options) {
        removeEventListener("popstate", listener, options);
    }

    default void removePopStateEventListener(EventListener<PopStateEvent> listener, boolean options) {
        removeEventListener("popstate", listener, options);
    }

    default void removePopStateEventListener(EventListener<PopStateEvent> listener) {
        removeEventListener("popstate", listener);
    }

    @JSProperty
    @Nullable
    EventListener<Event> getOnrejectionhandled();

    @JSProperty
    void setOnrejectionhandled(EventListener<Event> onrejectionhandled);

    default void addRejectionHandledEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
        addEventListener("rejectionhandled", listener, options);
    }

    default void addRejectionHandledEventListener(EventListener<Event> listener, boolean options) {
        addEventListener("rejectionhandled", listener, options);
    }

    default void addRejectionHandledEventListener(EventListener<Event> listener) {
        addEventListener("rejectionhandled", listener);
    }

    default void removeRejectionHandledEventListener(EventListener<Event> listener, EventListenerOptions options) {
        removeEventListener("rejectionhandled", listener, options);
    }

    default void removeRejectionHandledEventListener(EventListener<Event> listener, boolean options) {
        removeEventListener("rejectionhandled", listener, options);
    }

    default void removeRejectionHandledEventListener(EventListener<Event> listener) {
        removeEventListener("rejectionhandled", listener);
    }

    @JSProperty
    @Nullable
    EventListener<StorageEvent> getOnstorage();

    @JSProperty
    void setOnstorage(EventListener<StorageEvent> onstorage);

    default void addStorageEventListener(EventListener<StorageEvent> listener, AddEventListenerOptions options) {
        addEventListener("storage", listener, options);
    }

    default void addStorageEventListener(EventListener<StorageEvent> listener, boolean options) {
        addEventListener("storage", listener, options);
    }

    default void addStorageEventListener(EventListener<StorageEvent> listener) {
        addEventListener("storage", listener);
    }

    default void removeStorageEventListener(EventListener<StorageEvent> listener, EventListenerOptions options) {
        removeEventListener("storage", listener, options);
    }

    default void removeStorageEventListener(EventListener<StorageEvent> listener, boolean options) {
        removeEventListener("storage", listener, options);
    }

    default void removeStorageEventListener(EventListener<StorageEvent> listener) {
        removeEventListener("storage", listener);
    }

    @JSProperty
    @Nullable
    EventListener<PromiseRejectionEvent> getOnunhandledrejection();

    @JSProperty
    void setOnunhandledrejection(EventListener<PromiseRejectionEvent> onunhandledrejection);

    default void addUnhandledRejectionEventListener(EventListener<PromiseRejectionEvent> listener, AddEventListenerOptions options) {
        addEventListener("unhandledrejection", listener, options);
    }

    default void addUnhandledRejectionEventListener(EventListener<PromiseRejectionEvent> listener, boolean options) {
        addEventListener("unhandledrejection", listener, options);
    }

    default void addUnhandledRejectionEventListener(EventListener<PromiseRejectionEvent> listener) {
        addEventListener("unhandledrejection", listener);
    }

    default void removeUnhandledRejectionEventListener(EventListener<PromiseRejectionEvent> listener, EventListenerOptions options) {
        removeEventListener("unhandledrejection", listener, options);
    }

    default void removeUnhandledRejectionEventListener(EventListener<PromiseRejectionEvent> listener, boolean options) {
        removeEventListener("unhandledrejection", listener, options);
    }

    default void removeUnhandledRejectionEventListener(EventListener<PromiseRejectionEvent> listener) {
        removeEventListener("unhandledrejection", listener);
    }

    @JSProperty
    @Nullable
    EventListener<Event> getOnunload();

    @JSProperty
    void setOnunload(EventListener<Event> onunload);

    default void addUnloadEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
        addEventListener("unload", listener, options);
    }

    default void addUnloadEventListener(EventListener<Event> listener, boolean options) {
        addEventListener("unload", listener, options);
    }

    default void addUnloadEventListener(EventListener<Event> listener) {
        addEventListener("unload", listener);
    }

    default void removeUnloadEventListener(EventListener<Event> listener, EventListenerOptions options) {
        removeEventListener("unload", listener, options);
    }

    default void removeUnloadEventListener(EventListener<Event> listener, boolean options) {
        removeEventListener("unload", listener, options);
    }

    default void removeUnloadEventListener(EventListener<Event> listener) {
        removeEventListener("unload", listener);
    }
}
