package js.web.push;

import js.lang.Any;
import js.lang.Promise;
import org.teavm.jso.JSBody;


/**
 * This Push API interface provides a way to receive notifications from third-party servers as well as request URLs for push notifications.
 */
public interface PushManager extends Any {
    @JSBody(script = "return PushManager.prototype")
    static PushManager prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new PushManager()")
    static PushManager create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return PushManager.supportedContentEncodings")
    static String[] getSupportedContentEncodings() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    Promise<PushSubscription> getSubscription();

    Promise<PushPermissionState> permissionState(PushSubscriptionOptionsInit options);

    Promise<PushPermissionState> permissionState();

    Promise<PushSubscription> subscribe(PushSubscriptionOptionsInit options);

    Promise<PushSubscription> subscribe();
}
