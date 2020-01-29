package com.github.fluorumlabs.disconnect.core.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.concurrent.TimeUnit;


@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface EnableCache {
    CachingStrategy strategy() default CachingStrategy.NETWORK_FIRST;

    int maxEntries() default -1;

    int maxAge() default 24;

    TimeUnit unit() default TimeUnit.HOURS;

    enum CachingStrategy {
        STALE_WHILE_REVALIDATE,
        CACHE_FIRST,
        NETWORK_FIRST,
        CACHE_ONLY,
        NETWORK_ONLY
    }
}
