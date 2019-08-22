package com.github.fluorumlabs.disconnect.demo.client;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.vue.client.Elements;
import com.github.fluorumlabs.disconnect.vue.client.Vue;
import org.teavm.jso.core.JSRegExp;

/**
 * Created by Artem Godin on 8/21/2019.
 */
public class Vaadin {
    static {
        Vue.registerWebComponents(JSRegExp.create("^vaadin-"));
    }

    public static VaadinButton button() {
        return Elements.create(VaadinButton.tagName());
    }
}
