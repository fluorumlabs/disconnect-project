package com.github.fluorumlabs.disconnect.vaadin.charts;

import js.lang.Any;
import js.lang.JsObject;
import js.lang.Unknown;
import js.util.collections.Array;

import java.util.Map;

/**
 * Created by Artem Godin on 7/8/2020.
 */
public interface Point extends Unknown {
    static <Y extends Number> Point1D of(Y y) {
        return Unknown.of(y.doubleValue()).cast();
    }

    static <X extends Number, Y extends Number> Point2D of(X x, Y y) {
        Array<Unknown> point = Array.create(2).cast();
        point.set(0, Unknown.of(x.doubleValue()));
        point.set(1, Unknown.of(y.doubleValue()));
        return point.cast();
    }

    static <Y extends Number> NamedPoint of(String x, Y y) {
        JsObject point = Any.empty();
        point.set("name", x);
        point.set("y", y.doubleValue());
        return point.cast();
    }

    static <Y extends Number> NamedPoint of(Map.Entry<String, Y> entry) {
        return of(entry.getKey(), entry.getValue());
    }
}
