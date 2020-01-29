package js.web.webvtt;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import js.lang.Any;


public interface VTTRegion extends Any {
        @JSProperty
        String getId();

        @JSProperty
        void setId(String id);

        @JSProperty
        int getLines();

        @JSProperty
        void setLines(int lines);

        @JSProperty
        double getRegionAnchorX();

        @JSProperty
        void setRegionAnchorX(double regionAnchorX);

        @JSProperty
        double getRegionAnchorY();

        @JSProperty
        void setRegionAnchorY(double regionAnchorY);

        @JSProperty
        ScrollSetting getScroll();

        @JSProperty
        void setScroll(ScrollSetting scroll);

        @JSProperty
        double getViewportAnchorX();

        @JSProperty
        void setViewportAnchorX(double viewportAnchorX);

        @JSProperty
        double getViewportAnchorY();

        @JSProperty
        void setViewportAnchorY(double viewportAnchorY);

        @JSProperty
        double getWidth();

        @JSProperty
        void setWidth(double width);

        @JSBody(script = "return VTTRegion.prototype")
        static VTTRegion prototype() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(script = "return new VTTRegion()")
        static VTTRegion create() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        }
