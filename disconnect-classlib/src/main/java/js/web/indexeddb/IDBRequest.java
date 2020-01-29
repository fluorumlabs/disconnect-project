package js.web.indexeddb;

import js.lang.Any;
import js.lang.Unknown;
import js.web.dom.*;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/** The request object does not initially contain any information about the result of the operation, but once information becomes available, an event is fired on the request, and the information becomes available through the properties of the IDBRequest instance. */
        public interface IDBRequest<T extends Any> extends EventTarget {
        /**
         * When a request is completed, returns the error (a DOMException), or null if the request succeeded. Throws a "InvalidStateError" DOMException if the request is still pending.
         */
        @JSProperty
        @Nullable
        DOMException getError();

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
        EventListener<Event> getOnsuccess();

        @JSProperty
        void setOnsuccess(EventListener<Event> onsuccess);

        default void addSuccessEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
            addEventListener("success", listener, options);
        }
        default void addSuccessEventListener(EventListener<Event> listener, boolean options) {
            addEventListener("success", listener, options);
        }
        default void addSuccessEventListener(EventListener<Event> listener) {
            addEventListener("success", listener);
        }

        default void removeSuccessEventListener(EventListener<Event> listener, EventListenerOptions options) {
            removeEventListener("success", listener, options);
        }
        default void removeSuccessEventListener(EventListener<Event> listener, boolean options) {
            removeEventListener("success", listener, options);
        }
        default void removeSuccessEventListener(EventListener<Event> listener) {
            removeEventListener("success", listener);
        }

        /**
         * Returns "pending" until a request is complete, then returns "done".
         */
        @JSProperty
        IDBRequestReadyState getReadyState();

        /**
         * When a request is completed, returns the result, or undefined if the request failed. Throws a "InvalidStateError" DOMException if the request is still pending.
         */
        @JSProperty
        T getResult();

        /**
         * Returns the IDBObjectStore, IDBIndex, or IDBCursor the request was made against, or null if is was an open request.
         */
        @JSProperty
        Unknown getSource();

        /**
         * Returns the IDBTransaction the request was made within. If this as an open request, then it returns an upgrade transaction while it is running, or null otherwise.
         */
        @JSProperty
        @Nullable
        IDBTransaction getTransaction();

        @JSBody(script = "return IDBRequest.prototype")
        static IDBRequest prototype() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(script = "return new IDBRequest()")
        static IDBRequest create() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }


        }
