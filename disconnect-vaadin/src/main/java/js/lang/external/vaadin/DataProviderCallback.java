package js.lang.external.vaadin;

import js.lang.Any;
import js.util.collections.Array;
import org.teavm.jso.JSBody;

/**
 * Created by Artem Godin on 7/2/2020.
 */
public interface DataProviderCallback<T extends Any> extends Any {
    @JSBody(params = {"items", "size"}, script = "this(items, size)")
    void complete(Array<T> items, int size);
}
