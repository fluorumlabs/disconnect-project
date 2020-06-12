package com.github.fluorumlabs.disconnect.core.components.html.meta;

import com.github.fluorumlabs.disconnect.core.annotations.Tag;
import com.github.fluorumlabs.disconnect.core.components.HtmlComponent;
import js.web.cssom.StyleSheet;
import js.web.dom.HTMLStyleElement;

import java.util.Optional;

@Tag("style")
public class Style extends HtmlComponent<HTMLStyleElement> {
    public Style() {
        super();
    }

    public Style(String textContent) {
        super(textContent);
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

    public Optional<StyleSheet> getSheet() {
        return Optional.ofNullable(getElement().getSheet());
    }
}
