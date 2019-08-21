package com.github.fluorumlabs.disconnect.vue.client;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSObject;

/**
 * Created by Artem Godin on 8/14/2019.
 */
public abstract class VueComponentDefinition implements JSObject {
    @JSBody(params = {"_template", "_dataSupplier"},
            script = "return { template: _template, data: _dataSupplier }")
    public static native VueComponentDefinition create(String _template, VueComponentDataSupplier<JSObject> _dataSupplier);
}
