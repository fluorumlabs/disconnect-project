package js.web.cssom;


import js.util.collections.ArrayLike;
import org.teavm.jso.JSBody;

import javax.annotation.Nullable;

/** A CSSRuleList is an (indirect-modify only) array-like object containing an ordered collection of CSSRule objects. */
public interface CSSRuleList extends ArrayLike<CSSRule> {
    @Nullable
     CSSRule item(int index);

    @JSBody(script = "return CSSRuleList.prototype")
    static CSSRuleList prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new CSSRuleList()")
    static CSSRuleList create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

}
