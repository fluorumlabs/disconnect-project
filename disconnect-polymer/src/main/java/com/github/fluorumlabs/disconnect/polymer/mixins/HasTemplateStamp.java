package com.github.fluorumlabs.disconnect.polymer.mixins;

import com.github.fluorumlabs.disconnect.polymer.elements.mixins.TemplateStamp;
import com.github.fluorumlabs.disconnect.zero.component.Component;

/**
 * Element mixin that provides basic template parsing and stamping, including
 * the following template-related features for stamped templates:
 * <p>
 * - Declarative event listeners (`on-eventname="listener"`)
 * - Map of node id's to stamped node instances (`this.$.id`)
 * - Nested template content caching/removal and re-installation (performance
 * optimization)
 */
public interface HasTemplateStamp<E extends TemplateStamp, T extends Component<E>> extends Component<E> {
}
