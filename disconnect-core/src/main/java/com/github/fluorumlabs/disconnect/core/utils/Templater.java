package com.github.fluorumlabs.disconnect.core.utils;

import com.github.fluorumlabs.disconnect.core.internals.DisconnectSymbols;
import js.util.JS;
import js.web.dom.DocumentFragment;
import js.web.dom.ParentNode;
import js.web.dom.Window;
import js.web.webcomponents.HTMLTemplateElement;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSObject;
import org.teavm.platform.Platform;

import javax.annotation.Nullable;

/**
 * Created by Artem Godin on 5/19/2020.
 */
public final class Templater {
    private Templater() {}

    public static void registerTemplate(Class<?> componentClass, String id) {
        HTMLTemplateElement templateElement = Window.DOCUMENT.createElement("template");
        templateElement.setInnerHTML(DisconnectSymbols.get(id).stringValue());
        setComponentTemplate(Platform.getPlatformObject(componentClass), templateElement.getContent());
    }

    public static void injectTemplate(Class<?> clazz, ParentNode root) {
        DocumentFragment template = JS.nullify(getComponentTemplate(Platform.getPlatformObject(clazz)));
        if (template != null){
            root.appendChild(template.cloneNode(true).cast());
        }
    }


    @JSBody(params = {"clazz"}, script = "return clazz.__tpl__")
    @Nullable
    private static native DocumentFragment getComponentTemplate(JSObject clazz);

    @JSBody(params = {"clazz", "template"}, script = "clazz.__tpl__ = template")
    private static native void setComponentTemplate(JSObject clazz, DocumentFragment template);

}
