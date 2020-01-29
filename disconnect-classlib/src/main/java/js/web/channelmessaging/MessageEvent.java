package js.web.channelmessaging;

import js.lang.Any;
import js.lang.Unknown;
import js.util.collections.Array;
import js.util.collections.ReadonlyArray;
import js.web.dom.Event;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSByRef;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * A message received by a target object.
 */
public interface MessageEvent extends Event {
    @JSBody(script = "return MessageEvent.prototype")
    static MessageEvent prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = {"type", "eventInitDict"}, script = "return new MessageEvent(type, eventInitDict)")
    static MessageEvent create(String type, MessageEventInit eventInitDict) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = "type", script = "return new MessageEvent(type)")
    static MessageEvent create(String type) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    /**
     * Returns the data of the message.
     */
    @JSProperty
    Unknown getData();

    /**
     * Returns the last event ID string, for server-sent events.
     */
    @JSProperty
    String getLastEventId();

    /**
     * Returns the origin of the message, for server-sent events and cross-document messaging.
     */
    @JSProperty
    String getOrigin();

    /**
     * Returns the MessagePort array sent with the message, for cross-document messaging and channel messaging.
     */
    @JSProperty
    ReadonlyArray<MessagePort> getPorts();

    /**
     * Returns the WindowProxy of the source window, for cross-document messaging, and the MessagePort being attached, in the connect event fired at SharedWorkerGlobalScope objects.
     */
    @JSProperty
    @Nullable
    MessageEventSource getSource();


    interface MessageEventInit extends EventInit {
        @JSProperty
        @Nullable
        Any getData();

        @JSProperty
        void setData(Any data);

        @JSProperty
        @Nullable
        String getLastEventId();

        @JSProperty
        void setLastEventId(String lastEventId);

        @JSProperty
        @Nullable
        String getOrigin();

        @JSProperty
        void setOrigin(String origin);

        @JSProperty
        @Nullable
        Array<MessagePort> getPorts();

        @JSProperty
        void setPorts(@JSByRef MessagePort... ports);

        @JSProperty
        void setPorts(Array<MessagePort> ports);

        @JSProperty
        @Nullable
        MessageEventSource getSource();

        @JSProperty
        void setSource(MessageEventSource source);

    }
}
