package org.vaadin.disconnect.core.annotations;

import java.lang.annotation.*;

/**
 * Created by Artem Godin on 8/20/2019.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(NpmPackage.Container.class)
public @interface NpmPackage {
    String name();

    String version();

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
