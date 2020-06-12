package com.github.fluorumlabs.disconnect.core.internals;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import js.lang.Unknown;
import js.util.JS;
import org.teavm.jso.JSBody;
import org.teavm.platform.Platform;

import javax.annotation.Nullable;
import java.util.Optional;


@NpmPackage(name = "compact-base64", version = "^2.1.2")
@Import(symbols = "DisconnectUtils_Base64", module = "compact-base64/browser.js", defaultExport = true)
@Import(symbols = "deepCopy as DisconnectUtils_deepCopy", module = "disconnect-core-jar/frontend/deep-utils.js")
@Import(symbols = "deepEquals as DisconnectUtils_deepEquals", module = "disconnect-core-jar/frontend/deep-utils.js")
public abstract class DisconnectUtils implements Any {
    @JSBody(params = "value", script = "return DisconnectUtils_Base64.encodeUrl(value)")
    public static native String base64UrlEncode(String value);

    public static Unknown asJsObject(Object that) {
        return Platform.getPlatformObject(that).cast();
    }

    public static <T> T asJavaObject(Any that) {
        return (T) that;
    }

    @JSBody(params = "result", script = "return;")
    private static native void _ensure(Any result);

    public static void ensure(Object x) {
        _ensure(Platform.getPlatformObject(x).cast());
    }

    public static <T extends Any> Optional<T> optional(@Nullable T x) {
        if (JS.isUndefinedOrNull(x)) {
            return Optional.empty();
        } else {
            return Optional.of(x);
        }
    }

    public static <T> Optional<T> optional(@Nullable T x) {
        if (x == null || JS.isUndefinedOrNull(Platform.getPlatformObject(x).cast()) ) {
            return Optional.empty();
        } else {
            return Optional.of(x);
        }
    }

    @JSBody(params = "value", script = "return DisconnectUtils_deepCopy(value)")
    public static native  <T extends Any> T deepCopy(T value);

    @JSBody(params = {"value1","value2"}, script = "return DisconnectUtils_deepEquals(value1, value2)")
    public static native  <T extends Any> boolean deepEquals(T value1, T value2);
}
