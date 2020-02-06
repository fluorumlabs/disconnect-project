package com.github.fluorumlabs.disconnect.polymer.elements;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.polymer.Polymer;
import js.lang.Any;
import js.util.collections.Array;
import js.web.dom.HTMLElement;
import org.teavm.jso.JSProperty;

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
@NpmPackage(
		name = "@polymer/polymer",
		version = Polymer.VERSION
)
@Import(
		symbols = "IronMeta",
		module = "@polymer/iron-meta/iron-meta.js"
)
public interface IronMetaElement<ITEM extends Any> extends HTMLElement {
	String TAGNAME = "iron-meta";

	/**
	 * The type of meta-data.  All meta-data of the same type is stored
	 * together.
	 */
	@JSProperty
	String getType();

	/**
	 * The type of meta-data.  All meta-data of the same type is stored
	 * together.
	 */
	@JSProperty
	void setType(String type);

	/**
	 * The key used to store <code>value</code> under the <code>type</code> namespace.
	 */
	@JSProperty
	String getKey();

	/**
	 * The key used to store <code>value</code> under the <code>type</code> namespace.
	 */
	@JSProperty
	void setKey(String key);

	/**
	 * The meta-data to store or retrieve.
	 */
	@JSProperty
	ITEM getValue();

	/**
	 * The meta-data to store or retrieve.
	 */
	@JSProperty
	void setValue(ITEM value);

	/**
	 * If true, <code>value</code> is set to the iron-meta instance itself.
	 */
	@JSProperty
	boolean isSelf();

	/**
	 * If true, <code>value</code> is set to the iron-meta instance itself.
	 */
	@JSProperty
	void setSelf(boolean self);

	/**
	 *
	 */
	@JSProperty
	Array<ITEM> getList();

	/**
	 * Retrieves meta data value by key.
	 *
	 * @param key The key of the meta-data to be returned.
	 */
	ITEM byKey(String key);
}
