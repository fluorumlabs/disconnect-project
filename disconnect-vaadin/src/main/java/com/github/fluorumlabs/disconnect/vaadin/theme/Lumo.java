package com.github.fluorumlabs.disconnect.vaadin.theme;

import com.github.fluorumlabs.disconnect.polymer.elements.CustomStyleElement;
import com.github.fluorumlabs.disconnect.vaadin.mixins.HasThemableMixin;
import com.github.fluorumlabs.disconnect.vaadin.types.ThemeVariant;
import com.github.fluorumlabs.disconnect.zero.component.HasElement;
import js.extras.JsEnum;
import js.web.dom.HTMLElement;

import static js.web.dom.Window.DOCUMENT;

/**
 * Created by Artem Godin on 2/7/2020.
 */
public final class Lumo {
	private static boolean INITIALIZED = false;

	private Lumo() {
	}

	private static void init() {
		if (INITIALIZED) {
			return;
		}

		DOCUMENT.getBody().appendChild(DOCUMENT.createElement(com.github.fluorumlabs.disconnect.vaadin.elements.Lumo.TAGNAME()));
		HTMLElement customStyle = DOCUMENT.createElement(CustomStyleElement.TAGNAME());
		customStyle.setInnerHTML("<style include=\"lumo-color lumo-typography\"></style>");
		DOCUMENT.getHead().appendChild(customStyle);
	}

	public static void useLightTheme(HasElement<? extends HTMLElement> component) {
		init();
		HasThemableMixin.toggleTheme(component.getNode(), Theme.DARK, false);
		HasThemableMixin.toggleTheme(component.getNode(), Theme.LIGHT, true);
	}

	public static void useDarkTheme(HasElement<? extends HTMLElement> component) {
		init();
		HasThemableMixin.toggleTheme(component.getNode(), Theme.DARK, true);
		HasThemableMixin.toggleTheme(component.getNode(), Theme.LIGHT, false);
	}

	public static void useLightTheme() {
		init();
		HasThemableMixin.toggleTheme(DOCUMENT.getFirstElementChild(), Theme.DARK, false);
		HasThemableMixin.toggleTheme(DOCUMENT.getFirstElementChild(), Theme.LIGHT, true);
	}

	public static void useDarkTheme() {
		init();
		HasThemableMixin.toggleTheme(DOCUMENT.getFirstElementChild(), Theme.DARK, true);
		HasThemableMixin.toggleTheme(DOCUMENT.getFirstElementChild(), Theme.LIGHT, false);
	}

	public static void useNormalFontSize() {
		init();
		HasThemableMixin.toggleTheme(DOCUMENT.getFirstElementChild(), Theme.FONT_SIZE_XS, false);
		HasThemableMixin.toggleTheme(DOCUMENT.getFirstElementChild(), Theme.FONT_SIZE_S, false);
	}

	public static void useSmallFontSize() {
		init();
		HasThemableMixin.toggleTheme(DOCUMENT.getFirstElementChild(), Theme.FONT_SIZE_XS, false);
		HasThemableMixin.toggleTheme(DOCUMENT.getFirstElementChild(), Theme.FONT_SIZE_S, true);
	}

	public static void useExtraSmallFontSize() {
		init();
		HasThemableMixin.toggleTheme(DOCUMENT.getFirstElementChild(), Theme.FONT_SIZE_XS, true);
		HasThemableMixin.toggleTheme(DOCUMENT.getFirstElementChild(), Theme.FONT_SIZE_S, false);
	}

	private abstract static class Theme extends ThemeVariant {
		public static final Theme DARK = JsEnum.of("dark");

		public static final Theme LIGHT = JsEnum.of("light");

		public static final Theme FONT_SIZE_XS = JsEnum.of("font-size-xs");

		public static final Theme FONT_SIZE_S = JsEnum.of("font-size-s");
	}

}
