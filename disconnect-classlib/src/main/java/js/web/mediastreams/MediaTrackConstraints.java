package js.web.mediastreams;

import js.util.collections.Array;
import org.teavm.jso.JSByRef;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


public interface MediaTrackConstraints extends MediaTrackConstraintSet {
    @JSProperty
    @Nullable
    Array<MediaTrackConstraintSet> getAdvanced();

    @JSProperty
    void setAdvanced(@JSByRef MediaTrackConstraintSet... advanced);

    @JSProperty
    void setAdvanced(Array<MediaTrackConstraintSet> advanced);

}
