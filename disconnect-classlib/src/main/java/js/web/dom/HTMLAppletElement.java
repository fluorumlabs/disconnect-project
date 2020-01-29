package js.web.dom;


import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


public interface HTMLAppletElement extends HTMLElement {
    @JSBody(script = "return HTMLAppletElement.prototype")
    static HTMLAppletElement prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new HTMLAppletElement()")
    static HTMLAppletElement create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @Deprecated
    @JSProperty
    String getAlign();

    @JSProperty
    void setAlign(String align);

    /**
     * Sets or retrieves a text alternative to the graphic.
     */
    @Deprecated
    @JSProperty
    String getAlt();

    @JSProperty
    void setAlt(String alt);

    /**
     * Sets or retrieves a character string that can be used to implement your own archive functionality for the object.
     */
    @Deprecated
    @JSProperty
    String getArchive();

    @JSProperty
    void setArchive(String archive);

    @Deprecated
    @JSProperty
    String getCode();

    @JSProperty
    void setCode(String code);

    /**
     * Sets or retrieves the URL of the component.
     */
    @Deprecated
    @JSProperty
    String getCodeBase();

    @JSProperty
    void setCodeBase(String codeBase);

    @JSProperty
    @Nullable
    HTMLFormElement getForm();

    /**
     * Sets or retrieves the height of the object.
     */
    @Deprecated
    @JSProperty
    String getHeight();

    @JSProperty
    void setHeight(String height);

    @Deprecated
    @JSProperty
    double getHspace();

    @JSProperty
    void setHspace(double hspace);

    /**
     * Sets or retrieves the shape of the object.
     */
    @Deprecated
    @JSProperty
    String getName();

    @JSProperty
    void setName(String name);

    @Deprecated
    @JSProperty
    String getObject();

    @JSProperty
    void setObject(String object);

    @Deprecated
    @JSProperty
    double getVspace();

    @JSProperty
    void setVspace(double vspace);

    @Deprecated
    @JSProperty
    String getWidth();

    @JSProperty
    void setWidth(String width);

}
