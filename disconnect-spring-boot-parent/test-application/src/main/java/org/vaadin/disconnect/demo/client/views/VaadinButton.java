package org.vaadin.disconnect.demo.client.views;

import org.vaadin.disconnect.core.annotations.Import;
import org.vaadin.disconnect.core.annotations.NpmPackage;
import org.vaadin.disconnect.core.annotations.WebComponent;
import org.vaadin.disconnect.vue.client.elements.Element;
import org.vaadin.disconnect.vue.client.elements.HasChildElements;


@NpmPackage(name = "@vaadin/vaadin-button")
@Import(module = "@vaadin/vaadin-button")
@WebComponent
public class VaadinButton extends Element<VaadinButton> implements HasChildElements<VaadinButton, Element<?>> {
    public VaadinButton(String label) {
        super("vaadin-button");
        setText(label);

    }
}
