package com.github.fluorumlabs.disconnect.polymer.mixins;

import com.github.fluorumlabs.disconnect.polymer.elements.mixins.DirMixin;
import com.github.fluorumlabs.disconnect.core.components.HasElement;

/**
 * Element class mixin that allows elements to use the <code>:dir</code> CSS Selector to have text direction specific
 * styling.
 * <p>
 * With this mixin, any stylesheet provided in the template will transform
 * <code>:dir</code> into <code>:host([dir])</code> and sync direction with the page via the
 * element's <code>dir</code> attribute.
 * <p>
 * Elements can opt out of the global page text direction by setting the <code>dir</code> attribute directly in
 * <code>ready()</code> or in HTML.
 * <p>
 * Caveats:
 *
 * <ul>
 * <li>Applications must set <code>&lt;html dir=&quot;ltr&quot;&gt;</code> or <code>&lt;html dir=&quot;rtl&quot;&gt;
 * </code> to sync
 * direction</li>
 * <li>Automatic left-to-right or right-to-left styling is sync'd with the
 * <code>&lt;html&gt;</code> element only.</li>
 * <li>Changing <code>dir</code> at runtime is supported.</li>
 * <li>Opting out of the global direction styling is permanent</li>
 * </ul>
 *
 * @param <E> the type parameter
 * @param <T> the type parameter
 */
public interface HasDirMixin<E extends DirMixin, T extends HasElement<E>> extends HasPropertyAccessors<E, T> {
}
