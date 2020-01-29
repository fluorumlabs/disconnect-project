package js.web.canvas;

import js.lang.Any;
import org.teavm.jso.JSProperty;


public interface CanvasTextDrawingStyles extends Any {
    @JSProperty
    CanvasDirection getDirection();

    @JSProperty
    void setDirection(CanvasDirection direction);

    @JSProperty
    String getFont();

    @JSProperty
    void setFont(String font);

    @JSProperty
    CanvasTextAlign getTextAlign();

    @JSProperty
    void setTextAlign(CanvasTextAlign textAlign);

    @JSProperty
    CanvasTextBaseline getTextBaseline();

    @JSProperty
    void setTextBaseline(CanvasTextBaseline textBaseline);

}
