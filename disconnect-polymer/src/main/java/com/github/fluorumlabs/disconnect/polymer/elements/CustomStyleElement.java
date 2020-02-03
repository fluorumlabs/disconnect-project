package com.github.fluorumlabs.disconnect.polymer.elements;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.polymer.Polymer;
import js.web.dom.HTMLElement;
import js.web.dom.HTMLStyleElement;
import org.teavm.jso.JSMethod;

/**
 * Custom element for defining styles in the main document that can take
 * advantage of [shady DOM](https://github.com/webcomponents/shadycss) shims
 * for style encapsulation, custom properties, and custom mixins.
 * <p>
 * - Document styles defined in a `<custom-style>` are shimmed to ensure they
 * do not leak into local DOM when running on browsers without native
 * Shadow DOM.
 * - Custom properties can be defined in a `<custom-style>`. Use the `html` selector
 * to define custom properties that apply to all custom elements.
 * - Custom mixins can be defined in a `<custom-style>`, if you import the optional
 * [apply shim](https://github.com/webcomponents/shadycss#about-applyshim)
 * (`shadycss/apply-shim.html`).
 * <p>
 * To use:
 * <p>
 * - Import `custom-style.html`.
 * - Place a `<custom-style>` element in the main document, wrapping an inline `<style>` tag that
 * contains the CSS rules you want to shim.
 * <p>
 * For example:
 * <p>
 * ```html
 * <!-- import apply shim--only required if using mixins -->
 * <link rel="import" href="bower_components/shadycss/apply-shim.html">
 * <!-- import custom-style element -->
 * <link rel="import" href="bower_components/polymer/lib/elements/custom-style.html">
 * <p>
 * <custom-style>
 * <style>
 * html {
 * --custom-color: blue;
 * --custom-mixin: {
 * font-weight: bold;
 * color: red;
 * };
 * }
 * </style>
 * </custom-style>
 * ```
 */
@Import(
        symbols = "CustomStyle",
        module = "@polymer/polymer/lib/elements/custom-style.js"
)
public interface CustomStyleElement extends Polymer, HTMLElement {
    /**
     * Returns the light-DOM `<style>` child this element wraps.  Upon first
     * call any style modules referenced via the `include` attribute will be
     * concatenated to this element's `<style>`.
     *
     * @return This element's light-DOM `<style>`
     */
    @JSMethod("getStyle")
    HTMLStyleElement getStyleElement();
}
