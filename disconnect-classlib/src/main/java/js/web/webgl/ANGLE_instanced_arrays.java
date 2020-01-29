package js.web.webgl;

import org.teavm.jso.JSProperty;

import js.lang.Any;

/** The ANGLE_instanced_arrays extension is part of the WebGL API and allows to draw the same object, or groups of similar objects multiple times, if they share the same vertex data, primitive count and type. */
public interface ANGLE_instanced_arrays extends Any {
    void drawArraysInstancedANGLE(int mode, int first, int count, int primcount);
    void drawElementsInstancedANGLE(int mode, int count, int type, int offset, int primcount);
    void vertexAttribDivisorANGLE(int index, int divisor);
    @JSProperty
    int getVERTEX_ATTRIB_ARRAY_DIVISOR_ANGLE();

}
