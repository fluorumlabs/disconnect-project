package js.web.webcomponents;

import js.lang.Any;
import js.lang.JsFunction;
import js.lang.Unknown;
import js.lang.VoidPromise;
import js.web.dom.Node;
import org.teavm.jso.JSBody;


public interface CustomElementRegistry extends Any {
    @JSBody(script = "return CustomElementRegistry.prototype")
    static CustomElementRegistry prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new CustomElementRegistry()")
    static CustomElementRegistry create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    void define(String name, JsFunction constructor, ElementDefinitionOptions options);

    void define(String name, JsFunction constructor);

    Unknown get(String name);

    void upgrade(Node root);

    VoidPromise whenDefined(String name);

}
