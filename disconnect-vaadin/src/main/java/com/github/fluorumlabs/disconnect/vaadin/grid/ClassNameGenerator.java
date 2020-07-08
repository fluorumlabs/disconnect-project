package com.github.fluorumlabs.disconnect.vaadin.grid;

/**
 * Created by Artem Godin on 7/7/2020.
 */
@FunctionalInterface
public interface ClassNameGenerator<T> {
    String generateClassNames(GridColumn<T> column, ItemModel<T> context);
}
