package js.lang.external.polymer.ironmeta;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import js.util.Record;
import js.web.dom.HTMLElement;
import org.teavm.jso.JSMethod;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * <code>iron-meta</code> is a generic element you can use for sharing information across the DOM tree. It uses <a href="http://c2.com/cgi/wiki?MonostatePattern">monostate pattern</a> such that any instance of iron-meta has access to the shared information. You can use <code>iron-meta</code> to share whatever you want (or create an extension [like x-meta] for enhancements).
 *
 * The <code>iron-meta</code> instances containing your actual data can be loaded in an import, or constructed in any way you see fit. The only requirement is that you create them before you try to access them.
 *
 * Examples:
 *
 * If I create an instance like this:
 *
 * <pre><code> &lt;iron-meta key="info" value="foo/bar"&gt;&lt;/iron-meta&gt;
 * </code></pre>
 * Note that value="foo/bar" is the metadata I've defined. I could define more attributes or use child nodes to define additional metadata.
 *
 * Now I can access that element (and it's metadata) from any iron-meta instance via the byKey method, e.g.
 *
 * <pre><code> meta.byKey('info');
 * </code></pre>
 * Pure imperative form would be like:
 *
 * <pre><code> document.createElement('iron-meta').byKey('info');
 * </code></pre>
 * Or, in a Polymer element, you can include a meta in your template:
 *
 * <pre><code> &lt;iron-meta id="meta"&gt;&lt;/iron-meta&gt;
 *  ...
 *  this.$.meta.byKey('info');
 * </code></pre>
 */
@NpmPackage(name = "@polymer/iron-meta", version = "^3.0.1")
@Import(module = "@polymer/iron-meta/iron-meta.js")
public interface IronMetaElement<T extends Any> extends HTMLElement {

    // !wca! byKey: (key: string): any
    /**
     * Retrieves meta data value by key.
     *
     * <strong>key</strong>: The key of the meta-data to be returned.
     */
    @JSMethod("byKey")
    T byKey(String key);

    // !wca! get hostAttributes: object | null

    // !wca! set hostAttributes: object | null

    // !wca! get key: string | null
    /**
     * The key used to store <code>value</code> under the <code>type</code> namespace.
     */
    @JSProperty("key")
    @Nullable
    String getKey();

    // !wca! set key: string | null
    /**
     * The key used to store <code>value</code> under the <code>type</code> namespace.
     */
    @JSProperty("key")
    void setKey(@Nullable String value);

    // !wca! get list: ?
    /**
     */
    @JSProperty("list")
    Record<T> getList();

    // !wca! get self: boolean | null | undefined
    /**
     * If true, <code>value</code> is set to the iron-meta instance itself.
     */
    @JSProperty("self")
    boolean isSelf();

    // !wca! set self: boolean | null | undefined
    /**
     * If true, <code>value</code> is set to the iron-meta instance itself.
     */
    @JSProperty("self")
    void setSelf(boolean value);

    // !wca! get type: string
    /**
     * The type of meta-data. All meta-data of the same type is stored
     * together.
     */
    @JSProperty("type")
    String getType();

    // !wca! set type: string
    /**
     * The type of meta-data. All meta-data of the same type is stored
     * together.
     */
    @JSProperty("type")
    void setType(String value);

    // !wca! get value: ?
    /**
     * The meta-data to store or retrieve.
     */
    @JSProperty("value")
    T getValue();

    // !wca! set value: ?
    /**
     * The meta-data to store or retrieve.
     */
    @JSProperty("value")
    void setValue(T value);
}
