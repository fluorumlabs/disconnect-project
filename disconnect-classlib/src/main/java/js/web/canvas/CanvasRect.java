package js.web.canvas;

import js.lang.Any;


public interface CanvasRect extends Any {
    void clearRect(double x, double y, double w, double h);
    void fillRect(double x, double y, double w, double h);
    void strokeRect(double x, double y, double w, double h);
}
