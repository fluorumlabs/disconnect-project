package com.github.fluorumlabs.disconnect.polymer.elements;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.polymer.Polymer;
import js.lang.Any;
import js.util.collections.Array;
import js.web.dom.HTMLElement;
import org.teavm.jso.JSProperty;

/**
 * `iron-meta` is a generic element you can use for sharing information across the
 * DOM tree. It uses [monostate pattern](http://c2.com/cgi/wiki?MonostatePattern)
 * such that any instance of iron-meta has access to the shared information. You
 * can use `iron-meta` to share whatever you want (or create an extension [like
 * x-meta] for enhancements).
 * <p>
 * The `iron-meta` instances containing your actual data can be loaded in an
 * import, or constructed in any way you see fit. The only requirement is that you
 * create them before you try to access them.
 * <p>
 * Examples:
 * <p>
 * If I create an instance like this:
 * <p>
 * <iron-meta key="info" value="foo/bar"></iron-meta>
 * <p>
 * Note that value="foo/bar" is the metadata I've defined. I could define more
 * attributes or use child nodes to define additional metadata.
 * <p>
 * Now I can access that element (and it's metadata) from any iron-meta instance
 * via the byKey method, e.g.
 * <p>
 * meta.byKey('info');
 * <p>
 * Pure imperative form would be like:
 * <p>
 * document.createElement('iron-meta').byKey('info');
 * <p>
 * Or, in a Polymer element, you can include a meta in your template:
 * <p>
 * <iron-meta id="meta"></iron-meta>
 * ...
 * this.$.meta.byKey('info');
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
     * The key used to store `value` under the `type` namespace.
     */
    @JSProperty
    String getKey();

    /**
     * The key used to store `value` under the `type` namespace.
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
     * If true, `value` is set to the iron-meta instance itself.
     */
    @JSProperty
    boolean isSelf();

    /**
     * If true, `value` is set to the iron-meta instance itself.
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
     *
     * @return
     */
    ITEM byKey(String key);
}
