package com.github.fluorumlabs.disconnect.polymer.elements.mixins;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.polymer.Polymer;
import js.util.Record;
import js.util.StringRecord;
import js.web.dom.Element;
import js.web.dom.HTMLElement;
import js.web.dom.ParentNode;
import js.web.webcomponents.ShadowRoot;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/**
 * Element class mixin that provides the core API for Polymer's meta-programming
 * features including template stamping, data-binding, attribute deserialization,
 * and property change observation.
 * <p>
 * Subclassers may provide the following static getters to return metadata
 * used to configure Polymer's features for the class:
 * <p>
 * - `static get is()`: When the template is provided via a `dom-module`,
 * users should return the `dom-module` id from a static `is` getter.  If
 * no template is needed or the template is provided directly via the
 * `template` getter, there is no need to define `is` for the element.
 * <p>
 * - `static get template()`: Users may provide the template directly (as
 * opposed to via `dom-module`) by implementing a static `template` getter.
 * The getter must return an `HTMLTemplateElement`.
 * <p>
 * - `static get properties()`: Should return an object describing
 * property-related metadata used by Polymer features (key: property name
 * value: object containing property metadata). Valid keys in per-property
 * metadata include:
 * - `type` (String|Number|Object|Array|...): Used by
 * `attributeChangedCallback` to determine how string-based attributes
 * are deserialized to JavaScript property values.
 * - `notify` (boolean): Causes a change in the property to fire a
 * non-bubbling event called `<property>-changed`. Elements that have
 * enabled two-way binding to the property use this event to observe changes.
 * - `readOnly` (boolean): Creates a getter for the property, but no setter.
 * To set a read-only property, use the private setter method
 * `_setProperty(property, value)`.
 * - `observer` (string): Observer method name that will be called when
 * the property changes. The arguments of the method are
 * `(value, previousValue)`.
 * - `computed` (string): String describing method and dependent properties
 * for computing the value of this property (e.g. `'computeFoo(bar, zot)'`).
 * Computed properties are read-only by default and can only be changed
 * via the return value of the computing method.
 * <p>
 * - `static get observers()`: Array of strings describing multi-property
 * observer methods and their dependent properties (e.g.
 * `'observeABC(a, b, c)'`).
 * <p>
 * The base class provides default implementations for the following standard
 * custom element lifecycle callbacks; users may override these, but should
 * call the super method to ensure
 * - `constructor`: Run when the element is created or upgraded
 * - `connectedCallback`: Run each time the element is connected to the
 * document
 * - `disconnectedCallback`: Run each time the element is disconnected from
 * the document
 * - `attributeChangedCallback`: Run each time an attribute in
 * `observedAttributes` is set or removed (note: this element's default
 * `observedAttributes` implementation will automatically return an array
 * of dash-cased attributes based on `properties`)
 */
@NpmPackage(
        name = "@polymer/polymer",
        version = Polymer.VERSION
)
@Import(
        symbols = "ElementMixin",
        module = "@polymer/polymer/lib/mixins/element-mixin.js"
)
public interface ElementMixin extends PropertyEffects, PropertiesMixin {
    /**
     * When using the ShadyCSS scoping and custom property shim, causes all
     * shimmed `styles` (via `custom-style`) in the document (and its subtree)
     * to be updated based on current custom property values.
     * <p>
     * The optional parameter overrides inline custom property styles with an
     * object of properties where the keys are CSS properties, and the values
     * are strings.
     * <p>
     * Example: `updateStyles({'--color': 'blue'})`
     * <p>
     * These properties are retained unless a value of `null` is set.
     * FIXME param props: Object=
     *
     * @param props Bag of custom property key/values to
     *              apply to the document.
     */
    @JSBody(params = "props", script = "updateStyles(props)")
    static void updateStylesGlobally(StringRecord props) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    String getRootPath();

    @JSProperty
    void setRootPath(String rootPath);

    @JSProperty
    String getImportPath();

    @JSProperty
    void setImportPath(String importPath);

    /**
     *
     */
    @JSProperty
    ParentNode getRoot();

    @JSProperty
    void setRoot(ParentNode node);

    /**
     *
     */
    @JSProperty
    void setRoot(HTMLElement root);

    @JSProperty
    void setRoot(ShadowRoot root);

    /**
     *
     */
    @JSProperty
    Record<Element> $();

    /**
     * When using the ShadyCSS scoping and custom property shim, causes all
     * shimmed styles in this element (and its subtree) to be updated
     * based on current custom property values.
     * <p>
     * The optional parameter overrides inline custom property styles with an
     * object of properties where the keys are CSS properties, and the values
     * are strings.
     * <p>
     * Example: `this.updateStyles({'--color': 'blue'})`
     * <p>
     * These properties are retained unless a value of `null` is set.
     * <p>
     * Note: This function does not support updating CSS mixins.
     * You can not dynamically change the value of an `@apply`.
     * FIXME param properties: Object=
     *
     * @param properties Bag of custom property key/values to
     *                   apply to this element.
     */
    void updateStyles(StringRecord properties);

    /**
     * Rewrites a given URL relative to a base URL. The base URL defaults to
     * the original location of the document containing the `dom-module` for
     * this element. This method will return the same URL before and after
     * bundling.
     * <p>
     * Note that this function performs no resolution for URLs that start
     * with `/` (absolute URLs) or `#` (hash identifiers).  For general purpose
     * URL resolution, use `window.URL`.
     *
     * @param url  URL to resolve.
     * @param base Optional base URL to resolve against, defaults
     *             to the element's `importPath`
     *
     * @return Rewritten URL relative to base
     */
    String resolveUrl(String url, String base);

}
