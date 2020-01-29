package js.web.channelmessaging;

import js.util.buffers.Transferable;
import js.web.dom.EventListener;
import js.web.dom.AddEventListenerOptions;
import js.web.dom.EventListenerOptions;
import js.web.dom.EventTarget;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;import js.lang.Any;
import js.util.collections.Array;

import org.teavm.jso.JSByRef;

/** This Channel Messaging API interface represents one of the two ports of a MessageChannel, allowing messages to be sent from one port and listening out for them arriving at the other. */
        public interface MessagePort extends EventTarget, MessageEventSource, Transferable {

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
        /**
         * Disconnects the port, so that it is no longer active.
         */
        void close();
        /**
         * Posts a message through the channel. Objects listed in transfer are transferred, not just cloned, meaning that they are no longer usable on the sending side.
         *
         * Throws a "DataCloneError" DOMException if transfer contains duplicate objects or port, or if message could not be cloned.
         */
        void postMessage(Any message, @JSByRef Transferable... transfer);
        void postMessage(Any message, Array<Transferable> transfer);
        void postMessage(Any message, PostMessageOptions options);
        void postMessage(Any message);
        /**
         * Begins dispatching messages received on the port.
         */
        void start();

        @JSBody(script = "return MessagePort.prototype")
        static MessagePort prototype() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(script = "return new MessagePort()")
        static MessagePort create() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        }
