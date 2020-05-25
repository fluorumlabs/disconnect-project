package com.github.fluorumlabs.disconnect.core.components.html.text.inline;

import com.github.fluorumlabs.disconnect.core.annotations.Tag;
import com.github.fluorumlabs.disconnect.core.components.HtmlComponent;
import js.web.dom.DOMTokenList;
import js.web.dom.HTMLAnchorElement;
import js.web.dom.HTMLHyperlinkElementUtils;

/**
 * Created by Artem Godin on 5/14/2020.
 */
@Tag("a")
public class Anchor extends HtmlComponent<HTMLAnchorElement> {
    public HTMLHyperlinkElementUtils getHyperlink() {
        return getElement().cast();
    }

    public String getDownload() {
        return getElement().getDownload();
    }

    public void setDownload(String download) {
        getElement().setDownload(download);
    }

    /**
     * Sets or retrieves the language code of the object.
     */
    public String getHrefLang() {
        return getElement().getHreflang();
    }

    public void setHrefLang(String hreflang) {
        getElement().setHreflang(hreflang);
    }

    public String getPing() {
        return getElement().getPing();
    }

    public void setPing(String ping) {
        getElement().setPing(ping);
    }

    public String getReferrerPolicy() {
        return getElement().getReferrerPolicy();
    }

    public void setReferrerPolicy(String referrerPolicy) {
        getElement().setReferrerPolicy(referrerPolicy);
    }

    /**
     * Sets or retrieves the relationship between the object and the destination of the link.
     */
    public String getRel() {
        return getElement().getRel();
    }

    public void setRel(String rel) {
        getElement().setRel(rel);
    }

    public DOMTokenList getRelList() {
        return getElement().getRelList();
    }

    /**
     * Sets or retrieves the window or frame at which to target content.
     */
    public String getTarget() {
        return getElement().getTarget();
    }

    public void setTarget(String target) {
        getElement().setTarget(target);
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

    public String getType() {
        return getElement().getType();
    }

    public void setType(String type) {
        getElement().setType(type);
    }
}
