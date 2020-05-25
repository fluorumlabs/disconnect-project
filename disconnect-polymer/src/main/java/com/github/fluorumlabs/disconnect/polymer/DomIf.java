package com.github.fluorumlabs.disconnect.polymer;

import com.github.fluorumlabs.disconnect.core.annotations.WebComponent;
import com.github.fluorumlabs.disconnect.polymer.elements.DomIfElement;
import com.github.fluorumlabs.disconnect.zero.component.AbstractComponent;
import com.github.fluorumlabs.disconnect.core.components.HasElement;
import com.github.fluorumlabs.disconnect.zero.component.HasComponent;
import com.github.fluorumlabs.disconnect.zero.component.Template;
import com.github.fluorumlabs.disconnect.core.observables.ObservableEvent;
import js.web.dom.Event;

/**
 * The <code>&lt;dom-if&gt;</code> element will stamp a light-dom <code>&lt;template&gt;</code> child when the
 * <code>if</code> property becomes truthy, and the template can use Polymer data-binding and declarative event features
 * when used in the context of a Polymer element's template.
 * <p>
 * When <code>if</code> becomes falsy, the stamped content is hidden but not removed from dom. When <code>if</code>
 * subsequently becomes truthy again, the content is simply re-shown. This approach is used due to its favorable
 * performance characteristics: the expense of creating template content is paid only once and lazily.
 * <p>
 * Set the <code>restamp</code> property to true to force the stamped content to be created / destroyed when the
 * <code>if</code> condition changes.
 */
@WebComponent
public class DomIf
		extends AbstractComponent<DomIfElement>
		implements HasComponent<DomIfElement, DomIf, Template> {
	/**
	 * Instantiates a new Dom if.
	 */
	public DomIf() {
		super(DomIfElement.TAGNAME());
	}

	/**
	 * Instantiates a new Dom if.
	 *
	 * @param components the components
	 */
	public DomIf(HasElement<?>... components) {
		this();
		Template template = new Template();
		template.add(components);
		setContent(template);
	}

	/**
	 * A boolean indicating whether this template should stamp.
	 *
	 * @return the boolean
	 */
	public boolean isIf() {
		return getNode().isIf();
	}

	/**
	 * A boolean indicating whether this template should stamp.
	 *
	 * @param value the value
	 *
	 * @return the if
	 */
	public DomIf setIf(boolean value) {
		getNode().setIf(value);
		return this;
	}

	/**
	 * When true, elements will be removed from DOM and discarded when <code>if</code> becomes false and re-created and
	 * added back to the DOM when <code>if</code> becomes true.  By default, stamped elements will be hidden but
	 * left in
	 * the DOM when <code>if</code> becomes false, which is generally results in better performance.
	 *
	 * @return the boolean
	 */
	public boolean restamp() {
		return getNode().isRestamp();
	}

	/**
	 * When true, elements will be removed from DOM and discarded when <code>if</code> becomes false and re-created and
	 * added back to the DOM when <code>if</code> becomes true.  By default, stamped elements will be hidden but
	 * left in
	 * the DOM when <code>if</code> becomes false, which is generally results in better performance.
	 *
	 * @param restamp the restamp
	 *
	 * @return the dom if
	 */
	public DomIf restamp(boolean restamp) {
		getNode().setRestamp(restamp);
		return this;
	}

	/**
	 * Forces the element to render its content. Normally rendering is asynchronous to a provoking change. This is done
	 * for efficiency so that multiple changes trigger only a single render. The render method should be called if, for
	 * example, template rendering is required to validate application state.
	 */
	public void render() {
		getNode().render();
	}

	/**
	 * Fired whenever DOM is added or removed/hidden by this template (by default, rendering occurs lazily).  To force
	 * immediate rendering, call
	 * <code>render</code>.
	 *
	 * @return the observable event
	 */
	public ObservableEvent<Event> domChangeEvent() {
		return createEvent("dom-change");
	}
}
