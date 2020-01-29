package js.web.dom;

import js.util.collections.Array;
import org.teavm.jso.JSBody;

import js.lang.Any;

/** Provides the ability to watch for changes being made to the DOM tree. It is designed as a replacement for the older Mutation Events feature which was part of the DOM3 Events specification. */
        public interface MutationObserver extends Any {
        /**
         * Stops observer from observing any mutations. Until the observe() method is used again, observer's callback will not be invoked.
         */
        void disconnect();
        /**
         * Instructs the user agent to observe a given target (a node) and report any mutations based on the criteria given by options (an object).
         *
         * The options argument allows for setting mutation observation options via object members.
         */
        void observe(Node target, MutationObserverInit options);
        void observe(Node target);
        /**
         * Empties the record queue and returns what was in there.
         */
        Array<MutationRecord> takeRecords();

        @JSBody(script = "return MutationObserver.prototype")
        static MutationObserver prototype() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(params="callback", script = "return new MutationObserver(callback)")
        static MutationObserver create(MutationCallback callback) {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }


        }
