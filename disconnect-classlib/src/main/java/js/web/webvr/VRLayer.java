package js.web.webvr;

import js.web.canvas.HTMLCanvasElement;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;import js.lang.Any;
import js.lang.Unknown;
import js.util.buffers.Float32Array;

import org.teavm.jso.JSByRef;


public interface VRLayer extends Any {
    @JSProperty
    @Nullable
    Unknown getLeftBounds();

    @JSProperty
    void setLeftBounds(@JSByRef double... leftBounds);
    @JSProperty
    void setLeftBounds(Float32Array leftBounds);

    @JSProperty
    @Nullable
    Unknown  getRightBounds();

    @JSProperty
    void setRightBounds(@JSByRef double... rightBounds);
    @JSProperty
    void setRightBounds(Float32Array rightBounds);

    @JSProperty
    @Nullable
    HTMLCanvasElement getSource();

    @JSProperty
    void setSource(HTMLCanvasElement source);

}
