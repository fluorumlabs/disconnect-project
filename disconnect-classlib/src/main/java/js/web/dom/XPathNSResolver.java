package js.web.dom;

import org.teavm.jso.JSFunctor;
import org.teavm.jso.JSObject;

import javax.annotation.Nullable;


@JSFunctor
@FunctionalInterface
public interface XPathNSResolver extends JSObject {
    @Nullable
    String lookupNamespaceURI(@Nullable String prefix);
}
