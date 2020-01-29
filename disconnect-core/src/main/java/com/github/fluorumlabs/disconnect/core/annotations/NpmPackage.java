package com.github.fluorumlabs.disconnect.core.annotations;

import java.lang.annotation.*;


@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(NpmPackage.Container.class)
public @interface NpmPackage {
    String name();

    String version() default "LATEST";

    @Target(ElementType.TYPE)
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Container {

        /**
         * Internally used to enable use of multiple {@link UrlParameterMapping}
         * annotations.
         *
         * @return an array of the UrlParameterMapping annotations
         */
        NpmPackage[] value();
    }
}
