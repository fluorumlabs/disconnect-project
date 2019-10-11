package org.vaadin.disconnect.vue.annotations;

import java.lang.annotation.*;

import static org.vaadin.disconnect.vue.annotations.Route.FROM_CLASS_NAME;

/**
 * Created by Artem Godin on 8/20/2019.
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(RouteAlias.Container.class)
public @interface RouteAlias {
    String value();

    @Target({ElementType.TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Container {

        RouteAlias[] value();
    }

}
