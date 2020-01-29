package js.web.dom;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/** A processing instruction embeds application-specific instructions in XML which can be ignored by other applications that don't recognize them. */
        public interface ProcessingInstruction extends CharacterData {
        @JSProperty
        String getTarget();

        @JSBody(script = "return ProcessingInstruction.prototype")
        static ProcessingInstruction prototype() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(script = "return new ProcessingInstruction()")
        static ProcessingInstruction create() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        }
