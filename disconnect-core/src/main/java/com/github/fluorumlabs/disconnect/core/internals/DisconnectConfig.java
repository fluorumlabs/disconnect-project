package com.github.fluorumlabs.disconnect.core.internals;

import js.web.dom.Window;
import org.apache.commons.lang3.StringUtils;
import org.teavm.jso.JSBody;


public final class DisconnectConfig {
    private DisconnectConfig(){}
    private static final String RPC_HOST = getConfigParameter("RpcHost",StringUtils.removeEnd(Window.DOCUMENT.getBaseURI(), "/"));

    public static String getRpcHost() {
        return RPC_HOST;
    }

    @JSBody(params = {"name","defaultValue"}, script = "return (self.Disconnect && self.Disconnect[name]) ? self.Disconnect[name] : defaultValue")
    private static native String getConfigParameter(String name, String defaultValue);
}
