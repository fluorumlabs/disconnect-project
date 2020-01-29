package js.web.mediastreams;

import js.lang.Any;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


public interface MediaKeySystemMediaCapability extends Any {
    @JSProperty
    @Nullable
    String getContentType();

    @JSProperty
    void setContentType(String contentType);

    @JSProperty
    @Nullable
    String getRobustness();

    @JSProperty
    void setRobustness(String robustness);

}
