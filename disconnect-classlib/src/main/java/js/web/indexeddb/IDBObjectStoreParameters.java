package js.web.indexeddb;

import js.lang.Any;
import js.lang.Unknown;
import org.teavm.jso.JSByRef;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


public interface IDBObjectStoreParameters extends Any {
    @JSProperty
    boolean isAutoIncrement();

    @JSProperty
    void setAutoIncrement(boolean autoIncrement);

    @JSProperty
    @Nullable
    Unknown getKeyPath();

    @JSProperty
    void setKeyPath(String keyPath);

    @JSProperty
    void setKeyPath(String... keyPath);

}
