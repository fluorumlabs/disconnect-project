package com.github.fluorumlabs.disconnect.vaadin.dataproviders;

import com.github.fluorumlabs.disconnect.vaadin.types.Filter;
import com.github.fluorumlabs.disconnect.vaadin.types.SortOrder;
import js.lang.Any;
import js.util.collections.Array;
import org.teavm.jso.JSFunctor;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * Created by Artem Godin on 2/4/2020.
 */
@JSFunctor
@FunctionalInterface
public interface GridDataProvider<ITEM extends Any> extends Any {
	void provide(Params params, DataProviderCallback<ITEM> callback);

	interface Params<ITEM extends Any> extends Any {
		@JSProperty
		int getPage();

		@JSProperty
		int getPageSize();

		@JSProperty
		Array<Filter> getFilters();

		@JSProperty
		Array<SortOrder> getSortOrders();

		@Nullable
		@JSProperty
		ITEM getParentItem();
	}

}
