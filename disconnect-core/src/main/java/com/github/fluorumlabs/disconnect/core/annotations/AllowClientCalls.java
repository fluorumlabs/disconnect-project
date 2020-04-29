package com.github.fluorumlabs.disconnect.core.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface AllowClientCalls {
    Method method() default Method.DEFAULT;

    enum Method {
        GET, POST, DEFAULT /* POST */
    }
}
