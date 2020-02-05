package com.github.fluorumlabs.disconnect.polymer.types;

import js.lang.Any;
import js.util.function.JsRunnable;
import js.web.dom.EventListener;
import js.web.dom.MouseEvent;
import js.web.touchevents.TouchEvent;
import org.teavm.jso.JSByRef;
import org.teavm.jso.JSProperty;

/**
 * Created by Artem Godin on 2/3/2020.
 */
public interface GestureRecognizer extends Any {
	@JSProperty
	String getName();

	@JSProperty
	void setName(String name);

	@JSProperty
	String[] getDeps();

	@JSProperty
	void setDeps(@JSByRef String... deps);

	@JSProperty
	JsRunnable getReset();

	@JSProperty
	void setReset(JsRunnable reset);

	@JSProperty
	EventListener<MouseEvent> getMousedown();

	@JSProperty
	void setMousedown(EventListener<MouseEvent> mousedown);

	@JSProperty
	EventListener<MouseEvent> getMousemove();

	@JSProperty
	void setMousemove(EventListener<MouseEvent> mousemove);

	@JSProperty
	EventListener<MouseEvent> getMouseup();

	@JSProperty
	void setMouseup(EventListener<MouseEvent> mouseup);

	@JSProperty
	EventListener<TouchEvent> getTouchstart();

	@JSProperty
	void setTouchstart(EventListener<TouchEvent> touchstart);

	@JSProperty
	EventListener<TouchEvent> getTouchmove();

	@JSProperty
	void setTouchmove(EventListener<TouchEvent> touchmove);

	@JSProperty
	EventListener<TouchEvent> getTouchend();

	@JSProperty
	void setTouchend(EventListener<TouchEvent> touchend);

	@JSProperty
	EventListener<MouseEvent> getClick();

	@JSProperty
	void setClick(EventListener<MouseEvent> click);

	@JSProperty
	GestureInfo getInfo();

	@JSProperty
	void setInfo(GestureInfo info);

	@JSProperty
	String[] getEmits();

	@JSProperty
	void setEmits(@JSByRef String... emits);
}
