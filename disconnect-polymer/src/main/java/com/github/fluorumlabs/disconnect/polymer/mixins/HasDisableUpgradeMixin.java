package com.github.fluorumlabs.disconnect.polymer.mixins;

import com.github.fluorumlabs.disconnect.polymer.elements.mixins.DisableUpgradeMixin;
import com.github.fluorumlabs.disconnect.zero.component.HasElement;

/**
 * Element class mixin that allows the element to boot up in a non-enabled state when the <code>disable-upgrade</code>
 * attribute is present. This mixin is designed to be used with element classes like PolymerElement that perform initial
 * startup work when they are first connected. When the
 * <code>disable-upgrade</code> attribute is removed, if the element is connected, it
 * boots up and &quot;enables&quot; as it otherwise would; if it is not connected, the element boots up when it is next
 * connected.
 * <p>
 * Using <code>disable-upgrade</code> with PolymerElement prevents any data propagation to the element, any element DOM
 * from stamping, or any work done in connected/disconnctedCallback from occuring, but it does not prevent work done in
 * the element constructor.
 * <p>
 * Note, this mixin must be applied on top of any element class that itself implements a <code>connectedCallback</code>
 * so that it can control the work done in <code>connectedCallback</code>. For example,
 *
 * <pre><code>MyClass = DisableUpgradeMixin(class extends BaseClass {...});
 * </code></pre>
 *
 * @param <E> the type parameter
 * @param <T> the type parameter
 */
public interface HasDisableUpgradeMixin<E extends DisableUpgradeMixin, T extends HasElement<E>>
		extends HasElementMixin<E, T> {
}
