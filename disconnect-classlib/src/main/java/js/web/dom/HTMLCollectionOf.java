package js.web.dom;


import js.util.collections.ArrayLike;
import org.teavm.jso.JSIndexer;

import javax.annotation.Nullable;


public interface HTMLCollectionOf<T extends Element> extends ArrayLike<T> {
    @Nullable
    T item(int index);

    @Nullable
    T namedItem(String name);

    @JSIndexer
    T get(int n);

}
