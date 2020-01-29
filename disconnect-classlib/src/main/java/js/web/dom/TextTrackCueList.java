package js.web.dom;

import js.util.collections.ArrayLike;
import org.teavm.jso.JSBody;


public interface TextTrackCueList extends ArrayLike<TextTrackCue> {

         TextTrackCue getCueById(String id);
         TextTrackCue item(int index);

        @JSBody(script = "return TextTrackCueList.prototype")
        static TextTrackCueList prototype() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(script = "return new TextTrackCueList()")
        static TextTrackCueList create() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        }
