package com.github.fluorumlabs.disconnect.polymer.types;

import js.lang.Any;
import js.web.dom.CustomEvent;
import org.teavm.jso.JSProperty;

/**
 * Created by Artem Godin on 2/4/2020.
 */
public interface IntArrayPropertyChangeEvent extends CustomEvent<IntArrayPropertyChangeEvent.Details> {
	/**
	 * Created by Artem Godin on 2/3/2020.
	 */
	interface Details extends Any {
		/**
		 * Get value int [ ].
		 *
		 * @return the int [ ]
		 */
		@JSProperty
		int[] getValue();

		/**
		 * Sets value.
		 *
		 * @param value the value
		 */
		@JSProperty
		void setValue(int... value);

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
