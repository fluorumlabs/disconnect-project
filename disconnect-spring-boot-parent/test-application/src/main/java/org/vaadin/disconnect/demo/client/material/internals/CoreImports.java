package org.vaadin.disconnect.demo.client.material.internals;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSIndexer;
import org.teavm.jso.JSObject;
import org.vaadin.disconnect.core.annotations.Import;
import org.vaadin.disconnect.core.annotations.NpmPackage;
import org.vaadin.disconnect.core.client.Constructor;

/**
 * Created by Artem Godin on 8/26/2019.
 */
@NpmPackage(name = "@material-ui/core", version = "4.1.2")
@NpmPackage(name = "typeface-roboto", version = "latest")
@Import(module = "typeface-roboto")
@Import(symbols = "* as MaterialUI", module = "@material-ui/core")
public abstract class CoreImports implements JSObject {
    @JSBody(script = "return MaterialUI")
    public static native CoreImports imports();

    @JSIndexer
    public native Constructor get(String name);
}
