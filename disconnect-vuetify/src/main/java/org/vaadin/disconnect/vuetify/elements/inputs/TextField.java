package org.vaadin.disconnect.vuetify.elements.inputs;

import org.teavm.jso.core.JSString;
import org.vaadin.disconnect.core.client.internals.DisconnectUtils;
import org.vaadin.disconnect.vue.annotations.ImportComponent;
import org.vaadin.disconnect.vue.client.elements.HasBinding;
import org.vaadin.disconnect.vue.client.elements.HasImmediateBinding;
import org.vaadin.disconnect.vue.client.elements.HasReadonlyBinding;
import org.vaadin.disconnect.vue.client.validation.Validation;
import org.vaadin.disconnect.vue.client.validation.ValidationResult;
import org.vaadin.disconnect.vuetify.elements.HasTheme;
import org.vaadin.disconnect.vuetify.elements.VuetifyElement;

import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * Created by Artem Godin on 9/25/2019.
 */
@ImportComponent(module = "vuetify/lib/components/VTextField")
public final class TextField extends VuetifyElement<TextField> implements
        HasTheme<TextField>,
        HasBinding<TextField, String>,
        HasReadonlyBinding<TextField, String>,
        HasImmediateBinding<TextField, String> {

    private Supplier<String> getter = null;

    public TextField() {
        super(TextField.class);
    }

    public TextField(String label) {
        this();
        data().properties().set("label", label);
    }

    public TextField value(String value) {
        data().properties().set("value", value);
        return this;
    }

    public TextField setError(boolean value) {
        data().properties().set("error", value);
        return this;
    }

    public TextField setErrorMessage(String value) {
        data().properties().set("error-messages", value);
        return this;
    }

    @Override
    public TextField bind(Supplier<String> getter, Consumer<String> setter) {
        return bind(getter, setter, false);
    }

    @Override
    public TextField bind(Supplier<String> getter, Consumer<String> setter, boolean immediate) {
        bind(getter);

        data().eventListeners().set(immediate ? "input" : "change", (JSString value) -> {
            setter.accept(value.stringValue());
            revalidate();
        });

        return this;
    }

    @Override
    public TextField bind(Supplier<String> getter) {
        this.getter = getter;

        data().renderListeners().set("value", () -> data().properties().set("value", getter.get()));
        data().eventListeners().remove("input");
        data().eventListeners().remove("change");
        return this;
    }

    public TextField revalidate() {
        if ( getter != null ) {
            ValidationResult validationResult = Validation.runValidation(() -> DisconnectUtils.ensure(getter.get()));
            data().properties().set("rules", validationResult.getErrors());
        }

        return this;
    }
}
