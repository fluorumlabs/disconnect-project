package js.web.push;

import js.util.buffers.ArrayBuffer;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;import js.lang.Any;


public interface PushSubscriptionOptions extends Any {
        @JSProperty
        @Nullable
        ArrayBuffer getApplicationServerKey();

        @JSProperty
        boolean isUserVisibleOnly();

        @JSBody(script = "return PushSubscriptionOptions.prototype")
        static PushSubscriptionOptions prototype() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(script = "return new PushSubscriptionOptions()")
        static PushSubscriptionOptions create() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }


        }
