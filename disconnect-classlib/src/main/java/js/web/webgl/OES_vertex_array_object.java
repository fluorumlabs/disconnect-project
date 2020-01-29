package js.web.webgl;

import js.lang.Any;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


public interface OES_vertex_array_object extends Any {
    void bindVertexArrayOES(@Nullable WebGLVertexArrayObjectOES arrayObject);

    @Nullable
    WebGLVertexArrayObjectOES createVertexArrayOES();

    void deleteVertexArrayOES(@Nullable WebGLVertexArrayObjectOES arrayObject);

    boolean isVertexArrayOES(@Nullable WebGLVertexArrayObjectOES arrayObject);

    @JSProperty
    int getVERTEX_ARRAY_BINDING_OES();

}
