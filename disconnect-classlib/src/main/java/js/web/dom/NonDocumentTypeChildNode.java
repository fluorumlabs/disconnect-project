package js.web.dom;

import js.web.dom.Element;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;import js.lang.Any;


public interface NonDocumentTypeChildNode extends Any {
        /**
         * Returns the first following sibling that is an element, and null otherwise.
         */
        @JSProperty
        @Nullable
        Element getNextElementSibling();

        /**
         * Returns the first preceding sibling that is an element, and null otherwise.
         */
        @JSProperty
        @Nullable
        Element  getPreviousElementSibling();

        }
