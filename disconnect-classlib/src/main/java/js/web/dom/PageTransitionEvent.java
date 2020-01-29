package js.web.dom;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/** The PageTransitionEvent is fired when a document is being loaded or unloaded. */
        public interface PageTransitionEvent extends Event {
        @JSProperty
        boolean isPersisted();

        @JSBody(script = "return PageTransitionEvent.prototype")
        static PageTransitionEvent prototype() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(script = "return new PageTransitionEvent()")
        static PageTransitionEvent create() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        }
