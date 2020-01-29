package js.web.webanimations;


import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


public interface KeyframeAnimationOptions extends KeyframeEffectOptions {
    @JSProperty
    @Nullable
    String getId();

    @JSProperty
    void setId(String id);

}
