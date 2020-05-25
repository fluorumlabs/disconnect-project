package com.github.fluorumlabs.disconnect.polymer;

import com.github.fluorumlabs.disconnect.core.annotations.WebComponent;
import com.github.fluorumlabs.disconnect.polymer.elements.DomBindElement;
import com.github.fluorumlabs.disconnect.polymer.mixins.HasGestureEventListeners;
import com.github.fluorumlabs.disconnect.polymer.mixins.HasOptionalMutableData;
import com.github.fluorumlabs.disconnect.polymer.mixins.HasPropertyEffects;
import com.github.fluorumlabs.disconnect.zero.component.AbstractComponent;
import com.github.fluorumlabs.disconnect.zero.component.HasElement;
import com.github.fluorumlabs.disconnect.zero.component.HasComponent;
import com.github.fluorumlabs.disconnect.zero.component.Template;
import com.github.fluorumlabs.disconnect.zero.observable.ObservableEvent;
import js.web.dom.Event;

/**
 * Custom element to allow using Polymer's template features (data binding, declarative event listeners, etc.) in the
 * main document without defining a new custom element.
 *
 * <code>&lt;template&gt;</code> tags utilizing bindings may be wrapped with the <code>&lt;dom-bind&gt;</code>
 * element, which will immediately stamp the wrapped template into the main document and bind elements to the
 * <code>dom-bind</code> element itself as the binding scope.
 */
@WebComponent
public class DomBind
		extends AbstractComponent<DomBindElement>
		implements HasPropertyEffects<DomBindElement, DomBind>,
		HasOptionalMutableData<DomBindElement, DomBind>,
		HasGestureEventListeners<DomBindElement, DomBind>,
		HasComponent<DomBindElement, DomBind, Template> {
	/**
	 * Instantiates a new Dom bind.
	 */
	public DomBind() {
		super(DomBindElement.TAGNAME());
	}

	/**
	 * Instantiates a new Dom bind.
	 *
	 * @param components the components
	 */
	public DomBind(HasElement<?>... components) {
		this();
		Template template = new Template();
		template.add(components);
		setContent(template);
	}

	/**
	 * Forces the element to render its content. This is typically only necessary to call if HTMLImports with the async
	 * attribute are used.
	 */
	public void render() {
		getNode().render();
	}

	/**
	 * Fired whenever DOM is added or removed/hidden by this template (by default, rendering occurs lazily).  To force
	 * immediate rendering, call `render`.
	 *
	 * @return the observable event
	 */
	public ObservableEvent<Event> domChangeEvent() {
		return createEvent("dom-change");
	}

}
