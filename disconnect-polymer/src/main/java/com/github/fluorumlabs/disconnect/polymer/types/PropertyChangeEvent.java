package com.github.fluorumlabs.disconnect.polymer.types;

import js.lang.Any;
import js.web.dom.CustomEvent;
import org.teavm.jso.JSProperty;

/**
 * Created by Artem Godin on 2/4/2020.
 *
 * @param <T> the type parameter
 */
public interface PropertyChangeEvent<T extends Any> extends CustomEvent<PropertyChangeEvent.Details<T>> {
	/**
	 * Created by Artem Godin on 2/3/2020.
	 *
	 * @param <T> the type parameter
	 */
	interface Details<T extends Any> extends Any {
		/**
		 * Gets value.
		 *
		 * @return the value
		 */
		@JSProperty
		T getValue();

		/**
		 * Sets value.
		 *
		 * @param value the value
		 */
		@JSProperty
		void setValue(T value);

		/**
		 * Gets queue property.
		 *
		 * @return the queue property
		 */
		@JSProperty
		boolean getQueueProperty();

		/**
		 * Sets queue property.
		 *
		 * @param queueProperty the queue property
		 */
		@JSProperty
		void setQueueProperty(boolean queueProperty);

		/**
		 * Gets path.
		 *
		 * @return the path
		 */
		@JSProperty
		String getPath();

		/**
		 * Sets path.
		 *
		 * @param path the path
		 */
		@JSProperty
		void setPath(String path);
	}
}
