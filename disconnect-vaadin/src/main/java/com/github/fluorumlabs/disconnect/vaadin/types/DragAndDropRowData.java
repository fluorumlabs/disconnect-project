package com.github.fluorumlabs.disconnect.vaadin.types;

import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * Created by Artem Godin on 2/4/2020.
 */
public interface DragAndDropRowData<ITEM extends Any> extends Any {
	@JSProperty
	int getIndex();

	@JSProperty
	ITEM getItem();

	@JSProperty
	boolean getExpanded();

	@JSProperty
	int getLevel();

	@JSProperty
	boolean getSelected();
}
