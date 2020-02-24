package com.github.fluorumlabs.disconnect.polymer.mixins;

import com.github.fluorumlabs.disconnect.polymer.elements.mixins.TemplatizeMixin;
import com.github.fluorumlabs.disconnect.zero.component.Component;

/**
 * The interface Has templatize mixin.
 *
 * @param <E> the type parameter
 * @param <T> the type parameter
 */
public interface HasTemplatizeMixin<E extends TemplatizeMixin, T extends Component<E>> extends Component<E> {
}
