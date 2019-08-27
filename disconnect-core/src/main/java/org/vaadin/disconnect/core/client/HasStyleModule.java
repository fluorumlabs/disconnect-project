package org.vaadin.disconnect.core.client;

/**
 * Created by Artem Godin on 8/26/2019.
 */
public interface HasStyleModule {
    default String getClassName(String className) {
        throw new UnsupportedOperationException("HasStyleModule without @ImportStyleModule annotation");
    }
}
