package js.web.performance;

import js.lang.Unknown;
import js.util.collections.Array;
import js.web.dom.*;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * Provides access to performance-related information for the current page. It's part of the High Resolution Time API, but is enhanced by the Performance Timeline API, the Navigation Timing API, the User Timing API, and the Resource Timing API.
 */
public interface Performance extends EventTarget {
    @JSBody(script = "return Performance.prototype")
    static Performance prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new Performance()")
    static Performance create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @Deprecated
    @JSProperty
    PerformanceNavigation getNavigation();

    @JSProperty
    @Nullable
    EventListener<Event> getOnresourcetimingbufferfull();

    @JSProperty
    void setOnresourcetimingbufferfull(EventListener<Event> onresourcetimingbufferfull);

    default void addResourceTimingBufferFullEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
        addEventListener("resourcetimingbufferfull", listener, options);
    }

    default void addResourceTimingBufferFullEventListener(EventListener<Event> listener, boolean options) {
        addEventListener("resourcetimingbufferfull", listener, options);
    }

    default void addResourceTimingBufferFullEventListener(EventListener<Event> listener) {
        addEventListener("resourcetimingbufferfull", listener);
    }

    default void removeResourceTimingBufferFullEventListener(EventListener<Event> listener, EventListenerOptions options) {
        removeEventListener("resourcetimingbufferfull", listener, options);
    }

    default void removeResourceTimingBufferFullEventListener(EventListener<Event> listener, boolean options) {
        removeEventListener("resourcetimingbufferfull", listener, options);
    }

    default void removeResourceTimingBufferFullEventListener(EventListener<Event> listener) {
        removeEventListener("resourcetimingbufferfull", listener);
    }

    @JSProperty
    double getTimeOrigin();

    @Deprecated
    @JSProperty
    PerformanceTiming getTiming();

    void clearMarks(String markName);

    void clearMarks();

    void clearMeasures(String measureName);

    void clearMeasures();

    void clearResourceTimings();

    Array<PerformanceEntry> getEntries();

    Array<PerformanceEntry> getEntriesByName(String name, String type);

    Array<PerformanceEntry> getEntriesByName(String name);

    Array<PerformanceEntry> getEntriesByType(String type);

    void mark(String markName);

    void measure(String measureName, String startMark, String endMark);

    void measure(String measureName, String startMark);

    void measure(String measureName);

    double now();

    void setResourceTimingBufferSize(int maxSize);

    Unknown toJSON();

}
