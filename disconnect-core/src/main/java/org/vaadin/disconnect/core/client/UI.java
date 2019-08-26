package org.vaadin.disconnect.core.client;

import org.teavm.jso.dom.html.HTMLDocument;
import org.teavm.jso.dom.html.HTMLElement;
import org.teavm.jso.dom.xml.Document;
import org.vaadin.disconnect.core.annotations.Import;
import org.vaadin.disconnect.core.annotations.NpmPackage;
import org.vaadin.disconnect.core.client.internals.RenderFunction;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSObject;

/**
 * Created by Artem Godin on 8/23/2019.
 */
@NpmPackage(name = "react-dom", version = "latest")
@Import(symbols = "ReactDOM", module = "react-dom")
@Import(symbols = "renderElementPrototype", module = "./disconnect-react/render-elementprototype.js")
public abstract class UI implements JSObject {
    @JSBody(params = {"id", "renderFunction"},
    script = "ReactDOM.render(renderElementPrototype(renderFunction()), document.getElementById(id));")
    public static native void render(String id, RenderFunction renderFunction);

    public static void render(RenderFunction renderFunction) {
        HTMLDocument document = HTMLDocument.current();
        HTMLElement root = document.createElement("div").withAttr("id", "app-root");
        document.getBody().appendChild(root);

        render("app-root", renderFunction);
    }
}
