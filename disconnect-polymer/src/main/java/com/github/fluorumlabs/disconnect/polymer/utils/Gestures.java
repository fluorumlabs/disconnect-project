package com.github.fluorumlabs.disconnect.polymer.utils;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.polymer.Polymer;
import com.github.fluorumlabs.disconnect.polymer.types.GestureRecognizer;
import js.lang.Any;
import js.web.dom.Element;
import js.web.dom.Event;
import js.web.dom.EventListener;
import js.web.dom.EventTarget;
import org.teavm.jso.JSBody;

/**
 * The interface Gestures.
 */
@NpmPackage(
		name = "@polymer/polymer",
		version = Polymer.VERSION
)
@Import(
		symbols = {"prevent", "resetMouseCanceller", "deepTargetFind", "removeListener", "addListener", "register",
				"setTouchAction"},
		module = "@polymer/polymer/lib/utils/gestures.js"
)
public interface Gestures extends Any {
	/**
	 * Finds the element rendered on the screen at the provided coordinates.
	 * <p>
	 * Similar to <code>document.elementFromPoint</code>, but pierces through shadow roots.
	 *
	 * @param x Horizontal pixel coordinate
	 * @param y Vertical pixel coordinate
	 *
	 * @return Returns the deepest shadowRoot inclusive element found at the screen position given.
	 */
	@JSBody(
			params = {"x", "y"},
			script = "return deepTargetFind(x, y)"
	)
	static Element deepTargetFind(double x, double y) {
		throw new UnsupportedOperationException("Available only in JavaScript");
	}

	/**
	 * Adds an event listener to a node for the given gesture type.
	 *
	 * @param <E>     the type parameter
	 * @param node    Node to add listener on
	 * @param evType  Gesture type: <code>down</code>, <code>up</code>, <code>track</code>, or <code>tap</code>
	 * @param handler Event listener function to call
	 *
	 * @return Returns true if a gesture event listener was added.
	 */
	@JSBody(
			params = {"node", "evType", "handler"},
			script = "return addListener(node, evType, handler)"
	)
	static <E extends Event> boolean addListener(EventTarget node, String evType, EventListener<E> handler) {
		throw new UnsupportedOperationException("Available only in JavaScript");
	}

	/**
	 * Removes an event listener from a node for the given gesture type.
	 *
	 * @param node    Node to remove listener from
	 * @param evType  Gesture type: <code>down</code>, <code>up</code>, <code>track</code>, or <code>tap</code>
	 * @param handler Event listener function previously passed to                <code>addListener</code>.
	 *
	 * @return Returns true if a gesture event listener was removed.
	 */
	@JSBody(
			params = {"node", "evType", "handler"},
			script = "return removeListener(node, evType, handler)"
	)
	static boolean removeListener(EventTarget node, String evType, EventListener<?> handler) {
		throw new UnsupportedOperationException("Available only in JavaScript");
	}

	/**
	 * Registers a new gesture event recognizer for adding new custom gesture event types.
	 *
	 * @param recog Gesture recognizer descriptor
	 */
	@JSBody(params = "recog", script = "register(recog)")
	static void register(GestureRecognizer recog) {
		throw new UnsupportedOperationException("Available only in JavaScript");
	}

	/**
	 * Sets scrolling direction on node.
	 * <p>
	 * This value is checked on first move, thus it should be called prior to adding event listeners.
	 *
	 * @param node  Node to set touch action setting on
	 * @param value Touch action value
	 */
	@JSBody(
			params = {"node", "value"},
			script = "setTouchAction(node, value)"
	)
	static void setTouchAction(EventTarget node, String value) {
		throw new UnsupportedOperationException("Available only in JavaScript");
	}

	/**
	 * Prevents the dispatch and default action of the given event name.
	 *
	 * @param evName Event name.
	 */
	@JSBody(params = "evName", script = "prevent(evName)")
	static void prevent(String evName) {
		throw new UnsupportedOperationException("Available only in JavaScript");
	}

	/**
	 * Reset the 2500ms timeout on processing mouse input after detecting touch input.
	 * <p>
	 * Touch inputs create synthesized mouse inputs anywhere from 0 to 2000ms after the touch. This method should only
	 * be called during testing with simulated touch inputs. Calling this method in production may cause duplicate taps
	 * or other Gestures.
	 */
	@JSBody(
			script = "resetMouseCanceller()"
	)
	static void resetMouseCanceller() {
		throw new UnsupportedOperationException("Available only in JavaScript");
	}
}
