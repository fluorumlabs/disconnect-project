package org.vaadin.disconnect.vuetify.icons;

import org.vaadin.disconnect.core.annotations.Import;
import org.vaadin.disconnect.core.annotations.NpmPackage;

/**
 * Created by Artem Godin on 10/17/2019.
 */
@NpmPackage(name = "@mdi/font")
@Import(module = "@mdi/font/css/materialdesignicons.css")
public enum MDI implements IconFont {
    LAN_DISCONNECT;

    @Override
    public String prefix() {
        return "mdi-";
    }
}
