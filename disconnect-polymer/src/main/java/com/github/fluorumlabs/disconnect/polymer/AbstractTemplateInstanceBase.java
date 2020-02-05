package com.github.fluorumlabs.disconnect.polymer;

import com.github.fluorumlabs.disconnect.polymer.elements.TemplateInstanceBase;
import com.github.fluorumlabs.disconnect.polymer.elements.mixins.PropertyEffects;
import com.github.fluorumlabs.disconnect.polymer.mixins.HasPropertyEffects;
import com.github.fluorumlabs.disconnect.zero.component.AbstractComponent;
import js.lang.Any;
import js.web.dom.Event;
import js.web.dom.HTMLCollection;
import js.web.dom.ParentNode;

public abstract class AbstractTemplateInstanceBase<E extends TemplateInstanceBase,
		T extends AbstractTemplateInstanceBase<E, T>>
		extends AbstractComponent<E>
		implements HasPropertyEffects<E, T> {
	protected AbstractTemplateInstanceBase(String tagName) {
		super(tagName);
	}

	/**
	 *
	 */
	public ParentNode root() {
		return getNode().getRoot();
	}

	/**
	 *
	 */
	public AbstractTemplateInstanceBase<E, T> root(ParentNode root) {
		getNode().setRoot(root);
		return this;
	}

	/**
	 *
	 */
	public HTMLCollection children() {
		return getNode().getChildren();
	}

	/**
	 * Find the parent model of this template instance.  The parent model
	 * is either another templatize instance that had option `parentModel: true`,
	 * or else the host element.
	 */
	public PropertyEffects parentModel() {
		return getNode().getParentModel();
	}

	/**
	 * Forwards a host property to this instance.  This method should be
	 * called on instances from the `options.forwardHostProp` callback
	 * to propagate changes of host properties to each instance.
	 * <p>
	 * Note this method enqueues the change, which are flushed as a batch.
	 *
	 * @param prop  Property or path name
	 * @param value Value of the property to forward
	 */
	public void forwardHostProp(String prop, Any value) {
		getNode().forwardHostProp(prop, value);
	}

	/**
	 * Stub of HTMLElement's `dispatchEvent`, so that effects that may
	 * dispatch events safely no-op.
	 *
	 * @param event Event to dispatch
	 *
	 * @return Always true.
	 */
	public boolean dispatchEvent(Event event) {
		return getNode().dispatchEvent(event);
	}
}
