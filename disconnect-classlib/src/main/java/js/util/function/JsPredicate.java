package js.util.function;

import js.lang.Any;
import org.teavm.jso.JSFunctor;

/**
 * Created by Artem Godin on 2/4/2020.
 */
@JSFunctor
@FunctionalInterface
public interface JsPredicate<T extends Any>  extends Any{
    boolean test(T value);
}
