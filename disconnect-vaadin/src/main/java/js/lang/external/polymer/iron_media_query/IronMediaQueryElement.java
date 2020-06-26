package js.lang.external.polymer.iron_media_query;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import js.lang.external.polymer.legacy.LegacyElementMixin;
import js.web.dom.HTMLElement;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * <code>iron-media-query</code> can be used to data bind to a CSS media query.
 * The <code>query</code> property is a bare CSS media query.
 * The <code>query-matches</code> property is a boolean representing whether the page matches
 * that media query.
 *
 * Example:
 *
 * <pre><code class="language-html">&lt;iron-media-query query=&quot;(min-width: 600px)&quot; query-matches=&quot;{{queryMatches}}&quot;&gt;
 * &lt;/iron-media-query&gt;
 * </code></pre>
 */
@NpmPackage(
    name = "@polymer/iron-media-query",
    version = "^3.0.1"
)
@Import(
    module = "@polymer/iron-media-query/iron-media-query.js"
)
public interface IronMediaQueryElement extends HTMLElement, LegacyElementMixin {
  /**
   * The Boolean return value of the media query.
   *
   */
  @JSProperty("queryMatches")
  boolean getQueryMatches();

  /**
   * The CSS media query to evaluate.
   *
   */
  @JSProperty("query")
  @Nullable
  String getQuery();

  /**
   * The CSS media query to evaluate.
   *
   */
  @JSProperty("query")
  void setQuery(@Nullable String value);

  /**
   * If true, the query attribute is assumed to be a complete media query
   * string rather than a single media feature.
   *
   */
  @JSProperty("full")
  boolean getFull();

  /**
   * If true, the query attribute is assumed to be a complete media query
   * string rather than a single media feature.
   *
   */
  @JSProperty("full")
  void setFull(boolean value);

  void attached();

  void detached();

  void queryChanged();

  void queryHandler(Any mq);
}
