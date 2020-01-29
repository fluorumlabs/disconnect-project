package js.web.webstorage;

import js.web.dom.Event;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * A StorageEvent is sent to a window when a storage area it has access to is changed within the context of another document.
 */
public interface StorageEvent extends Event {
    @JSBody(script = "return StorageEvent.prototype")
    static StorageEvent prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = {"type", "eventInitDict"}, script = "return new StorageEvent(type, eventInitDict)")
    static StorageEvent create(String type, StorageEventInit eventInitDict) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = "type", script = "return new StorageEvent(type)")
    static StorageEvent create(String type) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    /**
     * Returns the key of the storage item being changed.
     */
    @JSProperty
    @Nullable
    String getKey();

    /**
     * Returns the new value of the key of the storage item whose value is being changed.
     */
    @JSProperty
    @Nullable
    String getNewValue();

    /**
     * Returns the old value of the key of the storage item whose value is being changed.
     */
    @JSProperty
    @Nullable
    String getOldValue();

    /**
     * Returns the Storage object that was affected.
     */
    @JSProperty
    @Nullable
    Storage getStorageArea();

    /**
     * Returns the URL of the document whose storage item changed.
     */
    @JSProperty
    String getUrl();


    interface StorageEventInit extends EventInit {
        @JSProperty
        @Nullable
        String getKey();

        @JSProperty
        void setKey(String key);

        @JSProperty
        @Nullable
        String getNewValue();

        @JSProperty
        void setNewValue(String newValue);

        @JSProperty
        @Nullable
        String getOldValue();

        @JSProperty
        void setOldValue(String oldValue);

        @JSProperty
        @Nullable
        Storage getStorageArea();

        @JSProperty
        void setStorageArea(Storage storageArea);

        @JSProperty
        @Nullable
        String getUrl();

        @JSProperty
        void setUrl(String url);

    }
}
