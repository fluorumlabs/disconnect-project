package js.web.webrtc;

import js.lang.Any;
import js.util.collections.Array;
import org.teavm.jso.JSByRef;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


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
    void setIceservers(RTCIceServer... iceservers);

    @JSProperty
    void setIceservers(Array<RTCIceServer> iceservers);

}
