package com.github.fluorumlabs.disconnect.vaadin.mixins;

import com.github.fluorumlabs.disconnect.vaadin.elements.mixins.ButtonsMixin;
import com.github.fluorumlabs.disconnect.zero.component.Component;

public interface HasButtonsMixin<E extends ButtonsMixin, T extends Component<E>> extends Component<E> {
    /**
     * Call this method after updating menu bar `items` dynamically, including changing
     * any property on the item object corresponding to one of the menu bar buttons.
     */
    default void render() {
        getNode().render();
    }
}
