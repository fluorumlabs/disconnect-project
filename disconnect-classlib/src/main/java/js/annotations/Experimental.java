package js.annotations;

import java.lang.annotation.*;

/**
 * Experimental. Expect behavior to change in the future.
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.SOURCE)
@Documented
public @interface Experimental {

}
