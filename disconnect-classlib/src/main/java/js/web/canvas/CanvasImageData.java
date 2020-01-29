package js.web.canvas;

import js.lang.Any;


public interface CanvasImageData extends Any {
    ImageData createImageData(double sw, double sh);

    ImageData createImageData(ImageData imagedata);

    ImageData getImageData(double sx, double sy, double sw, double sh);

    void putImageData(ImageData imagedata, double dx, double dy);

    void putImageData(ImageData imagedata, double dx, double dy, double dirtyX, double dirtyY, double dirtyWidth, double dirtyHeight);
}
