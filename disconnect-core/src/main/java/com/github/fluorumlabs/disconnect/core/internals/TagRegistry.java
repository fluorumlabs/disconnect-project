package com.github.fluorumlabs.disconnect.core.internals;

import com.github.fluorumlabs.disconnect.core.components.Component;
import com.github.fluorumlabs.disconnect.core.components.HtmlComponent;
import js.web.dom.Element;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSObject;
import org.teavm.platform.Platform;

import javax.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Artem Godin on 5/13/2020.
 */
public final class TagRegistry {
    private static final Map<String, Class<?>> TAG_TO_CLASS = new HashMap<>();

    private TagRegistry() {
    }

    public static void register(String tagName, Class<?> clazz) {
        TAG_TO_CLASS.put(tagName, clazz);
        setTagName(clazz, tagName);
    }

    public static void registerInherited(String tagName, Class<?> clazz) {
        setTagName(clazz, tagName);
    }

    public static Class<?> getComponentClass(String tagName) {
        return TAG_TO_CLASS.getOrDefault(tagName, HtmlComponent.class);
    }

    @Nullable
    public static <E extends Element, T extends Component<?>> T recover(E element) {
        if (element == null) {
            return null;
        }

        T result = element.<ComponentReferenceHolder>cast().get();
        if (result != null) {
            return result;
        }

        try {
            String tagName = element.getTagName();
            ComponentReferenceHolder.pushPendingElementReference(element);
            return (T) getComponentClass(tagName).newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new IllegalStateException("Unable to construct component", e);
        } finally {
            ComponentReferenceHolder.resetPendingElementReference();
        }
    }

    @Nullable
    public static <E extends Element, T extends Component<?>> T recover(E element, Class<T> clazz) {
        if (element == null) {
            return null;
        }

        T result = element.<ComponentReferenceHolder>cast().get();
        if (result != null && result.getClass().equals(clazz)) {
            return result;
        }

        try {
            ComponentReferenceHolder.pushPendingElementReference(element);
            return clazz.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new IllegalStateException("Unable to construct component", e);
        } finally {
            ComponentReferenceHolder.resetPendingElementReference();
        }
    }

    public static String getTagName(Class<?> clazz) {
        return getTagName(Platform.getPlatformObject(clazz));
    }

    private static void setTagName(Class<?> clazz, String tagName) {
        setTagName(Platform.getPlatformObject(clazz), tagName);
    }

    @JSBody(params = {"clazz", "tagName"}, script = "clazz.__tag_name__ = tagName")
    private static native void setTagName(JSObject clazz, String tagName);

    @JSBody(params = "clazz", script = "return clazz.__tag_name__ || null")
    private static native String getTagName(JSObject clazz);

}
