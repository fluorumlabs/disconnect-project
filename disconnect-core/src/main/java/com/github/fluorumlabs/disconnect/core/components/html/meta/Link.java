package com.github.fluorumlabs.disconnect.core.components.html.meta;

import com.github.fluorumlabs.disconnect.core.annotations.Tag;
import com.github.fluorumlabs.disconnect.core.components.HtmlComponent;
import js.web.cssom.StyleSheet;
import js.web.dom.DOMTokenList;
import js.web.dom.HTMLLinkElement;

import javax.annotation.Nullable;
import java.util.Optional;

@Tag("link")
public class Link extends HtmlComponent<HTMLLinkElement> {
    public String getAs() {
        return getElement().getAs();
    }

    public void setAs(String as) {
        getElement().setAs(as);
    }

    public Optional<String> getCrossOrigin() {
        return Optional.ofNullable(getElement().getCrossOrigin());
    }

    public void setCrossOrigin(@Nullable String crossOrigin) {
        getElement().setCrossOrigin(crossOrigin);
    }

    public boolean isDisabled() {
        return getElement().isDisabled();
    }

    public void setDisabled(boolean disabled) {
        getElement().setDisabled(disabled);
    }

    /**
     * Sets or retrieves a destination URL or an anchor point.
     */
    public String getHref() {
        return getElement().getHref();
    }

    public void setHref(String href) {
        getElement().setHref(href);
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

    public String getImageSizes() {
        return getElement().getImageSizes();
    }

    public void setImageSizes(String imageSizes) {
        getElement().setImageSizes(imageSizes);
    }

    public String getImageSrcSet() {
        return getElement().getImageSrcset();
    }

    public void setImageSrcSet(String imageSrcset) {
        getElement().setImageSrcset(imageSrcset);
    }

    public String getIntegrity() {
        return getElement().getIntegrity();
    }

    public void setIntegrity(String integrity) {
        getElement().setIntegrity(integrity);
    }

    /**
     * Sets or retrieves the media type.
     */
    public String getMedia() {
        return getElement().getMedia();
    }

    public void setMedia(String media) {
        getElement().setMedia(media);
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

    public DOMTokenList getSizes() {
        return getElement().getSizes();
    }

    /**
     * Sets or retrieves the MIME type of the object.
     */
    public String getType() {
        return getElement().getType();
    }

    public void setType(String type) {
        getElement().setType(type);
    }

    public Optional<StyleSheet> getSheet() {
        return Optional.ofNullable(getElement().getSheet());
    }
}
