package com.github.fluorumlabs.disconnect.core;

import com.github.fluorumlabs.disconnect.core.internals.DisconnectUtils;
import com.github.fluorumlabs.disconnect.core.adapters.Adapter;
import com.github.fluorumlabs.disconnect.core.adapters.ListAdapter;
import com.github.fluorumlabs.disconnect.core.adapters.ObjectAdapter;
import js.lang.Any;
import js.lang.JsObject;
import js.lang.PropertyDescriptor;
import js.lang.Unknown;
import js.util.JS;
import js.util.Proxy;
import js.util.ProxyHandler;
import js.util.collections.Array;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Artem Godin on 2/7/2020.
 */
public abstract class ObjectMirror<T extends Serializable> implements Any {
	private static final PropertyDescriptor PROPERTY_DESCRIPTOR = Any.empty();

	private static final ProxyHandler<?> PROXY_HANDLER;

	private static final Map<Class<?>, Adapter> ADAPTER_MAP = new HashMap<>();

	static {
		PROPERTY_DESCRIPTOR.setEnumerable(true);
		PROPERTY_DESCRIPTOR.setConfigurable(true);
		PROPERTY_DESCRIPTOR.setWritable(true);

		PROXY_HANDLER = Any.empty();
		PROXY_HANDLER.setSet(((target, key, value, receiver) -> {
			Object mirroredObject = target.<ObjectMirror<?>>cast().getTarget();
			Adapter adapter = target.<ObjectMirror<?>>cast().getAdapter();
			boolean set = adapter.set(mirroredObject, key.stringValue(), value);
			if (set) {
				return true;
			} else {
				return JS.getReflectInstance().set(target, key.stringValue(), value);
			}
		}));

		PROXY_HANDLER.setGet(((target, key, receiver) -> {
			Object mirroredObject = target.<ObjectMirror<?>>cast().getTarget();
			Adapter adapter = target.<ObjectMirror<?>>cast().getAdapter();
			Unknown unknown = adapter.get(mirroredObject, key.stringValue());
			if (!JS.isUndefined(unknown)) {
				return unknown;
			} else {
				return JS.getReflectInstance().get(target, key.stringValue());
			}
		}));

		PROXY_HANDLER.setHas(((target, key) -> {
			Object mirroredObject = target.<ObjectMirror<?>>cast().getTarget();
			Adapter adapter = target.<ObjectMirror<?>>cast().getAdapter();
			return adapter.has(mirroredObject, key.stringValue());
		}));

		PROXY_HANDLER.setOwnKeys(target -> {
			Object mirroredObject = target.<ObjectMirror<?>>cast().getTarget();
			Adapter adapter = target.<ObjectMirror<?>>cast().getAdapter();
			return adapter.keys(mirroredObject);
		});

		PROXY_HANDLER.setGetOwnPropertyDescriptor(((target, key) -> {
			Object mirroredObject = target.<ObjectMirror<?>>cast().getTarget();
			Adapter adapter = target.<ObjectMirror<?>>cast().getAdapter();
			if (adapter.has(mirroredObject, key.stringValue())) {
				return PROPERTY_DESCRIPTOR;
			} else {
				return null;
			}
		}));
	}

	public static <T extends Serializable> ObjectMirror<T> from(T target) {
		ObjectMirror<T> objectMirror =
				DisconnectUtils.asJsObject(target).<TargetMirrorReference<T>>cast().getObjectMirror();

		if (JS.isUndefinedOrNull(objectMirror)) {
			ObjectMirror<T> mirrorTemplate = Any.empty();
			Adapter adapter = ADAPTER_MAP.computeIfAbsent(target.getClass(),
					clazz -> new ObjectAdapter(target.getClass()));
			mirrorTemplate.setTarget(target);
			mirrorTemplate.setAdapter(adapter);
			objectMirror = Proxy.create(mirrorTemplate, (ProxyHandler<ObjectMirror<T>>) PROXY_HANDLER);
			DisconnectUtils.asJsObject(target).<TargetMirrorReference<T>>cast().setObjectMirror(objectMirror);
		}
		return objectMirror;
	}

	public static <T extends Serializable> T from(Class<T> clazz, Any mirror) {
		T newInstance = null;
		try {
			newInstance = clazz.newInstance();
		} catch (Throwable ignore) {
			// ignore
		}
		ObjectMirror<T> newMirror = from(newInstance);
		JsObject.assign(newMirror, mirror);
		return newInstance;
	}


	public static <T extends Serializable, L extends Serializable & List<T>> ObjectMirror<L> fromList(Class<T> clazz,
																						List<T> target) {
		ObjectMirror<L> objectMirror =
				DisconnectUtils.asJsObject(target).<TargetMirrorReference<L>>cast().getObjectMirror();

		if (JS.isUndefinedOrNull(objectMirror)) {
			Adapter adapter = new ListAdapter(clazz);
			ObjectMirror<L> mirrorTemplate = createFakeArray().cast();
			mirrorTemplate.setTarget((L)target);
			mirrorTemplate.setAdapter(adapter);
			objectMirror = Proxy.create(mirrorTemplate, (ProxyHandler<ObjectMirror<L>>) PROXY_HANDLER);
			DisconnectUtils.asJsObject(target).<TargetMirrorReference<L>>cast().setObjectMirror(objectMirror);
		}
		return objectMirror;
	}

	public static <T extends Serializable, L extends Serializable & List<T>> List<T> fromList(Class<T> clazz,
																							Any mirror) {
		List<T> newInstance = new ArrayList<>();
		ObjectMirror<L> newMirror = fromList(clazz, newInstance);
		mirror.<Array<Any>>cast().forEach((v, k, p) -> newMirror.<Array<Any>>cast().push(v));
		return newInstance;
	}

	Adapter getAdapter() {
		return DisconnectUtils.asJavaObject(getAdapterInternal());
	}

	void setAdapter(Adapter target) {
		setAdapterInternal(DisconnectUtils.asJsObject(target));
	}

	T getTarget() {
		return DisconnectUtils.asJavaObject(getTargetInternal());
	}

	void setTarget(T target) {
		setTargetInternal(DisconnectUtils.asJsObject(target));
	}

	@JSBody(script = "return Reflect.get(this, '__target__')")
	private native Any getTargetInternal();

	@JSBody(params = "target", script = "Reflect.set(this, '__target__', target)")
	private native void setTargetInternal(Any target);

	@JSBody(script = "return Reflect.get(this, '__adapter__')")
	private native Any getAdapterInternal();

	@JSBody(params = "target", script = "Reflect.set(this, '__adapter__', target)")
	private native void setAdapterInternal(Any target);

	private interface TargetMirrorReference<T extends Serializable> extends Any {
		@JSProperty("__mirror__")
		ObjectMirror<T> getObjectMirror();

		@JSProperty("__mirror__")
		void setObjectMirror(ObjectMirror<T> objectMirror);
	}

	@JSBody(script = "var target = [];\n" +
			"var props = {};\n" +
			"\n" +
			"props.length = {\n" +
			"    value: 0,\n" +
			"        writable: true\n" +
			"};\n" +
			"props[Symbol.iterator] = {\n" +
			"    // http://www.ecma-international.org/ecma-262/6.0/#sec-array.prototype-@@iterator\n" +
			"    value: function () {\n" +
			"        let index = 0;\n" +
			"\n" +
			"        return {\n" +
			"            next: function () {\n" +
			"                return {\n" +
			"                    done: index >= target.__target__.__mirror__.length,\n" +
			"                    value: target.__target__.__mirror__[index++]\n" +
			"                }\n" +
			"            }\n" +
			"        };\n" +
			"    }\n" +
			"};\n" +
			"\n" +
			"\n" +
			"Object.defineProperties(target, props);\n" +
			"return target;")
	private static native Any createFakeArray();

}
