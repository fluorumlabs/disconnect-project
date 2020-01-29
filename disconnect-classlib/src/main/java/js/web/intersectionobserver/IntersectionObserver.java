package js.web.intersectionobserver;

import js.lang.Any;
import js.lang.JsNumber;
import js.util.collections.Array;
import js.util.collections.ReadonlyArray;
import js.web.dom.Element;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * provides a way to asynchronously observe changes in the intersection of a target element with an ancestor element or with a top-level document's viewport.
 */
public interface IntersectionObserver extends Any {
    @JSBody(script = "return IntersectionObserver.prototype")
    static IntersectionObserver prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = "callback", script = "return new IntersectionObserver(callback)")
    static IntersectionObserver create(IntersectionObserverCallback callback) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = {"callback", "options"}, script = "return new IntersectionObserver(callback, options)")
    static IntersectionObserver create(IntersectionObserverCallback callback, IntersectionObserverInit options) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    @Nullable
    Element getRoot();

    @JSProperty
    String getRootMargin();

    @JSProperty
    ReadonlyArray<JsNumber> getThresholds();

    void disconnect();

    void observe(Element target);

    Array<IntersectionObserverEntry> takeRecords();

    void unobserve(Element target);

}
