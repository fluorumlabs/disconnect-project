package js.web.webrtc;

import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;import js.lang.Any;
import js.util.collections.Array;

import org.teavm.jso.JSByRef;


public interface RTCSrtpSdesParameters extends Any {
    @JSProperty
    @Nullable
    String getCryptoSuite();

    @JSProperty
    void setCryptoSuite(String cryptoSuite);

    @JSProperty
    @Nullable
    Array<RTCSrtpKeyParam> getKeyParams();

    @JSProperty
    void setKeyParams(@JSByRef RTCSrtpKeyParam... keyParams);
    @JSProperty
    void setKeyParams(Array<RTCSrtpKeyParam> keyParams);

    @JSProperty
    @Nullable
    String[] getSessionParams();

    @JSProperty
    void setSessionParams(@JSByRef String... sessionParams);

    @JSProperty
    int getTag();

    @JSProperty
    void setTag(int tag);

}
