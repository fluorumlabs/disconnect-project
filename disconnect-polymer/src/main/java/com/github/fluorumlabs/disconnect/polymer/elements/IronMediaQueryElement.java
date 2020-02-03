package com.github.fluorumlabs.disconnect.polymer.elements;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.polymer.Polymer;
import js.web.cssom.MediaQueryList;
import js.web.dom.HTMLElement;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * `iron-media-query` can be used to data bind to a CSS media query.
 * The `query` property is a bare CSS media query.
 * The `query-matches` property is a boolean representing whether the page matches
 * that media query.
 * <p>
 * Example:
 * <p>
 * ```html
 * <iron-media-query query="(min-width: 600px)" query-matches="{{queryMatches}}">
 * </iron-media-query>
 * ```
 */
@Import(
        symbols = "IronMediaQuery",
        module = "@polymer/iron-media-query/iron-media-query.js"
)
public interface IronMediaQueryElement extends Polymer, HTMLElement {
    /**
     * The Boolean return value of the media query.
     */
    @JSProperty
    boolean isQueryMatches();

    /**
     * The CSS media query to evaluate.
     */
    @Nullable
    @JSProperty
    String getQuery();

    /**
     * The CSS media query to evaluate.
     */
    @JSProperty
    void setQuery(String query);

    /**
     * If true, the query attribute is assumed to be a complete media query
     * string rather than a single media feature.
     */
    @JSProperty
    boolean isFull();

    /**
     * If true, the query attribute is assumed to be a complete media query
     * string rather than a single media feature.
     */
    @JSProperty
    void setFull(boolean full);

    void queryChanged();

    /**
     * @param mq
     */
    void queryHandler(MediaQueryList mq);
}
