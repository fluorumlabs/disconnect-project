package com.github.fluorumlabs.disconnect.core.components;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.containers.ComponentList;
import com.github.fluorumlabs.disconnect.core.internals.ComponentReferenceHolder;
import com.github.fluorumlabs.disconnect.core.observables.ObservableValue;
import com.github.fluorumlabs.disconnect.core.utils.Styler;
import com.github.fluorumlabs.disconnect.core.utils.Templater;
import js.lang.Any;
import js.lang.JsNumber;
import js.util.JS;
import js.web.dom.HTMLElement;
import js.web.dom.Window;
import js.web.webcomponents.ShadowRoot;
import org.apache.commons.lang3.StringUtils;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSFunctor;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Artem Godin on 4/30/2020.
 */
@Import(symbols = "registerCustomElement", module = "disconnect-core-jar/frontend/register-custom-element.js")
public class CustomElementComponent extends Component<HTMLElement> {
    private final Map<String, ObservableValue<String>> observedAttributes = new HashMap<>();
    private final ComponentList<Component<?>> root;

    protected CustomElementComponent() {
        this.root = createRoot();
        ShadowRoot shadowRoot = JS.nullify(getElement().getShadowRoot());
        if (shadowRoot != null) {
            Templater.injectTemplate(getClass(), shadowRoot);
            Styler.injectStyles(getClass(), shadowRoot);
        } else {
            Templater.injectTemplate(getClass(), getElement());
            Styler.injectStyles(getClass(), getElement());
        }
        constructor();
    }

    public static <T extends CustomElementComponent> void register(String tagName, List<String> attributes,
                                                                   Class<?> componentClass) {
        register(tagName, ref -> constructor(ref, (Class<T>)componentClass),
                CustomElementComponent::connectedCallback, CustomElementComponent::disconnectedCallback,
                CustomElementComponent::adoptedCallback, CustomElementComponent::attributeChangedCallback,
                (String[])attributes.toArray());
    }

    @JSBody(params = {"tagName", "constructorFn", "connectedFn", "disconnectedFn", "adoptedFn", "attributeChangedFn",
            "attributeNames"},
            script = "registerCustomElement(tagName, constructorFn, connectedFn, disconnectedFn, adoptedFn, " +
                    "attributeChangedFn, attributeNames)")
    private static native void register(String tagName,
                                        CallbackFunction constructorFn,
                                        CallbackFunction connectedFn,
                                        CallbackFunction disconnectedFn,
                                        CallbackFunction adoptedFn,
                                        AttributeCallbackFunction attributeChangedFn, String[] attributeNames);

    private static <T extends CustomElementComponent> void constructor(ComponentReferenceHolder element,
                                                                       Class<T> componentClass) {
        Component<?> instance = ComponentReferenceHolder.popPendingComponentReference();
        if (instance == null) {
            try {
                Window.CONSOLE.warn("No instance - creating a new one", element);
                ComponentReferenceHolder.pushPendingElementReference(element.cast());
                instance = componentClass.newInstance();
            } catch (InstantiationException | IllegalAccessException e) {
                throw new IllegalStateException("Error instantiating component", e);
            } finally {
                ComponentReferenceHolder.resetPendingElementReference();
            }
        }
        element.set(instance);
    }

    private static <T extends CustomElementComponent> void connectedCallback(ComponentReferenceHolder element) {
        element.<T>get().connectedCallback();
    }

    private static <T extends CustomElementComponent> void disconnectedCallback(ComponentReferenceHolder element) {
        element.<T>get().disconnectedCallback();
    }

    private static <T extends CustomElementComponent> void adoptedCallback(ComponentReferenceHolder element) {
        element.<T>get().adoptedCallback();
    }

    private static <T extends CustomElementComponent> void attributeChangedCallback(ComponentReferenceHolder element,
                                                                                    String attrName, String oldValue,
                                                                                    String newValue) {
        ObservableValue<String> attributeValue = element.<T>get().getObservedAttributes().get(attrName);
        if (attributeValue != null) {
            attributeValue.set(newValue);
        }
    }

    private static Integer toInt(String value) {
        int i = JsNumber.parseInt(value);
        if (JsNumber.isNaN(i)) {
            return null;
        } else {
            return i;
        }
    }

    private static Double toDouble(String value) {
        double i = JsNumber.parseFloat(value);
        if (JsNumber.isNaN(i)) {
            return null;
        } else {
            return i;
        }
    }

    private static Boolean toBoolean(String value) {
        return value != null;
    }

    private static String toString(Integer value) {
        if (value == null) {
            return null;
        } else {
            return value.toString();
        }
    }

    private static String toString(Double value) {
        if (value == null) {
            return null;
        } else {
            return value.toString();
        }
    }

    private static String toString(Boolean value) {
        if (Boolean.TRUE.equals(value)) {
            return "";
        } else {
            return null;
        }
    }

    public ComponentList<Component<?>> getRoot() {
        return root;
    }

    protected void constructor() {

    }

    protected void connectedCallback() {

    }

    protected void disconnectedCallback() {

    }

    protected void adoptedCallback() {

    }

    Map<String, ObservableValue<String>> getObservedAttributes() {
        return observedAttributes;
    }

    protected ComponentList<Component<?>> createRoot() {
        return attachShadow();
    }

    private ObservableValue<String> addObservableAttribite(String name, String defaultValue) {
        ObservableValue<String> observableValue = ObservableValue.of(StringUtils.defaultString(getElement().getAttribute(name), defaultValue));
        observedAttributes.put(name, observableValue);
        return observableValue;
    }

    private ObservableValue<String> addStringAttribute(String name, String defaultValue) {
        return addObservableAttribite(name, defaultValue);
    }

    private ObservableValue<Integer> addIntegerAttribute(String name, String defaultValue) {
        return addObservableAttribite(name, defaultValue).map(CustomElementComponent::toInt, CustomElementComponent::toString);
    }

    private ObservableValue<Double> addDoubleAttribute(String name, String defaultValue) {
        return addObservableAttribite(name, defaultValue).map(CustomElementComponent::toDouble, CustomElementComponent::toString);
    }

    private ObservableValue<Boolean> addBooleanAttribute(String name, String defaultValue) {
        return addObservableAttribite(name, defaultValue).map(CustomElementComponent::toBoolean, CustomElementComponent::toString);
    }

    @JSFunctor
    @FunctionalInterface
    private interface CallbackFunction extends Any {
        void callback(ComponentReferenceHolder element);
    }

    @JSFunctor
    @FunctionalInterface
    private interface AttributeCallbackFunction extends Any {
        void callback(ComponentReferenceHolder element, String attrName, String oldValue, String newValue);
    }
}
