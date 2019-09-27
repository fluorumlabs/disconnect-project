package org.vaadin.disconnect.vuetify.elements;

import org.vaadin.disconnect.core.annotations.NpmPackage;
import org.vaadin.disconnect.vue.client.elements.Element;

/**
 * Created by Artem Godin on 9/27/2019.
 */
@NpmPackage(name = "vuetify")
public abstract class VuetifyElement<T extends VuetifyElement<T>> extends Element<T> {
    protected VuetifyElement(Class<?> clazz) {
        super(clazz);
    }
}
