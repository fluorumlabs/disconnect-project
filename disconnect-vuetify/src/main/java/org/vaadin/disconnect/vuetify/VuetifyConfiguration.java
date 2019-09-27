package org.vaadin.disconnect.vuetify;

import org.teavm.jso.JSObject;
import org.teavm.jso.core.JSObjects;

/**
 * Created by Artem Godin on 9/26/2019.
 */
public abstract class VuetifyConfiguration implements JSObject {
    public static VuetifyConfiguration create() {
        return JSObjects.create();
    }
}
