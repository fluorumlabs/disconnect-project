package js.web.touchevents;

import js.util.collections.ArrayLike;
import org.teavm.jso.JSBody;

import javax.annotation.Nullable;


/** A list of contact points on a touch surface. For example, if the user has three fingers on the touch surface (such as a screen or trackpad), the corresponding TouchList object would have one Touch object for each finger, for a total of three entries. */
        public interface TouchList extends ArrayLike<Touch> {

        @Nullable
         Touch item(int index);


        @JSBody(script = "return TouchList.prototype")
        static TouchList prototype() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(script = "return new TouchList()")
        static TouchList create() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        }
