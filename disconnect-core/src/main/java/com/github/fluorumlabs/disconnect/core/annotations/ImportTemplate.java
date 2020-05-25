package com.github.fluorumlabs.disconnect.core.annotations;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Inherited
@Documented
public @interface ImportTemplate {
    String value();

}
