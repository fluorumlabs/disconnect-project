package js.web.mediastreams;

import js.lang.Any;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


public interface MediaStreamError extends Any {
    @JSBody(script = "return MediaStreamError.prototype")
    static MediaStreamError prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new MediaStreamError()")
    static MediaStreamError create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    @Nullable
    String getConstraintName();

    @JSProperty
    @Nullable
    String getMessage();

    @JSProperty
    String getName();

}
