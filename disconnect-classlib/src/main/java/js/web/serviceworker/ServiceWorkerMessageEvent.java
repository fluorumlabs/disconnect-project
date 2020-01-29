package js.web.serviceworker;

import js.lang.Any;
import js.lang.Unknown;
import js.util.collections.Array;
import js.util.collections.ReadonlyArray;
import js.web.channelmessaging.MessagePort;
import js.web.dom.Event;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSByRef;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/** This ServiceWorker API interface contains information about an event sent to a ServiceWorkerContainer target. This extends the default message event to allow setting a ServiceWorker object as the source of a message. The event object is accessed via the handler function of a message event, when fired by a message received from a service worker. */
        public interface ServiceWorkerMessageEvent extends Event {
        @JSProperty
        Unknown getData();

        @JSProperty
        String getLastEventId();

        @JSProperty
        String getOrigin();

        @JSProperty
        @Nullable
        ReadonlyArray<MessagePort> getPorts();

        @JSProperty
        @Nullable
        Unknown  getSource();

        @JSBody(script = "return ServiceWorkerMessageEvent.prototype")
        static ServiceWorkerMessageEvent prototype() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(params={"type","eventInitDict"}, script = "return new ServiceWorkerMessageEvent(type, eventInitDict)")
        static ServiceWorkerMessageEvent create(String type, ServiceWorkerMessageEventInit eventInitDict) {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(params="type", script = "return new ServiceWorkerMessageEvent(type)")
        static ServiceWorkerMessageEvent create(String type) {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }


    interface ServiceWorkerMessageEventInit extends EventInit {
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
        Unknown getSource();

        @JSProperty
        void setSource(ServiceWorker source);
        @JSProperty
        void setSource(MessagePort source);

    }
}
