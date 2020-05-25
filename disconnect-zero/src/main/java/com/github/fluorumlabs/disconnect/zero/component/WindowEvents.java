package com.github.fluorumlabs.disconnect.zero.component;

import com.github.fluorumlabs.disconnect.zero.EventInitializer;
import com.github.fluorumlabs.disconnect.zero.observable.ObservableEvent;
import js.web.channelmessaging.MessageEvent;
import js.web.dom.*;
import js.web.history.PopStateEvent;
import js.web.webstorage.StorageEvent;


public interface WindowEvents<T extends WindowEventHandlers> extends EventInitializer<T> {
    default ObservableEvent<Event> afterPrintEvent() { return createEvent(WindowEventHandlers::addAfterPrintEventListener); }
    default ObservableEvent<Event> beforePrintEvent() { return createEvent(WindowEventHandlers::addBeforePrintEventListener); }
    default ObservableEvent<BeforeUnloadEvent> beforeUnloadEvent() { return createEvent(WindowEventHandlers::addBeforeUnloadEventListener); }
    default ObservableEvent<HashChangeEvent> hashChangeEvent() { return createEvent(WindowEventHandlers::addHashChangeEventListener); }
    default ObservableEvent<Event> languageChangeEvent() { return createEvent(WindowEventHandlers::addLanguageChangeEventListener); }
    default ObservableEvent<MessageEvent> messageEvent() { return createEvent(WindowEventHandlers::addMessageEventListener); }
    default ObservableEvent<MessageEvent> messageErrorEvent() { return createEvent(WindowEventHandlers::addMessageErrorEventListener); }
    default ObservableEvent<Event> offlineEvent() { return createEvent(WindowEventHandlers::addOfflineEventListener); }
    default ObservableEvent<Event> onlineEvent() { return createEvent(WindowEventHandlers::addOnlineEventListener); }
    default ObservableEvent<PageTransitionEvent> pageHideEvent() { return createEvent(WindowEventHandlers::addPageHideEventListener); }
    default ObservableEvent<PageTransitionEvent> pageShowEvent() { return createEvent(WindowEventHandlers::addPageShowEventListener); }
    default ObservableEvent<PopStateEvent> popStateEvent() { return createEvent(WindowEventHandlers::addPopStateEventListener); }
    default ObservableEvent<Event> rejectionHandledEvent() { return createEvent(WindowEventHandlers::addRejectionHandledEventListener); }
    default ObservableEvent<StorageEvent> storageEvent() { return createEvent(WindowEventHandlers::addStorageEventListener); }
    default ObservableEvent<PromiseRejectionEvent> unhandledRejectionEvent() { return createEvent(WindowEventHandlers::addUnhandledRejectionEventListener); }
    default ObservableEvent<Event> unloadEvent() { return createEvent(WindowEventHandlers::addUnloadEventListener); }
}
