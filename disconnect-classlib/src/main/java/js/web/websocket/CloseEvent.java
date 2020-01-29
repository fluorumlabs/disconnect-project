package js.web.websocket;

import js.web.dom.Event;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * A CloseEvent is sent to clients using WebSockets when the connection is closed. This is delivered to the listener indicated by the WebSocket object's onclose attribute.
 */
public interface CloseEvent extends Event {
    @JSBody(script = "return CloseEvent.prototype")
    static CloseEvent prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = {"type", "eventInitDict"}, script = "return new CloseEvent(type, eventInitDict)")
    static CloseEvent create(String type, CloseEventInit eventInitDict) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = "type", script = "return new CloseEvent(type)")
    static CloseEvent create(String type) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    int getCode();

    @JSProperty
    String getReason();

    @JSProperty
    boolean isWasClean();

    @Deprecated
    void initCloseEvent(String typeArg, boolean canBubbleArg, boolean cancelableArg, boolean wasCleanArg, int codeArg, String reasonArg);


    interface CloseEventInit extends EventInit {
        @JSProperty
        int getCode();

        @JSProperty
        void setCode(int code);

        @JSProperty
        @Nullable
        String getReason();

        @JSProperty
        void setReason(String reason);

        @JSProperty
        @Nullable
        boolean isWasClean();

        @JSProperty
        void setWasClean(boolean wasClean);

    }
}
