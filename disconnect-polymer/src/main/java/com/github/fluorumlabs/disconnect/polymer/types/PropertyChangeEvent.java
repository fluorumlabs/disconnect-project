package com.github.fluorumlabs.disconnect.polymer.types;

import js.lang.Any;
import js.web.dom.CustomEvent;
import org.teavm.jso.JSProperty;

/**
 * Created by Artem Godin on 2/4/2020.
 */
public interface PropertyChangeEvent<T extends Any> extends CustomEvent<PropertyChangeEvent.Details<T>> {
	/**
	 * Created by Artem Godin on 2/3/2020.
	 */
	interface Details<T extends Any> extends Any {
		@JSProperty
		T getValue();

		@JSProperty
		void setValue(T value);

		@JSProperty
		boolean getQueueProperty();

		@JSProperty
		void setQueueProperty(boolean queueProperty);

		@JSProperty
		String getPath();

		@JSProperty
		void setPath(String path);
	}
}
