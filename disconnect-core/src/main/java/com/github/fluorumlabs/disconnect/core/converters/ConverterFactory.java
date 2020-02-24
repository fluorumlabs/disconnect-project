package com.github.fluorumlabs.disconnect.core.converters;

import org.teavm.metaprogramming.CompileTime;
import org.teavm.metaprogramming.Meta;
import org.teavm.metaprogramming.ReflectClass;

import java.io.Serializable;

import static org.teavm.metaprogramming.Metaprogramming.exit;

/**
 * Created by Artem Godin on 2/10/2020.
 */
@CompileTime
public class ConverterFactory {
	public static Converter converterFor(Class<?> clazz) {
		if ( clazz == boolean.class ) {
			return converterFor_(Boolean.class);
		} else if (clazz == byte.class) {
			return converterFor_(Byte.class);
		} else if (clazz == char.class) {
			return converterFor_(Character.class);
		} else if (clazz == short.class) {
			return converterFor_(Short.class);
		} else if (clazz == int.class) {
			return converterFor_(Integer.class);
		} else if (clazz == float.class) {
			return converterFor_(Float.class);
		} else if (clazz == double.class) {
			return converterFor_(Double.class);
		} else {
			return converterFor_(clazz);
		}
	}

	@Meta
	private static native Converter converterFor_(Class<?> clazz);

	private static void converterFor_(ReflectClass<?> clazz) {
		switch (clazz.getName()) {
			case "java.lang.String":
				exit(() -> StringConverter.INSTANCE);
				return;
			case "java.util.Date":
				exit(() -> DateConverter.INSTANCE);
				return;
			case "~Z":
			case "java.lang.Boolean":
				exit(() -> BooleanConverter.INSTANCE);
				return;
			case "~B":
			case "java.lang.Byte":
				exit(() -> ByteConverter.INSTANCE);
				return;
			case "~C":
			case "java.lang.Character":
				exit(() -> CharacterConverter.INSTANCE);
				return;
			case "~S":
			case "java.lang.Short":
				exit(() -> ShortConverter.INSTANCE);
				return;
			case "~I":
			case "java.lang.Integer":
				exit(() -> IntegerConverter.INSTANCE);
				return;
			case "~F":
			case "java.lang.Float":
				exit(() -> FloatConverter.INSTANCE);
				return;
			case "~D":
			case "java.lang.Double":
				exit(() -> DoubleConverter.INSTANCE);
				return;
		}
		exit(() -> new ObjectConverter((Class<Serializable>) clazz.asJavaClass()));
	}
}
