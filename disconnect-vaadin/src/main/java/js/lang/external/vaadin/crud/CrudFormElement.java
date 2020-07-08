package js.lang.external.vaadin.crud;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import js.web.dom.HTMLElement;

/**
 * <code>&lt;vaadin-crud-form&gt;</code> is a
 *  <vaadin-form-layout>
 *    which automatically can configures all its items based on the JSON structure of the first item set.
 *  </vaadin-form-layout>
 *
 * You cannot manually configure fields but you can still style the layout as it's described in <code>&lt;vaadin-form-layout&gt;</code> <a href="https://vaadin.com/components/vaadin-form-layout/html-api/elements/Vaadin.FormLayoutElement">Documentation</a>
 *
 * <strong>Mixins:</strong> IncludedMixin, ElementMixin, ThemableMixin, ElementMixin
 */
@NpmPackage(name = "@vaadin/vaadin-crud", version = "^1.3.0-alpha2")
@Import(module = "@vaadin/vaadin-crud/src/vaadin-crud-form.js")
public interface CrudFormElement<T extends Any> extends HTMLElement {

    // !wca! get exclude: string | RegExp | null

    // !wca! set exclude: string | RegExp | null

    // !wca! get include: string | string[] | undefined

    // !wca! set include: string | string[] | undefined

    // !wca! get item: CrudItem | undefined

    // !wca! set item: CrudItem | undefined

    // !wca! get responsiveSteps: FormLayoutResponsiveStep[]

    // !wca! set responsiveSteps: FormLayoutResponsiveStep[]

    // !wca! get theme: string | null | undefined
}
