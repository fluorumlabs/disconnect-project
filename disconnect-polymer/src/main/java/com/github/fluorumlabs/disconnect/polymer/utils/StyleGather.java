package com.github.fluorumlabs.disconnect.polymer.utils;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.polymer.Polymer;
import js.lang.Any;
import js.util.collections.Array;
import js.web.dom.HTMLStyleElement;
import js.web.webcomponents.HTMLTemplateElement;
import org.teavm.jso.JSBody;

@NpmPackage(
		name = "@polymer/polymer",
		version = Polymer.VERSION
)
@Import(
		symbols = {"stylesFromModule", "cssFromModules", "cssFromModule", "cssFromTemplate", "cssFromModuleImports",
				"stylesFromModuleImports", "stylesFromModules", "stylesFromTemplate"},
		module = "@polymer/polymer/lib/utils/style-gather.js"
)
public interface StyleGather extends Any {
	/**
	 * Returns a list of <style> elements in a space-separated list of <code>dom-module</code>s.
	 *
	 * @param moduleIds List of dom-module id's within which to
	 *                  search for css.
	 *
	 * @return Array of contained <style> elements
	 */
	@JSBody(params = "moduleIds", script = "return stylesFromModules(moduleIds)")
	static Array<HTMLStyleElement> stylesFromModules(String moduleIds) {
		throw new UnsupportedOperationException("Available only in JavaScript");
	}

	/**
	 * Returns a list of <style> elements in a given <code>dom-module</code>.
	 * Styles in a <code>dom-module</code> can come either from <code>&lt;style&gt;</code>s within the
	 * first <code>&lt;template&gt;</code>, or else from one or more
	 * <code>&lt;link rel=&quot;import&quot; type=&quot;css&quot;&gt;</code> links outside the template.
	 *
	 * @param moduleId dom-module id to gather styles from
	 *
	 * @return Array of contained styles.
	 */
	@JSBody(params = "moduleId", script = "return stylesFromModule(moduleId)")
	static Array<HTMLStyleElement> stylesFromModule(String moduleId) {
		throw new UnsupportedOperationException("Available only in JavaScript");
	}

	/**
	 * Returns the <code>&lt;style&gt;</code> elements within a given template.
	 *
	 * @param template Template to gather styles from
	 * @param baseURI  baseURI for style content
	 *
	 * @return Array of styles
	 */
	@JSBody(
			params = {"template", "baseURI"},
			script = "return stylesFromTemplate(template, baseURI)"
	)
	static Array<HTMLStyleElement> stylesFromTemplate(HTMLTemplateElement template, String baseURI) {
		throw new UnsupportedOperationException("Available only in JavaScript");
	}

	/**
	 * Returns a list of <style> elements  from stylesheets loaded via <code>&lt;link rel=&quot;import&quot;
	 * type=&quot;css&quot;&gt;</code> links within the specified <code>dom-module</code>.
	 *
	 * @param moduleId Id of <code>dom-module</code> to gather CSS from
	 *
	 * @return Array of contained styles.
	 */
	@JSBody(params = "moduleId", script = "return stylesFromModuleImports(moduleId)")
	static Array<HTMLStyleElement> stylesFromModuleImports(String moduleId) {
		throw new UnsupportedOperationException("Available only in JavaScript");
	}

	/**
	 * Returns CSS text of styles in a space-separated list of <code>dom-module</code>s.
	 * Note: This method is deprecated, use <code>stylesFromModules</code> instead.
	 *
	 * @param moduleIds List of dom-module id's within which to
	 *                  search for css.
	 *
	 * @return Concatenated CSS content from specified <code>dom-module</code>s
	 */
	@JSBody(params = "moduleIds", script = "return cssFromModules(moduleIds)")
	static String cssFromModules(String moduleIds) {
		throw new UnsupportedOperationException("Available only in JavaScript");
	}

	/**
	 * Returns CSS text of styles in a given <code>dom-module</code>.  CSS in a <code>dom-module</code>
	 * can come either from <code>&lt;style&gt;</code>s within the first <code>&lt;template&gt;</code>, or else
	 * from one or more <code>&lt;link rel=&quot;import&quot; type=&quot;css&quot;&gt;</code> links outside the
	 * template.
	 * <p>
	 * Any <code>&lt;styles&gt;</code> processed are removed from their original location.
	 * Note: This method is deprecated, use <code>styleFromModule</code> instead.
	 *
	 * @param moduleId dom-module id to gather styles from
	 *
	 * @return Concatenated CSS content from specified <code>dom-module</code>
	 */
	@JSBody(params = "moduleId", script = "return cssFromModule(moduleId)")
	static String cssFromModule(String moduleId) {
		throw new UnsupportedOperationException("Available only in JavaScript");
	}

	/**
	 * Returns CSS text of <code>&lt;styles&gt;</code> within a given template.
	 * <p>
	 * Any <code>&lt;styles&gt;</code> processed are removed from their original location.
	 * Note: This method is deprecated, use <code>styleFromTemplate</code> instead.
	 *
	 * @param template Template to gather styles from
	 * @param baseURI  Base URI to resolve the URL against
	 *
	 * @return Concatenated CSS content from specified template
	 */
	@JSBody(
			params = {"template", "baseURI"},
			script = "return cssFromTemplate(template, baseURI)"
	)
	static String cssFromTemplate(HTMLTemplateElement template, String baseURI) {
		throw new UnsupportedOperationException("Available only in JavaScript");
	}

	/**
	 * Returns CSS text from stylesheets loaded via <code>&lt;link rel=&quot;import&quot; type=&quot;css&quot;&gt;
	 * </code>
	 * links within the specified <code>dom-module</code>.
	 * <p>
	 * Note: This method is deprecated, use <code>stylesFromModuleImports</code> instead.
	 *
	 * @param moduleId Id of <code>dom-module</code> to gather CSS from
	 *
	 * @return Concatenated CSS content from links in specified <code>dom-module</code>
	 */
	@JSBody(params = "moduleId", script = "return cssFromModuleImports(moduleId)")
	static String cssFromModuleImports(String moduleId) {
		throw new UnsupportedOperationException("Available only in JavaScript");
	}
}
