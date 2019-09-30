package org.vaadin.disconnect.core.client.internals;

import org.teavm.jso.JSBody;

/**
 * Created by Artem Godin on 9/30/2019.
 */
public abstract class DisconnectConfig {
    @JSBody(script = "return (window.Disconnect && window.Disconnect.RpcHost) ? window.Disconnect.RpcHost : ''")
    public static native String getRpcHost();
}
