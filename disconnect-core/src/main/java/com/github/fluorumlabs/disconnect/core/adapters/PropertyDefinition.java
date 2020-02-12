package com.github.fluorumlabs.disconnect.core.adapters;

import org.teavm.metaprogramming.ReflectClass;
import org.teavm.metaprogramming.reflect.ReflectField;
import org.teavm.metaprogramming.reflect.ReflectMethod;

import java.lang.reflect.Type;

/**
 * Created by Artem Godin on 2/11/2020.
 */
public class PropertyDefinition {
	public ReflectField field;
	public ReflectMethod getter;
	public ReflectMethod setter;

	public ReflectClass<?> type;
	public Type[] actualTypeArguments;

	public boolean readable;
	public boolean writeable;
}
