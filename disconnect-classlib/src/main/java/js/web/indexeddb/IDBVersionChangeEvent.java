package js.web.indexeddb;


import js.web.dom.Event;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/** This IndexedDB API interface indicates that the version of the database has changed, as the result of an IDBOpenDBRequest.onupgradeneeded event handler function. */
        public interface IDBVersionChangeEvent extends Event {
        @JSProperty
        int  getNewVersion();

        @JSProperty
        int getOldVersion();

        @JSBody(script = "return IDBVersionChangeEvent.prototype")
        static IDBVersionChangeEvent prototype() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(params={"type","eventInitDict"}, script = "return new IDBVersionChangeEvent(type, eventInitDict)")
        static IDBVersionChangeEvent create(String type, IDBVersionChangeEventInit eventInitDict) {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(params="type", script = "return new IDBVersionChangeEvent(type)")
        static IDBVersionChangeEvent create(String type) {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }



    interface IDBVersionChangeEventInit extends EventInit {
        @JSProperty
        int  getNewVersion();

        @JSProperty
        void setNewVersion(int newVersion);

        @JSProperty
        int getOldVersion();

        @JSProperty
        void setOldVersion(int oldVersion);

    }
}
