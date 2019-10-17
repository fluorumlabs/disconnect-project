package org.vaadin.disconnect.vue.client.internals;

import org.teavm.jso.core.JSObjects;
import org.teavm.jso.core.JSString;
import org.teavm.platform.Platform;
import org.teavm.platform.PlatformObject;
import org.vaadin.disconnect.core.client.internals.JSObjectMap;
import org.vaadin.disconnect.vue.client.utils.EnumeratedString;

/**
 * Created by Artem Godin on 8/30/2019.
 */
public class EnumeratedStringValueResolver {
    private final static JSObjectMap<PlatformObject, JSString> ENUM_VALUES = JSObjects.create();

    public static JSString getValue(EnumeratedString enumeratedString) {
        JSString value = ENUM_VALUES.get(Platform.getPlatformObject(enumeratedString));
        if (!JSObjects.isUndefined(value)) {
            return value;
        }

        value = JSString.valueOf(enumeratedString.name()).replace(JSString.valueOf("_"), JSString.valueOf("-")).toLowerCase();
        ENUM_VALUES.set(Platform.getPlatformObject(enumeratedString), value);

        return value;
    }
}
