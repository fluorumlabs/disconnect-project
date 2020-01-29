package js.web.streams;

import js.lang.Any;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


public interface Transformer<I extends Any, O extends Any> extends Any {
    @JSProperty
    @Nullable
    TransformStreamDefaultControllerCallback<O> getFlush();

    @JSProperty
    void setFlush(TransformStreamDefaultControllerCallback<O> flush);

    @JSProperty
    @Nullable
    Any getReadableType();

    @JSProperty
    void setReadableType(Any readableType);

    @JSProperty
    @Nullable
    TransformStreamDefaultControllerCallback<O> getStart();

    @JSProperty
    void setStart(TransformStreamDefaultControllerCallback<O> start);

    @JSProperty
    @Nullable
    TransformStreamDefaultControllerTransformCallback<I, O> getTransform();

    @JSProperty
    void setTransform(TransformStreamDefaultControllerTransformCallback<I, O> transform);

    @JSProperty
    @Nullable
    Any getWritableType();

    @JSProperty
    void setWritableType(Any writableType);

}
