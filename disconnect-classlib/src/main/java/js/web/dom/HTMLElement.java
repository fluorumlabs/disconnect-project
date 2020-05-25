package js.web.dom;


import js.web.cssom.ElementCSSInlineStyle;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * Any HTML element. Some elements directly implement this interface, while others implement it via an interface that inherits it.
 */
public interface HTMLElement extends Element, DocumentAndElementEventHandlers, ElementCSSInlineStyle, ElementContentEditable, GlobalEventHandlers, HTMLOrSVGElement {
    @JSBody(script = "return HTMLElement.prototype")
    static HTMLElement prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new HTMLElement()")
    static HTMLElement create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    String getAccessKey();

    @JSProperty
    void setAccessKey(String accessKey);

    @JSProperty
    String getAccessKeyLabel();

    @JSProperty
    Autocapitalize getAutocapitalize();

    @JSProperty
    void setAutocapitalize(Autocapitalize autocapitalize);

    @JSProperty
    Dir getDir();

    @JSProperty
    void setDir(Dir dir);

    @JSProperty
    boolean isDraggable();

    @JSProperty
    void setDraggable(boolean draggable);

    @JSProperty
    boolean isHidden();

    @JSProperty
    void setHidden(boolean hidden);

    @JSProperty
    String getInnerText();

    @JSProperty
    void setInnerText(String innerText);

    @JSProperty
    String getLang();

    @JSProperty
    void setLang(String lang);

    @JSProperty
    double getOffsetHeight();

    @JSProperty
    double getOffsetLeft();

    @JSProperty
    @Nullable
    Element getOffsetParent();

    @JSProperty
    double getOffsetTop();

    @JSProperty
    double getOffsetWidth();

    @JSProperty
    boolean isSpellcheck();

    @JSProperty
    void setSpellcheck(boolean spellcheck);

    @JSProperty
    String getTitle();

    @JSProperty
    void setTitle(String title);

    @JSProperty
    boolean isTranslate();

    @JSProperty
    void setTranslate(boolean translate);

    void click();

}
