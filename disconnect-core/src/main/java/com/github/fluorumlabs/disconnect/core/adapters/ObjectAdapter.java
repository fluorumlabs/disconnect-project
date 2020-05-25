package com.github.fluorumlabs.disconnect.core.adapters;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.fluorumlabs.disconnect.core.converters.*;
import js.lang.Any;
import js.lang.Unknown;
import js.util.collections.Array;
import org.apache.commons.lang3.StringUtils;
import org.teavm.metaprogramming.*;
import org.teavm.metaprogramming.reflect.ReflectField;
import org.teavm.metaprogramming.reflect.ReflectMethod;

import java.io.Serializable;
import java.lang.reflect.*;
import java.util.*;

import static com.github.fluorumlabs.disconnect.core.internals.DisconnectUtils.optional;
import static org.teavm.metaprogramming.Metaprogramming.*;

/**
 * Created by Artem Godin on 2/10/2020.
 */
@CompileTime
public class ObjectAdapter implements Adapter {
	private final Class<?> beanClass;

	private final Map<String, Converter> converters = new HashMap<>();

	private final Array<Unknown> keys = Array.create();

	private static final Map<String, Map<String, PropertyDefinition>> CLASS_PROPERTIES = new HashMap<>();

	public ObjectAdapter(Class<?> beanClass) {
		this.beanClass = beanClass;
		populateConverters(beanClass, this);
	}

	@Override
	public Unknown get(Object instance, String key) {
		if (converters.containsKey(key)) {
			Object o = readField(beanClass, instance, key);
			Converter converter = converters.get(key);
			return optional(o).map(converter::toJS).orElse(null);
		} else {
			return Unknown.undefined();
		}
	}

	@Override
	public boolean set(Object instance, String key, Unknown value) {
		if (converters.containsKey(key)) {
			writeField(beanClass, instance, key, optional(value)
					.map(v -> converters.get(key).fromJS(v)).orElse(null));
			return true;
		}
		return false;
	}

	@Override
	public boolean has(Object instance, String key) {
		return converters.containsKey(key);
	}

	@Override
	public Array<Unknown> keys(Object instance) {
		return keys;
	}

	@Meta
	public static native void populateConverters(Class<?> clazz, ObjectAdapter adapter);

	private static void populateConverters(ReflectClass<?> clazz, Value<ObjectAdapter> adapter) {
		if (!findClass(Serializable.class).isAssignableFrom(clazz)) {
			return;
		}

		populateClassFields(clazz);

		Map<String, PropertyDefinition> propertyDefinitions = CLASS_PROPERTIES.get(clazz.getName());

		if (propertyDefinitions == null) {
			return;
		}
		for (Map.Entry<String, PropertyDefinition> entry : propertyDefinitions.entrySet()) {
			ReflectClass<?> type = entry.getValue().type;
			String fieldName = entry.getKey();
			if (findClass(Set.class).isAssignableFrom(type)) {
				Type[] actualTypeArguments = entry.getValue().actualTypeArguments;
				if (actualTypeArguments.length < 1) {
					throw new IllegalArgumentException("Missing generic type argument for " + clazz.getName() + "." + fieldName);
				}

				emit((Action) () -> {
					adapter.get().converters.put(fieldName,
							new SetConverter((Class<Serializable>) actualTypeArguments[0]));
					adapter.get().keys.push(Unknown.of(fieldName));
				});
			} else if (findClass(List.class).isAssignableFrom(type)) {
				Type[] actualTypeArguments = entry.getValue().actualTypeArguments;
				if (actualTypeArguments.length < 1) {
					throw new IllegalArgumentException("Missing generic type argument for " + clazz.getName() + "." + fieldName);
				}

				emit((Action) () -> {
					adapter.get().converters.put(fieldName,
							new ListConverter((Class<Serializable>) actualTypeArguments[0]));
					adapter.get().keys.push(Unknown.of(fieldName));
				});
			} else if (findClass(Map.class).isAssignableFrom(type)) {
				Type[] actualTypeArguments = entry.getValue().actualTypeArguments;
				if (actualTypeArguments.length < 2) {
					throw new IllegalArgumentException("Missing generic type argument for " + clazz.getName() + "." + fieldName);
				}
				if (!actualTypeArguments[0].equals(String.class)) {
					throw new IllegalArgumentException("Unsupported key type for the map " + clazz.getName() +
							"." + fieldName);
				}

				emit((Action) () -> {
					adapter.get().converters.put(fieldName,
							new StringMapConverter((Class<Serializable>) actualTypeArguments[1]));
					adapter.get().keys.push(Unknown.of(fieldName));
				});
			} else {
				emit((Action) () -> {
					adapter.get().converters.put(fieldName, ConverterFactory.converterFor(type.asJavaClass()));
					adapter.get().keys.push(Unknown.of(fieldName));
				});
			}

		}
	}

	@Meta
	public static native <T> T readField(Class<?> clazz, Object instance, String fieldName);

	private static void readField(ReflectClass<?> clazz, Value<Object> instance, Value<String> fieldName) {
		String className = clazz.getName();

		if (!findClass(Serializable.class).isAssignableFrom(clazz)) {
			emit(() -> {
				throw new IllegalStateException("Non serializable class " + className);
			});
		}

		populateClassFields(clazz);

		Map<String, PropertyDefinition> propertyDefinitions = CLASS_PROPERTIES.get(className);

		Value<Object> result = lazy(() -> {
			throw new IllegalArgumentException("Unknown field " + className + "." + fieldName.get());
		});

		if (propertyDefinitions != null) {
			for (Map.Entry<String, PropertyDefinition> entry : propertyDefinitions.entrySet()) {
				String realFieldName = entry.getKey();
				ReflectField field = entry.getValue().field;
				ReflectMethod getter = entry.getValue().getter;
				Value<Object> currentResult = result;
				if (entry.getValue().readable) {
					if (getter != null) {
						result = lazy(() -> fieldName.get().equals(realFieldName) ? getter.invoke(instance.get()) :
								currentResult.get());
					} else {
						result = lazy(() -> fieldName.get().equals(realFieldName) ? field.get(instance.get()) :
								currentResult.get());
					}
				}
			}
		}

		Value<Object> finalResult = result;
		exit(() -> optional(finalResult.get()).orElse(null));
	}

	@Meta
	public static native void writeField(Class<?> clazz, Object instance, String fieldName, Object value);

	private static void writeField(ReflectClass<?> clazz, Value<Object> instance, Value<String> fieldName,
								   Value<Object> value) {
		String className = clazz.getName();
		if (!findClass(Serializable.class).isAssignableFrom(clazz)) {
			emit(() -> {
				throw new IllegalStateException("Non serializable class " + className);
			});
		}

		populateClassFields(clazz);

		Map<String, PropertyDefinition> propertyDefinitions = CLASS_PROPERTIES.get(className);
		if (propertyDefinitions == null) {
			emit(() -> {
				throw new IllegalArgumentException("Unknown field " + className + "." + fieldName.get());
			});
		}
		for (Map.Entry<String, PropertyDefinition> entry : propertyDefinitions.entrySet()) {
			String realFieldName = entry.getKey();
			ReflectField field = entry.getValue().field;
			ReflectMethod setter = entry.getValue().setter;
			if (entry.getValue().writeable) {
				if (setter != null) {
					emit(() -> {
						if (fieldName.get().equals(realFieldName)) {
							setter.invoke(instance.get(), value.get());
						}
					});
				} else {
					emit(() -> {
						if (fieldName.get().equals(realFieldName)) {
							field.set(instance.get(), value.get());
						}
					});
				}
			}
		}


		for (ReflectField field : clazz.getFields()) {
			String realFieldName = field.getName();
			emit(() -> {
				if (fieldName.get().equals(realFieldName)) {
					field.set(instance.get(), value.get());
				}
			});
		}
	}

	private static void populateClassFields(ReflectClass<?> clazz) {
		String className = clazz.getName();
		if (CLASS_PROPERTIES.containsKey(className)) {
			return;
		}
		Map<String, PropertyDefinition> properties = new HashMap<>();
		for (ReflectField field : clazz.getFields()) {
			if (Modifier.isStatic(field.getModifiers()) || !Modifier.isPublic(field.getModifiers()) || Modifier.isTransient(field.getModifiers())) {
				continue;
			}
			if (field.getAnnotation(JsonIgnore.class) != null) {
				continue;
			}
			String fieldName = field.getName();
			PropertyDefinition definition = new PropertyDefinition();
			definition.field = field;
			definition.type = field.getType();

			Class<?> realClass = null;
			Field realField = null;
			try {
				realClass = Class.forName(clazz.getName(), false, getClassLoader());
				realField = realClass.getField(field.getName());
			} catch (ClassNotFoundException | NoSuchFieldException ignore) {
				// ignore
			}
			if (realField != null && (findClass(List.class).isAssignableFrom(definition.type)
					|| findClass(Set.class).isAssignableFrom(definition.type)
					|| findClass(Map.class).isAssignableFrom(definition.type))) {
				definition.actualTypeArguments =
						((ParameterizedType) (realField.getGenericType())).getActualTypeArguments();
			}

			JsonProperty annotation = field.getAnnotation(JsonProperty.class);
			if (annotation != null) {
				if (!annotation.value().isEmpty()) {
					fieldName = annotation.value();
				}
				if (annotation.access() == JsonProperty.Access.READ_ONLY || annotation.access() == JsonProperty.Access.READ_WRITE || annotation.access() == JsonProperty.Access.AUTO) {
					definition.readable = true;
				}
				if (annotation.access() == JsonProperty.Access.WRITE_ONLY || annotation.access() == JsonProperty.Access.READ_WRITE || annotation.access() == JsonProperty.Access.AUTO) {
					definition.writeable = true;
				}
			} else {
				definition.readable = true;
				definition.writeable = true;
			}

			properties.put(fieldName, definition);
		}

		for (ReflectMethod method : clazz.getMethods()) {
			// Find getters and setters
			if (Modifier.isStatic(method.getModifiers()) || !Modifier.isPublic(method.getModifiers())) {
				continue;
			}
			if (!StringUtils.startsWithAny(method.getName(), "set", "get", "is")) {
				continue;
			}
			String fieldName = method.getName();
			if (fieldName.startsWith("set") || fieldName.startsWith("get")) {
				fieldName = fieldName.substring(3);
			} else if (fieldName.startsWith("is")) {
				fieldName = fieldName.substring(2);
			}
			if (fieldName.isEmpty() || fieldName.charAt(0) < 'A' || fieldName.charAt(0) > 'Z') {
				continue;
			}
			if (method.getAnnotation(JsonIgnore.class) != null) {
				continue;
			}
			fieldName = StringUtils.uncapitalize(fieldName);
			JsonProperty annotation = method.getAnnotation(JsonProperty.class);
			if (annotation != null) {
				if (!annotation.value().isEmpty()) {
					fieldName = annotation.value();
				}
			}
			PropertyDefinition definition = properties.computeIfAbsent(fieldName, __ -> new PropertyDefinition());
			if (annotation != null) {
				if (annotation.access() == JsonProperty.Access.READ_ONLY || annotation.access() == JsonProperty.Access.READ_WRITE || annotation.access() == JsonProperty.Access.AUTO) {
					definition.readable = true;
				}
				if (annotation.access() == JsonProperty.Access.WRITE_ONLY || annotation.access() == JsonProperty.Access.READ_WRITE || annotation.access() == JsonProperty.Access.AUTO) {
					definition.writeable = true;
				}
			}

			if (method.getParameterCount() == 0 && StringUtils.startsWithAny(method.getName(), "is", "get")) {
				// getter
				ReflectClass<?> returnType = method.getReturnType();
				if ((!returnType.getName().equals("boolean") && !returnType.getName().equals("java.lang.Boolean")) && method.getName().startsWith("is")) {
					continue;
				}
				updateType(clazz, fieldName, definition, returnType);

				Class<?> realClass = null;
				Method realMethod = null;
				try {
					realClass = Class.forName(clazz.getName(), false, getClassLoader());
					realMethod = realClass.getMethod(method.getName());
				} catch (ClassNotFoundException | NoSuchMethodException ignore) {
					// ignore
				}
				if (realMethod != null && (findClass(List.class).isAssignableFrom(definition.type)
						|| findClass(Set.class).isAssignableFrom(definition.type)
						|| findClass(Map.class).isAssignableFrom(definition.type))) {
					definition.actualTypeArguments =
							((ParameterizedType) (realMethod.getGenericReturnType())).getActualTypeArguments();
				}
				if (annotation != null) {
					if (annotation.access() == JsonProperty.Access.READ_ONLY || annotation.access() == JsonProperty.Access.READ_WRITE || annotation.access() == JsonProperty.Access.AUTO) {
						definition.readable = true;
					}
				} else {
					definition.readable = true;
				}
				definition.getter = method;
			} else if (method.getParameterCount() == 1 && method.getReturnType().getName().equals("void") &&
					StringUtils.startsWith(method.getName(), "set")) {
				// setter
				ReflectClass<?> argumentType = method.getParameterType(0);
				updateType(clazz, fieldName, definition, argumentType);

				Class<?> realClass = null;
				Method realMethod = null;
				try {
					realClass = Class.forName(clazz.getName(), false, getClassLoader());
					realMethod = realClass.getMethod(method.getName(), Class.forName(argumentType.getName(), false, getClassLoader()));
				} catch (ClassNotFoundException | NoSuchMethodException ignore) {
					// ignore
				}
				if (realMethod != null && (findClass(List.class).isAssignableFrom(definition.type)
						|| findClass(Set.class).isAssignableFrom(definition.type)
						|| findClass(Map.class).isAssignableFrom(definition.type))) {
					definition.actualTypeArguments =
							((ParameterizedType) (realMethod.getGenericParameterTypes()[0])).getActualTypeArguments();
				}
				if (annotation != null) {
					if (annotation.access() == JsonProperty.Access.WRITE_ONLY || annotation.access() == JsonProperty.Access.READ_WRITE || annotation.access() == JsonProperty.Access.AUTO) {
						definition.writeable = true;
					}
				} else {
					definition.writeable = true;
				}
				definition.setter = method;
			}
		}
		Map<String, PropertyDefinition> filteredProperties = new HashMap<>();
		properties.forEach((s, v) -> {
			if (v.type == null || v.type.isArray()) {
				return;
			}
			if (!v.type.isPrimitive() && !findClass(Serializable.class).isAssignableFrom(v.type)
					&& !findClass(Any.class).isAssignableFrom(v.type)
					&& !findClass(Date.class).isAssignableFrom(v.type)
					&& !findClass(List.class).isAssignableFrom(v.type)
					&& !findClass(Set.class).isAssignableFrom(v.type)
					&& !findClass(Map.class).isAssignableFrom(v.type)) {
				return;
			}

			if (v.readable || v.writeable) {
				filteredProperties.put(s, v);
			}
		});
		CLASS_PROPERTIES.put(className, filteredProperties);
	}

	private static void updateType(ReflectClass<?> clazz, String property, PropertyDefinition definition,
								   ReflectClass<?> type) {
		if (definition.type == null) {
			definition.type = type;
			return;
		}
		if (definition.type.isAssignableFrom(type)) {
			return;
		}
		if (type.isAssignableFrom(definition.type)) {
			definition.type = type;
			return;
		}
		throw new IllegalStateException("Property " + property + " of " + clazz.getName() + " has incompatible types " +
				"across " +
				"field/getter/setter: " + definition.type.getName() + " vs " + type.getName());
	}
}
