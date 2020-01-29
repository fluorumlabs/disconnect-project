package js.web.serviceworker;

import js.lang.Any;
import js.lang.Promise;
import js.lang.VoidPromise;
import org.teavm.jso.JSBody;


public interface NavigationPreloadManager extends Any {
        VoidPromise disable();
        VoidPromise enable();
        Promise<NavigationPreloadState> getState();
        VoidPromise setHeaderValue(String value);

        @JSBody(script = "return NavigationPreloadManager.prototype")
        static NavigationPreloadManager prototype() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(script = "return new NavigationPreloadManager()")
        static NavigationPreloadManager create() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        }
