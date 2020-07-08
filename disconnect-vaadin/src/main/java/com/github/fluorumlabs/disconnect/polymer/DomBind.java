package com.github.fluorumlabs.disconnect.polymer;

import com.github.fluorumlabs.disconnect.core.annotations.CustomElement;
import com.github.fluorumlabs.disconnect.core.components.Component;
import com.github.fluorumlabs.disconnect.core.components.HtmlComponent;
import com.github.fluorumlabs.disconnect.core.components.html.webcomponent.Template;
import com.github.fluorumlabs.disconnect.core.observables.ObservableEvent;
import js.lang.external.polymer.DomBindElement;
import js.web.dom.Event;

/**
 * Custom element to allow using Polymer's template features (data binding, declarative event listeners, etc.) in the main document without defining a new custom element.
 *
 * <code>&lt;template&gt;</code> tags utilizing bindings may be wrapped with the <code>&lt;dom-bind&gt;</code> element, which will immediately stamp the wrapped template into the main document and bind elements to the <code>dom-bind</code> element itself as the binding scope.
 *
 * <strong>Mixins:</strong> GestureEventListeners, OptionalMutableData, PropertyEffects
 */
@CustomElement(tagName = "dom-bind", external = true)
public class DomBind extends HtmlComponent<DomBindElement> {

    public DomBind() {
    }

    public DomBind(String textContent) {
        Template template = new Template();
        template.getContent().add(textContent);
        add(template);
    }

    public DomBind(Component<?>... components) {
        Template template = new Template();
        template.getContent().add(components);
        add(template);
    }

    // !wca! get mutableData: boolean | null | undefined
    /**
     * Instance-level flag for configuring the dirty-checking strategy
     * for this element. When true, Objects and Arrays will skip dirty
     * checking, otherwise strict equality checking will be used.
     */
    public boolean isMutableData() {
        return getElement().isMutableData();
    }

    // !wca! set mutableData: boolean | null | undefined
    /**
     * Instance-level flag for configuring the dirty-checking strategy
     * for this element. When true, Objects and Arrays will skip dirty
     * checking, otherwise strict equality checking will be used.
     */
    public void setMutableData(boolean value) {
        getElement().setMutableData(value);
    }

    // !wca! observe mutableData: boolean | null | undefined

    // !wca! event dom-change: ?
    public ObservableEvent<Event> domChangeEvent() {
        return createEvent("dom-change");
    }
}
