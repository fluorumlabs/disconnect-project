package js.web.cssom;

import js.util.collections.StringArrayLike;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSMethod;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


public interface MediaList extends StringArrayLike {
    @JSBody(script = "return MediaList.prototype")
    static MediaList prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new MediaList()")
    static MediaList create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    String getMediaText();

    @JSProperty
    void setMediaText(String mediaText);

    void appendMedium(String medium);

    void deleteMedium(String medium);

    @Nullable
    String item(int index);

    @JSMethod("toString")
    int doToString();

}
