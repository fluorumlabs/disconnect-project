package org.vaadin.disconnect.demo.client.material;

import org.vaadin.disconnect.core.annotations.Import;
import org.vaadin.disconnect.core.annotations.NpmPackage;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSObject;
import org.vaadin.disconnect.core.client.Constructor;

/**
 * Created by Artem Godin on 8/25/2019.
 */
@NpmPackage(name = "@material-ui/core", version = "latest")
@NpmPackage(name = "@material-ui/icons", version = "latest")
@NpmPackage(name = "typeface-roboto", version = "latest")
@Import(module = "typeface-roboto")
@Import(symbols = "MaterialUIAppBar", module = "@material-ui/core/AppBar")
@Import(symbols = "MaterialUIToolBar", module = "@material-ui/core/ToolBar")
@Import(symbols = "MaterialUIButton", module = "@material-ui/core/Button")
@Import(symbols = "MaterialUITypography", module = "@material-ui/core/Typography")
public abstract class MaterialUIButton implements JSObject {
    @JSBody(script = "return MaterialUIAppBar")
    public static native Constructor appBar();

    @JSBody(script = "return MaterialUIToolBar")
    public static native Constructor toolBar();

    @JSBody(script = "return MaterialUIypography")
    public static native Constructor typography();

    @JSBody(script = "return MaterialUIButton")
    public static native Constructor button();
}
