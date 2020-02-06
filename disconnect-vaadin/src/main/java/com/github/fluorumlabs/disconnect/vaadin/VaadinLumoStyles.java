package com.github.fluorumlabs.disconnect.vaadin;

import com.github.fluorumlabs.disconnect.vaadin.elements.Lumo;
import com.github.fluorumlabs.disconnect.zero.component.AbstractComponent;
import com.github.fluorumlabs.disconnect.zero.component.Component;
import com.github.fluorumlabs.disconnect.zero.component.HasComponents;

public class VaadinLumoStyles extends AbstractComponent<Lumo>
		implements HasComponents<Lumo, VaadinLumoStyles, Component<?>> {
	public VaadinLumoStyles() {
		super(Lumo.TAGNAME());
	}
}
