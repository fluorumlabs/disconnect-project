package js.web.indexeddb;

import org.teavm.jso.JSProperty;

import js.lang.Any;


public interface IDBEnvironment extends Any {
    @JSProperty
    IDBFactory getIndexedDB();

}
