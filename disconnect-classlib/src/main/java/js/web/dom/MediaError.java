package js.web.dom;

import js.extras.JsEnum;
import js.lang.Any;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/**
 * An error which occurred while handling media in an HTML media element based on HTMLMediaElement, such as &lt;audio&gt; or &lt;video&gt;.
 */
public interface MediaError extends Any {
    @JSBody(script = "return MediaError.prototype")
    static MediaError prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new MediaError()")
    static MediaError create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    Code getCode();

    @JSProperty
    String getMessage();

    @JSProperty
    int getMsExtendedCode();

    abstract class Code extends JsEnum {
        public static final Code MEDIA_ERR_ABORTED = JsEnum.from("MediaError.MEDIA_ERR_ABORTED");

        public static final Code MEDIA_ERR_DECODE = JsEnum.from("MediaError.MEDIA_ERR_DECODE");

        public static final Code MEDIA_ERR_NETWORK = JsEnum.from("MediaError.MEDIA_ERR_NETWORK");

        public static final Code MEDIA_ERR_SRC_NOT_SUPPORTED = JsEnum.from("MediaError.MEDIA_ERR_SRC_NOT_SUPPORTED");

        public static final Code MS_MEDIA_ERR_ENCRYPTED = JsEnum.from("MediaError.MS_MEDIA_ERR_ENCRYPTED");
    }

}
