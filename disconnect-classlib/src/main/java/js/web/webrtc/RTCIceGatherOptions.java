package js.web.webrtc;

import js.util.collections.Array;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;import js.lang.Any;

import org.teavm.jso.JSByRef;


public interface RTCIceGatherOptions extends Any {
    @JSProperty
    @Nullable
    RTCIceGatherPolicy getGatherPolicy();

    @JSProperty
    void setGatherPolicy(RTCIceGatherPolicy gatherPolicy);

    @JSProperty
    @Nullable
    Array<RTCIceServer> getIceservers();

    @JSProperty
    void setIceservers(@JSByRef RTCIceServer... iceservers);
    @JSProperty
    void setIceservers(Array<RTCIceServer> iceservers);

}
