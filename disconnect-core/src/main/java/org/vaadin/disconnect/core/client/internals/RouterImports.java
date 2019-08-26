package org.vaadin.disconnect.core.client.internals;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSObject;
import org.vaadin.disconnect.core.annotations.Import;
import org.vaadin.disconnect.core.annotations.NpmPackage;
import org.vaadin.disconnect.core.client.Constructor;

/**
 * Created by Artem Godin on 8/26/2019.
 */
@NpmPackage(name = "react-router-dom", version = "latest")
@Import(symbols = {"BrowserRouter as ReactRouter", "Switch as ReactSwitch", "Route as ReactRoute", "Link as ReactLink"}, module = "react-router-dom", object = true)
public abstract class RouterImports implements JSObject {
    @JSBody(script = "return ReactRouter")
    public static native Constructor router();

    @JSBody(script = "return ReactRoute")
    public static native Constructor route();

    @JSBody(script = "return ReactSwitch")
    public static native Constructor routeSwitch();

    @JSBody(script = "return ReactLink")
    public static native Constructor link();
}
