package js.web.webanimations;

import js.lang.Any;
import js.lang.Unknown;
import org.teavm.jso.JSIndexer;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


public interface Keyframe extends Any {
    @JSProperty
    @Nullable
    CompositeOperationOrAuto getComposite();

    @JSProperty
    void setComposite(CompositeOperationOrAuto composite);

    @JSProperty
    @Nullable
    String getEasing();

    @JSProperty
    void setEasing(String easing);

    @JSProperty
    double getOffset();

    @JSProperty
    void setOffset(double offset);

    @JSIndexer
    @Nullable
    Unknown get(String property);

    @JSIndexer
    void set(String property, String value);

    @JSIndexer
    void set(String property, double value);

}
