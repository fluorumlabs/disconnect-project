package com.github.fluorumlabs.disconnect.zero.component.html.media;

import com.github.fluorumlabs.disconnect.zero.annotations.Tag;
import com.github.fluorumlabs.disconnect.zero.component.HtmlComponent;
import js.lang.VoidPromise;
import js.web.dom.HTMLImageElement;

import javax.annotation.Nullable;
import java.util.Optional;

@Tag("img")
public class Image extends HtmlComponent<HTMLImageElement> {
    /**
     * Sets or retrieves a text alternative to the graphic.
     */
    public String getAlt() {
        return getElement().getAlt();
    }

    public void setAlt(String alt) {
        getElement().setAlt(alt);
    }

    /**
     * Retrieves whether the object is fully loaded.
     */
    public boolean isComplete() {
        return getElement().isComplete();
    }

    public Optional<String> getCrossOrigin() {
        return Optional.ofNullable(getElement().getCrossOrigin());
    }

    public void setCrossOrigin(@Nullable String crossOrigin) {
        getElement().setCrossOrigin(crossOrigin);
    }

    public String getCurrentSrc() {
        return getElement().getCurrentSrc();
    }

    public HTMLImageElement.Decoding getDecoding() {
        return getElement().getDecoding();
    }

    public void setDecoding(HTMLImageElement.Decoding decoding) {
        getElement().setDecoding(decoding);
    }

    /**
     * Sets or retrieves the height of the object.
     */
    public double getHeight() {
        return getElement().getHeight();
    }

    public void setHeight(double height) {
        getElement().setHeight(height);
    }

    /**
     * Sets or retrieves whether the image is a server-side image map.
     */
    public boolean isIsMap() {
        return getElement().isIsMap();
    }

    public void setIsMap(boolean isMap) {
        getElement().setIsMap(isMap);
    }

    /**
     * The original height of the image resource before sizing.
     */
    public double getNaturalHeight() {
        return getElement().getNaturalHeight();
    }

    /**
     * The original width of the image resource before sizing.
     */
    public double getNaturalWidth() {
        return getElement().getNaturalWidth();
    }

    public String getReferrerPolicy() {
        return getElement().getReferrerPolicy();
    }

    public void setReferrerPolicy(String referrerPolicy) {
        getElement().setReferrerPolicy(referrerPolicy);
    }

    public String getSizes() {
        return getElement().getSizes();
    }

    public void setSizes(String sizes) {
        getElement().setSizes(sizes);
    }

    /**
     * The address or URL of the a media resource that is to be considered.
     */
    public String getSrc() {
        return getElement().getSrc();
    }

    public void setSrc(String src) {
        getElement().setSrc(src);
    }

    public String getSrcSet() {
        return getElement().getSrcset();
    }

    public void setSrcSet(String srcset) {
        getElement().setSrcset(srcset);
    }

    /**
     * Sets or retrieves the URL, often with a bookmark extension (#name), to use as a client-side image map.
     */
    public String getUseMap() {
        return getElement().getUseMap();
    }

    public void setUseMap(String useMap) {
        getElement().setUseMap(useMap);
    }

    /**
     * Sets or retrieves the width of the object.
     */
    public double getWidth() {
        return getElement().getWidth();
    }

    public void setWidth(double width) {
        getElement().setWidth(width);
    }

    public double getX() {
        return getElement().getX();
    }

    public double getY() {
        return getElement().getY();
    }

    public VoidPromise decode() {
        return getElement().decode();
    }
}
