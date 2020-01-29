package js.web.performance.timeline;

import js.lang.Any;
import js.util.collections.Array;
import js.web.performance.PerformanceEntry;
import org.teavm.jso.JSBody;


public interface PerformanceObserver extends Any {
    @JSBody(script = "return PerformanceObserver.prototype")
    static PerformanceObserver prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = "callback", script = "return new PerformanceObserver(callback)")
    static PerformanceObserver create(PerformanceObserverCallback callback) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return PerformanceObserver.supportedEntryTypes")
    static String[] getSupportedEntryTypes() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    void disconnect();

    void observe(PerformanceObserverInit options);

    void observe();

    Array<PerformanceEntry> takeRecords();
}
