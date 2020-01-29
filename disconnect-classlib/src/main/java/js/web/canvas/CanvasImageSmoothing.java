package js.web.canvas;

import js.lang.Any;
import org.teavm.jso.JSProperty;


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
