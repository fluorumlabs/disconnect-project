package com.github.fluorumlabs.disconnect.vaadin.elements;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.vaadin.Vaadin;
import js.web.dom.HTMLElement;

@NpmPackage(
		name = "@vaadin/vaadin",
		version = Vaadin.VERSION
)
@Import(
		symbols = "Material",
		module = "@vaadin/vaadin-material-styles/version.js"
)
public interface Material extends HTMLElement {
	String TAGNAME = "vaadin-material-styles";
}
