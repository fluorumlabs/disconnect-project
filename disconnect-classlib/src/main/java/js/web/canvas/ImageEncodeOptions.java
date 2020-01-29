package js.web.canvas;

import js.lang.Any;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


public interface ImageEncodeOptions extends Any {
    @JSProperty
    double getQuality();

    @JSProperty
    void setQuality(double quality);

    @JSProperty
    @Nullable
    String getType();

    @JSProperty
    void setType(String type);

}
