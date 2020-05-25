package com.github.fluorumlabs.disconnect.core.components.html.embedding;

import com.github.fluorumlabs.disconnect.core.annotations.Tag;
import com.github.fluorumlabs.disconnect.core.components.HtmlComponent;
import js.web.dom.HTMLSourceElement;


@Tag("source")
public class Source extends HtmlComponent<HTMLSourceElement> {
    /**
     * Gets or sets the intended media type of the media source.
     */
    public String getMedia() {
        return getElement().getMedia();
    }

    public void setMedia(String media) {
        getElement().setMedia(media);
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
     * Gets or sets the MIME type of a media resource.
     */
    public String getType() {
        return getElement().getType();
    }

    public void setType(String type) {
        getElement().setType(type);
    }
}

