package org.vaadin.disconnect.core.client.internals;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSObject;
import org.vaadin.disconnect.core.annotations.Import;
import org.vaadin.disconnect.core.annotations.NpmPackage;
import org.vaadin.disconnect.core.client.internals.dependencies.BuildDependencies;
import org.vaadin.disconnect.core.client.internals.dependencies.RuntimeDependencies;

/**
 * Created by Artem Godin on 8/28/2019.
 */
@NpmPackage(name = "fast-memoize", version = "latest")
@Import(symbols = {"$rtd_wrapThread", "$rtd_setThreadStarter"}, module = "./disconnect/thread-wrapper.js", object = true)
public abstract class DisconnectInitializer implements JSObject {
    @JSBody(script = "$rtd_setThreadStarter($rt_threadStarter)")
    private static native void initThreadStarter();

    public static void init() {
        BuildDependencies.init();
        RuntimeDependencies.init();

        initThreadStarter();
    }
}
