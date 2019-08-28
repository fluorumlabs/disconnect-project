package org.vaadin.disconnect.core.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.concurrent.TimeUnit;

/**
 * Created by Artem Godin on 8/19/2019.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface EnableBackgroundSync {
    int maxRetentionTime() default 24;

    TimeUnit unit() default TimeUnit.HOURS;
}
