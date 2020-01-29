package js.web.push;

import js.lang.Any;
import js.lang.BooleanPromise;
import js.util.buffers.ArrayBuffer;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/** This Push API interface provides a subcription's URL endpoint and allows unsubscription from a push service. */
        public interface PushSubscription extends Any {
        @JSProperty
        String getEndpoint();

        @JSProperty
        @Nullable
        double  getExpirationTime();

        @JSProperty
        PushSubscriptionOptions getOptions();

        @Nullable
        ArrayBuffer getKey(PushEncryptionKeyName name);
        PushSubscriptionJSON toJSON();
        BooleanPromise unsubscribe();

        @JSBody(script = "return PushSubscription.prototype")
        static PushSubscription prototype() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(script = "return new PushSubscription()")
        static PushSubscription create() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        }
