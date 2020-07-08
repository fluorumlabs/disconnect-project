package com.github.fluorumlabs.disconnect.vaadin.charts;

import org.teavm.jso.JSBody;

/**
 * Created by Artem Godin on 7/8/2020.
 */
public interface Point2D extends Point {
    @JSBody(script = "return this[0]")
    double getX();

    @JSBody(script = "return this[1]")
    double getY();

    @JSBody(params = "value", script = "var old = this[1]; this[1] = value; return old;")
    double setY(double value);

}
