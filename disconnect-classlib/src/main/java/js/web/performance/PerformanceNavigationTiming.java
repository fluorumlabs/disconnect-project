package js.web.performance;

import js.web.performance.timeline.PerformanceResourceTiming;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import js.lang.Unknown;

/** Provides methods and properties to store and retrieve metrics regarding the browser's document navigation events. For example, this interface can be used to determine how much time it takes to load or unload a document. */
        public interface PerformanceNavigationTiming extends PerformanceResourceTiming {
        @JSProperty
        double getDomComplete();

        @JSProperty
        double getDomContentLoadedEventEnd();

        @JSProperty
        double getDomContentLoadedEventStart();

        @JSProperty
        double getDomInteractive();

        @JSProperty
        double getLoadEventEnd();

        @JSProperty
        double getLoadEventStart();

        @JSProperty
        double getRedirectCount();

        @JSProperty
        NavigationType getType();

        @JSProperty
        double getUnloadEventEnd();

        @JSProperty
        double getUnloadEventStart();

        Unknown toJSON();

        @JSBody(script = "return PerformanceNavigationTiming.prototype")
        static PerformanceNavigationTiming prototype() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(script = "return new PerformanceNavigationTiming()")
        static PerformanceNavigationTiming create() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        }
