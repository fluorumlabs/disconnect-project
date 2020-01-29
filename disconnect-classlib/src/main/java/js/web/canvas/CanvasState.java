package js.web.canvas;

import js.lang.Any;


public interface CanvasState extends Any {
    void restore();
    void save();
}
