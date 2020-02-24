package com.github.fluorumlabs.disconnect.polymer.types;

import js.lang.Any;
import js.util.function.JsRunnable;
import js.web.dom.EventListener;
import js.web.dom.MouseEvent;
import js.web.touchevents.TouchEvent;
import org.teavm.jso.JSProperty;

/**
 * Created by Artem Godin on 2/3/2020.
 */
public interface GestureRecognizer extends Any {
	/**
	 * Gets name.
	 *
	 * @return the name
	 */
	@JSProperty
	String getName();

	/**
	 * Sets name.
	 *
	 * @param name the name
	 */
	@JSProperty
	void setName(String name);

	/**
	 * Get deps string [ ].
	 *
	 * @return the string [ ]
	 */
	@JSProperty
	String[] getDeps();

	/**
	 * Sets deps.
	 *
	 * @param deps the deps
	 */
	@JSProperty
	void setDeps(String... deps);

	/**
	 * Gets reset.
	 *
	 * @return the reset
	 */
	@JSProperty
	JsRunnable getReset();

	/**
	 * Sets reset.
	 *
	 * @param reset the reset
	 */
	@JSProperty
	void setReset(JsRunnable reset);

	/**
	 * Gets mousedown.
	 *
	 * @return the mousedown
	 */
	@JSProperty
	EventListener<MouseEvent> getMousedown();

	/**
	 * Sets mousedown.
	 *
	 * @param mousedown the mousedown
	 */
	@JSProperty
	void setMousedown(EventListener<MouseEvent> mousedown);

	/**
	 * Gets mousemove.
	 *
	 * @return the mousemove
	 */
	@JSProperty
	EventListener<MouseEvent> getMousemove();

	/**
	 * Sets mousemove.
	 *
	 * @param mousemove the mousemove
	 */
	@JSProperty
	void setMousemove(EventListener<MouseEvent> mousemove);

	/**
	 * Gets mouseup.
	 *
	 * @return the mouseup
	 */
	@JSProperty
	EventListener<MouseEvent> getMouseup();

	/**
	 * Sets mouseup.
	 *
	 * @param mouseup the mouseup
	 */
	@JSProperty
	void setMouseup(EventListener<MouseEvent> mouseup);

	/**
	 * Gets touchstart.
	 *
	 * @return the touchstart
	 */
	@JSProperty
	EventListener<TouchEvent> getTouchstart();

	/**
	 * Sets touchstart.
	 *
	 * @param touchstart the touchstart
	 */
	@JSProperty
	void setTouchstart(EventListener<TouchEvent> touchstart);

	/**
	 * Gets touchmove.
	 *
	 * @return the touchmove
	 */
	@JSProperty
	EventListener<TouchEvent> getTouchmove();

	/**
	 * Sets touchmove.
	 *
	 * @param touchmove the touchmove
	 */
	@JSProperty
	void setTouchmove(EventListener<TouchEvent> touchmove);

	/**
	 * Gets touchend.
	 *
	 * @return the touchend
	 */
	@JSProperty
	EventListener<TouchEvent> getTouchend();

	/**
	 * Sets touchend.
	 *
	 * @param touchend the touchend
	 */
	@JSProperty
	void setTouchend(EventListener<TouchEvent> touchend);

	/**
	 * Gets click.
	 *
	 * @return the click
	 */
	@JSProperty
	EventListener<MouseEvent> getClick();

	/**
	 * Sets click.
	 *
	 * @param click the click
	 */
	@JSProperty
	void setClick(EventListener<MouseEvent> click);

	/**
	 * Gets info.
	 *
	 * @return the info
	 */
	@JSProperty
	GestureInfo getInfo();

	/**
	 * Sets info.
	 *
	 * @param info the info
	 */
	@JSProperty
	void setInfo(GestureInfo info);

	/**
	 * Get emits string [ ].
	 *
	 * @return the string [ ]
	 */
	@JSProperty
	String[] getEmits();

	/**
	 * Sets emits.
	 *
	 * @param emits the emits
	 */
	@JSProperty
	void setEmits(String... emits);
}
