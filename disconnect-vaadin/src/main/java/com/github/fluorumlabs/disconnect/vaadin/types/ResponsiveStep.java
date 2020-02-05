package com.github.fluorumlabs.disconnect.vaadin.types;

import com.github.fluorumlabs.disconnect.vaadin.constants.ResponsiveStepPosition;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * Created by Artem Godin on 2/4/2020.
 */
public interface ResponsiveStep extends Any {
	@JSProperty
	String getMinWidth();

	@JSProperty
	void setMinWidth(String minWidth);

	@JSProperty
	int getColumns();

	@JSProperty
	void setColumns(int columns);

	@JSProperty
	ResponsiveStepPosition getLabelsPosition();

	@JSProperty
	void setLabelsPosition(ResponsiveStepPosition labelsPosition);

}
