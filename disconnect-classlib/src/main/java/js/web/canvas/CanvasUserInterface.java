package js.web.canvas;

import js.lang.Any;
import js.web.dom.Element;


public interface CanvasUserInterface extends Any {
    void drawFocusIfNeeded(Element element);

    void drawFocusIfNeeded(Path2D path, Element element);

    void scrollPathIntoView();

    void scrollPathIntoView(Path2D path);
}
