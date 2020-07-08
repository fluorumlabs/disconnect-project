package com.github.fluorumlabs.disconnect.vaadin;

import com.github.fluorumlabs.disconnect.core.components.Component;
import com.github.fluorumlabs.disconnect.core.containers.ComponentList;

/**
 * Created by Artem Godin on 7/7/2020.
 */
@FunctionalInterface
public interface ComponentRendererWithContext<T> {
    void renderTo(ComponentList<Component<?>> root, T context);
}
