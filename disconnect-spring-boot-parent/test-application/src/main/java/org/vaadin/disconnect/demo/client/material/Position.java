package org.vaadin.disconnect.demo.client.material;

/**
 * Created by Artem Godin on 8/26/2019.
 */
public enum Position {
    ABSOLUTE("absolute"),
    FIXED("fixed"),
    RELATIVE("relative"),
    STATIC("static"),
    STICKY("sticky");

    private final String value;

    Position(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
