package js.web.performance.timeline;

import js.lang.Any;
import js.util.collections.Array;
import js.web.performance.PerformanceEntry;
import org.teavm.jso.JSBody;


public interface PerformanceObserverEntryList extends Any {
    @JSBody(script = "return PerformanceObserverEntryList.prototype")
    static PerformanceObserverEntryList prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new PerformanceObserverEntryList()")
    static PerformanceObserverEntryList create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    Array<PerformanceEntry> getEntries();

    Array<PerformanceEntry> getEntriesByName(String name, String type);

    Array<PerformanceEntry> getEntriesByName(String name);

    Array<PerformanceEntry> getEntriesByType(String type);

}
