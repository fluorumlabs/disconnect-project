package com.github.fluorumlabs.disconnect.zero.annotations;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD})
@Inherited
@Documented
public @interface NamedSlot {
    String value();
}
