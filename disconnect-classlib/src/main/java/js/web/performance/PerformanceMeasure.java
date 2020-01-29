package js.web.performance;

import org.teavm.jso.JSBody;

/** PerformanceMeasure is an abstract interface for PerformanceEntry objects with an entryType of "measure". Entries of this type are created by calling performance.measure() to add a named DOMHighResTimeStamp (the measure) between two marks to the browser's performance timeline. */
        public interface PerformanceMeasure extends PerformanceEntry {
                @JSBody(script = "return PerformanceMeasure.prototype")
                static PerformanceMeasure prototype() {
                    throw new UnsupportedOperationException("Available only in JavaScript");
                }

                @JSBody(script = "return new PerformanceMeasure()")
                static PerformanceMeasure create() {
                    throw new UnsupportedOperationException("Available only in JavaScript");
                }

        }
