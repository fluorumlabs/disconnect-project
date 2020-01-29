package js.web.canvas;

import js.web.dom.Element;

import js.lang.Any;


public interface CanvasUserInterface extends Any {
    void drawFocusIfNeeded(Element element);
    void drawFocusIfNeeded(Path2D path, Element element);
    void scrollPathIntoView();
    void scrollPathIntoView(Path2D path);
}
