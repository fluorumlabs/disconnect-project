package com.github.fluorumlabs.disconnect.polymer.elements.mixins;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.polymer.Polymer;
import js.web.dom.Element;

/**
 * Element mixin that provides basic template parsing and stamping, including
 * the following template-related features for stamped templates:
 *
 * <ul>
 * <li>Declarative event listeners (<code>on-eventname=&quot;listener&quot;</code>)</li>
 * <li>Map of node id's to stamped node instances (<code>this.$.id</code>)</li>
 * <li>Nested template content caching/removal and re-installation (performance
 * optimization)</li>
 * </ul>
 */
@NpmPackage(
		name = "@polymer/polymer",
		version = Polymer.VERSION
)
@Import(
		symbols = "TemplateStamp",
		module = "@polymer/polymer/lib/mixins/template-stamp.js"
)
public interface TemplateStamp extends Element {
}
