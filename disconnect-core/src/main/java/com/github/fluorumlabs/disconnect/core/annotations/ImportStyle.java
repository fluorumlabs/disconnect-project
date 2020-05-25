package com.github.fluorumlabs.disconnect.core.annotations;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Inherited
@Documented
@Repeatable(ImportStyle.Container.class)
public @interface ImportStyle {
    String value();

    Scope scope() default Scope.DEFAULT;

    @Retention(RetentionPolicy.RUNTIME)
    @Target({ElementType.TYPE})
    @Inherited
    @Documented
    @interface Container {
        ImportStyle[] value();
    }

    /**
     * Created by Artem Godin on 5/19/2020.
     */
    enum Scope {
        DEFAULT,
        DOCUMENT,
        GLOBAL,
        COMPONENT
    }
}
