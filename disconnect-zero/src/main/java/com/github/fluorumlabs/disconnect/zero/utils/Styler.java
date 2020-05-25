package com.github.fluorumlabs.disconnect.zero.utils;

import com.github.fluorumlabs.disconnect.core.internals.DisconnectSymbols;
import js.lang.Any;
import js.lang.Unknown;
import js.util.Record;
import js.util.collections.Array;
import js.web.dom.HTMLStyleElement;
import js.web.dom.Node;
import js.web.dom.ParentNode;
import js.web.dom.Window;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSObject;
import org.teavm.platform.Platform;

/**
 * Created by Artem Godin on 5/19/2020.
 */
public final class Styler {
    private Styler() {}

    private static final Record<Node> STYLE_ELEMENTS = Any.empty();
    private static final Array<Unknown> GLOBAL_STYLES = Array.create();

    public static void injectStyles(Class<?> clazz, ParentNode root) {
        GLOBAL_STYLES.forEach(((value, key, parent) -> attachStyle(root, value.stringValue())));
        getComponentStyles(Platform.getPlatformObject(clazz)).forEach(((value, key, parent) -> attachStyle(root, value.stringValue())));
    }

    public static void registerStyle(Class<?> componentClass, String id, String scope) {
        STYLE_ELEMENTS.set(id, createStyle(id));

        if ("COMPONENT".equals(scope)) {
            getComponentStyles(Platform.getPlatformObject(componentClass)).push(Unknown.of(id));
            return;
        } else if ("GLOBAL".equals(scope)) {
            GLOBAL_STYLES.push(Unknown.of(id));
        }
        Window.DOCUMENT.getHead().appendChild(getStyle(id));
    }

    private static void attachStyle(Node parentNode, String id) {
        ParentNode root = parentNode.getRootNode().cast();
        if (root.querySelectorAll("style#"+id).getLength() == 0) {
            root.append(getStyle(id));
        }
    }

    private static Node getStyle(String id) {
        return STYLE_ELEMENTS.get(id).cloneNode(true);
    }

    private static Node createStyle(String id) {
        HTMLStyleElement styleElement = Window.DOCUMENT.createElement("style");
        styleElement.setTextContent(DisconnectSymbols.get(id).stringValue());
        styleElement.setId(id);
        return styleElement;
    }

    @JSBody(params = {"clazz"}, script = "clazz.__styles__ = clazz.__styles__ || []; return clazz.__styles__")
    private static native Array<Unknown> getComponentStyles(JSObject clazz);

}
