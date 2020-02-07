package js.web.mediastreams;

import js.lang.Any;
import js.lang.Unknown;
import js.util.collections.Array;
import org.teavm.jso.JSByRef;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


public interface ConstrainVideoFacingModeParameters extends Any {
    @JSProperty
    @Nullable
    Unknown getExact();

    @JSProperty
    void setExact(VideoFacingModeEnum exact);

    @JSProperty
    void setExact(VideoFacingModeEnum... exact);

    @JSProperty
    void setExact(Array<VideoFacingModeEnum> exact);

    @JSProperty
    @Nullable
    Unknown getIdeal();

    @JSProperty
    void setIdeal(VideoFacingModeEnum ideal);

    @JSProperty
    void setIdeal(VideoFacingModeEnum... ideal);

    @JSProperty
    void setIdeal(Array<VideoFacingModeEnum> ideal);

}
