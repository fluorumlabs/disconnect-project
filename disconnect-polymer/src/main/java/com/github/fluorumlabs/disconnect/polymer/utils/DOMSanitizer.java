package com.github.fluorumlabs.disconnect.polymer.utils;

import js.extras.JsEnum;
import js.lang.Any;
import js.web.dom.Node;
import org.teavm.jso.JSFunctor;

/**
 * Created by Artem Godin on 2/3/2020.
 */
@JSFunctor
@FunctionalInterface
public interface DOMSanitizer extends Any {
    <T extends Any> T sanitize(T value, String name, Type type, Node node);

    abstract class Type extends JsEnum {
        public static final Type PROPERTY = JsEnum.of("property");

        public static final Type ATTRIBUTE = JsEnum.of("attribute");

        public static final Type TEXT = JsEnum.of("text");
    }
}
