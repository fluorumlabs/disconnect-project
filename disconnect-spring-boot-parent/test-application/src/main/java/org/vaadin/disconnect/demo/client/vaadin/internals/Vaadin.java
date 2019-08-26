package org.vaadin.disconnect.demo.client.vaadin.internals;

import org.teavm.jso.JSObject;
import org.vaadin.disconnect.core.annotations.Import;
import org.vaadin.disconnect.core.annotations.NpmPackage;
import org.vaadin.disconnect.core.annotations.WebComponent;

/**
 * Created by Artem Godin on 8/26/2019.
 */
@NpmPackage(name = "@vaadin/vaadin", version = "latest")
@Import(module = "@vaadin/vaadin-checkbox")
@WebComponent
public abstract class Vaadin implements JSObject {
    public static String CHECKBOX = "vaadin-checkbox";
}
