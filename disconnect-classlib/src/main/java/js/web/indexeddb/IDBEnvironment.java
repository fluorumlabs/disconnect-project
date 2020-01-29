package js.web.indexeddb;

import js.lang.Any;
import org.teavm.jso.JSProperty;


public interface IDBEnvironment extends Any {
    @JSProperty
    IDBFactory getIndexedDB();

}
