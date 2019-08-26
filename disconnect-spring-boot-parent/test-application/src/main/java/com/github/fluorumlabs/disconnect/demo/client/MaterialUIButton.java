package com.github.fluorumlabs.disconnect.demo.client;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSObject;

/**
 * Created by Artem Godin on 8/25/2019.
 */
@NpmPackage(name = "@material-ui/core", version = "latest")
@NpmPackage(name = "@material-ui/icons", version = "latest")
@NpmPackage(name = "typeface-roboto", version = "latest")
@Import(module = "typeface-roboto")
@Import(symbols = "MaterialUIButton", module = "@material-ui/core/Button")
public abstract class MaterialUIButton implements JSObject {
    @JSBody(script = "return MaterialUIButton")
    public static native JSObject button();
}
