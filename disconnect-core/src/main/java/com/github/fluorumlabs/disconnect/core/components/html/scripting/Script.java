package com.github.fluorumlabs.disconnect.core.components.html.scripting;

import com.github.fluorumlabs.disconnect.core.annotations.Tag;
import com.github.fluorumlabs.disconnect.core.components.HtmlComponent;
import js.web.dom.HTMLScriptElement;

import javax.annotation.Nullable;
import java.util.Optional;


@Tag("script")
public class Script extends HtmlComponent<HTMLScriptElement> {
    public Script() {
        super();
    }

    public Script(String textContent) {
        super(textContent);
    }

    public boolean isAsync() {
        return getElement().isAsync();
    }

    public void setAsync(boolean async) {
        getElement().setAsync(async);
    }

    public Optional<String> getCrossOrigin() {
        return Optional.ofNullable(getElement().getCrossOrigin());
    }

    public void setCrossOrigin(@Nullable String crossOrigin) {
        getElement().setCrossOrigin(crossOrigin);
    }

    /**
     * Sets or retrieves the status of the script.
     */
    public boolean isDefer() {
        return getElement().isDefer();
    }

    public void setDefer(boolean defer) {
        getElement().setDefer(defer);
    }

    public String getIntegrity() {
        return getElement().getIntegrity();
    }

    public void setIntegrity(String integrity) {
        getElement().setIntegrity(integrity);
    }

    public boolean isNoModule() {
        return getElement().isNoModule();
    }

    public void setNoModule(boolean noModule) {
        getElement().setNoModule(noModule);
    }

    public String getReferrerPolicy() {
        return getElement().getReferrerPolicy();
    }

    public void setReferrerPolicy(String referrerPolicy) {
        getElement().setReferrerPolicy(referrerPolicy);
    }

    /**
     * Retrieves the URL to an external file that contains the source code or data.
     */
    public String getSrc() {
        return getElement().getSrc();
    }

    public void setSrc(String src) {
        getElement().setSrc(src);
    }

    /**
     * Retrieves or sets the text of the object as a string.
     */
    public String getText() {
        return getElement().getText();
    }

    public void setText(String text) {
        getElement().setText(text);
    }

    /**
     * Sets or retrieves the MIME type for the associated scripting engine.
     */
    public String getType() {
        return getElement().getType();
    }

    public void setType(String type) {
        getElement().setType(type);
    }
}
