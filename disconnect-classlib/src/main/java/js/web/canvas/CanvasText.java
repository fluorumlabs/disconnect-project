package js.web.canvas;

import js.lang.Any;
import js.web.canvas.TextMetrics;


public interface CanvasText extends Any {
    void fillText(String text, double x, double y, double maxWidth);
    void fillText(String text, double x, double y);
    TextMetrics measureText(String text);
    void strokeText(String text, double x, double y, double maxWidth);
    void strokeText(String text, double x, double y);
}
