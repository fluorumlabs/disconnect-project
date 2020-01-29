package js.web.webanimations;


import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


public interface KeyframeEffectOptions extends EffectTiming {
    @JSProperty
    @Nullable
    CompositeOperation getComposite();

    @JSProperty
    void setComposite(CompositeOperation composite);

    @JSProperty
    @Nullable
    IterationCompositeOperation getIterationComposite();

    @JSProperty
    void setIterationComposite(IterationCompositeOperation iterationComposite);

}
