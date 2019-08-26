package com.github.fluorumlabs.disconnect.preact.client;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.preact.client.internals.RenderFunction;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSObject;

/**
 * Created by Artem Godin on 8/23/2019.
 */
@NpmPackage(name = "react-dom", version = "latest")
@Import(symbols = "ReactDOM", module = "react-dom")
@Import(symbols = "renderElementPrototype", module = "./disconnect-react/render-elementprototype.js")
public abstract class React implements JSObject {
    @JSBody(params = {"id", "renderFunction"},
    script = "ReactDOM.render(renderElementPrototype(renderFunction()), document.getElementById(id));")
    public static native void render(String id, RenderFunction renderFunction);

}
