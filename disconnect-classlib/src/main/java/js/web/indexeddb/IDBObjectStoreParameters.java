package js.web.indexeddb;

import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;import js.lang.Any;
import js.lang.Unknown;

import org.teavm.jso.JSByRef;


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
    void setKeyPath(@JSByRef String... keyPath);

}
