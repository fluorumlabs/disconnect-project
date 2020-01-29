package js.web.serviceworker;

import js.lang.Any;
import js.lang.JsString;
import js.lang.Promise;
import js.lang.VoidPromise;
import js.util.collections.Array;
import org.teavm.jso.JSBody;

/** This ServiceWorker API interface provides an interface for registering and listing sync registrations. */
        public interface SyncManager extends Any {
        Promise<Array<JsString>> getTags();
        VoidPromise register(String tag);

        @JSBody(script = "return SyncManager.prototype")
        static SyncManager prototype() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(script = "return new SyncManager()")
        static SyncManager create() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        }
