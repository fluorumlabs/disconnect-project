package js.web.indexeddb;

import js.lang.Any;
import org.teavm.jso.JSProperty;


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
