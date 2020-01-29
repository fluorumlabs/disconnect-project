package com.github.fluorumlabs.disconnect.core;

import js.lang.Any;
import js.lang.Unknown;
import org.teavm.flavour.json.JSON;
import org.teavm.flavour.json.tree.Node;

import java.io.Serializable;


public abstract class Convert implements Any {
    public static Unknown toJS(boolean arg) {return Unknown.of(arg);}

    public static Unknown toJS(String arg) {
        return Unknown.of(arg);
    }

    public static Unknown toJS(double arg) {
        return Unknown.of(arg);
    }

    public static Unknown toJS(float arg) {
        return Unknown.of(arg);
    }

    public static Unknown toJS(byte arg) {
        return Unknown.of(arg);
    }

    public static Unknown toJS(int arg) {
        return Unknown.of(arg);
    }

    public static Unknown toJS(long arg) {
        throw new RuntimeException("Long is not supported in JavaScript");
    }

    public static Unknown toJS(char arg) {
        return Unknown.of(arg);
    }

    public static Unknown toJS(short arg) {
        return Unknown.of(arg);
    }

    public static Unknown toJS(Serializable arg) {
        return JSON.serialize(arg).cast();
    }

    public static String toString(Serializable arg) {
        return JSON.serialize(arg).stringify();
    }

    public static String toString(Any arg) {
        return ((Unknown) arg).stringValue();
    }

    public static boolean toBoolean(Any arg) {
        return ((Unknown) arg).booleanValue();
    }

    public static int toInt(Any arg) {
        return ((Unknown) arg).intValue();
    }

    public static long toLong(Any arg) {
        throw new RuntimeException("Long is not supported in JavaScript");
    }

    public static byte toByte(Any arg) {
        return ((Unknown) arg).byteValue();
    }

    public static char toChar(Any arg) {
        return ((Unknown) arg).charValue();
    }

    public static short toShort(Any arg) {
        return ((Unknown) arg).shortValue();
    }

    public static float toFloat(Any arg) {
        return ((Unknown) arg).floatValue();
    }

    public static double toDouble(Any arg) {
        return ((Unknown) arg).doubleValue();
    }

    public static <T extends Serializable> T toSerializable(Any arg, Class<T> clazz) {
        return JSON.deserialize((Node) arg, clazz);
    }

    public static <T extends Serializable> T toSerializable(String arg, Class<T> clazz) {
        return JSON.deserialize(Node.parse(arg), clazz);
    }
}
