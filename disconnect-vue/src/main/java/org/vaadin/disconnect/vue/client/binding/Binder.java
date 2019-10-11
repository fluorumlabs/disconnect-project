package org.vaadin.disconnect.vue.client.binding;

import org.teavm.metaprogramming.*;
import org.teavm.metaprogramming.reflect.ReflectField;
import org.vaadin.disconnect.vue.client.elements.HasBinding;
import org.vaadin.disconnect.vue.client.elements.HasImmediateBinding;
import org.vaadin.disconnect.vue.client.elements.HasReadonlyBinding;
import org.vaadin.disconnect.vue.client.ui.Component;
import org.vaadin.disconnect.vue.client.validation.Validation;
import org.vaadin.disconnect.vue.client.validation.ValidationResult;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Supplier;

import static org.teavm.metaprogramming.Metaprogramming.*;

/**
 * Created by Artem Godin on 10/11/2019.
 */
@CompileTime
public class Binder<BEAN> {
    private final Map<String, BeanFieldDefinition> fields = new HashMap<>();
    private BEAN bean;
    private boolean changed;
    private ValidationResult cachedValidationResult = ValidationResult.valid();

    public Binder(Class<BEAN> beanClass) {
        getBeanFields(beanClass, this);
    }

    public static <T> Binder<T> bind(T bean, Component that) {
        return new Binder<T>((Class<T>) bean.getClass()).setBean(bean).bind(that);
    }

    @Meta
    private static native void getBeanFields(Class<?> beanClass, Binder<?> instance);

    private static void getBeanFields(ReflectClass<?> beanClass, Value<Binder<?>> instance) {
        for (ReflectField declaredField : beanClass.getDeclaredFields()) {
            ReflectClass<?> type = declaredField.getType();
            String name = declaredField.getName();
            emit(() -> {
                Class<?> clazz = beanClass.asJavaClass();
                Binder<?> finalInstance = instance.get();

                BeanFieldDefinition beanFieldDefinition = new BeanFieldDefinition();
                beanFieldDefinition.type = type.asJavaClass();
                beanFieldDefinition.getter = () -> Binder.readField(clazz, finalInstance.bean, name);
                beanFieldDefinition.setter = (value) -> {
                    Binder.writeField(clazz, finalInstance.bean, name, value);
                    finalInstance.changed = true;
                };

                instance.get().fields.put(name, beanFieldDefinition);
            });
        }
    }

    @Meta
    private static native Object readField(Class<?> clazz, Object instance, String fieldName);

    private static void readField(ReflectClass<?> clazz, Value<Object> instance, Value<String> fieldName) {
        String className = clazz.getName();
        Value<Object> result = lazy(() -> {
            throw new IllegalArgumentException("Unknown field " + className + "." + fieldName.get());
        });

        for (ReflectField field : clazz.getDeclaredFields()) {
            String realFieldName = field.getName();
            Value<Object> currentResult = result;
            result = lazy(() -> fieldName.get().equals(realFieldName) ? field.get(instance.get()) : currentResult.get());
        }

        Value<Object> finalResult = result;
        exit(() -> finalResult.get());
    }

    @Meta
    private static native void writeField(Class<?> clazz, Object instance, String fieldName, Object value);

    private static void writeField(ReflectClass<?> clazz, Value<Object> instance, Value<String> fieldName, Value<Object> value) {
        for (ReflectField field : clazz.getDeclaredFields()) {
            String realFieldName = field.getName();
            emit(() -> {
                if (fieldName.get().equals(realFieldName)) {
                    field.set(instance.get(), value.get());
                }
            });
        }
    }

    public Binder<BEAN> bind(Component component) {
        bind(component.getClass(), component, true, this);
        return this;
    }

    public Binder<BEAN> bind(Component component, boolean immediate) {
        bind(component.getClass(), component, immediate, this);
        return this;
    }

    public Binder<BEAN> setBean(BEAN bean) {
        this.bean = bean;
        this.changed = false;
        return this;
    }

    public BEAN getBean() {
        return this.bean;
    }

    public ValidationResult validate() {
        ValidationResult validationResult = Validation.validate(bean);
        if (!validationResult.equals(cachedValidationResult)) {
            cachedValidationResult = validationResult;
        }
        return cachedValidationResult;
    }

    public boolean isValid() {
        return validate().isValid();
    }

    public boolean isChanged() {
        return changed;
    }

    @Meta
    private static native void bind(Class<? extends Component> aClass, Component component, Boolean immediate, Binder<?> instance);

    @SuppressWarnings("unchecked")
    private static void bind(ReflectClass<? extends Component> aClass, Value<Component> component, Value<Boolean> immediate, Value<Binder> instance) {
        ReflectClass<HasBinding> hasBindingClass = Metaprogramming.findClass(HasBinding.class);
        ReflectClass<HasImmediateBinding> hasImmediateBindingClass = Metaprogramming.findClass(HasImmediateBinding.class);
        ReflectClass<HasReadonlyBinding> hasReadonlyBindingClass = Metaprogramming.findClass(HasReadonlyBinding.class);
        for (ReflectField declaredField : aClass.getDeclaredFields()) {
            if (hasImmediateBindingClass.isAssignableFrom(declaredField.getType())) {
                String name = declaredField.getName();
                emit(() -> {
                    BeanFieldDefinition beanFieldDefinition = (BeanFieldDefinition) instance.get().fields.get(name);
                    if (beanFieldDefinition != null) {
                        HasImmediateBinding<?, ?> bindable = (HasImmediateBinding<?, ?>) declaredField.get(component.get());
                        bindable.bind(beanFieldDefinition.getter, beanFieldDefinition.setter, immediate.get());
                    }
                });
            } else if (hasBindingClass.isAssignableFrom(declaredField.getType())) {
                String name = declaredField.getName();
                emit(() -> {
                    BeanFieldDefinition beanFieldDefinition = (BeanFieldDefinition) instance.get().fields.get(name);
                    if (beanFieldDefinition != null) {
                        HasBinding<?, ?> bindable = (HasBinding<?, ?>) declaredField.get(component.get());
                        bindable.bind(beanFieldDefinition.getter, beanFieldDefinition.setter);
                    }
                });
            } else if (hasReadonlyBindingClass.isAssignableFrom(declaredField.getType())) {
                String name = declaredField.getName();
                emit(() -> {
                    BeanFieldDefinition beanFieldDefinition = (BeanFieldDefinition) instance.get().fields.get(name);
                    if (beanFieldDefinition != null) {
                        HasReadonlyBinding<?, ?> bindable = (HasReadonlyBinding<?, ?>) declaredField.get(component.get());
                        bindable.bind(beanFieldDefinition.getter);
                    }
                });
            }
        }
    }

    private static class BeanFieldDefinition<BEAN> {
        private Supplier<?> getter;
        private Consumer<?> setter;
        private Class<?> type;
    }

}
