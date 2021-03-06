package com.github.fluorumlabs.disconnect.core.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by Artem Godin on 5/4/2020.
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface RouteParameter {
	String name() default "";

	String defaultValue() default "";
}
