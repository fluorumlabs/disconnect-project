package com.github.fluorumlabs.disconnect.polymer.elements;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.polymer.Polymer;
import js.web.dom.Element;
import js.web.dom.HTMLElement;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/**
 * The <code>dom-module</code> element registers the dom it contains to the name given
 * by the module's id attribute. It provides a unified database of dom
 * accessible via its static <code>import</code> API.
 * <p>
 * A key use case of <code>dom-module</code> is for providing custom element <code>&lt;template&gt;</code>s
 * via HTML imports that are parsed by the native HTML parser, that can be
 * relocated during a bundling pass and still looked up by <code>id</code>.
 * <p>
 * Example:
 *
 * <pre><code>&lt;dom-module id=&quot;foo&quot;&gt;
 *   &lt;img src=&quot;stuff.png&quot;&gt;
 * &lt;/dom-module&gt;
 * </code></pre>
 * Then in code in some other location that cannot access the dom-module above
 *
 * <pre><code>let img = customElements.get('dom-module').import('foo', 'img');
 * </code></pre>
 */
@NpmPackage(
		name = "@polymer/polymer",
		version = Polymer.VERSION
)
@Import(
		symbols = "DomModule",
		module = "@polymer/polymer/lib/elements/dom-module.js"
)
public interface DomModuleElement extends HTMLElement {
	/**
	 * Retrieves the element specified by the css <code>selector</code> in the module
	 * registered by <code>id</code>. For example, this.import('foo', 'img');
	 *
	 * @param id       The id of the dom-module in which to search.
	 * @param selector The css selector by which to find the element.
	 *
	 * @return Returns the element which matches <code>selector</code> in the
	 * 		module registered at the specified <code>id</code>.
	 */
	@JSBody(
			params = {"id", "selector"},
			script = "return DomModule.import(id, selector)"
	)
	static Element doImport(String id, String selector) {
		throw new UnsupportedOperationException("Available only in JavaScript");
	}

	/**
	 * The absolute URL of the original location of this <code>dom-module</code>.
	 * <p>
	 * This value will differ from this element's <code>ownerDocument</code> in the
	 * following ways:
	 *
	 * <ul>
	 * <li>Takes into account any <code>assetpath</code> attribute added during bundling
	 * to indicate the original location relative to the bundled location</li>
	 * <li>Uses the HTMLImports polyfill's <code>importForElement</code> API to ensure
	 * the path is relative to the import document's location since
	 * <code>ownerDocument</code> is not currently polyfilled</li>
	 * </ul>
	 */
	@JSProperty
	String getAssetpath();

	/**
	 * Registers the dom-module at a given id. This method should only be called
	 * when a dom-module is imperatively created. For
	 * example, <code>document.createElement('dom-module').register('foo')</code>.
	 *
	 * @param id The id at which to register the dom-module.
	 */
	void register(String id);
}
