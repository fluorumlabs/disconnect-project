package js.web.streams;

import js.extras.JsEnum;
import js.lang.Any;
import js.web.streams.ReadableByteStreamControllerCallback;
import js.web.streams.ReadableStreamErrorCallback;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


public interface UnderlyingByteSource extends Any {
    @JSProperty
    int getAutoAllocateChunkSize();

    @JSProperty
    void setAutoAllocateChunkSize(int autoAllocateChunkSize);

    @JSProperty
    @Nullable
    ReadableStreamErrorCallback getCancel();

    @JSProperty
    void setCancel(ReadableStreamErrorCallback cancel);

    @JSProperty
    @Nullable
    ReadableByteStreamControllerCallback getPull();

    @JSProperty
    void setPull(ReadableByteStreamControllerCallback pull);

    @JSProperty
    @Nullable
    ReadableByteStreamControllerCallback getStart();

    @JSProperty
    void setStart(ReadableByteStreamControllerCallback start);

    @JSProperty
    Type getType();

    @JSProperty
    void setType(Type type);

    abstract class Type extends JsEnum {
        public final static Type BYTES = JsEnum.of("bytes");
    }
}
