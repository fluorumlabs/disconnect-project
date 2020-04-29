package js.web.webworkers;

import js.web.console.WindowConsole;
import js.web.dom.EventTarget;
import js.web.dom.WindowOrWorkerGlobalScope;
import js.web.performance.Performance;
import js.web.serviceworker.CacheStorage;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/**
 * A window containing a DOM document; the document property points to the DOM document loaded in that window.
 */
public interface WorkerGlobalScope extends EventTarget, WorkerUtils, WindowConsole, WindowOrWorkerGlobalScope {
    @JSBody(script = "return WorkerGlobalScope.prototype")
    static WorkerGlobalScope prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new WorkerGlobalScope()")
    static WorkerGlobalScope create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    CacheStorage getCaches();

    @JSProperty
    boolean isIsSecureContext();

    @JSProperty
    WorkerLocation getLocation();

    @JSProperty
    Performance getPerformance();

    @JSProperty
    WorkerGlobalScope getSelf();
}
