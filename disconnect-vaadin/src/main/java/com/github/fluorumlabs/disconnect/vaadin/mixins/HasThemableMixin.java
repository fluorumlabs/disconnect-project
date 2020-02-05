package com.github.fluorumlabs.disconnect.vaadin.mixins;

import com.github.fluorumlabs.disconnect.vaadin.elements.mixins.ThemableMixin;
import com.github.fluorumlabs.disconnect.zero.component.Component;

public interface HasThemableMixin<E extends ThemableMixin, T extends Component<E>> extends HasThemePropertyMixin<E, T> {
}
