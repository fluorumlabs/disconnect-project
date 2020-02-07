package com.github.fluorumlabs.disconnect.zero.component;

import com.github.fluorumlabs.disconnect.zero.event.VisibilityChange;
import com.github.fluorumlabs.disconnect.zero.observable.ObservableEvent;
import js.web.dom.HTMLElement;
import js.web.dom.HTMLUnknownElement;
import js.web.dom.Node;
import org.teavm.jso.JSBody;

import static js.web.dom.Window.DOCUMENT;


public abstract class AbstractComponent<X extends HTMLElement> extends AbstractBaseComponent<X>
		implements GlobalEvents<X>, ElementEvents<X>, ClipboardEvents<X> {
	private HiddenNode hiddenNodeHolder;

	private ObservableEvent<VisibilityChange> visibilityChangeEvent;

	protected AbstractComponent(X node) {
		super(node);
	}

	@SuppressWarnings("unchecked")
	protected AbstractComponent(String tagName) {
		this((X) DOCUMENT.createElement(tagName));
	}

	public Node getRenderedNode() {
		if (hiddenNodeHolder != null) {
			return hiddenNodeHolder;
		} else {
			return getNode();
		}
	}

	public boolean isVisible() {
		return hiddenNodeHolder == null || hiddenNodeHolder.isVisible();
	}

	public void toggleVisibility() {
		if (isVisible()) {
			hide();
		} else {
			show();
		}
	}

	public void hide() {
		X node = getNode();
		if (isVisible()) {
			if (hiddenNodeHolder == null) {
				hiddenNodeHolder = DOCUMENT.createElement("zero-hidden");
				hiddenNodeHolder.setNode(node);
				hiddenNodeHolder.setVisible(false);
				if (node.getParentNode() != null) {
					if (node.getSlot() != null && !node.getSlot().isEmpty()) {
						hiddenNodeHolder.setSlot(node.getSlot());
					}
					node.getParentNode().replaceChild(hiddenNodeHolder, node);
				}
			} else {
				hiddenNodeHolder.setVisible(false);
				if (node.getParentNode() != null) {
					if (node.getSlot() != null && !node.getSlot().isEmpty()) {
						hiddenNodeHolder.setSlot(node.getSlot());
					}
					node.getParentNode().removeChild(node);
				}
			}
			if (visibilityChangeEvent != null) {
				visibilityChangeEvent.trigger(new VisibilityChange(this, false));
			}
		}
	}

	public void show() {
		X node = getNode();

		if (!isVisible()) {
			if (hiddenNodeHolder.getParentNode() != null) {
				if (hiddenNodeHolder.getSlot() != null && !hiddenNodeHolder.getSlot().isEmpty()) {
					node.setSlot(hiddenNodeHolder.getSlot());
				}
				hiddenNodeHolder.getParentNode().insertBefore(node, hiddenNodeHolder);
				hiddenNodeHolder.setVisible(true);
			}
			if (visibilityChangeEvent != null) {
				visibilityChangeEvent.trigger(new VisibilityChange(this, true));
			}
		}
	}

	public ObservableEvent<VisibilityChange> visibilityChangeEvent() {
		if (visibilityChangeEvent == null) {
			visibilityChangeEvent = new ObservableEvent<>();
		}
		return visibilityChangeEvent;
	}

	private interface HiddenNode extends HTMLUnknownElement {
		@JSBody(script = "return this.__node__")
		Node getNode();

		@JSBody(params = "node", script = "this.__node__ = node")
		void setNode(Node node);

		@JSBody(script = "return this.__hidden__")
		boolean isVisible();

		@JSBody(params = "hidden", script = "this.__hidden__ = hidden")
		void setVisible(boolean visible);
	}
}
