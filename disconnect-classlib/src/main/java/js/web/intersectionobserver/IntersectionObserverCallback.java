package js.web.intersectionobserver;

import js.util.collections.Array;

import js.lang.Any;
import org.teavm.jso.JSFunctor;
import org.teavm.jso.JSObject;


@JSFunctor
@FunctionalInterface
public interface IntersectionObserverCallback extends JSObject {
        void accept(Array<IntersectionObserverEntry> entries, IntersectionObserver observer);
        }
