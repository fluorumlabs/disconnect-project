package com.github.fluorumlabs.disconnect.polymer.mixins;

import com.github.fluorumlabs.disconnect.polymer.elements.mixins.PropertiesChanged;
import com.github.fluorumlabs.disconnect.zero.component.Component;

/**
 * Element class mixin that provides basic meta-programming for creating one
 * or more property accessors (getter/setter pair) that enqueue an async
 * (batched) `_propertiesChanged` callback.
 * <p>
 * For basic usage of this mixin, call `MyClass.createProperties(props)`
 * once at class definition time to create property accessors for properties
 * named in props, implement `_propertiesChanged` to react as desired to
 * property changes, and implement `static get observedAttributes()` and
 * include lowercase versions of any property names that should be set from
 * attributes. Last, call `this._enableProperties()` in the element's
 * `connectedCallback` to enable the accessors.
 */
public interface HasPropertiesChanged<E extends PropertiesChanged, T extends Component<E>> extends Component<E> {
}
