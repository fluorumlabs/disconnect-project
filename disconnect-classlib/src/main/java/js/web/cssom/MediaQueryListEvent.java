package js.web.cssom;

import js.web.dom.Event;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


public interface MediaQueryListEvent extends Event {
    @JSBody(script = "return MediaQueryListEvent.prototype")
    static MediaQueryListEvent prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = {"type", "eventInitDict"}, script = "return new MediaQueryListEvent(type, eventInitDict)")
    static MediaQueryListEvent create(String type, MediaQueryListEventInit eventInitDict) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = "type", script = "return new MediaQueryListEvent(type)")
    static MediaQueryListEvent create(String type) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    boolean isMatches();

    @JSProperty
    String getMedia();


    interface MediaQueryListEventInit extends EventInit {
        @JSProperty
        boolean isMatches();

        @JSProperty
        void setMatches(boolean matches);

        @JSProperty
        @Nullable
        String getMedia();

        @JSProperty
        void setMedia(String media);

    }
}
