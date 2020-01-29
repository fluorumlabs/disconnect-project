package js.web.cssom;

import js.lang.Any;
import org.teavm.jso.JSProperty;


public interface ElementCSSInlineStyle extends Any {
    @JSProperty
    CSSStyleDeclaration getStyle();

}
