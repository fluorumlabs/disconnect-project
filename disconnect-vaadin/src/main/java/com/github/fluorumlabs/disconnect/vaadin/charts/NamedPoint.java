package com.github.fluorumlabs.disconnect.vaadin.charts;

import org.teavm.jso.JSBody;

/**
 * Created by Artem Godin on 7/8/2020.
 */
public interface NamedPoint extends Point {
    @JSBody(script = "return this.name")
    String getName();

    @JSBody(script = "return this.y")
    double getY();

    @JSBody(params = "value", script = "var old = this.y; this.y = value; return old;")
    double setY(double value);

}
