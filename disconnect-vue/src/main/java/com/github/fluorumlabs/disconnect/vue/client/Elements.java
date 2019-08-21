package com.github.fluorumlabs.disconnect.vue.client;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSObject;

/**
 * Created by Artem Godin on 8/21/2019.
 */
public abstract class Elements implements JSObject {
    @JSBody(params = "tagName", script = "return [\n" +
            "    tagName,\n" +
            "    {\n" +
            "        class: {},\n" +
            "        style: {},\n" +
            "        attrs: {},\n" +
            "        props: {},\n" +
            "        domProps: {},\n" +
            "        on: {},\n" +
            "        nativeOn: {},\n" +
            "        directives: [],\n" +
            "        scopedSlots: {}\n" +
            "    },\n" +
            "    []\n" +
            "];")
    public static native <T extends ElementPrototype> T create(String tagName);

    @JSBody(params = "text", script = "return [\n" +
            "    '#text',\n" +
            "    {\n" +
            "        domProps: {textContent: text},\n" +
            "    },\n" +
            "    []\n" +
            "];")
    public static native ElementPrototype text(String text);
}
