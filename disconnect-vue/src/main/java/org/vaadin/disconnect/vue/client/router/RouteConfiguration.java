package org.vaadin.disconnect.vue.client.router;

/**
 * Created by Artem Godin on 10/1/2019.
 */
public interface RouteConfiguration {
    Class<?> view();

    String path();

    Class<?> layout();

    String[] aliases();
}
