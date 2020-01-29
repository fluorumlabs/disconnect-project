package js.web.dom;

import js.lang.Any;
import js.web.mse.SourceBuffer;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * A single video track from a <video> element.
 */
public interface VideoTrack extends Any {
    @JSBody(script = "return VideoTrack.prototype")
    static VideoTrack prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new VideoTrack()")
    static VideoTrack create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    String getId();

    @JSProperty
    String getKind();

    @JSProperty
    void setKind(String kind);

    @JSProperty
    String getLabel();

    @JSProperty
    String getLanguage();

    @JSProperty
    void setLanguage(String language);

    @JSProperty
    boolean isSelected();

    @JSProperty
    void setSelected(boolean selected);

    @JSProperty
    @Nullable
    SourceBuffer getSourceBuffer();

}
