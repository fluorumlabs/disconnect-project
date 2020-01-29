package js.web.streams;

import js.lang.Any;
import js.lang.Unknown;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


public interface UnderlyingSink<W extends Any> extends Any {
    @JSProperty
    @Nullable
    WritableStreamErrorCallback getAbort();

    @JSProperty
    void setAbort(WritableStreamErrorCallback abort);

    @JSProperty
    @Nullable
    WritableStreamDefaultControllerCloseCallback getClose();

    @JSProperty
    void setClose(WritableStreamDefaultControllerCloseCallback close);

    @JSProperty
    @Nullable
    WritableStreamDefaultControllerStartCallback getStart();

    @JSProperty
    void setStart(WritableStreamDefaultControllerStartCallback start);

    @JSProperty
    @Nullable
    Unknown getType();

    @JSProperty
    void setType(Unknown type);

    @JSProperty
    @Nullable
    WritableStreamDefaultControllerWriteCallback<W> getWrite();

    @JSProperty
    void setWrite(WritableStreamDefaultControllerWriteCallback<W> write);
}
