package js.web.streams;

import js.lang.Any;
import js.lang.Unknown;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


public interface UnderlyingSource<R extends Any> extends Any {
    @JSProperty
    @Nullable
    ReadableStreamErrorCallback getCancel();

    @JSProperty
    void setCancel(ReadableStreamErrorCallback cancel);

    @JSProperty
    @Nullable
    ReadableStreamDefaultControllerCallback<R> getPull();

    @JSProperty
    void setPull(ReadableStreamDefaultControllerCallback<R> pull);

    @JSProperty
    @Nullable
    ReadableStreamDefaultControllerCallback<R> getStart();

    @JSProperty
    void setStart(ReadableStreamDefaultControllerCallback<R> pull);

    @JSProperty
    @Nullable
    Unknown getType();

    @JSProperty
    void setType(Unknown type);
}
