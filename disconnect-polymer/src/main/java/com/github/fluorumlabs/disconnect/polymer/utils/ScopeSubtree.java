package com.github.fluorumlabs.disconnect.polymer.utils;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.polymer.Polymer;
import js.lang.Any;
import js.web.dom.Element;
import js.web.dom.MutationObserver;
import org.teavm.jso.JSBody;

@NpmPackage(
		name = "@polymer/polymer",
		version = Polymer.VERSION
)
@Import(symbols = "scopeSubtree", module = "@polymer/polymer/lib/utils/scope-subtree.js")
public interface ScopeSubtree extends Any {
	/**
	 * Ensure that elements in a ShadowDOM container are scoped correctly.
	 * This function is only needed when ShadyDOM is used and unpatched DOM APIs are used in third party code.
	 * This can happen in noPatch mode or when specialized APIs like ranges or tables are used to mutate DOM.
	 *
	 * @param container     Container element to scope
	 * @param shouldObserve if true, start a mutation observer for added nodes to the container
	 *
	 * @return Returns a new MutationObserver on `container` if `shouldObserve` is true.
	 */
	@JSBody(
			params = {"container", "shouldObserve"},
			script = "return scopeSubtree(container, shouldObserve)"
	)
	static MutationObserver scopeSubtree(Element container, boolean shouldObserve) {
		throw new UnsupportedOperationException("Available only in JavaScript");
	}
}
