package com.github.fluorumlabs.disconnect.vaadin.types;

import com.github.fluorumlabs.disconnect.vaadin.constants.SortDirection;
import js.lang.Any;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * Created by Artem Godin on 2/4/2020.
 */
public interface SortOrder extends Any {
	@JSProperty
	String getPath();

	@Nullable
	@JSProperty
	SortDirection getDirection();

}
