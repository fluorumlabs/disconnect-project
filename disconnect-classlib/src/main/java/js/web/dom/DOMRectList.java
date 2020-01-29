package js.web.dom;


import js.util.collections.ArrayLike;
import org.teavm.jso.JSBody;

import javax.annotation.Nullable;


public interface DOMRectList extends ArrayLike<DOMRect> {
    @Nullable
     DOMRect item(int index);

    @JSBody(script = "return DOMRectList.prototype")
    static DOMRectList prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new DOMRectList()")
    static DOMRectList create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

}
