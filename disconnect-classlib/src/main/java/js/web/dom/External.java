package js.web.dom;

import js.lang.Any;
import org.teavm.jso.JSBody;


@Deprecated
public interface External extends Any {
    @JSBody(script = "return External.prototype")
    static External prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new External()")
    static External create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @Deprecated
    void AddSearchProvider();

    @Deprecated
    void IsSearchProviderInstalled();

}
