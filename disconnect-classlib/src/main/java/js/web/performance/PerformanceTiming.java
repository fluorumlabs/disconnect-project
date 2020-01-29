package js.web.performance;

import js.lang.Any;
import js.lang.Unknown;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/**
 * A legacy interface kept for backwards compatibility and contains properties that offer performance timing information for various events which occur during the loading and use of the current page. You get a PerformanceTiming object describing your page using the window.performance.timing property.
 */
@Deprecated
public interface PerformanceTiming extends Any {
    @JSBody(script = "return PerformanceTiming.prototype")
    static PerformanceTiming prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new PerformanceTiming()")
    static PerformanceTiming create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    double getConnectEnd();

    @JSProperty
    double getConnectStart();

    @JSProperty
    double getDomComplete();

    @JSProperty
    double getDomContentLoadedEventEnd();

    @JSProperty
    double getDomContentLoadedEventStart();

    @JSProperty
    double getDomInteractive();

    @JSProperty
    double getDomLoading();

    @JSProperty
    double getDomainLookupEnd();

    @JSProperty
    double getDomainLookupStart();

    @JSProperty
    double getFetchStart();

    @JSProperty
    double getLoadEventEnd();

    @JSProperty
    double getLoadEventStart();

    @JSProperty
    double getNavigationStart();

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
    double getUnloadEventEnd();

    @JSProperty
    double getUnloadEventStart();

    Unknown toJSON();

}
