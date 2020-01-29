package js.web.dom;

import js.extras.JsEnum;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/** The HTMLTrackElement */
public interface HTMLTrackElement extends HTMLElement {
    @JSProperty
    boolean isDefault();

    @JSProperty
    void setDefault(boolean isdefault);

    @JSProperty
    String getKind();

    @JSProperty
    void setKind(String kind);

    @JSProperty
    String getLabel();

    @JSProperty
    void setLabel(String label);

    @JSProperty
    ReadyState getReadyState();

    @JSProperty
    String getSrc();

    @JSProperty
    void setSrc(String src);

    @JSProperty
    String getSrclang();

    @JSProperty
    void setSrclang(String srclang);

    @JSProperty
    TextTrack getTrack();

    abstract class ReadyState extends JsEnum {
    public static final ReadyState ERROR = JsEnum.from("return HTMLTrackElement.ERROR");

    public static final ReadyState LOADED = JsEnum.from("return HTMLTrackElement.LOADED");

    public static final ReadyState LOADING = JsEnum.from("return HTMLTrackElement.LOADING");

    public static final ReadyState NONE = JsEnum.from("return HTMLTrackElement.NONE");}

    @JSBody(script = "return HTMLTrackElement.prototype")
    static HTMLTrackElement prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new HTMLTrackElement()")
    static HTMLTrackElement create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

}
