package com.github.fluorumlabs.disconnect.core.annotations;

import java.lang.annotation.*;


@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(Import.Container.class)
public @interface Import {
    String[] symbols() default {};

    String module();

    boolean defaultExport() default false;

    @Target({ElementType.TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Container {

        Import[] value();
    }

}
