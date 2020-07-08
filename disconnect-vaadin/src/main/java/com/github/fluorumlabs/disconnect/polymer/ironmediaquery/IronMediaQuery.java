package com.github.fluorumlabs.disconnect.polymer.ironmediaquery;

import com.github.fluorumlabs.disconnect.core.annotations.CustomElement;
import com.github.fluorumlabs.disconnect.core.components.Component;
import com.github.fluorumlabs.disconnect.core.components.HtmlComponent;
import com.github.fluorumlabs.disconnect.core.observables.Observable;
import js.lang.external.polymer.ironmediaquery.IronMediaQueryElement;

import javax.annotation.Nullable;

/**
 * <code>iron-media-query</code> can be used to data bind to a CSS media query. The <code>query</code> property is a bare CSS media query. The <code>query-matches</code> property is a boolean representing whether the page matches that media query.
 *
 * Example:
 *
 * <pre><code class="language-html">&lt;iron-media-query query="(min-width: 600px)" query-matches="{{queryMatches}}"&gt;
 * &lt;/iron-media-query&gt;
 * </code></pre>
 */
@CustomElement(tagName = "iron-media-query", external = true)
public class IronMediaQuery extends HtmlComponent<IronMediaQueryElement> {

    public IronMediaQuery() {
    }

    public IronMediaQuery(String textContent) {
        super(textContent);
    }

    public IronMediaQuery(Component<?>... components) {
        super(components);
    }

    // !wca! queryChanged: (): void

    // !wca! queryHandler: (mq: any): void

    // !wca! get full: boolean | null | undefined
    /**
     * If true, the query attribute is assumed to be a complete media query
     * string rather than a single media feature.
     */
    public boolean isFull() {
        return getElement().isFull();
    }

    // !wca! set full: boolean | null | undefined
    /**
     * If true, the query attribute is assumed to be a complete media query
     * string rather than a single media feature.
     */
    public void setFull(boolean value) {
        getElement().setFull(value);
    }

    // !wca! observe full: boolean | null | undefined

    // !wca! get query: string | null | undefined
    /**
     * The CSS media query to evaluate.
     */
    @Nullable
    public String getQuery() {
        return getElement().getQuery();
    }

    // !wca! set query: string | null | undefined
    /**
     * The CSS media query to evaluate.
     */
    public void setQuery(@Nullable String value) {
        getElement().setQuery(value);
    }

    // !wca! observe query: string | null | undefined

    // !wca! get queryMatches: boolean | null | undefined
    /**
     * The Boolean return value of the media query.
     */
    public boolean isQueryMatches() {
        return getElement().isQueryMatches();
    }

    // !wca! observe queryMatches: boolean | null | undefined
    /**
     * The Boolean return value of the media query.
     */
    public Observable<Boolean> queryMatches() {
        return createObservable(this::isQueryMatches, "query-matches-changed");
    }
}
