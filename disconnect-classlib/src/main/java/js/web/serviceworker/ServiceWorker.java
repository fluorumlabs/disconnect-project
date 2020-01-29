package js.web.serviceworker;

import js.lang.Any;
import js.util.buffers.Transferable;
import js.util.collections.Array;
import js.web.dom.EventListener;
import js.web.channelmessaging.MessageEventSource;
import js.web.channelmessaging.PostMessageOptions;
import js.web.dom.AddEventListenerOptions;
import js.web.dom.Event;
import js.web.dom.EventListenerOptions;
import js.web.dom.EventTarget;
import js.web.webworkers.AbstractWorker;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSByRef;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/** This ServiceWorker API interface provides a reference to a service worker. Multiple browsing contexts (e.g. pages, workers, etc.) can be associated with the same service worker, each through a unique ServiceWorker object. */
        public interface ServiceWorker extends EventTarget, AbstractWorker, MessageEventSource {
        @JSProperty
        @Nullable
        EventListener<Event> getOnstatechange();

        @JSProperty
        void setOnstatechange(EventListener<Event> onstatechange);

        default void addStateChangeEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
            addEventListener("statechange", listener, options);
        }
        default void addStateChangeEventListener(EventListener<Event> listener, boolean options) {
            addEventListener("statechange", listener, options);
        }
        default void addStateChangeEventListener(EventListener<Event> listener) {
            addEventListener("statechange", listener);
        }

        default void removeStateChangeEventListener(EventListener<Event> listener, EventListenerOptions options) {
            removeEventListener("statechange", listener, options);
        }
        default void removeStateChangeEventListener(EventListener<Event> listener, boolean options) {
            removeEventListener("statechange", listener, options);
        }
        default void removeStateChangeEventListener(EventListener<Event> listener) {
            removeEventListener("statechange", listener);
        }
        @JSProperty
        String getScriptURL();

        @JSProperty
        ServiceWorkerState getState();

        void postMessage(Any message, Array<Transferable> transfer);
        void postMessage(Any message, @JSByRef Transferable... transfer);
        void postMessage(Any message, PostMessageOptions options);
        void postMessage(Any message);

        @JSBody(script = "return ServiceWorker.prototype")
        static ServiceWorker prototype() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(script = "return new ServiceWorker()")
        static ServiceWorker create() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        }
