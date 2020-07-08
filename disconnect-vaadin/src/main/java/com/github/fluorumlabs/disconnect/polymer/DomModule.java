package com.github.fluorumlabs.disconnect.polymer;

import com.github.fluorumlabs.disconnect.core.annotations.CustomElement;
import com.github.fluorumlabs.disconnect.core.components.Component;
import com.github.fluorumlabs.disconnect.core.components.HtmlComponent;
import js.lang.external.polymer.DomModuleElement;

import javax.annotation.Nullable;

/**
 * The <code>dom-module</code> element registers the dom it contains to the name given by the module's id attribute. It provides a unified database of dom accessible via its static <code>import</code> API.
 *
 * A key use case of <code>dom-module</code> is for providing custom element <code>&lt;template&gt;</code>s via HTML imports that are parsed by the native HTML parser, that can be relocated during a bundling pass and still looked up by <code>id</code>.
 *
 * Example:
 *
 * <pre><code> &lt;dom-module id="foo"&gt;
 *    &lt;img src="stuff.png"&gt;
 *  &lt;/dom-module&gt;
 * </code></pre>
 * Then in code in some other location that cannot access the dom-module above
 *
 * <pre><code> let img = customElements.get('dom-module').import('foo', 'img');
 * </code></pre>
 */
@CustomElement(tagName = "dom-module", external = true)
public class DomModule extends HtmlComponent<DomModuleElement> {

    public DomModule() {
    }

    public DomModule(String textContent) {
        super(textContent);
    }

    public DomModule(Component<?>... components) {
        super(components);
    }

    // !wca! register: (id?: string | undefined): void
    /**
     * Registers the dom-module at a given id. This method should only be called
     * when a dom-module is imperatively created. For
     * example, <code>document.createElement('dom-module').register('foo')</code>.
     *
     * <strong>id</strong>: The id at which to register the dom-module.
     */
    public void register(@Nullable String id) {
        getElement().register(id);
    }

    // !wca! get assetpath: string
    /**
     * The absolute URL of the original location of this <code>dom-module</code>.
     *
     * This value will differ from this element's <code>ownerDocument</code> in the
     * following ways:
     * - Takes into account any <code>assetpath</code> attribute added during bundling
     *  to indicate the original location relative to the bundled location
     * - Uses the HTMLImports polyfill's <code>importForElement</code> API to ensure
     *  the path is relative to the import document's location since
     *  <code>ownerDocument</code> is not currently polyfilled
     */
    public String getAssetpath() {
        return getElement().getAssetpath();
    }

    // !wca! get id: ?

    // !wca! set id: ?
}
