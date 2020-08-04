package com.github.fluorumlabs.disconnect.vaadin;

import com.github.fluorumlabs.disconnect.core.components.Component;
import com.github.fluorumlabs.disconnect.core.containers.ComponentList;
import com.github.fluorumlabs.disconnect.core.utils.SidebandReference;

import javax.annotation.Nullable;
import java.io.Serializable;
import java.util.Collection;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * Created by Artem Godin on 7/7/2020.
 */
public class RenderingKeyedItemList<T extends Serializable, C extends Component<?>> extends KeyedItemList<T> implements ComponentRendererWithContext<T> {
    @Nullable
    private final Supplier<C> ctor;
    @Nullable
    private final ComponentUpdater<C, T> updater;
    private final SidebandReference<C> renderedComponent = new SidebandReference<>();

    public RenderingKeyedItemList(Function<T, String> keyExtractor, Supplier<C> ctor, ComponentUpdater<C, T> updater) {
        super(keyExtractor);
        this.ctor = ctor;
        this.updater = updater;
    }

    public RenderingKeyedItemList(Function<T, String> keyExtractor, Supplier<C> ctor, ComponentUpdater<C, T> updater, Collection<T> collection) {
        super(keyExtractor, collection);
        this.ctor = ctor;
        this.updater = updater;
    }

    public RenderingKeyedItemList(Function<T, String> keyExtractor, Supplier<C> ctor, ComponentUpdater<C, T> updater, T... collection) {
        super(keyExtractor, collection);
        this.ctor = ctor;
        this.updater = updater;
    }

    public RenderingKeyedItemList(Supplier<C> ctor, ComponentUpdater<C, T> updater) {
        this.ctor = ctor;
        this.updater = updater;
    }

    public RenderingKeyedItemList(Supplier<C> ctor, ComponentUpdater<C, T> updater, Collection<T> collection) {
        super(collection);
        this.ctor = ctor;
        this.updater = updater;
    }

    public RenderingKeyedItemList(Supplier<C> ctor, ComponentUpdater<C, T> updater, T... collection) {
        super(collection);
        this.ctor = ctor;
        this.updater = updater;
    }

    private C createComponent() {
        return ctor!=null?ctor.get():null;
    }

    private void updateComponent(C component, T value) {
        if (updater!=null) {
            updater.updateComponent(component, value, getKey(value));
        }
    }

    public C render(T context) {
        C component = renderedComponent.retrieveObject(context);
        if (component == null) {
            component = createComponent();
            renderedComponent.storeObject(context, component);
        }
        updateComponent(component, context);
        return component;
    }

    public void forEachRendered(Consumer<? super C> action) {
        for (T t : this) {
            action.accept(render(t));
        }
    }

    @Override
    public void renderTo(ComponentList<Component<?>> root, T context) {
        if ( context != null ) {
            if (ctor != null && updater != null) {
                C component = renderedComponent.retrieveObject(context);
                if (component == null) {
                    component = createComponent();
                    renderedComponent.storeObject(context, component);
                }
                updateComponent(component, context);
                root.add(component);
            } else {
                root.add(getKey(context));
            }
        }

    }
}
