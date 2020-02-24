package com.github.fluorumlabs.disconnect.polymer.utils;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.polymer.Polymer;
import js.lang.Any;
import org.teavm.jso.JSBody;

/**
 * The interface Resolve url.
 */
@NpmPackage(
		name = "@polymer/polymer",
		version = Polymer.VERSION
)
@Import(
		symbols = {"pathFromUrl", "resolveUrl", "resolveCss"},
		module = "@polymer/polymer/lib/utils/resolve-url.js"
)
public interface ResolveUrl extends Any {
	/**
	 * Resolves the given URL against the provided `baseUri'.
	 * <p>
	 * Note that this function performs no resolution for URLs that start with <code>/</code> (absolute URLs) or
	 * <code>#</code> (hash identifiers).  For general purpose URL resolution, use <code>window.URL</code>.
	 *
	 * @param url     Input URL to resolve
	 * @param baseURI Base URI to resolve the URL against
	 *
	 * @return resolved URL
	 */
	@JSBody(
			params = {"url", "baseURI"},
			script = "return resolveUrl(url, baseURI)"
	)
	static String resolveUrl(String url, String baseURI) {
		throw new UnsupportedOperationException("Available only in JavaScript");
	}

	/**
	 * Resolves any relative URL's in the given CSS text against the provided
	 * <code>ownerDocument</code>'s <code>baseURI</code>.
	 *
	 * @param cssText CSS text to process
	 * @param baseURI Base URI to resolve the URL against
	 *
	 * @return Processed CSS text with resolved URL's
	 */
	@JSBody(
			params = {"cssText", "baseURI"},
			script = "return resolveCss(cssText, baseURI)"
	)
	static String resolveCss(String cssText, String baseURI) {
		throw new UnsupportedOperationException("Available only in JavaScript");
	}

	/**
	 * Returns a path from a given <code>url</code>. The path includes the trailing
	 * <code>/</code> from the url.
	 *
	 * @param url Input URL to transform
	 *
	 * @return resolved path
	 */
	@JSBody(params = "url", script = "return pathFromUrl(url)")
	static String pathFromUrl(String url) {
		throw new UnsupportedOperationException("Available only in JavaScript");
	}
}
