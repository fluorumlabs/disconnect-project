package com.github.fluorumlabs.disconnect.vaadin.elements;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.vaadin.Vaadin;
import com.github.fluorumlabs.disconnect.vaadin.elements.mixins.IncludedMixin;
import js.lang.Any;
import js.web.dom.HTMLElement;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * <code>&lt;vaadin-crud-form&gt;</code> is a <vaadin-form-layout> which automatically can configures all its items
 * based
 * on the JSON structure of the first item set.
 * <p>
 * You cannot manually configure fields but you can still style the layout as it's described in
 * <code>&lt;vaadin-form-layout&gt;</code>
 * <a href="https://vaadin.com/components/vaadin-form-layout/html-api/elements/Vaadin.FormLayoutElement">Documentation</a>
 */
@NpmPackage(
		name = "@vaadin/vaadin",
		version = Vaadin.VERSION
)
@Import(

		module = "@vaadin/vaadin-crud/vaadin-crud-form.js"
)
public interface CrudFormElement<ITEM extends Any> extends HTMLElement, IncludedMixin {
	static String TAGNAME() {
		return "vaadin-crud-form";
	}

	/**
	 * The item being edited.
	 */
	@Nullable
	@JSProperty
	ITEM getItem();

	/**
	 * The item being edited.
	 */
	@JSProperty
	void setItem(ITEM item);
}
