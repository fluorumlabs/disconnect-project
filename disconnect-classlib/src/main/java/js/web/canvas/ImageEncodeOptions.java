package js.web.canvas;

import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;import js.lang.Any;


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
