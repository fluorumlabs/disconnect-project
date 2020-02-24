package com.github.fluorumlabs.disconnect.polymer.types;

import js.extras.JsEnum;
import js.lang.Any;
import js.web.dom.Node;
import org.teavm.jso.JSFunctor;

/**
 * Created by Artem Godin on 2/3/2020.
 */
@JSFunctor
@FunctionalInterface
public interface DOMSanitizer extends Any {
	/**
	 * Sanitize t.
	 *
	 * @param <T>   the type parameter
	 * @param value the value
	 * @param name  the name
	 * @param type  the type
	 * @param node  the node
	 *
	 * @return the t
	 */
	<T extends Any> T sanitize(T value, String name, Type type, Node node);

	/**
	 * The type Type.
	 */
	abstract class Type extends JsEnum {
		/**
		 * The constant PROPERTY.
		 */
		public static final Type PROPERTY = JsEnum.of("property");

		/**
		 * The constant ATTRIBUTE.
		 */
		public static final Type ATTRIBUTE = JsEnum.of("attribute");

		/**
		 * The constant TEXT.
		 */
		public static final Type TEXT = JsEnum.of("text");
	}
}
