package com.github.fluorumlabs.disconnect.polymer.mixins;

import com.github.fluorumlabs.disconnect.polymer.elements.mixins.ElementMixin;
import com.github.fluorumlabs.disconnect.zero.component.HasElement;
import js.util.Record;
import js.util.StringRecord;
import js.web.dom.Element;
import js.web.dom.HTMLElement;
import js.web.dom.ParentNode;
import js.web.webcomponents.ShadowRoot;

/**
 * Element class mixin that provides the core API for Polymer's meta-programming features including template stamping,
 * data-binding, attribute deserialization, and property change observation.
 * <p>
 * Subclassers may provide the following static getters to return metadata used to configure Polymer's features for the
 * class:
 *
 * <ul>
 * <li>
 * <code>static get is()</code>: When the template is provided via a <code>dom-module</code>,
 * users should return the <code>dom-module</code> id from a static <code>is</code> getter.  If no template is needed or
 * the template is provided directly via the
 * <code>template</code> getter, there is no need to define <code>is</code> for the element.
 *
 * </li>
 * <li>
 * <code>static get template()</code>: Users may provide the template directly (as
 * opposed to via <code>dom-module</code>) by implementing a static <code>template</code> getter. The getter must return
 * an <code>HTMLTemplateElement</code>.
 *
 * </li>
 * <li>
 * <code>static get properties()</code>: Should return an object describing
 * property-related metadata used by Polymer features (key: property name value: object containing property metadata).
 * Valid keys in per-property metadata include:
 *
 * <ul>
 * <li><code>type</code> (String|Number|Object|Array|...): Used by
 * <code>attributeChangedCallback</code> to determine how string-based attributes
 * are deserialized to JavaScript property values.</li>
 * <li><code>notify</code> (boolean): Causes a change in the property to fire a
 * non-bubbling event called <code>&lt;property&gt;-changed</code>. Elements that have enabled two-way binding to the
 * property use this event to observe changes.</li>
 * <li><code>readOnly</code> (boolean): Creates a getter for the property, but no setter.
 * To set a read-only property, use the private setter method
 * <code>_setProperty(property, value)</code>.</li>
 * <li><code>observer</code> (string): Observer method name that will be called when
 * the property changes. The arguments of the method are
 * <code>(value, previousValue)</code>.</li>
 * <li><code>computed</code> (string): String describing method and dependent properties
 * for computing the value of this property (e.g. <code>'computeFoo(bar, zot)'</code>). Computed properties are
 * read-only by default and can only be changed via the return value of the computing method.</li>
 * </ul>
 * </li>
 * <li>
 * <code>static get observers()</code>: Array of strings describing multi-property
 * observer methods and their dependent properties (e.g.
 * <code>'observeABC(a, b, c)'</code>).
 *
 * </li>
 * </ul>
 * The base class provides default implementations for the following standard custom element lifecycle callbacks; users
 * may override these, but should call the super method to ensure
 *
 * <ul>
 * <li><code>constructor</code>: Run when the element is created or upgraded</li>
 * <li><code>connectedCallback</code>: Run each time the element is connected to the
 * document</li>
 * <li><code>disconnectedCallback</code>: Run each time the element is disconnected from
 * the document</li>
 * <li><code>attributeChangedCallback</code>: Run each time an attribute in
 * <code>observedAttributes</code> is set or removed (note: this element's default
 * <code>observedAttributes</code> implementation will automatically return an array
 * of dash-cased attributes based on <code>properties</code>)</li>
 * </ul>
 *
 * @param <E> the type parameter
 * @param <T> the type parameter
 */
public interface HasElementMixin<E extends ElementMixin, T extends HasElement<E>>
		extends HasPropertyEffects<E, T>, HasPropertiesMixin<E, T> {
	/**
	 * Root path string.
	 *
	 * @return the string
	 */
	default String rootPath() {
		return getNode().getRootPath();
	}

	/**
	 * Root path t.
	 *
	 * @param rootPath the root path
	 *
	 * @return the t
	 */
	default T rootPath(String rootPath) {
		getNode().setRootPath(rootPath);
		return (T) this;
	}

	/**
	 * Import path string.
	 *
	 * @return the string
	 */
	default String importPath() {
		return getNode().getImportPath();
	}

	/**
	 * Import path t.
	 *
	 * @param importPath the import path
	 *
	 * @return the t
	 */
	default T importPath(String importPath) {
		getNode().setImportPath(importPath);
		return (T) this;
	}

	/**
	 * Root parent node.
	 *
	 * @return the parent node
	 */
	default ParentNode root() {
		return getNode().getRoot();
	}

	/**
	 * Root t.
	 *
	 * @param root the root
	 *
	 * @return the t
	 */
	default T root(HTMLElement root) {
		getNode().setRoot(root);
		return (T) this;
	}

	/**
	 * Root t.
	 *
	 * @param root the root
	 *
	 * @return the t
	 */
	default T root(ShadowRoot root) {
		getNode().setRoot(root);
		return (T) this;
	}

	/**
	 * record.
	 *
	 * @return the record
	 */
	default Record<Element> $() {
		return getNode().$();
	}

	/**
	 * When using the ShadyCSS scoping and custom property shim, causes all shimmed styles in this element (and its
	 * subtree) to be updated based on current custom property values.
	 * <p>
	 * The optional parameter overrides inline custom property styles with an object of properties where the keys are
	 * CSS properties, and the values are strings.
	 * <p>
	 * Example: <code>this.updateStyles({'--color': 'blue'})</code>
	 * <p>
	 * These properties are retained unless a value of <code>null</code> is set.
	 * <p>
	 * Note: This function does not support updating CSS mixins. You can not dynamically change the value of an
	 * <code>@apply</code>.
	 *
	 * @param properties Bag of custom property key/values to                   apply to this element.
	 */
	default void updateStyles(StringRecord properties) {
		getNode().updateStyles(properties);
	}

	/**
	 * Rewrites a given URL relative to a base URL. The base URL defaults to the original location of the document
	 * containing the <code>dom-module</code> for this element. This method will return the same URL before and after
	 * bundling.
	 * <p>
	 * Note that this function performs no resolution for URLs that start with <code>/</code> (absolute URLs) or
	 * <code>#</code> (hash identifiers).  For general purpose URL resolution, use <code>window.URL</code>.
	 *
	 * @param url  URL to resolve.
	 * @param base Optional base URL to resolve against, defaults             to the element's <code>importPath</code>
	 *
	 * @return Rewritten URL relative to base
	 */
	default String resolveUrl(String url, String base) {
		return getNode().resolveUrl(url, base);
	}
}
