package js.web.performance;

import org.teavm.jso.JSBody;

/** PerformanceMark is an abstract interface for PerformanceEntry objects with an entryType of "mark". Entries of this type are created by calling performance.mark() to add a named DOMHighResTimeStamp (the mark) to the browser's performance timeline. */
        public interface PerformanceMark extends PerformanceEntry {
                @JSBody(script = "return PerformanceMark.prototype")
                static PerformanceMark prototype() {
                    throw new UnsupportedOperationException("Available only in JavaScript");
                }

                @JSBody(script = "return new PerformanceMark()")
                static PerformanceMark create() {
                    throw new UnsupportedOperationException("Available only in JavaScript");
                }

        }
