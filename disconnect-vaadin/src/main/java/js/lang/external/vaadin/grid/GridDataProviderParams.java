package js.lang.external.vaadin.grid;

import js.lang.Any;
import js.util.collections.Array;
import org.teavm.jso.JSProperty;

/**
 * Created by Artem Godin on 7/2/2020.
 */
public interface GridDataProviderParams<T extends Any> extends Any {
    @JSProperty
    int getPage();

    @JSProperty
    int getPageSize();

    @JSProperty
    Array<Filter> getFilters();

    @JSProperty
    Array<Sorter> getSortOrders();

    @JSProperty
    T getParentItem();

    interface Filter extends Any {
        @JSProperty
        String getPath();
        @JSProperty
        String getValue();
    }

    interface Sorter extends Any {
        @JSProperty
        String getPath();
        @JSProperty
        String getSorterDirection(); // asc/desc
    }
}
