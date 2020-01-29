package js.web.dom;

import js.lang.Any;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * A Selection object represents the range of text selected by the user or the current position of the caret. To obtain a Selection object for examination or modification, call Window.getSelection().
 */
public interface Selection extends Any {
    @JSBody(script = "return Selection.prototype")
    static Selection prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new Selection()")
    static Selection create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    @Nullable
    Node getAnchorNode();

    @JSProperty
    int getAnchorOffset();

    @JSProperty
    @Nullable
    Node getFocusNode();

    @JSProperty
    int getFocusOffset();

    @JSProperty
    boolean isIsCollapsed();

    @JSProperty
    int getRangeCount();

    @JSProperty
    String getType();

    void addRange(Range range);

    void collapse(@Nullable Node node, int offset);

    void collapse(@Nullable Node node);

    void collapseToEnd();

    void collapseToStart();

    boolean containsNode(Node node, boolean allowPartialContainment);

    boolean containsNode(Node node);

    void deleteFromDocument();

    void empty();

    void extend(Node node, int offset);

    void extend(Node node);

    Range getRangeAt(int index);

    void removeAllRanges();

    void removeRange(Range range);

    void selectAllChildren(Node node);

    void setBaseAndExtent(Node anchorNode, int anchorOffset, Node focusNode, int focusOffset);

    void setPosition(@Nullable Node node, int offset);

    void setPosition(@Nullable Node node);

}
