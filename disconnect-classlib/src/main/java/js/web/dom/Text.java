package js.web.dom;


import js.web.webcomponents.HTMLSlotElement;
import js.web.webcomponents.Slotable;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/** The textual content of Element or Attr. If an element has no markup within its content, it has a single child implementing Text that contains the element's text. However, if the element contains markup, it is parsed into information items and Text nodes that form its children. */
        public interface Text extends CharacterData, Slotable {
        @JSProperty
        @Nullable
        HTMLSlotElement getAssignedSlot();

        /**
         * Returns the combined data of all direct Text node siblings.
         */
        @JSProperty
        String getWholeText();

        /**
         * Splits data at the given offset and returns the remainder as Text node.
         */
        Text splitText(int offset);

        @JSBody(script = "return Text.prototype")
        static Text prototype() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(script = "return new Text()")
        static Text create() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(params="data", script = "return new Text(data)")
        static Text create(String data) {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        }
