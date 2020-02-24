package com.github.fluorumlabs.disconnect.polymer;

import com.github.fluorumlabs.disconnect.polymer.elements.TemplateInstanceBase;
import com.github.fluorumlabs.disconnect.polymer.elements.mixins.PropertyEffects;
import com.github.fluorumlabs.disconnect.polymer.mixins.HasPropertyEffects;
import com.github.fluorumlabs.disconnect.zero.component.AbstractComponent;
import js.lang.Any;
import js.web.dom.Event;
import js.web.dom.HTMLCollection;
import js.web.dom.ParentNode;

/**
 * The type Abstract template instance base.
 *
 * @param <E> the type parameter
 * @param <T> the type parameter
 */
public abstract class AbstractTemplateInstanceBase<E extends TemplateInstanceBase,
		T extends AbstractTemplateInstanceBase<E, T>>
		extends AbstractComponent<E>
		implements HasPropertyEffects<E, T> {
	/**
	 * Instantiates a new Abstract template instance base.
	 *
	 * @param tagName the tag name
	 */
	protected AbstractTemplateInstanceBase(String tagName) {
		super(tagName);
	}

	/**
	 * Root parent node.
	 *
	 * @return the parent node
	 */
	public ParentNode root() {
		return getNode().getRoot();
	}

	/**
	 * Root abstract template instance base.
	 *
	 * @param root the root
	 *
	 * @return the abstract template instance base
	 */
	public AbstractTemplateInstanceBase<E, T> root(ParentNode root) {
		getNode().setRoot(root);
		return this;
	}

	/**
	 * Children html collection.
	 *
	 * @return the html collection
	 */
	public HTMLCollection children() {
		return getNode().getChildren();
	}

	/**
	 * Find the parent model of this template instance.  The parent model is either another templatize instance that
	 * had
	 * option <code>parentModel: true</code>, or else the host element.
	 *
	 * @return the property effects
	 */
	public PropertyEffects parentModel() {
		return getNode().getParentModel();
	}

	/**
	 * Forwards a host property to this instance.  This method should be called on instances from the
	 * <code>options.forwardHostProp</code> callback to propagate changes of host properties to each instance.
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
	 * Stub of HTMLElement's <code>dispatchEvent</code>, so that effects that may dispatch events safely no-op.
	 *
	 * @param event Event to dispatch
	 *
	 * @return Always true.
	 */
	public boolean dispatchEvent(Event event) {
		return getNode().dispatchEvent(event);
	}
}
