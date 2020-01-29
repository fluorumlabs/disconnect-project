package js.web.webworkers;

import js.util.buffers.Transferable;
import js.util.collections.Array;
import js.web.dom.EventListener;
import js.web.channelmessaging.PostMessageOptions;
import js.web.dom.AddEventListenerOptions;
import js.web.dom.EventListenerOptions;
import js.web.dom.EventTarget;
import js.web.dom.URL;
import js.web.channelmessaging.MessageEvent;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;import js.lang.Any;

import org.teavm.jso.JSByRef;

/** This Web Workers API interface represents a background task that can be easily created and can send messages back to its creator. Creating a worker is as simple as calling the Worker() constructor and specifying a script to be run in the worker thread. */
        public interface Worker extends EventTarget, AbstractWorker {
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
        void postMessage(Any message, @JSByRef Transferable... transfer);
        void postMessage(Any message, Array<Transferable> transfer);
        void postMessage(Any message, PostMessageOptions options);
        void postMessage(Any message);
        void terminate();

        @JSBody(script = "return Worker.prototype")
        static Worker prototype() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }
        @JSBody(params="url", script = "return new Worker(url)")
        static Worker create(String url) {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(params="url", script = "return new Worker(url)")
        static Worker create(URL url) {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(params={"url","options"}, script = "return new Worker(url, options)")
        static Worker create(String url, WorkerOptions options) {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(params={"url","options"}, script = "return new Worker(url, options)")
        static Worker create(URL url, WorkerOptions options) {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        }
