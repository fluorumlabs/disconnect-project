package js.web.mediastreams;

import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;import js.util.collections.Array;

import org.teavm.jso.JSByRef;


public interface MediaTrackConstraints extends MediaTrackConstraintSet {
    @JSProperty
    @Nullable
    Array<MediaTrackConstraintSet> getAdvanced();

    @JSProperty
    void setAdvanced(@JSByRef MediaTrackConstraintSet... advanced);
    @JSProperty
    void setAdvanced(Array<MediaTrackConstraintSet> advanced);

}
