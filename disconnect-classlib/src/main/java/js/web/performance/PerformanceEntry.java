package js.web.performance;

import js.lang.Any;
import js.lang.Unknown;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/**
 * Encapsulates a single performance metric that is part of the performance timeline. A performance entry can be directly created by making a performance mark or measure (for example by calling the mark() method) at an explicit point in an application. Performance entries are also created in indirect ways such as loading a resource (such as an image).
 */
public interface PerformanceEntry extends Any {
    @JSBody(script = "return PerformanceEntry.prototype")
    static PerformanceEntry prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new PerformanceEntry()")
    static PerformanceEntry create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    double getDuration();

    @JSProperty
    String getEntryType();

    @JSProperty
    String getName();

    @JSProperty
    double getStartTime();

    Unknown toJSON();

}
