package js.lang.external.polymer.ironmediaquery;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.web.dom.HTMLElement;
import org.teavm.jso.JSProperty;

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
@NpmPackage(name = "@polymer/iron-media-query", version = "^3.0.1")
@Import(module = "@polymer/iron-media-query/iron-media-query.js")
public interface IronMediaQueryElement extends HTMLElement {

    // !wca! queryChanged: (): void

    // !wca! queryHandler: (mq: any): void

    // !wca! get full: boolean | null | undefined
    /**
     * If true, the query attribute is assumed to be a complete media query
     * string rather than a single media feature.
     */
    @JSProperty("full")
    boolean isFull();

    // !wca! set full: boolean | null | undefined
    /**
     * If true, the query attribute is assumed to be a complete media query
     * string rather than a single media feature.
     */
    @JSProperty("full")
    void setFull(boolean value);

    // !wca! get query: string | null | undefined
    /**
     * The CSS media query to evaluate.
     */
    @JSProperty("query")
    @Nullable
    String getQuery();

    // !wca! set query: string | null | undefined
    /**
     * The CSS media query to evaluate.
     */
    @JSProperty("query")
    void setQuery(@Nullable String value);

    // !wca! get queryMatches: boolean | null | undefined
    /**
     * The Boolean return value of the media query.
     */
    @JSProperty("queryMatches")
    boolean isQueryMatches();
}
