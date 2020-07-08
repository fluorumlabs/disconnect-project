package js.lang.external.vaadin.grid;

import js.lang.Any;
import org.teavm.jso.JSFunctor;
import org.teavm.jso.JSObject;

/**
 * Created by Artem Godin on 7/2/2020.
 */
@JSFunctor
@FunctionalInterface
public interface GridCellClassNameGenerator<T extends Any> extends JSObject {
    String generateClassNames(GridColumnElement<T> column, GridItemModel<T> model);
}
