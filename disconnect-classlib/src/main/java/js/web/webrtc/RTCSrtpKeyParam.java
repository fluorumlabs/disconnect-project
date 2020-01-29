package js.web.webrtc;

import js.lang.Any;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


public interface RTCSrtpKeyParam extends Any {
    @JSProperty
    @Nullable
    String getKeyMethod();

    @JSProperty
    void setKeyMethod(String keyMethod);

    @JSProperty
    @Nullable
    String getKeySalt();

    @JSProperty
    void setKeySalt(String keySalt);

    @JSProperty
    @Nullable
    String getLifetime();

    @JSProperty
    void setLifetime(String lifetime);

    @JSProperty
    double getMkiLength();

    @JSProperty
    void setMkiLength(double mkiLength);

    @JSProperty
    double getMkiValue();

    @JSProperty
    void setMkiValue(double mkiValue);

}
