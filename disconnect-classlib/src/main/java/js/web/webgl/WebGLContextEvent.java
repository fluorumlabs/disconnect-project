package js.web.webgl;

import js.web.dom.Event;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * The WebContextEvent interface is part of the WebGL API and is an interface for an event that is generated in response to a status change to the WebGL rendering context.
 */
public interface WebGLContextEvent extends Event {
    @JSBody(script = "return WebGLContextEvent.prototype")
    static WebGLContextEvent prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = {"type", "eventInitDict"}, script = "return new WebGLContextEvent(type, eventInitDict)")
    static WebGLContextEvent create(String type, WebGLContextEventInit eventInitDict) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = "type", script = "return new WebGLContextEvent(type)")
    static WebGLContextEvent create(String type) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    String getStatusMessage();


    interface WebGLContextEventInit extends EventInit {
        @JSProperty
        @Nullable
        String getStatusMessage();

        @JSProperty
        void setStatusMessage(String statusMessage);

    }
}
