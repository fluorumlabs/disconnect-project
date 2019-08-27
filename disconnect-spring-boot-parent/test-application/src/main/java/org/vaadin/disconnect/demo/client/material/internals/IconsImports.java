package org.vaadin.disconnect.demo.client.material.internals;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSObject;
import org.vaadin.disconnect.core.annotations.Import;
import org.vaadin.disconnect.core.annotations.NpmPackage;
import org.vaadin.disconnect.core.client.Constructor;

/**
 * Created by Artem Godin on 8/26/2019.
 */
@NpmPackage(name = "@material-ui/icons", version = "latest")
@Import(symbols = {
        "Create as MUI_Create",
        "Clear as MUI_Clear",
        "Map as MUI_Map",
        "DateRange as MUI_DateRange",
        "PieChart as MUI_PieChart"
}, module = "@material-ui/icons", object = true)
public abstract class IconsImports implements JSObject {
    @JSBody(script = "return MUI_Create")
    public static native Constructor Create();

    @JSBody(script = "return MUI_Clear")
    public static native Constructor Clear();

    @JSBody(script = "return MUI_Map")
    public static native Constructor Map();

    @JSBody(script = "return MUI_DateRange")
    public static native Constructor DateRange();

    @JSBody(script = "return MUI_PieChart")
    public static native Constructor PieChart();
}
