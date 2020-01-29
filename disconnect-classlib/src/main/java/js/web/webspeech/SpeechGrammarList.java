package js.web.webspeech;

import js.util.collections.ArrayLike;
import org.teavm.jso.JSBody;


public interface SpeechGrammarList extends ArrayLike<SpeechGrammar> {
         void addFromString(String string, double weight);
         void addFromString(String string);
         void addFromURI(String src, double weight);
         void addFromURI(String src);
         SpeechGrammar item(int index);


        @JSBody(script = "return SpeechGrammarList.prototype")
        static SpeechGrammarList prototype() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(script = "return new SpeechGrammarList()")
        static SpeechGrammarList create() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        }
