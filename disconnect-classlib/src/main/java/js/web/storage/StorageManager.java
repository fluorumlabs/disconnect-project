package js.web.storage;

import js.lang.Any;
import js.lang.BooleanPromise;
import js.lang.Promise;
import org.teavm.jso.JSBody;


public interface StorageManager extends Any {
    @JSBody(script = "return StorageManager.prototype")
    static StorageManager prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new StorageManager()")
    static StorageManager create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    Promise<StorageEstimate> estimate();

    BooleanPromise persist();

    BooleanPromise persisted();

}
