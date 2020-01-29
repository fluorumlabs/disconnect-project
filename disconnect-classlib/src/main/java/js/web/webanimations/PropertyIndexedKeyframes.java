package js.web.webanimations;

import js.lang.Any;
import js.lang.Unknown;
import js.util.collections.Array;
import org.teavm.jso.JSByRef;
import org.teavm.jso.JSIndexer;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


public interface PropertyIndexedKeyframes extends Any {
    @JSProperty
    @Nullable
    Unknown getComposite();

    @JSProperty
    void setComposite(CompositeOperationOrAuto composite);
    @JSProperty
    void setComposite(@JSByRef CompositeOperationOrAuto... composite);
    @JSProperty
    void setComposite(Array<CompositeOperationOrAuto> composite);

    @JSProperty
    @Nullable
    Unknown getEasing();

    @JSProperty
    void setEasing(String easing);

    @JSProperty
    void setEasing(@JSByRef String... easing);

    @JSProperty
    Unknown getOffset();

    @JSProperty
    void setOffset(double offset);

    @JSProperty
    void setOffset(@JSByRef double... offset);

    @JSIndexer
    @Nullable
    Unknown get(String property);

    @JSIndexer
    void set(String property, String value);

    @JSIndexer
    void set(String property, @JSByRef String... value);

    @JSIndexer
    void set(String property, double value);

    @JSIndexer
    void set(String property, @JSByRef double... value);
}
