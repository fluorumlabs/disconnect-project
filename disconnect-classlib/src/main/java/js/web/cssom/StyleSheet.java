package js.web.cssom;

import js.lang.Any;
import js.web.dom.Node;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * A single style sheet. CSS style sheets will further implement the more specialized CSSStyleSheet interface.
 */
public interface StyleSheet extends Any {
    @JSBody(script = "return StyleSheet.prototype")
    static StyleSheet prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new StyleSheet()")
    static StyleSheet create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    boolean isDisabled();

    @JSProperty
    void setDisabled(boolean disabled);

    @JSProperty
    @Nullable
    String getHref();

    @JSProperty
    MediaList getMedia();

    @JSProperty
    Node getOwnerNode();

    @JSProperty
    @Nullable
    StyleSheet getParentStyleSheet();

    @JSProperty
    @Nullable
    String getTitle();

    @JSProperty
    String getType();

}
