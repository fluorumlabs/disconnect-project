package js.web.dom.svg;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/**
 * Corresponds to the SVG <style> element.
 */
public interface SVGStyleElement extends SVGElement {
    @JSBody(script = "return SVGStyleElement.prototype")
    static SVGStyleElement prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new SVGStyleElement()")
    static SVGStyleElement create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    boolean isDisabled();

    @JSProperty
    void setDisabled(boolean disabled);

    @JSProperty
    String getMedia();

    @JSProperty
    void setMedia(String media);

    @JSProperty
    String getTitle();

    @JSProperty
    void setTitle(String title);

    @JSProperty
    String getType();

    @JSProperty
    void setType(String type);

}
