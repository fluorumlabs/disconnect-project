package com.github.fluorumlabs.disconnect.core.adapters;

import com.github.fluorumlabs.disconnect.core.converters.Converter;
import com.github.fluorumlabs.disconnect.core.converters.ConverterFactory;
import js.lang.JsNumber;
import js.lang.Unknown;
import js.util.JS;
import js.util.collections.Array;
import org.teavm.jso.JSBody;
import org.teavm.metaprogramming.CompileTime;

import java.util.List;

/**
 * Created by Artem Godin on 2/10/2020.
 */
@CompileTime
public class ListAdapter implements Adapter {
	private final Class<?> itemType;
	private Converter converter = null;

	public ListAdapter(Class<?> itemType) {
		this.itemType = itemType;
		this.converter = ConverterFactory.converterFor(itemType);
	}

	@Override
	public Unknown get(Object instance, String key) {
		if ("length".equals(key)) {
			return Unknown.of(((List<Object>)instance).size());
		} else if (isArrayIndex(key)) {
			int index = JsNumber.parseInt(key, 10);
			if (index>=0 && index < ((List<Object>)instance).size()) {
				Object o = ((List<Object>)instance).get(index);
				return o == null ? null : converter.toJS(o);
			}
		}
		return Unknown.undefined();
	}

	@Override
	public boolean set(Object instance, String key, Unknown value) {
		if ("length".equals(key)) {
			ensureSize((List<Object>) instance, value.intValue(), true);
			return true;
		} else if (isArrayIndex(key)) {
			int index = JsNumber.parseInt(key, 10);
			ensureSize((List<?>) instance, index+1, false);
			if (JS.isUndefinedOrNull(value)) {
				((List<Object>)instance).set(index, null);
			} else {
				((List<Object>)instance).set(index, converter.fromJS(value));
			}
			return true;
		}
		return false;
	}

	@Override
	public boolean has(Object instance, String key) {
		if ("length".equals(key)) {
			return true;
		} else if (isArrayIndex(key)) {
			int index = JsNumber.parseInt(key, 10);
			return index >= 0 && index < ((List<Object>) instance).size();
		}
		return false;
	}

	@Override
	public Array<Unknown> keys(Object instance) {
		return Array.from(Array.create(((List)instance).size()).keys().getIterator());
	}

	@JSBody(params = "p", script = "/* an array index is a property such that\n" +
			"   ToString(ToUint32(p)) === p and ToUint(p) !== 2^32 - 1 */\n" +
			"const uint = p >>> 0;\n" +
			"const s = uint + \"\";\n" +
			"return p === s && uint !== 0xffffffff;")
	private static native boolean isArrayIndex(String p);

	private static void ensureSize(List<?> list, int index, boolean shrink) {
		if (index > list.size()) {
			int oldSize = list.size();
			for (int i = oldSize; i <= index; i++) {
				list.add(null);
			}
		} else if (index < list.size() && shrink) {
			int oldSize = list.size();
			for (int i = oldSize; i > index; i--) {
				list.remove(i-1);
			}
		}
	}

}
