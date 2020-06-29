package com.github.fluorumlabs.disconnect.core.observables;

import com.github.fluorumlabs.disconnect.core.utils.BeanProperties;
import com.github.fluorumlabs.disconnect.core.utils.Lazy;
import com.github.fluorumlabs.disconnect.core.validation.Validation;
import com.github.fluorumlabs.disconnect.core.validation.ValidationResult;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

/**
 * Created by Artem Godin on 6/23/2020.
 */
public class ObservableProperty<BEAN> extends ObservableValue<BEAN> {
    private final Class<BEAN> propertyType;
    @Nullable
    private final ObservableProperty<?> parentBean;
    @Nullable
    private final String propertyName;
    private final Lazy<Validated<BEAN>> validatedObserver = Lazy.from(this::computeValidatedObservable);

    @Nullable
    private Validated<BEAN> validatedObservable = null;

    public static <BEAN> ObservableProperty<BEAN> of(@Nonnull BEAN value) {
        return new ObservableProperty<>((Class<BEAN>)value.getClass(), value);
    }

    public static <BEAN> ObservableProperty<BEAN> of(Class<BEAN> beanClass, BEAN value) {
        return new ObservableProperty<>(beanClass, value);
    }

    public static <BEAN> ObservableProperty<BEAN> empty(Class<BEAN> beanClass) {
        return new ObservableProperty<>(beanClass, null);
    }

    private ObservableProperty(Class<BEAN> beanClass, BEAN value) {
        super(value);
        this.parentBean = null;
        this.propertyType = beanClass;
        this.propertyName = null;
    }

    private ObservableProperty(ObservableProperty<?> parentBean, Class<BEAN> propertyType, String propertyName) {
        super(null);

        this.parentBean = parentBean;
        this.propertyType = propertyType;
        this.propertyName = propertyName;
    }

    public List<BeanProperties.Descriptor> getProperties() {
        return BeanProperties.getPropertyDescriptors(propertyType);
    }

    public <VALUE> ObservableProperty<VALUE> getProperty(String propertyName) {
        Optional<BeanProperties.Descriptor> property = BeanProperties.getProperty(propertyType, propertyName);
        if ( !property.isPresent()) {
            throw new IllegalArgumentException("Property " + propertyName +" does not exist in class "+propertyType.getName() );
        }
        ObservableProperty<VALUE> observableProperty = new ObservableProperty<>(this, (Class<VALUE>) property.get().getType(), propertyName);
        acceptImpl(bean -> {
            if (bean != null) {
                observableProperty.pushNewValue(BeanProperties.read(propertyType, bean, propertyName));
            } else {
                observableProperty.pushNewValue(null);
            }
        });
        observableProperty.acceptImpl(value -> {
            if (getCurrentValue() != null) {
                BeanProperties.write(propertyType, getCurrentValue(), propertyName, value);
                refresh();
            }
        });

        return observableProperty;
    }

    public Validated<BEAN> validated() {
        return validatedObserver.get();
    }

    private Validated<BEAN> computeValidatedObservable() {
        if (validatedObservable == null) {
            validatedObservable = new Validated<>();
            acceptImpl(bean -> {
                ValidationResult validationResult = Validation.validate(propertyType, bean, null);
                if (validationResult.isValid() && parentBean != null) {
                    validationResult = Validation.validate((Class) parentBean.propertyType, parentBean.get(), propertyName);
                }
                validatedObservable.pushNewValue(Pair.of(bean, validationResult));
            });
        }
        return validatedObservable;
    }

    public Forked<BEAN> whenValid() {
        Forked<BEAN> forkedObserver = new Forked<>();
        Validated<BEAN> validated = computeValidatedObservable();
        validated.acceptImpl(forkedObserver::pushNewValue);
        return forkedObserver;
    }

    public static class Validated<BEAN> extends BiObservable<BEAN, ValidationResult> {
        public BEAN getValue() {
            return getLeft();
        }

        public ValidationResult getValidationResult() {
            return getRight();
        }
    }

    public static class Forked<VALUE> extends ObservableBase<Pair<VALUE, ValidationResult>> {
        public Observable<VALUE> then() {
            Observable<VALUE> observable = new Observable<>();
            acceptImpl(valueBooleanPair -> {
                if (valueBooleanPair.getValueB().isValid()) {
                    observable.pushNewValue(valueBooleanPair.getValueA());
                }
            });
            return observable;
        }

        public Forked<VALUE> then(Consumer<VALUE> consumer) {
            acceptImpl(valueBooleanPair -> {
                if (valueBooleanPair.getValueB().isValid()) {
                    consumer.accept(valueBooleanPair.getValueA());
                }
            });
            return this;
        }

        public Forked<VALUE> thenAsync(Consumer<VALUE> consumer) {
            acceptImpl(valueBooleanPair -> {
                if (valueBooleanPair.getValueB().isValid()) {
                    new Thread(() -> consumer.accept(valueBooleanPair.getValueA())).start();
                }
            });
            return this;
        }

        public Forked<VALUE> then(Runnable runnable) {
            acceptImpl(valueBooleanPair -> {
                if (valueBooleanPair.getValueB().isValid()) {
                    runnable.run();
                }
            });
            return this;
        }

        public Forked<VALUE> thenAsync(Runnable runnable) {
            acceptImpl(valueBooleanPair -> {
                if (valueBooleanPair.getValueB().isValid()) {
                    new Thread(runnable).start();
                }
            });
            return this;
        }

        public Observable<VALUE> orElse() {
            Observable<VALUE> observable = new Observable<>();
            acceptImpl(valueBooleanPair -> {
                if (!valueBooleanPair.getValueB().isValid()) {
                    observable.pushNewValue(valueBooleanPair.getValueA());
                }
            });
            return observable;
        }

        public Forked<VALUE> orElse(BiConsumer<VALUE, ValidationResult> consumer) {
            acceptImpl(valueBooleanPair -> {
                if (!valueBooleanPair.getValueB().isValid()) {
                    consumer.accept(valueBooleanPair.getValueA(), valueBooleanPair.getValueB());
                }
            });
            return this;
        }

        public Forked<VALUE> orElseAsync(BiConsumer<VALUE, ValidationResult> consumer) {
            acceptImpl(valueBooleanPair -> {
                if (!valueBooleanPair.getValueB().isValid()) {
                    new Thread(() -> consumer.accept(valueBooleanPair.getValueA(), valueBooleanPair.getValueB())).start();
                }
            });
            return this;
        }

        public Forked<VALUE> orElse(Runnable runnable) {
            acceptImpl(valueBooleanPair -> {
                if (!valueBooleanPair.getValueB().isValid()) {
                    runnable.run();
                }
            });
            return this;
        }

        public Forked<VALUE> orElseAsync(Runnable runnable) {
            acceptImpl(valueBooleanPair -> {
                if (!valueBooleanPair.getValueB().isValid()) {
                    new Thread(runnable).start();
                }
            });
            return this;
        }

        @Override
        void pushNewValue(Pair<VALUE, ValidationResult> value) {
            pushNewValue(value, true);
        }
    }

}
