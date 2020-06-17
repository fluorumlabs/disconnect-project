package com.github.fluorumlabs.disconnect.core;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.components.Component;
import com.github.fluorumlabs.disconnect.core.internals.DisconnectUtils;
import com.github.fluorumlabs.disconnect.core.router.LocationParams;
import com.github.fluorumlabs.disconnect.core.router.Router;
import js.lang.Unknown;
import js.util.collections.WeakMap;
import js.util.function.JsRunnable;
import js.web.dom.Element;
import js.web.dom.WindowOrWorkerGlobalScope;
import org.teavm.interop.Async;
import org.teavm.interop.AsyncCallback;
import org.teavm.jso.JSBody;

import static js.web.dom.Window.DOCUMENT;
import static js.web.dom.Window.WINDOW;


@Import(symbols = {"$rtd_wrapThread"}, module = "disconnect-core-jar/frontend/thread-wrapper.js")
public final class Application {
    private static final ApplicationWindow APPLICATION_WINDOW = new ApplicationWindow();
    private static final WeakMap<Unknown, WindowOrWorkerGlobalScope.TimeoutHandle> asyncQueue = WeakMap.create();

    private Application() {
    }

    public static ApplicationWindow window() {
        return APPLICATION_WINDOW;
    }

    public static void render(Component<? extends Element> component) {
        DOCUMENT.getBody().appendChild(component.getElement());
    }

    public static void async(Runnable action) {
        async(action, action);
    }

    public static void debounce(Runnable action, int milliseconds) {
        debounce(action, action, milliseconds);
    }

    public static void async(Object marker, Runnable action) {
        debounce(marker, action, 0);
    }

    public static void debounce(Object marker, Runnable action, int milliseconds) {
        Unknown actionReference = DisconnectUtils.asJsObject(marker);
        if (asyncQueue.has(actionReference)) {
            WINDOW.clearTimeout(asyncQueue.get(actionReference));
            asyncQueue.delete(actionReference);
        }
        asyncQueue.set(actionReference, WINDOW.setTimeout(wrapRunnable(() -> {
            try {
                action.run();
            } finally {
                asyncQueue.delete(actionReference);
            }
        }), milliseconds));
    }

    @JSBody(params = "runnable", script = "return $rtd_wrapThread.fn(runnable)")
    private static native JsRunnable wrapRunnable(JsRunnable runnable);

    @Async
    public static native void wait(int milliseconds);

    private static void wait(int milliseconds, AsyncCallback<Integer> callback) {
        WINDOW.setTimeout(() -> callback.complete(0), milliseconds);
    }

    @Async
    public static native void waitNextFrame();

    private static void waitNextFrame(AsyncCallback<Integer> callback) {
        WINDOW.requestAnimationFrame((x) -> callback.complete(0));
    }
}
