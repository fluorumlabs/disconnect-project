package js.web.dom;

import js.lang.Any;
import js.lang.Unknown;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * Events providing information related to errors in scripts or in files.
 */
public interface ErrorEvent extends Event {
    @JSBody(script = "return ErrorEvent.prototype")
    static ErrorEvent prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = {"type", "eventInitDict"}, script = "return new ErrorEvent(type, eventInitDict)")
    static ErrorEvent create(String type, ErrorEventInit eventInitDict) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = "type", script = "return new ErrorEvent(type)")
    static ErrorEvent create(String type) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    int getColno();

    @JSProperty
    Unknown getError();

    @JSProperty
    String getFilename();

    @JSProperty
    int getLineno();

    @JSProperty
    String getMessage();


    interface ErrorEventInit extends EventInit {
        @JSProperty
        int getColno();

        @JSProperty
        void setColno(int colno);

        @JSProperty
        @Nullable
        Unknown getError();

        @JSProperty
        void setError(Any error);

        @JSProperty
        @Nullable
        String getFilename();

        @JSProperty
        void setFilename(String filename);

        @JSProperty
        int getLineno();

        @JSProperty
        void setLineno(int lineno);

        @JSProperty
        @Nullable
        String getMessage();

        @JSProperty
        void setMessage(String message);

    }
}
