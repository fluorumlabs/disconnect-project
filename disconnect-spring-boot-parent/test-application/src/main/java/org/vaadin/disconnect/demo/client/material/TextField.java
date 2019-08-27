package org.vaadin.disconnect.demo.client.material;

import org.teavm.jso.JSIndexer;
import org.teavm.jso.JSObject;
import org.teavm.jso.core.JSObjects;
import org.vaadin.disconnect.core.client.ElementPrototype;
import org.vaadin.disconnect.core.client.Elements;
import org.vaadin.disconnect.demo.client.material.internals.CoreImports;

/**
 * Created by Artem Godin on 8/26/2019.
 */
public interface TextField extends ElementPrototype<TextField> {
    static TextField create() {
        return Elements.create(CoreImports.imports().get("TextField"));
    }

    default TextField label(String label) {
        return with("label", label);
    }

    default TextField type(String type) {
        return with("type", type);
    }

    default TextField value(String type) {
        return with("value", type);
    }

    default TextField fullWidth() {
        return with("fullWidth", true);
    }

    default TextField variant(Variant variant) {
        return with("variant", variant.getValue());
    }

    default TextField margin(Margin margin) {
        return with("margin", margin.getValue());
    }

    default TextField nativeSelect() {
        with("select", true);
        SelectProps selectProps = JSObjects.create();
        selectProps.set("native",true);
        return with("SelectProps", selectProps);
    }

    enum Margin {
        NONE("none"),
        NORMAL("normal"),
        DENSE("dense");

        private final String value;

        Margin(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    enum Variant {
        STANDARD("standard"),
        OUTLINED("outlined"),
        FILLED("filled");
        private final String value;

        Variant(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    interface SelectProps extends JSObject {
        @JSIndexer
        void set(String key, String value);

        @JSIndexer
        void set(String key, boolean value);
    }
}
