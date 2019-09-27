package org.vaadin.disconnect.core.annotations;

import java.lang.annotation.*;

/**
 * Created by Artem Godin on 8/20/2019.
 */
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
