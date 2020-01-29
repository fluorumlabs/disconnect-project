package js.web.dom;

import js.extras.JsEnum;
import js.lang.VoidPromise;
import js.web.canvas.CanvasImageSource;
import js.web.webgl.TexImageSource;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * Provides special properties and methods for manipulating <img> elements.
 */
public interface HTMLImageElement extends HTMLElement, CanvasImageSource, TexImageSource {
    @JSBody(script = "return HTMLImageElement.prototype")
    static HTMLImageElement prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new HTMLImageElement()")
    static HTMLImageElement create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    /**
     * Sets or retrieves how the object is aligned with adjacent text.
     */
    @Deprecated
    @JSProperty
    String getAlign();

    @JSProperty
    void setAlign(String align);

    /**
     * Sets or retrieves a text alternative to the graphic.
     */
    @JSProperty
    String getAlt();

    @JSProperty
    void setAlt(String alt);

    /**
     * Specifies the properties of a border drawn around an object.
     */
    @Deprecated
    @JSProperty
    String getBorder();

    @JSProperty
    void setBorder(String border);

    /**
     * Retrieves whether the object is fully loaded.
     */
    @JSProperty
    boolean isComplete();

    @JSProperty
    @Nullable
    String getCrossOrigin();

    @JSProperty
    void setCrossOrigin(String crossOrigin);

    @JSProperty
    String getCurrentSrc();

    @JSProperty
    Decoding getDecoding();

    @JSProperty
    void setDecoding(Decoding decoding);

    /**
     * Sets or retrieves the height of the object.
     */
    @JSProperty
    double getHeight();

    @JSProperty
    void setHeight(double height);

    /**
     * Sets or retrieves the width of the border to draw around the object.
     */
    @Deprecated
    @JSProperty
    double getHspace();

    @JSProperty
    void setHspace(double hspace);

    /**
     * Sets or retrieves whether the image is a server-side image map.
     */
    @JSProperty
    boolean isIsMap();

    @JSProperty
    void setIsMap(boolean isMap);

    /**
     * Sets or retrieves a Uniform Resource Identifier (URI) to a long description of the object.
     */
    @Deprecated
    @JSProperty
    String getLongDesc();

    @JSProperty
    void setLongDesc(String longDesc);

    @Deprecated
    @JSProperty
    String getLowsrc();

    @JSProperty
    void setLowsrc(String lowsrc);

    /**
     * Sets or retrieves the name of the object.
     */
    @Deprecated
    @JSProperty
    String getName();

    @JSProperty
    void setName(String name);

    /**
     * The original height of the image resource before sizing.
     */
    @JSProperty
    double getNaturalHeight();

    /**
     * The original width of the image resource before sizing.
     */
    @JSProperty
    double getNaturalWidth();

    @JSProperty
    String getReferrerPolicy();

    @JSProperty
    void setReferrerPolicy(String referrerPolicy);

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
     * Sets or retrieves the URL, often with a bookmark extension (#name), to use as a client-side image map.
     */
    @JSProperty
    String getUseMap();

    @JSProperty
    void setUseMap(String useMap);

    /**
     * Sets or retrieves the vertical margin for the object.
     */
    @Deprecated
    @JSProperty
    double getVspace();

    @JSProperty
    void setVspace(double vspace);

    /**
     * Sets or retrieves the width of the object.
     */
    @JSProperty
    double getWidth();

    @JSProperty
    void setWidth(double width);

    @JSProperty
    double getX();

    @JSProperty
    double getY();

    VoidPromise decode();

    abstract class Decoding extends JsEnum {
        public static final Decoding ASYNC = JsEnum.of("async");

        public static final Decoding SYNC = JsEnum.of("sync");

        public static final Decoding AUTO = JsEnum.of("auto");
    }

}
