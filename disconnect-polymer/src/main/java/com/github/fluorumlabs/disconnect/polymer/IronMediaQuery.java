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
 * The <code>query</code> property is a bare CSS media query.
 * The <code>query-matches</code> property is a boolean representing whether the page matches
 * that media query.
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
	public IronMediaQuery() {
		super(IronMediaQueryElement.TAGNAME());
	}

	/**
	 * The Boolean return value of the media query.
	 */
	public boolean queryMatches() {
		return getNode().isQueryMatches();
	}

	/**
	 * The CSS media query to evaluate.
	 */
	@Nullable
	public String query() {
		return getNode().getQuery();
	}

	/**
	 * The CSS media query to evaluate.
	 */
	public IronMediaQuery query(String query) {
		getNode().setQuery(query);
		return this;
	}

	/**
	 * If true, the query attribute is assumed to be a complete media query
	 * string rather than a single media feature.
	 */
	public boolean full() {
		return getNode().isFull();
	}

	/**
	 * If true, the query attribute is assumed to be a complete media query
	 * string rather than a single media feature.
	 */
	public IronMediaQuery full(boolean full) {
		getNode().setFull(full);
		return this;
	}

	public void queryChanged() {
		getNode().queryChanged();
	}

	/**
	 *
	 */
	public void queryHandler(MediaQueryList mq) {
		getNode().queryHandler(mq);
	}

	/**
	 * Fired when the <code>queryMatches</code> property changes.
	 */
	public ObservableEvent<Event> queryMatchesChangedEvent() {
		return createEvent("query-matches-changed");
	}
}
