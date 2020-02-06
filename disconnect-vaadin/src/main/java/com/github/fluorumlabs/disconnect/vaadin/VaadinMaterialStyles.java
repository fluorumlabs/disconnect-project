package com.github.fluorumlabs.disconnect.vaadin;

import com.github.fluorumlabs.disconnect.vaadin.elements.Material;
import com.github.fluorumlabs.disconnect.zero.component.AbstractComponent;
import com.github.fluorumlabs.disconnect.zero.component.Component;
import com.github.fluorumlabs.disconnect.zero.component.HasComponents;

public class VaadinMaterialStyles extends AbstractComponent<Material>
		implements HasComponents<Material, VaadinMaterialStyles, Component<?>> {
	public VaadinMaterialStyles() {
		super(Material.TAGNAME);
	}
}
