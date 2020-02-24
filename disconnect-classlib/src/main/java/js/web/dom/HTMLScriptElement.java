package js.web.dom;


import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * HTML &lt;script&gt; elements expose the HTMLScriptElement interface, which provides special properties and methods for manipulating the behavior and execution of &lt;script&gt; elements (beyond the inherited HTMLElement interface).
 */
public interface HTMLScriptElement extends HTMLElement, HTMLOrSVGScriptElement {
    @JSBody(script = "return HTMLScriptElement.prototype")
    static HTMLScriptElement prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new HTMLScriptElement()")
    static HTMLScriptElement create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    boolean isAsync();

    @JSProperty
    void setAsync(boolean async);

    /**
     * Sets or retrieves the character set used to encode the object.
     */
    @Deprecated
    @JSProperty
    String getCharset();

    @JSProperty
    void setCharset(String charset);

    @JSProperty
    @Nullable
    String getCrossOrigin();

    @JSProperty
    void setCrossOrigin(String crossOrigin);

    /**
     * Sets or retrieves the status of the script.
     */
    @JSProperty
    boolean isDefer();

    @JSProperty
    void setDefer(boolean defer);

    /**
     * Sets or retrieves the event for which the script is written.
     */
    @Deprecated
    @JSProperty
    String getEvent();

    @JSProperty
    void setEvent(String event);

    /**
     * Sets or retrieves the object that is bound to the event script.
     */
    @Deprecated
    @JSProperty
    String getHtmlFor();

    @JSProperty
    void setHtmlFor(String htmlFor);

    @JSProperty
    String getIntegrity();

    @JSProperty
    void setIntegrity(String integrity);

    @JSProperty
    boolean isNoModule();

    @JSProperty
    void setNoModule(boolean noModule);

    @JSProperty
    String getReferrerPolicy();

    @JSProperty
    void setReferrerPolicy(String referrerPolicy);

    /**
     * Retrieves the URL to an external file that contains the source code or data.
     */
    @JSProperty
    String getSrc();

    @JSProperty
    void setSrc(String src);

    /**
     * Retrieves or sets the text of the object as a string.
     */
    @JSProperty
    String getText();

    @JSProperty
    void setText(String text);

    /**
     * Sets or retrieves the MIME type for the associated scripting engine.
     */
    @JSProperty
    String getType();

    @JSProperty
    void setType(String type);

}
