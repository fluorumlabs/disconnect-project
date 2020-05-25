package com.github.fluorumlabs.disconnect.zero.component.html.media;

import com.github.fluorumlabs.disconnect.zero.annotations.Tag;
import com.github.fluorumlabs.disconnect.zero.component.HtmlComponent;
import com.github.fluorumlabs.disconnect.zero.container.ArrayLikeBackedComponentList;
import com.github.fluorumlabs.disconnect.zero.container.ComponentList;
import js.web.dom.DOMTokenList;
import js.web.dom.HTMLAreaElement;
import js.web.dom.HTMLHyperlinkElementUtils;
import js.web.dom.HTMLMapElement;

@Tag("map")
public class ImageMap extends HtmlComponent<HTMLMapElement> {
    /**
     * Retrieves a collection of the area objects defined for the given map object.
     */
    public ComponentList<Area> getAreas() {
        return  new ArrayLikeBackedComponentList<>(getElement().getAreas().cast());
    }

    /**
     * Sets or retrieves the name of the object.
     */
    public String getName() {
        return getElement().getName();
    }

    public void setName(String name) {
        getElement().setName(name);
    }

    @Tag("area")
    public static class Area extends HtmlComponent<HTMLAreaElement> {
        public HTMLHyperlinkElementUtils getHyperlink() {
            return getElement().cast();
        }

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
         * Sets or retrieves the coordinates of the object.
         */
        public String getCoords() {
            return getElement().getCoords();
        }

        public void setCoords(String coords) {
            getElement().setCoords(coords);
        }

        public String getDownload() {
            return getElement().getDownload();
        }

        public void setDownload(String download) {
            getElement().setDownload(download);
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
         * Sets or retrieves the shape of the object.
         */
        public String getShape() {
            return getElement().getShape();
        }

        public void setShape(String shape) {
            getElement().setShape(shape);
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
    }

}
