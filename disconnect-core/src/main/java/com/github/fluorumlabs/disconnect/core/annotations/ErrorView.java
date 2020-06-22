package com.github.fluorumlabs.disconnect.core.annotations;

import com.github.fluorumlabs.disconnect.core.router.RouterOutlet;

import java.lang.annotation.*;

/**
 * Created by Artem Godin on 6/15/2020.
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface ErrorView {
    Class<? extends Exception> value();

    Class<?> outlet() default RouterOutlet.class;

    @Target({ElementType.TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    @Repeatable(Alternative.Container.class)
    @interface Alternative {
        Class<? extends Exception> value();

        @Target(ElementType.TYPE)
        @Retention(RetentionPolicy.RUNTIME)
        public @interface Container {

            /**
             * Internally used to enable use of multiple {@link NpmPackage}
             * annotations.
             *
             * @return an array of the UrlParameterMapping annotations
             */
            Alternative[] value();
        }

    }
}
