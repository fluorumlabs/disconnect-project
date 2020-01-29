package js.web.dom;

import org.teavm.jso.JSBody;

import js.lang.Any;


@Deprecated
public interface External extends Any {
    @Deprecated
    void AddSearchProvider();
    @Deprecated
    void IsSearchProviderInstalled();

    @JSBody(script = "return External.prototype")
    static External prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new External()")
    static External create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

}
