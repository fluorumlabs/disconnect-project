package js.web.canvas;

import js.lang.Any;


public interface CanvasDrawPath extends Any {
    void beginPath();
    void clip(CanvasFillRule fillRule);
    void clip();
    void clip(Path2D path, CanvasFillRule fillRule);
    void clip(Path2D path);
    void fill(CanvasFillRule fillRule);
    void fill();
    void fill(Path2D path, CanvasFillRule fillRule);
    void fill(Path2D path);
    boolean isPointInPath(double x, double y, CanvasFillRule fillRule);
    boolean isPointInPath(double x, double y);
    boolean isPointInPath(Path2D path, double x, double y, CanvasFillRule fillRule);
    boolean isPointInPath(Path2D path, double x, double y);
    boolean isPointInStroke(double x, double y);
    boolean isPointInStroke(Path2D path, double x, double y);
    void stroke();
    void stroke(Path2D path);
}
