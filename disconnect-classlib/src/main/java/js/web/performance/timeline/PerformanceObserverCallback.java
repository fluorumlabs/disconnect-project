package js.web.performance.timeline;

import org.teavm.jso.JSFunctor;
import org.teavm.jso.JSObject;


@JSFunctor
@FunctionalInterface
public interface PerformanceObserverCallback extends JSObject {
    void accept(PerformanceObserverEntryList entries, PerformanceObserver observer);
}
