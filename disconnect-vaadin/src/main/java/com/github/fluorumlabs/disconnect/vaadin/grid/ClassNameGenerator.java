package com.github.fluorumlabs.disconnect.vaadin.grid;

import java.io.Serializable;

/**
 * Created by Artem Godin on 7/7/2020.
 */
@FunctionalInterface
public interface ClassNameGenerator<T extends Serializable> {
    String generateClassNames(GridColumn<T> column, ItemModel<T> context);
}
