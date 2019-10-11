package org.vaadin.disconnect.vue.annotations;

import java.lang.annotation.*;

/**
 * Created by Artem Godin on 10/2/2019.
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface PathParameter {
    String value() default "";
}
