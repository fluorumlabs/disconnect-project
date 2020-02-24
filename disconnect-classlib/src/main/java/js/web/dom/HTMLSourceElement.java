package js.web.dom;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/**
 * Provides special properties (beyond the regular HTMLElement object interface it also has available to it by inheritance) for manipulating &lt;source&gt; elements.
 */
public interface HTMLSourceElement extends HTMLElement {
    @JSBody(script = "return HTMLSourceElement.prototype")
    static HTMLSourceElement prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new HTMLSourceElement()")
    static HTMLSourceElement create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    /**
     * Gets or sets the intended media type of the media source.
     */
    @JSProperty
    String getMedia();

    @JSProperty
    void setMedia(String media);

    @JSProperty
    String getSizes();

    @JSProperty
    void setSizes(String sizes);

    /**
     * The address or URL of the a media resource that is to be considered.
     */
    @JSProperty
    String getSrc();

    @JSProperty
    void setSrc(String src);

    @JSProperty
    String getSrcset();

    @JSProperty
    void setSrcset(String srcset);

    /**
     * Gets or sets the MIME type of a media resource.
     */
    @JSProperty
    String getType();

    @JSProperty
    void setType(String type);

}
