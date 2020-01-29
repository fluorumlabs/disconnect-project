package js.web.webspeech;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import js.lang.Any;


public interface SpeechGrammar extends Any {
        @JSProperty
        String getSrc();

        @JSProperty
        void setSrc(String src);

        @JSProperty
        double getWeight();

        @JSProperty
        void setWeight(double weight);

        @JSBody(script = "return SpeechGrammar.prototype")
        static SpeechGrammar prototype() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(script = "return new SpeechGrammar()")
        static SpeechGrammar create() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        }
