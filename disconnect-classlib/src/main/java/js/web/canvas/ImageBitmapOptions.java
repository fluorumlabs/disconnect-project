package js.web.canvas;

import js.extras.JsEnum;
import js.lang.Any;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


public interface ImageBitmapOptions extends Any {
    @JSProperty
    @Nullable
    ColorSpaceConversion getColorSpaceConversion();

    @JSProperty
    void setColorSpaceConversion(ColorSpaceConversion colorSpaceConversion);

    @JSProperty
    @Nullable
    ImageOrientation getImageOrientation();

    @JSProperty
    void setImageOrientation(ImageOrientation imageOrientation);

    @JSProperty
    @Nullable
    PremultiplyAlpha getPremultiplyAlpha();

    @JSProperty
    void setPremultiplyAlpha(PremultiplyAlpha premultiplyAlpha);

    @JSProperty
    @Nullable
    double getResizeHeight();

    @JSProperty
    void setResizeHeight(double resizeHeight);

    @JSProperty
    @Nullable
    ResizeQuality getResizeQuality();

    @JSProperty
    void setResizeQuality(ResizeQuality resizeQuality);

    @JSProperty
    double getResizeWidth();

    @JSProperty
    void setResizeWidth(double resizeWidth);

    abstract class ColorSpaceConversion extends JsEnum {
        public static final ColorSpaceConversion NONE = JsEnum.of("none");

        public static final ColorSpaceConversion DEFAULT = JsEnum.of("default");
    }

    abstract class ImageOrientation extends JsEnum {
        public static final ImageOrientation NONE = JsEnum.of("none");

        public static final ImageOrientation FLIP_Y = JsEnum.of("flipY");
    }

    abstract class PremultiplyAlpha extends JsEnum {
        public static final PremultiplyAlpha NONE = JsEnum.of("none");

        public static final PremultiplyAlpha PREMULTIPLY = JsEnum.of("premultiply");

        public static final PremultiplyAlpha DEFAULT = JsEnum.of("default");
    }

    abstract class ResizeQuality extends JsEnum {
        public static final ResizeQuality PIXELATED = JsEnum.of("pixelated");

        public static final ResizeQuality LOW = JsEnum.of("low");

        public static final ResizeQuality MEDIUM = JsEnum.of("medium");

        public static final ResizeQuality HIGH = JsEnum.of("high");
    }

}
