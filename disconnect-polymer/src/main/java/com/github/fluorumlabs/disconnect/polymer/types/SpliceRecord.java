package com.github.fluorumlabs.disconnect.polymer.types;

import js.extras.JsEnum;
import js.lang.Any;
import js.util.collections.Array;
import org.teavm.jso.JSProperty;

/**
 * Created by Artem Godin on 2/3/2020.
 *
 * @param <T> the type parameter
 */
public interface SpliceRecord<T extends Any> extends ReadonlySpliceRecord<T> {
	/**
	 * Sets index.
	 *
	 * @param index the index
	 */
	@JSProperty
	void setIndex(int index);

	/**
	 * Sets removed.
	 *
	 * @param removed the removed
	 */
	@JSProperty
	void setRemoved(T... removed);

	/**
	 * Sets removed.
	 *
	 * @param removed the removed
	 */
	@JSProperty
	void setRemoved(Array<T> removed);

	/**
	 * Sets added count.
	 *
	 * @param addedCount the added count
	 */
	@JSProperty
	void setAddedCount(int addedCount);

	/**
	 * Gets object.
	 *
	 * @return the object
	 */
	@JSProperty
	Array<T> getObject();

	/**
	 * Sets object.
	 *
	 * @param object the object
	 */
	@JSProperty
	void setObject(Array<T> object);

	/**
	 * Gets type.
	 *
	 * @return the type
	 */
	@JSProperty
	Type getType();

	/**
	 * Sets type.
	 *
	 * @param type the type
	 */
	@JSProperty
	void setType(Type type);

	/**
	 * The type Type.
	 */
	abstract class Type extends JsEnum {
		/**
		 * The constant SPLICE.
		 */
		public static final Type SPLICE = JsEnum.of("splice");
	}

}
