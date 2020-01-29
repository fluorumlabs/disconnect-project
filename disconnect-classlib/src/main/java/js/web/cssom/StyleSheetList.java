package js.web.cssom;


import js.util.collections.ArrayLike;
import org.teavm.jso.JSBody;

import javax.annotation.Nullable;

/**
 * A list of StyleSheet.
 */
public interface StyleSheetList extends ArrayLike<StyleSheet> {

    @JSBody(script = "return StyleSheetList.prototype")
    static StyleSheetList prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new StyleSheetList()")
    static StyleSheetList create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @Nullable
    StyleSheet item(int index);

}
