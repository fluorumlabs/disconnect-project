package com.github.fluorumlabs.disconnect.polymer.ironmeta;

import com.github.fluorumlabs.disconnect.core.annotations.CustomElement;
import com.github.fluorumlabs.disconnect.core.components.HtmlComponent;
import com.github.fluorumlabs.disconnect.core.observables.Observable;
import com.github.fluorumlabs.disconnect.core.observables.ObservableValue;
import com.github.fluorumlabs.disconnect.core.utils.Mirrored;
import com.github.fluorumlabs.disconnect.core.utils.SerDes;
import js.lang.external.polymer.ironmeta.IronMetaElement;
import lombok.Setter;

import javax.annotation.Nullable;
import java.util.Map;

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
@CustomElement(tagName = "iron-meta", external = true)
public class IronMeta<T> extends HtmlComponent<IronMetaElement<Mirrored<T>>> {

    @Setter
    private Class<T> itemClass = null;

    public IronMeta() {
    }

    public IronMeta(Class<T> itemClass) {
        this.itemClass = itemClass;
    }

    // !wca! byKey: (key: string): any
    /**
     * Retrieves meta data value by key.
     *
     * <strong>key</strong>: The key of the meta-data to be returned.
     */
    public T byKey(String key) {
        return SerDes.unmirror(getElement().byKey(key), itemClass);
    }

    // !wca! get hostAttributes: object | null

    // !wca! set hostAttributes: object | null

    // !wca! observe hostAttributes: object | null

    // !wca! get key: string | null
    /**
     * The key used to store <code>value</code> under the <code>type</code> namespace.
     */
    @Nullable
    public String getKey() {
        return getElement().getKey();
    }

    // !wca! set key: string | null
    /**
     * The key used to store <code>value</code> under the <code>type</code> namespace.
     */
    public void setKey(@Nullable String value) {
        getElement().setKey(value);
    }

    // !wca! observe key: string | null

    // !wca! get list: ?
    /**
     */
    public Map<String, T> getList() {
        return SerDes.unmirrorMap(getElement().getList(), itemClass);
    }

    // !wca! observe list: ?
    /**
     */
    public Observable<Map<String, T>> list() {
        return createObservable(this::getList, "list-changed");
    }

    // !wca! get self: boolean | null | undefined
    /**
     * If true, <code>value</code> is set to the iron-meta instance itself.
     */
    public boolean isSelf() {
        return getElement().isSelf();
    }

    // !wca! set self: boolean | null | undefined
    /**
     * If true, <code>value</code> is set to the iron-meta instance itself.
     */
    public void setSelf(boolean value) {
        getElement().setSelf(value);
    }

    // !wca! observe self: boolean | null | undefined

    // !wca! get type: string
    /**
     * The type of meta-data. All meta-data of the same type is stored
     * together.
     */
    public String getType() {
        return getElement().getType();
    }

    // !wca! set type: string
    /**
     * The type of meta-data. All meta-data of the same type is stored
     * together.
     */
    public void setType(String value) {
        getElement().setType(value);
    }

    // !wca! observe type: string

    // !wca! get value: ?
    /**
     * The meta-data to store or retrieve.
     */
    public T getValue() {
        return SerDes.unmirror(getElement().getValue(), itemClass);
    }

    // !wca! set value: ?
    /**
     * The meta-data to store or retrieve.
     */
    public void setValue(T value) {
        getElement().setValue(SerDes.mirror(value));
    }

    // !wca! observe value: ?
    /**
     * The meta-data to store or retrieve.
     */
    public ObservableValue<T> value() {
        return createObservableValue(this::getValue, this::setValue, "value-changed");
    }
}
