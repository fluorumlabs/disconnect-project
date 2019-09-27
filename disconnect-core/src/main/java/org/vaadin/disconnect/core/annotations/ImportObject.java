package org.vaadin.disconnect.core.annotations;

import java.lang.annotation.*;

/**
 * Created by Artem Godin on 8/20/2019.
 */
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface ImportObject {
    String symbol() default "";

    String module();
}
