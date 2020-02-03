package com.github.fluorumlabs.disconnect.polymer;

import com.github.fluorumlabs.disconnect.polymer.elements.IronMetaElement;
import com.github.fluorumlabs.disconnect.polymer.utils.PropertyChangeDetails;
import com.github.fluorumlabs.disconnect.zero.component.AbstractComponent;
import com.github.fluorumlabs.disconnect.zero.observable.ObservableEvent;
import js.lang.Any;
import js.util.collections.Array;
import js.web.dom.CustomEvent;

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
     * The key used to store `value` under the `type` namespace.
     */
    public String key() {
        return getNode().getKey();
    }

    /**
     * The key used to store `value` under the `type` namespace.
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
     * If true, `value` is set to the iron-meta instance itself.
     */
    public boolean self() {
        return getNode().isSelf();
    }

    /**
     * If true, `value` is set to the iron-meta instance itself.
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
     *
     * @return
     */
    public ITEM byKey(String key) {
        return getNode().byKey(key);
    }

    /**
     * Fired when the `value` property changes.
     */
    public ObservableEvent<CustomEvent<PropertyChangeDetails<ITEM>>> ValueChangedEvent() {
        return createEvent("value-changed");
    }
}
