package js.web.mediastreams;

import js.util.errors.JsError;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;


public interface OverconstrainedError extends JsError {
        @JSProperty
        String getConstraint();

        @JSProperty
        void setConstraint(String constraint);

        @JSBody(script = "return OverconstrainedError.prototype")
        static OverconstrainedError prototype() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(script = "return new OverconstrainedError()")
        static OverconstrainedError create() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }


        }
