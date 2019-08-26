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
@NpmPackage(name = "@material-ui/icons", version = "latest")
@Import(symbols = "* as MaterialUIIcons", module = "@material-ui/icons")
public abstract class IconsImports implements JSObject {
    @JSBody(script = "return MaterialUIIcons")
    public static native IconsImports imports();

    @JSIndexer
    public native Constructor get(String name);
}
