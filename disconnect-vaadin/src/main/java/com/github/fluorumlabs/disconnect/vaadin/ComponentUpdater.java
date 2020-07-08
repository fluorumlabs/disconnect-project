package com.github.fluorumlabs.disconnect.vaadin;

import com.github.fluorumlabs.disconnect.core.components.Component;

/**
 * Created by Artem Godin on 7/8/2020.
 */
public interface ComponentUpdater<C extends Component<?>, T> {
    void updateComponent(C component, T context, String key);
}
