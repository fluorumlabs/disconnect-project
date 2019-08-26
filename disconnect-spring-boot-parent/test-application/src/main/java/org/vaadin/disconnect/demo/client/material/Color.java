package org.vaadin.disconnect.demo.client.material;

/**
 * Created by Artem Godin on 8/26/2019.
 */
public enum Color {
    DEFAULT("default"),
    INHERIT("inherit"),
    PRIMARY("primary"),
    SECONDARY("secondary");

    private final String value;

    Color(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
