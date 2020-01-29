package js.web.webcomponents;

import js.lang.Any;
import js.util.collections.Array;
import js.web.cssom.CaretPosition;
import js.web.cssom.StyleSheetList;
import js.web.dom.Element;
import js.web.dom.Range;
import js.web.dom.Selection;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


public interface DocumentOrShadowRoot extends Any {
    @JSProperty
    @Nullable
    Element getActiveElement();

    /**
     * Returns document's fullscreen element.
     */
    @JSProperty
    @Nullable
    Element getFullscreenElement();

    @JSProperty
    @Nullable
    Element getPointerLockElement();

    /**
     * Retrieves a collection of styleSheet objects representing the style sheets that correspond to each instance of a link or style object in the document.
     */
    @JSProperty
    StyleSheetList getStyleSheets();

    @Nullable
    CaretPosition caretPositionFromPoint(double x, double y);

    @Deprecated
    Range caretRangeFromPoint(double x, double y);

    @Nullable
    Element elementFromPoint(double x, double y);

    Array<Element> elementsFromPoint(double x, double y);

    @Nullable
    Selection getSelection();
}
