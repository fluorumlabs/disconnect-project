package org.vaadin.disconnect.vue.annotations;

import org.vaadin.disconnect.vue.client.ui.HasRouterView;

import java.lang.annotation.*;

/**
 * Created by Artem Godin on 8/20/2019.
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface Route {
    String FROM_CLASS_NAME = "__CLASS_NAME__";

    String value() default FROM_CLASS_NAME;

    Class<?> parent() default void.class;
}
