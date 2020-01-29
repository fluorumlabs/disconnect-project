package js.web.performance.timeline;

import js.util.collections.Array;
import js.web.performance.PerformanceEntry;
import org.teavm.jso.JSBody;

import js.lang.Any;


public interface PerformanceObserver extends Any {
        void disconnect();
        void observe(PerformanceObserverInit options);
        void observe();
        Array<PerformanceEntry> takeRecords();

        @JSBody(script = "return PerformanceObserver.prototype")
        static PerformanceObserver prototype() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(params="callback", script = "return new PerformanceObserver(callback)")
        static PerformanceObserver create(PerformanceObserverCallback callback) {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(script = "return PerformanceObserver.supportedEntryTypes")
        static String[] getSupportedEntryTypes() {
                throw new UnsupportedOperationException("Available only in JavaScript");
        }
        }
