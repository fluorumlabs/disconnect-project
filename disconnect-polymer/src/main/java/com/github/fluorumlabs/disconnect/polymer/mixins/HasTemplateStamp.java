package com.github.fluorumlabs.disconnect.polymer.mixins;

import com.github.fluorumlabs.disconnect.polymer.elements.mixins.TemplateStamp;
import com.github.fluorumlabs.disconnect.zero.component.HasElement;

/**
 * Element mixin that provides basic template parsing and stamping, including the following template-related features
 * for stamped templates:
 *
 * <ul>
 * <li>Declarative event listeners (<code>on-eventname=&quot;listener&quot;</code>)</li>
 * <li>Map of node id's to stamped node instances (<code>this.$.id</code>)</li>
 * <li>Nested template content caching/removal and re-installation (performance
 * optimization)</li>
 * </ul>
 *
 * @param <E> the type parameter
 * @param <T> the type parameter
 */
public interface HasTemplateStamp<E extends TemplateStamp, T extends HasElement<E>> extends HasElement<E> {
}
