package com.github.fluorumlabs.disconnect.vaadin;

import com.github.fluorumlabs.disconnect.core.annotations.WebComponent;
import com.github.fluorumlabs.disconnect.vaadin.elements.CrudEditColumnElement;
import com.github.fluorumlabs.disconnect.zero.component.AbstractComponent;
import com.github.fluorumlabs.disconnect.zero.component.HasElement;
import com.github.fluorumlabs.disconnect.zero.component.HasComponents;
import com.github.fluorumlabs.disconnect.zero.component.HasStyle;

import javax.annotation.Nullable;

/**
 * <code>&lt;vaadin-crud-edit-column&gt;</code> is a helper element for the <code>&lt;vaadin-grid&gt;</code>
 * that provides a clickable and themable edit icon.
 * <p>
 * Typical usage is in a custom <code>&lt;vaadin-grid&gt;</code> inside a <code>&lt;vaadin-crud&gt;</code>.
 *
 * <h4>Example:</h4>
 * <pre><code class="language-html">&lt;vaadin-grid items=&quot;[[items]]&quot;&gt;
 *  &lt;vaadin-crud-edit-column&gt;&lt;/vaadin-crud-edit-column&gt;
 *
 *  &lt;vaadin-grid-column&gt;
 *    ...
 * </code></pre>
 */
@WebComponent
public class CrudEditColumn extends AbstractComponent<CrudEditColumnElement>
		implements HasStyle<CrudEditColumnElement, CrudEditColumn>, HasComponents<CrudEditColumnElement, CrudEditColumn, HasElement<?>> {
	public CrudEditColumn() {
		super(CrudEditColumnElement.TAGNAME());
	}

	/**
	 * The arial-label for the edit button
	 */
	@Nullable
	public String ariaLabel() {
		return getNode().getAriaLabel();
	}

	/**
	 * The arial-label for the edit button
	 */
	public CrudEditColumn ariaLabel(String ariaLabel) {
		getNode().setAriaLabel(ariaLabel);
		return this;
	}
}
