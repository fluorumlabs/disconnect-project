package js.web.dom;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/** Events that fire when the fragment identifier of the URL has changed. */
public interface HashChangeEvent extends Event {
    @JSProperty
    String getNewURL();

    @JSProperty
    String getOldURL();

    @JSBody(script = "return HashChangeEvent.prototype")
    static HashChangeEvent prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params={"type","eventInitDict"}, script = "return new HashChangeEvent(type, eventInitDict)")
    static HashChangeEvent create(String type, HashChangeEventInit eventInitDict) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params="type", script = "return new HashChangeEvent(type)")
    static HashChangeEvent create(String type) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }



    interface HashChangeEventInit extends EventInit {
        @JSProperty
        @Nullable
        String getNewURL();

        @JSProperty
        void setNewURL(String newURL);

        @JSProperty
        @Nullable
        String getOldURL();

        @JSProperty
        void setOldURL(String oldURL);

    }
}
