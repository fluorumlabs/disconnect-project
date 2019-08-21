package com.github.fluorumlabs.disconnect.demo.client;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.vue.client.ElementPrototype;
import com.github.fluorumlabs.disconnect.vue.client.Elements;

/**
 * Created by Artem Godin on 8/21/2019.
 */
@NpmPackage(name = "@vaadin/vaadin-button", version = "latest")
@Import(module = "@vaadin/vaadin-button")
public interface VaadinButton extends ElementPrototype<VaadinButton> {
    static String tagName() {
        return "vaadin-button";
    }
}
