package js.web.canvas;

import org.teavm.jso.JSProperty;

import js.lang.Any;


public interface CanvasImageSmoothing extends Any {
    @JSProperty
    boolean isImageSmoothingEnabled();

    @JSProperty
    void setImageSmoothingEnabled(boolean imageSmoothingEnabled);

    @JSProperty
    ImageSmoothingQuality getImageSmoothingQuality();

    @JSProperty
    void setImageSmoothingQuality(ImageSmoothingQuality imageSmoothingQuality);

}
