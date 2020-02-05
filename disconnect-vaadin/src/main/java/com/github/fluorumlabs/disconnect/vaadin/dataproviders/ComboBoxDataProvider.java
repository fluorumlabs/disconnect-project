package com.github.fluorumlabs.disconnect.vaadin.dataproviders;

import js.lang.Any;
import org.teavm.jso.JSFunctor;
import org.teavm.jso.JSProperty;

/**
 * Created by Artem Godin on 2/4/2020.
 */
@JSFunctor
@FunctionalInterface
public interface ComboBoxDataProvider<ITEM extends Any> extends Any {
	void provide(Params params, DataProviderCallback<ITEM> callback);

	interface Params extends Any {
		@JSProperty
		int getPage();

		@JSProperty
		int getPageSize();

		@JSProperty
		String getFilter();
	}

}
