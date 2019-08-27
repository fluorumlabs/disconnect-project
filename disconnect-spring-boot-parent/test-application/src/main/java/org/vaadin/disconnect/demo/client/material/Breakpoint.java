package org.vaadin.disconnect.demo.client.material;

/**
 * Created by Artem Godin on 8/27/2019.
 */
public enum Breakpoint {
    LG("lg"), MD("md"), SM("sm"), XL("xl"), XS("xs");

    private final String value;

    Breakpoint(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
