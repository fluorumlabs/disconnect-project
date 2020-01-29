package js.web.channelmessaging;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import js.lang.Any;

/** This Channel Messaging API interface allows us to create a new message channel and send data through it via its two MessagePort properties. */
        public interface MessageChannel extends Any {
        /**
         * Returns the first MessagePort object.
         */
        @JSProperty
        MessagePort getPort1();

        /**
         * Returns the second MessagePort object.
         */
        @JSProperty
        MessagePort getPort2();

        @JSBody(script = "return MessageChannel.prototype")
        static MessageChannel prototype() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(script = "return new MessageChannel()")
        static MessageChannel create() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        }
