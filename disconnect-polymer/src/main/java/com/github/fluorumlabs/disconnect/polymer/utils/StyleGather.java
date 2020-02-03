package com.github.fluorumlabs.disconnect.polymer.utils;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.polymer.Polymer;
import js.util.collections.Array;
import js.web.dom.HTMLStyleElement;
import js.web.webcomponents.HTMLTemplateElement;
import org.teavm.jso.JSBody;

@Import(
        symbols = {"stylesFromModule", "cssFromModules", "cssFromModule", "cssFromTemplate", "cssFromModuleImports", "stylesFromModuleImports", "stylesFromModules", "stylesFromTemplate"},
        module = "@polymer/polymer/lib/utils/style-gather.js"
)
public interface StyleGather extends Polymer {
    /**
     * Returns a list of <style> elements in a space-separated list of `dom-module`s.
     *
     * @param moduleIds List of dom-module id's within which to
     *                  search for css.
     *
     * @return Array of contained <style> elements
     */
    @JSBody(params = "moduleIds", script = "return stylesFromModules(moduleIds)")
    static Array<HTMLStyleElement> stylesFromModules(String moduleIds) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    /**
     * Returns a list of <style> elements in a given `dom-module`.
     * Styles in a `dom-module` can come either from `<style>`s within the
     * first `<template>`, or else from one or more
     * `<link rel="import" type="css">` links outside the template.
     *
     * @param moduleId dom-module id to gather styles from
     *
     * @return Array of contained styles.
     */
    @JSBody(params = "moduleId", script = "return stylesFromModule(moduleId)")
    static Array<HTMLStyleElement> stylesFromModule(String moduleId) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    /**
     * Returns the `<style>` elements within a given template.
     *
     * @param template Template to gather styles from
     * @param baseURI  baseURI for style content
     *
     * @return Array of styles
     */
    @JSBody(
            params = {"template", "baseURI"},
            script = "return stylesFromTemplate(template, baseURI)"
    )
    static Array<HTMLStyleElement> stylesFromTemplate(HTMLTemplateElement template, String baseURI) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    /**
     * Returns a list of <style> elements  from stylesheets loaded via `<link rel="import" type="css">` links within the specified `dom-module`.
     *
     * @param moduleId Id of `dom-module` to gather CSS from
     *
     * @return Array of contained styles.
     */
    @JSBody(params = "moduleId", script = "return stylesFromModuleImports(moduleId)")
    static Array<HTMLStyleElement> stylesFromModuleImports(String moduleId) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    /**
     * Returns CSS text of styles in a space-separated list of `dom-module`s.
     * Note: This method is deprecated, use `stylesFromModules` instead.
     *
     * @param moduleIds List of dom-module id's within which to
     *                  search for css.
     *
     * @return Concatenated CSS content from specified `dom-module`s
     */
    @JSBody(params = "moduleIds", script = "return cssFromModules(moduleIds)")
    static String cssFromModules(String moduleIds) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    /**
     * Returns CSS text of styles in a given `dom-module`.  CSS in a `dom-module`
     * can come either from `<style>`s within the first `<template>`, or else
     * from one or more `<link rel="import" type="css">` links outside the
     * template.
     * <p>
     * Any `<styles>` processed are removed from their original location.
     * Note: This method is deprecated, use `styleFromModule` instead.
     *
     * @param moduleId dom-module id to gather styles from
     *
     * @return Concatenated CSS content from specified `dom-module`
     */
    @JSBody(params = "moduleId", script = "return cssFromModule(moduleId)")
    static String cssFromModule(String moduleId) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    /**
     * Returns CSS text of `<styles>` within a given template.
     * <p>
     * Any `<styles>` processed are removed from their original location.
     * Note: This method is deprecated, use `styleFromTemplate` instead.
     *
     * @param template Template to gather styles from
     * @param baseURI  Base URI to resolve the URL against
     *
     * @return Concatenated CSS content from specified template
     */
    @JSBody(
            params = {"template", "baseURI"},
            script = "return cssFromTemplate(template, baseURI)"
    )
    static String cssFromTemplate(HTMLTemplateElement template, String baseURI) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    /**
     * Returns CSS text from stylesheets loaded via `<link rel="import" type="css">`
     * links within the specified `dom-module`.
     * <p>
     * Note: This method is deprecated, use `stylesFromModuleImports` instead.
     *
     * @param moduleId Id of `dom-module` to gather CSS from
     *
     * @return Concatenated CSS content from links in specified `dom-module`
     */
    @JSBody(params = "moduleId", script = "return cssFromModuleImports(moduleId)")
    static String cssFromModuleImports(String moduleId) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }
}
