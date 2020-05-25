package com.github.fluorumlabs.disconnect.zero.component.html.media;

import com.github.fluorumlabs.disconnect.zero.annotations.Tag;
import com.github.fluorumlabs.disconnect.zero.component.HtmlComponent;
import js.web.dom.HTMLTrackElement;
import js.web.dom.TextTrack;

@Tag("track")
public class Track extends HtmlComponent<HTMLTrackElement> {
    public boolean isDefault() {
        return getElement().isDefault();
    }

    public void setDefault(boolean isdefault) {
        getElement().setDefault(isdefault);
    }

    public String getKind() {
        return getElement().getKind();
    }

    public void setKind(String kind) {
        getElement().setKind(kind);
    }

    public String getLabel() {
        return getElement().getLabel();
    }

    public void setLabel(String label) {
        getElement().setLabel(label);
    }

    public HTMLTrackElement.ReadyState getReadyState() {
        return getElement().getReadyState();
    }

    public String getSrc() {
        return getElement().getSrc();
    }

    public void setSrc(String src) {
        getElement().setSrc(src);
    }

    public String getSrcLang() {
        return getElement().getSrclang();
    }

    public void setSrcLang(String srclang) {
        getElement().setSrclang(srclang);
    }

    public TextTrack getTrack() {
        return getElement().getTrack();
    }
}
