package js.web.dom;

import js.lang.Any;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/**
 * Used to represent a set of time ranges, primarily for the purpose of tracking which portions of media have been buffered when loading it for use by the <audio> and <video> elements.
 */
public interface TimeRanges extends Any {
    @JSBody(script = "return TimeRanges.prototype")
    static TimeRanges prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new TimeRanges()")
    static TimeRanges create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    int getLength();

    double end(int index);

    double start(int index);

}
