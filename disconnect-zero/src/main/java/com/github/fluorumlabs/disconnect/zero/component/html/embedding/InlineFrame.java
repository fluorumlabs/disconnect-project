package com.github.fluorumlabs.disconnect.zero.component.html.embedding;

import com.github.fluorumlabs.disconnect.zero.annotations.Tag;
import com.github.fluorumlabs.disconnect.zero.component.HtmlComponent;
import js.web.dom.*;

import java.util.Optional;

@Tag("iframe")
public class InlineFrame extends HtmlComponent<HTMLIFrameElement> {
    public String getAllow() {
        return getElement().getAllow();
    }

    public void setAllow(String allow) {
        getElement().setAllow(allow);
    }

    public boolean isAllowFullscreen() {
        return getElement().isAllowFullscreen();
    }

    public void setAllowFullscreen(boolean allowFullscreen) {
        getElement().setAllowFullscreen(allowFullscreen);
    }

    public boolean isAllowPaymentRequest() {
        return getElement().isAllowPaymentRequest();
    }

    public void setAllowPaymentRequest(boolean allowPaymentRequest) {
        getElement().setAllowPaymentRequest(allowPaymentRequest);
    }

    /**
     * Retrieves the document object of the page or frame.
     */
    public Optional<Document> getContentDocument() {
        return Optional.ofNullable(getElement().getContentDocument());
    }

    /**
     * Retrieves the object of the specified.
     */
    public Optional<WindowProxy> getContentWindow() {
        return Optional.ofNullable(getElement().getContentWindow());
    }

    /**
     * Sets or retrieves the height of the object.
     */
    public String getHeight() {
        return getElement().getHeight();
    }

    public void setHeight(String height) {
        getElement().setHeight(height);
    }

    /**
     * Sets or retrieves the frame name.
     */
    public String getName() {
        return getElement().getName();
    }

    public void setName(String name) {
        getElement().setName(name);
    }

    public ReferrerPolicy getReferrerPolicy() {
        return getElement().getReferrerPolicy();
    }

    public void setReferrerPolicy(ReferrerPolicy referrerPolicy) {
        getElement().setReferrerPolicy(referrerPolicy);
    }

    public DOMTokenList getSandbox() {
        return getElement().getSandbox();
    }

    /**
     * Sets or retrieves a URL to be loaded by the object.
     */
    public String getSrc() {
        return getElement().getSrc();
    }

    public void setSrc(String src) {
        getElement().setSrc(src);
    }

    /**
     * Sets or retrives the content of the page that is to contain.
     */
    public String getSrcDocumentContent() {
        return getElement().getSrcdoc();
    }

    public void setSrcDocumentContent(String srcdoc) {
        getElement().setSrcdoc(srcdoc);
    }

    /**
     * Sets or retrieves the width of the object.
     */
    public String getWidth() {
        return getElement().getWidth();
    }

    public void setWidth(String width) {
        getElement().setWidth(width);
    }

    public Optional<Document> getSVGDocument() {
        return Optional.ofNullable(getElement().getSVGDocument());
    }
}
