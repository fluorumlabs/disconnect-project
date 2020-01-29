package js.web.canvas;

import js.lang.Any;


public interface CanvasDrawImage extends Any {
    void drawImage(CanvasImageSource image, double dx, double dy);

    void drawImage(CanvasImageSource image, double dx, double dy, double dw, double dh);

    void drawImage(CanvasImageSource image, double sx, double sy, double sw, double sh, double dx, double dy, double dw, double dh);
}
