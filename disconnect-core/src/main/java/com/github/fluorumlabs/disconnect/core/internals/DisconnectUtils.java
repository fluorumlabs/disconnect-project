package com.github.fluorumlabs.disconnect.core.internals;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import js.lang.Unknown;
import org.teavm.jso.JSBody;
import org.teavm.platform.Platform;


@NpmPackage(name = "compact-base64", version = "latest")
@Import(symbols = "Base64", module = "compact-base64/browser.js", defaultExport = true)
public abstract class DisconnectUtils implements Any {
    @JSBody(params = "value", script = "return Base64.encodeUrl(value)")
    public static native String base64UrlEncode(String value);

    public static Unknown asJsObject(Object that) {
        return Platform.getPlatformObject(that).cast();
    }

    public static <T> T asJavaObject(Any that) {
        return (T)(Object)that;
    }

    @JSBody(params = "result", script = "return;")
    private static native void ensure(Any result);

    public static void ensure(Object x) {
        ensure(Platform.getPlatformObject(x));
    }

}
