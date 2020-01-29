package js.web.performance.timeline;

import js.lang.Unknown;
import js.web.performance.PerformanceEntry;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/**
 * Enables retrieval and analysis of detailed network timing data regarding the loading of an application's resources. An application can use the timing metrics to determine, for example, the length of time it takes to fetch a specific resource, such as an XMLHttpRequest, <SVG>, image, or script.
 */
public interface PerformanceResourceTiming extends PerformanceEntry {
    @JSBody(script = "return PerformanceResourceTiming.prototype")
    static PerformanceResourceTiming prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new PerformanceResourceTiming()")
    static PerformanceResourceTiming create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    double getConnectEnd();

    @JSProperty
    double getConnectStart();

    @JSProperty
    double getDecodedBodySize();

    @JSProperty
    double getDomainLookupEnd();

    @JSProperty
    double getDomainLookupStart();

    @JSProperty
    double getEncodedBodySize();

    @JSProperty
    double getFetchStart();

    @JSProperty
    String getInitiatorType();

    @JSProperty
    String getNextHopProtocol();

    @JSProperty
    double getRedirectEnd();

    @JSProperty
    double getRedirectStart();

    @JSProperty
    double getRequestStart();

    @JSProperty
    double getResponseEnd();

    @JSProperty
    double getResponseStart();

    @JSProperty
    double getSecureConnectionStart();

    @JSProperty
    double getTransferSize();

    @JSProperty
    double getWorkerStart();

    Unknown toJSON();

}
