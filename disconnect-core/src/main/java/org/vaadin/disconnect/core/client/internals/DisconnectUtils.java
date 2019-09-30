package org.vaadin.disconnect.core.client.internals;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSObject;
import org.teavm.platform.Platform;
import org.vaadin.disconnect.core.annotations.Import;
import org.vaadin.disconnect.core.annotations.NpmPackage;

import static org.teavm.metaprogramming.Metaprogramming.emit;
import static org.teavm.metaprogramming.Metaprogramming.exit;

/**
 * Created by Artem Godin on 8/28/2019.
 */
@NpmPackage(name = "compact-base64", version = "latest")
@Import(symbols = "Base64", module = "compact-base64/browser.js", defaultExport = true)
public abstract class DisconnectUtils implements JSObject {
    @JSBody(params = "value", script = "return Base64.encodeUrl(value)")
    public static native String base64UrlEncode(String value);

    public static JSObject asJsObject(Object that) {
        return Platform.getPlatformObject(that);
    }

    public static <T> T asJavaObject(JSObject that) {
        return (T)(Object)that;
    }
}
