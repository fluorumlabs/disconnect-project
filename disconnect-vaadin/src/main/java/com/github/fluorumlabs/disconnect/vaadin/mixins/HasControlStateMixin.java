package com.github.fluorumlabs.disconnect.vaadin.mixins;

import com.github.fluorumlabs.disconnect.vaadin.elements.mixins.ControlStateMixin;
import com.github.fluorumlabs.disconnect.zero.component.Component;
import js.web.dom.Element;

/**
 * Polymer.IronControlState is not a proper 2.0 class, also, its tabindex
 * implementation fails in the shadow dom, so we have this for vaadin elements.
 */
public interface HasControlStateMixin<E extends ControlStateMixin, T extends Component<E>> extends Component<E> {
    /**
     * FIXME type ?
     * Any element extending this mixin is required to implement this getter.
     * It returns the actual focusable element in the component.
     */
    default Element focusElement() {
        return getNode().getFocusElement();
    }

    /**
     * Specify that this control should have input focus when the page loads.
     */
    default boolean autofocus() {
        return getNode().isAutofocus();
    }

    /**
     * Specify that this control should have input focus when the page loads.
     */
    default T autofocus(boolean autofocus) {
        getNode().setAutofocus(autofocus);
        return (T) this;
    }

    /**
     * If true, the user cannot interact with this element.
     */
    default boolean disabled() {
        return getNode().isDisabled();
    }

    /**
     * If true, the user cannot interact with this element.
     */
    default T disabled(boolean disabled) {
        getNode().setDisabled(disabled);
        return (T) this;
    }
}
