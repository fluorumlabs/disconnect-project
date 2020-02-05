package com.github.fluorumlabs.disconnect.vaadin.types;

import com.github.fluorumlabs.disconnect.vaadin.constants.Section;
import com.github.fluorumlabs.disconnect.vaadin.elements.GridColumnElement;
import js.lang.Any;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * Created by Artem Godin on 2/4/2020.
 */
public interface EventContextData<ITEM extends Any> extends Any {
	@Nullable
	@JSProperty
	ITEM getItem();

	@JSProperty
	GridColumnElement<ITEM> getColumn();

	@JSProperty
	Section getSection();

	@JSProperty
	int getIndex();

	@JSProperty
	boolean getSelected();

	@JSProperty
	boolean getDetailsOpened();

	@JSProperty
	boolean getExpanded();

	@JSProperty
	int getLevel();

}
