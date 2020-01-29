package com.github.fluorumlabs.disconnect.core.internals;

import org.teavm.jso.JSBody;


public abstract class DisconnectConfig {
    @JSBody(script = "return (window.Disconnect && window.Disconnect.RpcHost) ? window.Disconnect.RpcHost : ''")
    public static native String getRpcHost();
}
