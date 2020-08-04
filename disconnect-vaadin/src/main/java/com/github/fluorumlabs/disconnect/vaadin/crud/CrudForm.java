package com.github.fluorumlabs.disconnect.vaadin.crud;

import com.github.fluorumlabs.disconnect.core.components.HtmlComponent;
import com.github.fluorumlabs.disconnect.core.utils.Mirrored;
import js.lang.external.vaadin.crud.CrudFormElement;

import java.io.Serializable;

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
class CrudForm<T extends Serializable> extends HtmlComponent<CrudFormElement<Mirrored<T>>> {

    // !wca! get exclude: string | RegExp | null

    // !wca! set exclude: string | RegExp | null

    // !wca! observe exclude: string | RegExp | null

    // !wca! get include: string | string[] | undefined

    // !wca! set include: string | string[] | undefined

    // !wca! observe include: string | string[] | undefined

    // !wca! get item: CrudItem | undefined

    // !wca! set item: CrudItem | undefined

    // !wca! observe item: CrudItem | undefined

    // !wca! get responsiveSteps: FormLayoutResponsiveStep[]

    // !wca! set responsiveSteps: FormLayoutResponsiveStep[]

    // !wca! observe responsiveSteps: FormLayoutResponsiveStep[]

    // !wca! get theme: string | null | undefined

    // !wca! observe theme: string | null | undefined
}
