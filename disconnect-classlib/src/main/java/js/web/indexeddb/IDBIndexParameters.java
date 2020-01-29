package js.web.indexeddb;

import org.teavm.jso.JSProperty;

import js.lang.Any;


public interface IDBIndexParameters extends Any {
    @JSProperty
    boolean isMultiEntry();

    @JSProperty
    void setMultiEntry(boolean multiEntry);

    @JSProperty
    boolean isUnique();

    @JSProperty
    void setUnique(boolean unique);

}
