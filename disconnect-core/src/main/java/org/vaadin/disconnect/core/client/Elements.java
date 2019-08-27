package org.vaadin.disconnect.core.client;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSObject;
import org.vaadin.disconnect.core.annotations.Import;

/**
 * Created by Artem Godin on 8/21/2019.
 */
@Import(symbols = "renderElementPrototype", module = "./disconnect-react/render-elementprototype.js")
public abstract class Elements implements JSObject {
    @JSBody(params = "tagName", script = "return [\n" +
            "    tagName,\n" +
            "    {},\n" +
            "    []\n" +
            "];")
    public static native <T extends ElementPrototype> T create(String tagName);

    @JSBody(params = "constructor", script = "return [\n" +
            "    constructor,\n" +
            "    {},\n" +
            "    []\n" +
            "];")
    public static native <T extends ElementPrototype> T create(Constructor constructor);

    @JSBody(params = "text", script = "return [\n" +
            "    '#text',\n" +
            "    {textContent: text},\n" +
            "    []\n" +
            "];")
    public static native ElementPrototype text(String text);

    @JSBody(params = {"proto"},
            script = "return renderElementPrototype(proto);")
    public static native Element from(ElementPrototype<?> proto);

}
