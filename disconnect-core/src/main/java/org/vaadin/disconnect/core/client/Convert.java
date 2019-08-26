package org.vaadin.disconnect.core.client;

import org.teavm.flavour.json.JSON;
import org.teavm.flavour.json.tree.Node;
import org.teavm.jso.JSObject;
import org.teavm.jso.core.JSBoolean;
import org.teavm.jso.core.JSNumber;
import org.teavm.jso.core.JSString;

import java.io.Serializable;

/**
 * Created by Artem Godin on 8/19/2019.
 */
public abstract class Convert implements JSObject {
    public static JSObject toJSObject(boolean arg) {
        return JSBoolean.valueOf(arg);
    }

    public static JSObject toJSObject(String arg) {
        return JSString.valueOf(arg);
    }

    public static JSObject toJSObject(double arg) {
        return JSNumber.valueOf(arg);
    }

    public static JSObject toJSObject(float arg) {
        return JSNumber.valueOf(arg);
    }

    public static JSObject toJSObject(byte arg) {
        return JSNumber.valueOf(arg);
    }

    public static JSObject toJSObject(int arg) {
        return JSNumber.valueOf(arg);
    }

    public static JSObject toJSObject(long arg) {
        throw new RuntimeException("Long is not supported in JavaScript");
    }

    public static JSObject toJSObject(char arg) {
        return JSNumber.valueOf(arg);
    }

    public static JSObject toJSObject(short arg) {
        return JSNumber.valueOf(arg);
    }

    public static JSObject toJSObject(Serializable arg) {
        return JSON.serialize(arg);
    }

    public static String toString(Serializable arg) {
        return JSON.serialize(arg).stringify();
    }

    public static String toString(JSObject arg) {
        return ((JSString) arg).stringValue();
    }

    public static boolean toBoolean(JSObject arg) {
        return ((JSBoolean) arg).booleanValue();
    }

    public static int toInt(JSObject arg) {
        return ((JSNumber) arg).intValue();
    }

    public static long toLong(JSObject arg) {
        throw new RuntimeException("Long is not supported in JavaScript");
    }

    public static int toByte(JSObject arg) {
        return ((JSNumber) arg).byteValue();
    }

    public static char toChar(JSObject arg) {
        return ((JSNumber) arg).charValue();
    }

    public static short toShort(JSObject arg) {
        return ((JSNumber) arg).shortValue();
    }

    public static float toFloat(JSObject arg) {
        return ((JSNumber) arg).floatValue();
    }

    public static double toDouble(JSObject arg) {
        return ((JSNumber) arg).doubleValue();
    }

    public static <T extends Serializable> T toSerializable(JSObject arg, Class<T> clazz) {
        return JSON.deserialize((Node) arg, clazz);
    }

    public static <T extends Serializable> T toSerializable(String arg, Class<T> clazz) {
        return JSON.deserialize(Node.parse(arg), clazz);
    }
}
