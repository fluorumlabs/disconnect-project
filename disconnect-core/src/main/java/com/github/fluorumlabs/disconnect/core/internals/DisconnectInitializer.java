package com.github.fluorumlabs.disconnect.core.internals;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.internals.dependencies.BuildDependencies;
import com.github.fluorumlabs.disconnect.core.internals.dependencies.RuntimeDependencies;
import js.lang.Any;
import org.teavm.jso.JSBody;


@Import(symbols = {"$rtd_setThreadStarter"}, module = "disconnect-core-jar/frontend/thread-wrapper.js")
public abstract class DisconnectInitializer implements Any {
    @JSBody(script = "$rtd_setThreadStarter($rt_threadStarter)")
    private static native void initThreadStarter();

    public static void init() {
        BuildDependencies.init();
        RuntimeDependencies.init();

        initThreadStarter();
    }
}
