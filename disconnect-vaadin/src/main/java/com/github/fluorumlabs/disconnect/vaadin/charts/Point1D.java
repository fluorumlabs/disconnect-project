package com.github.fluorumlabs.disconnect.vaadin.charts;

import org.teavm.jso.JSBody;

/**
 * Created by Artem Godin on 7/8/2020.
 */
public interface Point1D extends Point {
    @JSBody(script = "return this")
    double getY();
}
