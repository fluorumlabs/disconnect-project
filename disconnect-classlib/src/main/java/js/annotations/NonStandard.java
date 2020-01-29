package js.annotations;

import java.lang.annotation.*;

/**
 * Non-standard. Expect poor cross-browser support.
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.SOURCE)
@Documented
public @interface NonStandard {

}
