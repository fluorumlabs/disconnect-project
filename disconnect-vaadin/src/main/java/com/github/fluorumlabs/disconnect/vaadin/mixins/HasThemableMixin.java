package com.github.fluorumlabs.disconnect.vaadin.mixins;

import com.github.fluorumlabs.disconnect.vaadin.elements.mixins.ThemableMixin;
import com.github.fluorumlabs.disconnect.vaadin.types.ThemeVariant;
import com.github.fluorumlabs.disconnect.zero.component.HasElement;
import js.lang.JsString;
import js.util.collections.Array;
import js.web.dom.Element;

public interface HasThemableMixin<VARIANT extends ThemeVariant, E extends ThemableMixin, T extends HasElement<E>>
		extends HasThemePropertyMixin<E, T> {
	default T theme(VARIANT theme) {
		return theme(theme, true);
	}

	default T theme(VARIANT... themes) {
		for (VARIANT theme : themes) {
			theme(theme, true);
		}
		return (T)this;
	}

	default T theme(VARIANT theme, boolean enable) {
		toggleTheme(getNode(), theme, enable);
		return (T) this;
	}

	default boolean hasTheme(VARIANT theme) {
		return hasTheme(getNode(), theme);
	}

	static void toggleTheme(Element element, ThemeVariant theme, boolean enable) {
		String currentTheme = element.getAttribute("theme");

		Array<JsString> tokens = currentTheme == null ? Array.create() : JsString.of(currentTheme).split(" ");
		int index = tokens.indexOf(theme.cast());
		if (index >= 0 != enable) {
			if (enable) {
				tokens.push(theme.cast());
			} else {
				tokens.splice(index, 1);
			}
		}

		element.setAttribute("theme", tokens.join(" "));
	}

	static boolean hasTheme(Element element, ThemeVariant theme) {
		String currentTheme = element.getAttribute("theme");
		if (currentTheme == null) {
			return false;
		}

		int index = JsString.of(currentTheme).split(" ").indexOf(theme.cast());

		return index >= 0;
	}

}
