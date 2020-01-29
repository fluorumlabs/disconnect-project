package js.web.dom;

import js.util.collections.Array;
import org.teavm.jso.JSFunctor;
import org.teavm.jso.JSObject;


@JSFunctor
@FunctionalInterface
        public interface MutationCallback extends JSObject {
        void accept(Array<MutationRecord> mutations, MutationObserver observer);
        }
