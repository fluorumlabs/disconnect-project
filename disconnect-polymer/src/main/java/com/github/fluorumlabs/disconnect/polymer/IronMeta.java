package com.github.fluorumlabs.disconnect.polymer;

import com.github.fluorumlabs.disconnect.polymer.elements.IronMetaElement;
import com.github.fluorumlabs.disconnect.polymer.types.PropertyChangeEvent;
import com.github.fluorumlabs.disconnect.zero.component.AbstractComponent;
import com.github.fluorumlabs.disconnect.zero.observable.ObservableEvent;
import js.lang.Any;
import js.util.collections.Array;

/**
 * <code>iron-meta</code> is a generic element you can use for sharing information across the
 * DOM tree. It uses <a href="http://c2.com/cgi/wiki?MonostatePattern">monostate pattern</a>
 * such that any instance of iron-meta has access to the shared information. You
 * can use <code>iron-meta</code> to share whatever you want (or create an extension [like
 * x-meta] for enhancements).
 * <p>
 * The <code>iron-meta</code> instances containing your actual data can be loaded in an
 * import, or constructed in any way you see fit. The only requirement is that you
 * create them before you try to access them.
 * <p>
 * Examples:
 * <p>
 * If I create an instance like this:
 *
 * <pre><code>&lt;iron-meta key=&quot;info&quot; value=&quot;foo/bar&quot;&gt;&lt;/iron-meta&gt;
 * </code></pre>
 * Note that value=&quot;foo/bar&quot; is the metadata I've defined. I could define more
 * attributes or use child nodes to define additional metadata.
 * <p>
 * Now I can access that element (and it's metadata) from any iron-meta instance
 * via the byKey method, e.g.
 *
 * <pre><code>meta.byKey('info');
 * </code></pre>
 * Pure imperative form would be like:
 *
 * <pre><code>document.createElement('iron-meta').byKey('info');
 * </code></pre>
 * Or, in a Polymer element, you can include a meta in your template:
 *
 * <pre><code>&lt;iron-meta id=&quot;meta&quot;&gt;&lt;/iron-meta&gt;
 * ...
 * this.$.meta.byKey('info');
 * </code></pre>
 */
public class IronMeta<ITEM extends Any>
		extends AbstractComponent<IronMetaElement<ITEM>> {
	public IronMeta() {
		super("iron-meta");
	}

	/**
	 * The type of meta-data.  All meta-data of the same type is stored
	 * together.
	 */
	public String type() {
		return getNode().getType();
	}

	/**
	 * The type of meta-data.  All meta-data of the same type is stored
	 * together.
	 */
	public IronMeta<ITEM> type(String type) {
		getNode().setType(type);
		return this;
	}

	/**
	 * The key used to store <code>value</code> under the <code>type</code> namespace.
	 */
	public String key() {
		return getNode().getKey();
	}

	/**
	 * The key used to store <code>value</code> under the <code>type</code> namespace.
	 */
	public IronMeta<ITEM> key(String key) {
		getNode().setKey(key);
		return this;
	}

	/**
	 * The meta-data to store or retrieve.
	 */
	public ITEM value() {
		return getNode().getValue();
	}

	/**
	 * The meta-data to store or retrieve.
	 */
	public IronMeta<ITEM> value(ITEM value) {
		getNode().setValue(value);
		return this;
	}

	/**
	 * If true, <code>value</code> is set to the iron-meta instance itself.
	 */
	public boolean self() {
		return getNode().isSelf();
	}

	/**
	 * If true, <code>value</code> is set to the iron-meta instance itself.
	 */
	public IronMeta<ITEM> self(boolean self) {
		getNode().setSelf(self);
		return this;
	}

	/**
	 *
	 */
	public Array<ITEM> list() {
		return getNode().getList();
	}

	/**
	 * Retrieves meta data value by key.
	 *
	 * @param key The key of the meta-data to be returned.
	 */
	public ITEM byKey(String key) {
		return getNode().byKey(key);
	}

	/**
	 * Fired when the <code>value</code> property changes.
	 */
	public ObservableEvent<PropertyChangeEvent<ITEM>> valueChangedEvent() {
		return createEvent("value-changed");
	}
}
