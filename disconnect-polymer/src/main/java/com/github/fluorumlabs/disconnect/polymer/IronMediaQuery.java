package com.github.fluorumlabs.disconnect.polymer;

import com.github.fluorumlabs.disconnect.core.annotations.WebComponent;
import com.github.fluorumlabs.disconnect.polymer.elements.IronMediaQueryElement;
import com.github.fluorumlabs.disconnect.zero.component.AbstractComponent;
import com.github.fluorumlabs.disconnect.zero.observable.ObservableEvent;
import js.web.cssom.MediaQueryList;
import js.web.dom.Event;

import javax.annotation.Nullable;

/**
 * <code>iron-media-query</code> can be used to data bind to a CSS media query.
 * The <code>query</code> property is a bare CSS media query. The <code>query-matches</code> property is a boolean
 * representing whether the page matches that media query.
 * <p>
 * Example:
 *
 * <pre><code class="language-html">&lt;iron-media-query query=&quot;(min-width: 600px)&quot; query-matches=&quot;{{
 * queryMatches}}&quot;&gt;
 * &lt;/iron-media-query&gt;
 * </code></pre>
 */
@WebComponent
public class IronMediaQuery
		extends AbstractComponent<IronMediaQueryElement> {
	/**
	 * Instantiates a new Iron media query.
	 */
	public IronMediaQuery() {
		super(IronMediaQueryElement.TAGNAME());
	}

	/**
	 * The Boolean return value of the media query.
	 *
	 * @return the boolean
	 */
	public boolean queryMatches() {
		return getNode().isQueryMatches();
	}

	/**
	 * The CSS media query to evaluate.
	 *
	 * @return the string
	 */
	@Nullable
	public String query() {
		return getNode().getQuery();
	}

	/**
	 * The CSS media query to evaluate.
	 *
	 * @param query the query
	 *
	 * @return the iron media query
	 */
	public IronMediaQuery query(String query) {
		getNode().setQuery(query);
		return this;
	}

	/**
	 * If true, the query attribute is assumed to be a complete media query string rather than a single media feature.
	 *
	 * @return the boolean
	 */
	public boolean full() {
		return getNode().isFull();
	}

	/**
	 * If true, the query attribute is assumed to be a complete media query string rather than a single media feature.
	 *
	 * @param full the full
	 *
	 * @return the iron media query
	 */
	public IronMediaQuery full(boolean full) {
		getNode().setFull(full);
		return this;
	}

	/**
	 * Query changed.
	 */
	public void queryChanged() {
		getNode().queryChanged();
	}

	/**
	 * Query handler.
	 *
	 * @param mq the mq
	 */
	public void queryHandler(MediaQueryList mq) {
		getNode().queryHandler(mq);
	}

	/**
	 * Fired when the <code>queryMatches</code> property changes.
	 *
	 * @return the observable event
	 */
	public ObservableEvent<Event> queryMatchesChangedEvent() {
		return createEvent("query-matches-changed");
	}
}
