package js.web.performance.timeline;

import js.util.collections.Array;
import js.web.performance.PerformanceEntry;
import org.teavm.jso.JSBody;

import js.lang.Any;


public interface PerformanceObserverEntryList extends Any {
        Array<PerformanceEntry> getEntries();
        Array<PerformanceEntry> getEntriesByName(String name, String type);
        Array<PerformanceEntry> getEntriesByName(String name);
        Array<PerformanceEntry> getEntriesByType(String type);

        @JSBody(script = "return PerformanceObserverEntryList.prototype")
        static PerformanceObserverEntryList prototype() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(script = "return new PerformanceObserverEntryList()")
        static PerformanceObserverEntryList create() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        }
