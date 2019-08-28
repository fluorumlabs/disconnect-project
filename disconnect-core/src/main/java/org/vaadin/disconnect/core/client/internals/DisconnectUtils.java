package org.vaadin.disconnect.core.client.internals;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSObject;
import org.vaadin.disconnect.core.annotations.Import;
import org.vaadin.disconnect.core.annotations.NpmPackage;

/**
 * Created by Artem Godin on 8/28/2019.
 */
@NpmPackage(name = "compact-base64", version = "latest")
@Import(symbols = "Base64", module = "compact-base64/browser.js")
public abstract class DisconnectUtils implements JSObject {
    @JSBody(params = "value", script = "return Base64.encodeUrl(value)")
    public static native String base64UrlEncode(String value);
}
