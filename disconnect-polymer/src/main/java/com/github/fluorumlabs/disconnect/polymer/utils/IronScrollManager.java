package com.github.fluorumlabs.disconnect.polymer.utils;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.polymer.Polymer;
import js.lang.Any;
import js.web.dom.HTMLElement;
import org.teavm.jso.JSBody;

/**
 * The interface Iron scroll manager.
 */
@NpmPackage(
		name = "@polymer/polymer",
		version = Polymer.VERSION
)
@Import(
		symbols = {"pushScrollLock", "removeScrollLock", "elementIsScrollLocked"},
		module = "@polymer/iron-overlay-behavior/iron-scroll-manager.js"
)
public interface IronScrollManager extends Any {
	/**
	 * Returns true if the provided element is &quot;scroll locked&quot;, which is to say that it cannot be scrolled
	 * via
	 * pointer or keyboard interactions.
	 *
	 * @param element An HTML element instance which may or may not be scroll locked.
	 *
	 * @return the boolean
	 */
	@JSBody(params = "element", script = "return elementIsScrollLocked(element)")
	static boolean elementIsScrollLocked(HTMLElement element) {
		throw new UnsupportedOperationException("Available only in JavaScript");
	}

	/**
	 * Push an element onto the current scroll lock stack. The most recently pushed element and its children will be
	 * considered scrollable. All other elements will not be scrollable.
	 * <p>
	 * Scroll locking is implemented as a stack so that cases such as dropdowns within dropdowns are handled well.
	 *
	 * @param element The element that should lock scroll.
	 */
	@JSBody(params = "element", script = "pushScrollLock(element)")
	static void pushScrollLock(HTMLElement element) {
		throw new UnsupportedOperationException("Available only in JavaScript");
	}

	/**
	 * Remove an element from the scroll lock stack. The element being removed does not need to be the most recently
	 * pushed element. However, the scroll lock constraints only change when the most recently pushed element is
	 * removed.
	 *
	 * @param element The element to remove from the scroll lock stack.
	 */
	@JSBody(params = "element", script = "removeScrollLock(element)")
	static void removeScrollLock(HTMLElement element) {
		throw new UnsupportedOperationException("Available only in JavaScript");
	}
}
