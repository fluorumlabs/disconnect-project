package js.web.cssom;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import js.lang.Any;

/** A screen, usually the one on which the current window is being rendered, and is obtained using window.screen. */
        public interface Screen extends Any {
        @JSProperty
        int getAvailHeight();

        @JSProperty
        int getAvailWidth();

        @JSProperty
        int getColorDepth();

        @JSProperty
        int getHeight();

        @JSProperty
        ScreenOrientation getOrientation();

        @JSProperty
        int getPixelDepth();

        @JSProperty
        int getWidth();

        @JSBody(script = "return Screen.prototype")
        static Screen prototype() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(script = "return new Screen()")
        static Screen create() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        }
