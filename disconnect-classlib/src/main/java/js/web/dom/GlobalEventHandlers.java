package js.web.dom;


import js.web.cssom.AnimationEvent;
import js.web.cssom.TransitionEvent;
import js.web.htmldraganddrop.DragEvent;
import js.web.pointerevents.PointerEvent;
import js.web.touchevents.TouchEvent;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


/**
 * The interface Global event handlers.
 */
public interface GlobalEventHandlers extends EventTarget {
	/**
	 * Fires when the user aborts the download.
	 *
	 * @return the onabort
	 */
	@JSProperty
	@Nullable
	EventListener<UIEvent> getOnabort();

	/**
	 * Sets onabort.
	 *
	 * @param onabort the onabort
	 */
	@JSProperty
	void setOnabort(EventListener<UIEvent> onabort);

	/**
	 * Add abort event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addAbortEventListener(EventListener<UIEvent> listener, AddEventListenerOptions options) {
		addEventListener("abort", listener, options);
	}

	/**
	 * Add abort event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addAbortEventListener(EventListener<UIEvent> listener, boolean options) {
		addEventListener("abort", listener, options);
	}

	/**
	 * Add abort event listener.
	 *
	 * @param listener the listener
	 */
	default void addAbortEventListener(EventListener<UIEvent> listener) {
		addEventListener("abort", listener);
	}

	/**
	 * Remove abort event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removeAbortEventListener(EventListener<UIEvent> listener, EventListenerOptions options) {
		removeEventListener("abort", listener, options);
	}

	/**
	 * Remove abort event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removeAbortEventListener(EventListener<UIEvent> listener, boolean options) {
		removeEventListener("abort", listener, options);
	}

	/**
	 * Remove abort event listener.
	 *
	 * @param listener the listener
	 */
	default void removeAbortEventListener(EventListener<UIEvent> listener) {
		removeEventListener("abort", listener);
	}

	/**
	 * Gets onanimationcancel.
	 *
	 * @return the onanimationcancel
	 */
	@JSProperty
	@Nullable
	EventListener<AnimationEvent> getOnanimationcancel();

	/**
	 * Sets onanimationcancel.
	 *
	 * @param onanimationcancel the onanimationcancel
	 */
	@JSProperty
	void setOnanimationcancel(EventListener<AnimationEvent> onanimationcancel);

	/**
	 * Add animation cancel event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addAnimationCancelEventListener(EventListener<AnimationEvent> listener,
												 AddEventListenerOptions options) {
		addEventListener("animationcancel", listener, options);
	}

	/**
	 * Add animation cancel event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addAnimationCancelEventListener(EventListener<AnimationEvent> listener, boolean options) {
		addEventListener("animationcancel", listener, options);
	}

	/**
	 * Add animation cancel event listener.
	 *
	 * @param listener the listener
	 */
	default void addAnimationCancelEventListener(EventListener<AnimationEvent> listener) {
		addEventListener("animationcancel", listener);
	}

	/**
	 * Remove animation cancel event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removeAnimationCancelEventListener(EventListener<AnimationEvent> listener,
													EventListenerOptions options) {
		removeEventListener("animationcancel", listener, options);
	}

	/**
	 * Remove animation cancel event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removeAnimationCancelEventListener(EventListener<AnimationEvent> listener, boolean options) {
		removeEventListener("animationcancel", listener, options);
	}

	/**
	 * Remove animation cancel event listener.
	 *
	 * @param listener the listener
	 */
	default void removeAnimationCancelEventListener(EventListener<AnimationEvent> listener) {
		removeEventListener("animationcancel", listener);
	}

	/**
	 * Gets onanimationend.
	 *
	 * @return the onanimationend
	 */
	@JSProperty
	@Nullable
	EventListener<AnimationEvent> getOnanimationend();

	/**
	 * Sets onanimationend.
	 *
	 * @param onanimationend the onanimationend
	 */
	@JSProperty
	void setOnanimationend(EventListener<AnimationEvent> onanimationend);

	/**
	 * Add animation end event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addAnimationEndEventListener(EventListener<AnimationEvent> listener,
											  AddEventListenerOptions options) {
		addEventListener("animationend", listener, options);
	}

	/**
	 * Add animation end event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addAnimationEndEventListener(EventListener<AnimationEvent> listener, boolean options) {
		addEventListener("animationend", listener, options);
	}

	/**
	 * Add animation end event listener.
	 *
	 * @param listener the listener
	 */
	default void addAnimationEndEventListener(EventListener<AnimationEvent> listener) {
		addEventListener("animationend", listener);
	}

	/**
	 * Remove animation end event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removeAnimationEndEventListener(EventListener<AnimationEvent> listener,
												 EventListenerOptions options) {
		removeEventListener("animationend", listener, options);
	}

	/**
	 * Remove animation end event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removeAnimationEndEventListener(EventListener<AnimationEvent> listener, boolean options) {
		removeEventListener("animationend", listener, options);
	}

	/**
	 * Remove animation end event listener.
	 *
	 * @param listener the listener
	 */
	default void removeAnimationEndEventListener(EventListener<AnimationEvent> listener) {
		removeEventListener("animationend", listener);
	}

	/**
	 * Gets onanimationiteration.
	 *
	 * @return the onanimationiteration
	 */
	@JSProperty
	@Nullable
	EventListener<AnimationEvent> getOnanimationiteration();

	/**
	 * Sets onanimationiteration.
	 *
	 * @param onanimationiteration the onanimationiteration
	 */
	@JSProperty
	void setOnanimationiteration(EventListener<AnimationEvent> onanimationiteration);

	/**
	 * Add animation iteration event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addAnimationIterationEventListener(EventListener<AnimationEvent> listener,
													AddEventListenerOptions options) {
		addEventListener("animationiteration", listener, options);
	}

	/**
	 * Add animation iteration event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addAnimationIterationEventListener(EventListener<AnimationEvent> listener, boolean options) {
		addEventListener("animationiteration", listener, options);
	}

	/**
	 * Add animation iteration event listener.
	 *
	 * @param listener the listener
	 */
	default void addAnimationIterationEventListener(EventListener<AnimationEvent> listener) {
		addEventListener("animationiteration", listener);
	}

	/**
	 * Remove animation iteration event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removeAnimationIterationEventListener(EventListener<AnimationEvent> listener,
													   EventListenerOptions options) {
		removeEventListener("animationiteration", listener, options);
	}

	/**
	 * Remove animation iteration event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removeAnimationIterationEventListener(EventListener<AnimationEvent> listener, boolean options) {
		removeEventListener("animationiteration", listener, options);
	}

	/**
	 * Remove animation iteration event listener.
	 *
	 * @param listener the listener
	 */
	default void removeAnimationIterationEventListener(EventListener<AnimationEvent> listener) {
		removeEventListener("animationiteration", listener);
	}

	/**
	 * Gets onanimationstart.
	 *
	 * @return the onanimationstart
	 */
	@JSProperty
	@Nullable
	EventListener<AnimationEvent> getOnanimationstart();

	/**
	 * Sets onanimationstart.
	 *
	 * @param onanimationstart the onanimationstart
	 */
	@JSProperty
	void setOnanimationstart(EventListener<AnimationEvent> onanimationstart);

	/**
	 * Add animation start event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addAnimationStartEventListener(EventListener<AnimationEvent> listener,
												AddEventListenerOptions options) {
		addEventListener("animationstart", listener, options);
	}

	/**
	 * Add animation start event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addAnimationStartEventListener(EventListener<AnimationEvent> listener, boolean options) {
		addEventListener("animationstart", listener, options);
	}

	/**
	 * Add animation start event listener.
	 *
	 * @param listener the listener
	 */
	default void addAnimationStartEventListener(EventListener<AnimationEvent> listener) {
		addEventListener("animationstart", listener);
	}

	/**
	 * Remove animation start event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removeAnimationStartEventListener(EventListener<AnimationEvent> listener,
												   EventListenerOptions options) {
		removeEventListener("animationstart", listener, options);
	}

	/**
	 * Remove animation start event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removeAnimationStartEventListener(EventListener<AnimationEvent> listener, boolean options) {
		removeEventListener("animationstart", listener, options);
	}

	/**
	 * Remove animation start event listener.
	 *
	 * @param listener the listener
	 */
	default void removeAnimationStartEventListener(EventListener<AnimationEvent> listener) {
		removeEventListener("animationstart", listener);
	}

	/**
	 * Gets onauxclick.
	 *
	 * @return the onauxclick
	 */
	@JSProperty
	@Nullable
	EventListener<MouseEvent> getOnauxclick();

	/**
	 * Sets onauxclick.
	 *
	 * @param onauxclick the onauxclick
	 */
	@JSProperty
	void setOnauxclick(EventListener<MouseEvent> onauxclick);

	/**
	 * Add aux click event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addAuxClickEventListener(EventListener<MouseEvent> listener, AddEventListenerOptions options) {
		addEventListener("auxclick", listener, options);
	}

	/**
	 * Add aux click event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addAuxClickEventListener(EventListener<MouseEvent> listener, boolean options) {
		addEventListener("auxclick", listener, options);
	}

	/**
	 * Add aux click event listener.
	 *
	 * @param listener the listener
	 */
	default void addAuxClickEventListener(EventListener<MouseEvent> listener) {
		addEventListener("auxclick", listener);
	}

	/**
	 * Remove aux click event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removeAuxClickEventListener(EventListener<MouseEvent> listener, EventListenerOptions options) {
		removeEventListener("auxclick", listener, options);
	}

	/**
	 * Remove aux click event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removeAuxClickEventListener(EventListener<MouseEvent> listener, boolean options) {
		removeEventListener("auxclick", listener, options);
	}

	/**
	 * Remove aux click event listener.
	 *
	 * @param listener the listener
	 */
	default void removeAuxClickEventListener(EventListener<MouseEvent> listener) {
		removeEventListener("auxclick", listener);
	}

	/**
	 * Fires when the object loses the input focus.
	 *
	 *
	 *
	 * @return the onblur
	 */
	@JSProperty
	@Nullable
	EventListener<FocusEvent> getOnblur();

	/**
	 * Sets onblur.
	 *
	 * @param onblur the onblur
	 */
	@JSProperty
	void setOnblur(EventListener<FocusEvent> onblur);

	/**
	 * Add blur event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addBlurEventListener(EventListener<FocusEvent> listener, AddEventListenerOptions options) {
		addEventListener("blur", listener, options);
	}

	/**
	 * Add blur event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addBlurEventListener(EventListener<FocusEvent> listener, boolean options) {
		addEventListener("blur", listener, options);
	}

	/**
	 * Add blur event listener.
	 *
	 * @param listener the listener
	 */
	default void addBlurEventListener(EventListener<FocusEvent> listener) {
		addEventListener("blur", listener);
	}

	/**
	 * Remove blur event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removeBlurEventListener(EventListener<FocusEvent> listener, EventListenerOptions options) {
		removeEventListener("blur", listener, options);
	}

	/**
	 * Remove blur event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removeBlurEventListener(EventListener<FocusEvent> listener, boolean options) {
		removeEventListener("blur", listener, options);
	}

	/**
	 * Remove blur event listener.
	 *
	 * @param listener the listener
	 */
	default void removeBlurEventListener(EventListener<FocusEvent> listener) {
		removeEventListener("blur", listener);
	}

	/**
	 * Gets oncancel.
	 *
	 * @return the oncancel
	 */
	@JSProperty
	@Nullable
	EventListener<Event> getOncancel();

	/**
	 * Sets oncancel.
	 *
	 * @param oncancel the oncancel
	 */
	@JSProperty
	void setOncancel(EventListener<Event> oncancel);

	/**
	 * Add cancel event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addCancelEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
		addEventListener("cancel", listener, options);
	}

	/**
	 * Add cancel event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addCancelEventListener(EventListener<Event> listener, boolean options) {
		addEventListener("cancel", listener, options);
	}

	/**
	 * Add cancel event listener.
	 *
	 * @param listener the listener
	 */
	default void addCancelEventListener(EventListener<Event> listener) {
		addEventListener("cancel", listener);
	}

	/**
	 * Remove cancel event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removeCancelEventListener(EventListener<Event> listener, EventListenerOptions options) {
		removeEventListener("cancel", listener, options);
	}

	/**
	 * Remove cancel event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removeCancelEventListener(EventListener<Event> listener, boolean options) {
		removeEventListener("cancel", listener, options);
	}

	/**
	 * Remove cancel event listener.
	 *
	 * @param listener the listener
	 */
	default void removeCancelEventListener(EventListener<Event> listener) {
		removeEventListener("cancel", listener);
	}

	/**
	 * Occurs when playback is possible, but would require further buffering.
	 *
	 * @return the oncanplay
	 */
	@JSProperty
	@Nullable
	EventListener<Event> getOncanplay();

	/**
	 * Sets oncanplay.
	 *
	 * @param oncanplay the oncanplay
	 */
	@JSProperty
	void setOncanplay(EventListener<Event> oncanplay);

	/**
	 * Add can play event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addCanPlayEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
		addEventListener("canplay", listener, options);
	}

	/**
	 * Add can play event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addCanPlayEventListener(EventListener<Event> listener, boolean options) {
		addEventListener("canplay", listener, options);
	}

	/**
	 * Add can play event listener.
	 *
	 * @param listener the listener
	 */
	default void addCanPlayEventListener(EventListener<Event> listener) {
		addEventListener("canplay", listener);
	}

	/**
	 * Remove can play event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removeCanPlayEventListener(EventListener<Event> listener, EventListenerOptions options) {
		removeEventListener("canplay", listener, options);
	}

	/**
	 * Remove can play event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removeCanPlayEventListener(EventListener<Event> listener, boolean options) {
		removeEventListener("canplay", listener, options);
	}

	/**
	 * Remove can play event listener.
	 *
	 * @param listener the listener
	 */
	default void removeCanPlayEventListener(EventListener<Event> listener) {
		removeEventListener("canplay", listener);
	}

	/**
	 * Gets oncanplaythrough.
	 *
	 * @return the oncanplaythrough
	 */
	@JSProperty
	@Nullable
	EventListener<Event> getOncanplaythrough();

	/**
	 * Sets oncanplaythrough.
	 *
	 * @param oncanplaythrough the oncanplaythrough
	 */
	@JSProperty
	void setOncanplaythrough(EventListener<Event> oncanplaythrough);

	/**
	 * Add can play through event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addCanPlayThroughEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
		addEventListener("canplaythrough", listener, options);
	}

	/**
	 * Add can play through event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addCanPlayThroughEventListener(EventListener<Event> listener, boolean options) {
		addEventListener("canplaythrough", listener, options);
	}

	/**
	 * Add can play through event listener.
	 *
	 * @param listener the listener
	 */
	default void addCanPlayThroughEventListener(EventListener<Event> listener) {
		addEventListener("canplaythrough", listener);
	}

	/**
	 * Remove can play through event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removeCanPlayThroughEventListener(EventListener<Event> listener, EventListenerOptions options) {
		removeEventListener("canplaythrough", listener, options);
	}

	/**
	 * Remove can play through event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removeCanPlayThroughEventListener(EventListener<Event> listener, boolean options) {
		removeEventListener("canplaythrough", listener, options);
	}

	/**
	 * Remove can play through event listener.
	 *
	 * @param listener the listener
	 */
	default void removeCanPlayThroughEventListener(EventListener<Event> listener) {
		removeEventListener("canplaythrough", listener);
	}

	/**
	 * Fires when the contents of the object or selection have changed.
	 *
	 * @return the onchange
	 */
	@JSProperty
	@Nullable
	EventListener<Event> getOnchange();

	/**
	 * Sets onchange.
	 *
	 * @param onchange the onchange
	 */
	@JSProperty
	void setOnchange(EventListener<Event> onchange);

	/**
	 * Add change event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addChangeEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
		addEventListener("change", listener, options);
	}

	/**
	 * Add change event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addChangeEventListener(EventListener<Event> listener, boolean options) {
		addEventListener("change", listener, options);
	}

	/**
	 * Add change event listener.
	 *
	 * @param listener the listener
	 */
	default void addChangeEventListener(EventListener<Event> listener) {
		addEventListener("change", listener);
	}

	/**
	 * Remove change event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removeChangeEventListener(EventListener<Event> listener, EventListenerOptions options) {
		removeEventListener("change", listener, options);
	}

	/**
	 * Remove change event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removeChangeEventListener(EventListener<Event> listener, boolean options) {
		removeEventListener("change", listener, options);
	}

	/**
	 * Remove change event listener.
	 *
	 * @param listener the listener
	 */
	default void removeChangeEventListener(EventListener<Event> listener) {
		removeEventListener("change", listener);
	}

	/**
	 * Fires when the user clicks the left mouse button on the object
	 *
	 *
	 *
	 * @return the onclick
	 */
	@JSProperty
	@Nullable
	EventListener<MouseEvent> getOnclick();

	/**
	 * Sets onclick.
	 *
	 * @param onclick the onclick
	 */
	@JSProperty
	void setOnclick(EventListener<MouseEvent> onclick);

	/**
	 * Add click event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addClickEventListener(EventListener<MouseEvent> listener, AddEventListenerOptions options) {
		addEventListener("click", listener, options);
	}

	/**
	 * Add click event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addClickEventListener(EventListener<MouseEvent> listener, boolean options) {
		addEventListener("click", listener, options);
	}

	/**
	 * Add click event listener.
	 *
	 * @param listener the listener
	 */
	default void addClickEventListener(EventListener<MouseEvent> listener) {
		addEventListener("click", listener);
	}

	/**
	 * Remove click event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removeClickEventListener(EventListener<MouseEvent> listener, EventListenerOptions options) {
		removeEventListener("click", listener, options);
	}

	/**
	 * Remove click event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removeClickEventListener(EventListener<MouseEvent> listener, boolean options) {
		removeEventListener("click", listener, options);
	}

	/**
	 * Remove click event listener.
	 *
	 * @param listener the listener
	 */
	default void removeClickEventListener(EventListener<MouseEvent> listener) {
		removeEventListener("click", listener);
	}

	/**
	 * Gets onclose.
	 *
	 * @return the onclose
	 */
	@JSProperty
	@Nullable
	EventListener<Event> getOnclose();

	/**
	 * Sets onclose.
	 *
	 * @param onclose the onclose
	 */
	@JSProperty
	void setOnclose(EventListener<Event> onclose);

	/**
	 * Add close event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addCloseEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
		addEventListener("close", listener, options);
	}

	/**
	 * Add close event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addCloseEventListener(EventListener<Event> listener, boolean options) {
		addEventListener("close", listener, options);
	}

	/**
	 * Add close event listener.
	 *
	 * @param listener the listener
	 */
	default void addCloseEventListener(EventListener<Event> listener) {
		addEventListener("close", listener);
	}

	/**
	 * Remove close event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removeCloseEventListener(EventListener<Event> listener, EventListenerOptions options) {
		removeEventListener("close", listener, options);
	}

	/**
	 * Remove close event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removeCloseEventListener(EventListener<Event> listener, boolean options) {
		removeEventListener("close", listener, options);
	}

	/**
	 * Remove close event listener.
	 *
	 * @param listener the listener
	 */
	default void removeCloseEventListener(EventListener<Event> listener) {
		removeEventListener("close", listener);
	}

	/**
	 * Fires when the user clicks the right mouse button in the client area, opening the context menu.
	 *
	 *
	 *
	 * @return the oncontextmenu
	 */
	@JSProperty
	@Nullable
	EventListener<MouseEvent> getOncontextmenu();

	/**
	 * Sets oncontextmenu.
	 *
	 * @param oncontextmenu the oncontextmenu
	 */
	@JSProperty
	void setOncontextmenu(EventListener<MouseEvent> oncontextmenu);

	/**
	 * Add context menu event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addContextMenuEventListener(EventListener<MouseEvent> listener, AddEventListenerOptions options) {
		addEventListener("contextmenu", listener, options);
	}

	/**
	 * Add context menu event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addContextMenuEventListener(EventListener<MouseEvent> listener, boolean options) {
		addEventListener("contextmenu", listener, options);
	}

	/**
	 * Add context menu event listener.
	 *
	 * @param listener the listener
	 */
	default void addContextMenuEventListener(EventListener<MouseEvent> listener) {
		addEventListener("contextmenu", listener);
	}

	/**
	 * Remove context menu event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removeContextMenuEventListener(EventListener<MouseEvent> listener, EventListenerOptions options) {
		removeEventListener("contextmenu", listener, options);
	}

	/**
	 * Remove context menu event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removeContextMenuEventListener(EventListener<MouseEvent> listener, boolean options) {
		removeEventListener("contextmenu", listener, options);
	}

	/**
	 * Remove context menu event listener.
	 *
	 * @param listener the listener
	 */
	default void removeContextMenuEventListener(EventListener<MouseEvent> listener) {
		removeEventListener("contextmenu", listener);
	}

	/**
	 * Gets oncuechange.
	 *
	 * @return the oncuechange
	 */
	@JSProperty
	@Nullable
	EventListener<Event> getOncuechange();

	/**
	 * Sets oncuechange.
	 *
	 * @param oncuechange the oncuechange
	 */
	@JSProperty
	void setOncuechange(EventListener<Event> oncuechange);

	/**
	 * Add cue change event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addCueChangeEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
		addEventListener("cuechange", listener, options);
	}

	/**
	 * Add cue change event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addCueChangeEventListener(EventListener<Event> listener, boolean options) {
		addEventListener("cuechange", listener, options);
	}

	/**
	 * Add cue change event listener.
	 *
	 * @param listener the listener
	 */
	default void addCueChangeEventListener(EventListener<Event> listener) {
		addEventListener("cuechange", listener);
	}

	/**
	 * Remove cue change event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removeCueChangeEventListener(EventListener<Event> listener, EventListenerOptions options) {
		removeEventListener("cuechange", listener, options);
	}

	/**
	 * Remove cue change event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removeCueChangeEventListener(EventListener<Event> listener, boolean options) {
		removeEventListener("cuechange", listener, options);
	}

	/**
	 * Remove cue change event listener.
	 *
	 * @param listener the listener
	 */
	default void removeCueChangeEventListener(EventListener<Event> listener) {
		removeEventListener("cuechange", listener);
	}

	/**
	 * Fires when the user double-clicks the object.
	 *
	 *
	 *
	 * @return the ondblclick
	 */
	@JSProperty
	@Nullable
	EventListener<MouseEvent> getOndblclick();

	/**
	 * Sets ondblclick.
	 *
	 * @param ondblclick the ondblclick
	 */
	@JSProperty
	void setOndblclick(EventListener<MouseEvent> ondblclick);

	/**
	 * Add dbl click event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addDblClickEventListener(EventListener<MouseEvent> listener, AddEventListenerOptions options) {
		addEventListener("dblclick", listener, options);
	}

	/**
	 * Add dbl click event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addDblClickEventListener(EventListener<MouseEvent> listener, boolean options) {
		addEventListener("dblclick", listener, options);
	}

	/**
	 * Add dbl click event listener.
	 *
	 * @param listener the listener
	 */
	default void addDblClickEventListener(EventListener<MouseEvent> listener) {
		addEventListener("dblclick", listener);
	}

	/**
	 * Remove dbl click event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removeDblClickEventListener(EventListener<MouseEvent> listener, EventListenerOptions options) {
		removeEventListener("dblclick", listener, options);
	}

	/**
	 * Remove dbl click event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removeDblClickEventListener(EventListener<MouseEvent> listener, boolean options) {
		removeEventListener("dblclick", listener, options);
	}

	/**
	 * Remove dbl click event listener.
	 *
	 * @param listener the listener
	 */
	default void removeDblClickEventListener(EventListener<MouseEvent> listener) {
		removeEventListener("dblclick", listener);
	}

	/**
	 * Fires on the source object continuously during a drag operation.
	 *
	 * @return the ondrag
	 */
	@JSProperty
	@Nullable
	EventListener<DragEvent> getOndrag();

	/**
	 * Sets ondrag.
	 *
	 * @param ondrag the ondrag
	 */
	@JSProperty
	void setOndrag(EventListener<DragEvent> ondrag);

	/**
	 * Add drag event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addDragEventListener(EventListener<DragEvent> listener, AddEventListenerOptions options) {
		addEventListener("drag", listener, options);
	}

	/**
	 * Add drag event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addDragEventListener(EventListener<DragEvent> listener, boolean options) {
		addEventListener("drag", listener, options);
	}

	/**
	 * Add drag event listener.
	 *
	 * @param listener the listener
	 */
	default void addDragEventListener(EventListener<DragEvent> listener) {
		addEventListener("drag", listener);
	}

	/**
	 * Remove drag event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removeDragEventListener(EventListener<DragEvent> listener, EventListenerOptions options) {
		removeEventListener("drag", listener, options);
	}

	/**
	 * Remove drag event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removeDragEventListener(EventListener<DragEvent> listener, boolean options) {
		removeEventListener("drag", listener, options);
	}

	/**
	 * Remove drag event listener.
	 *
	 * @param listener the listener
	 */
	default void removeDragEventListener(EventListener<DragEvent> listener) {
		removeEventListener("drag", listener);
	}

	/**
	 * Fires on the source object when the user releases the mouse at the close of a drag operation.
	 *
	 * @return the ondragend
	 */
	@JSProperty
	@Nullable
	EventListener<DragEvent> getOndragend();

	/**
	 * Sets ondragend.
	 *
	 * @param ondragend the ondragend
	 */
	@JSProperty
	void setOndragend(EventListener<DragEvent> ondragend);

	/**
	 * Add drag end event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addDragEndEventListener(EventListener<DragEvent> listener, AddEventListenerOptions options) {
		addEventListener("dragend", listener, options);
	}

	/**
	 * Add drag end event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addDragEndEventListener(EventListener<DragEvent> listener, boolean options) {
		addEventListener("dragend", listener, options);
	}

	/**
	 * Add drag end event listener.
	 *
	 * @param listener the listener
	 */
	default void addDragEndEventListener(EventListener<DragEvent> listener) {
		addEventListener("dragend", listener);
	}

	/**
	 * Remove drag end event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removeDragEndEventListener(EventListener<DragEvent> listener, EventListenerOptions options) {
		removeEventListener("dragend", listener, options);
	}

	/**
	 * Remove drag end event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removeDragEndEventListener(EventListener<DragEvent> listener, boolean options) {
		removeEventListener("dragend", listener, options);
	}

	/**
	 * Remove drag end event listener.
	 *
	 * @param listener the listener
	 */
	default void removeDragEndEventListener(EventListener<DragEvent> listener) {
		removeEventListener("dragend", listener);
	}

	/**
	 * Fires on the target element when the user drags the object to a valid drop target.
	 *
	 *
	 *
	 * @return the ondragenter
	 */
	@JSProperty
	@Nullable
	EventListener<DragEvent> getOndragenter();

	/**
	 * Sets ondragenter.
	 *
	 * @param ondragenter the ondragenter
	 */
	@JSProperty
	void setOndragenter(EventListener<DragEvent> ondragenter);

	/**
	 * Add drag enter event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addDragEnterEventListener(EventListener<DragEvent> listener, AddEventListenerOptions options) {
		addEventListener("dragenter", listener, options);
	}

	/**
	 * Add drag enter event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addDragEnterEventListener(EventListener<DragEvent> listener, boolean options) {
		addEventListener("dragenter", listener, options);
	}

	/**
	 * Add drag enter event listener.
	 *
	 * @param listener the listener
	 */
	default void addDragEnterEventListener(EventListener<DragEvent> listener) {
		addEventListener("dragenter", listener);
	}

	/**
	 * Remove drag enter event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removeDragEnterEventListener(EventListener<DragEvent> listener, EventListenerOptions options) {
		removeEventListener("dragenter", listener, options);
	}

	/**
	 * Remove drag enter event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removeDragEnterEventListener(EventListener<DragEvent> listener, boolean options) {
		removeEventListener("dragenter", listener, options);
	}

	/**
	 * Remove drag enter event listener.
	 *
	 * @param listener the listener
	 */
	default void removeDragEnterEventListener(EventListener<DragEvent> listener) {
		removeEventListener("dragenter", listener);
	}

	/**
	 * Gets ondragexit.
	 *
	 * @return the ondragexit
	 */
	@JSProperty
	@Nullable
	EventListener<Event> getOndragexit();

	/**
	 * Sets ondragexit.
	 *
	 * @param ondragexit the ondragexit
	 */
	@JSProperty
	void setOndragexit(EventListener<Event> ondragexit);

	/**
	 * Add drag exit event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addDragExitEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
		addEventListener("dragexit", listener, options);
	}

	/**
	 * Add drag exit event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addDragExitEventListener(EventListener<Event> listener, boolean options) {
		addEventListener("dragexit", listener, options);
	}

	/**
	 * Add drag exit event listener.
	 *
	 * @param listener the listener
	 */
	default void addDragExitEventListener(EventListener<Event> listener) {
		addEventListener("dragexit", listener);
	}

	/**
	 * Remove drag exit event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removeDragExitEventListener(EventListener<Event> listener, EventListenerOptions options) {
		removeEventListener("dragexit", listener, options);
	}

	/**
	 * Remove drag exit event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removeDragExitEventListener(EventListener<Event> listener, boolean options) {
		removeEventListener("dragexit", listener, options);
	}

	/**
	 * Remove drag exit event listener.
	 *
	 * @param listener the listener
	 */
	default void removeDragExitEventListener(EventListener<Event> listener) {
		removeEventListener("dragexit", listener);
	}

	/**
	 * Fires on the target object when the user moves the mouse out of a valid drop target during a drag operation.
	 *
	 *
	 *
	 * @return the ondragleave
	 */
	@JSProperty
	@Nullable
	EventListener<DragEvent> getOndragleave();

	/**
	 * Sets ondragleave.
	 *
	 * @param ondragleave the ondragleave
	 */
	@JSProperty
	void setOndragleave(EventListener<DragEvent> ondragleave);

	/**
	 * Add drag leave event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addDragLeaveEventListener(EventListener<DragEvent> listener, AddEventListenerOptions options) {
		addEventListener("dragleave", listener, options);
	}

	/**
	 * Add drag leave event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addDragLeaveEventListener(EventListener<DragEvent> listener, boolean options) {
		addEventListener("dragleave", listener, options);
	}

	/**
	 * Add drag leave event listener.
	 *
	 * @param listener the listener
	 */
	default void addDragLeaveEventListener(EventListener<DragEvent> listener) {
		addEventListener("dragleave", listener);
	}

	/**
	 * Remove drag leave event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removeDragLeaveEventListener(EventListener<DragEvent> listener, EventListenerOptions options) {
		removeEventListener("dragleave", listener, options);
	}

	/**
	 * Remove drag leave event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removeDragLeaveEventListener(EventListener<DragEvent> listener, boolean options) {
		removeEventListener("dragleave", listener, options);
	}

	/**
	 * Remove drag leave event listener.
	 *
	 * @param listener the listener
	 */
	default void removeDragLeaveEventListener(EventListener<DragEvent> listener) {
		removeEventListener("dragleave", listener);
	}

	/**
	 * Fires on the target element continuously while the user drags the object over a valid drop target.
	 *
	 * @return the ondragover
	 */
	@JSProperty
	@Nullable
	EventListener<DragEvent> getOndragover();

	/**
	 * Sets ondragover.
	 *
	 * @param ondragover the ondragover
	 */
	@JSProperty
	void setOndragover(EventListener<DragEvent> ondragover);

	/**
	 * Add drag over event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addDragOverEventListener(EventListener<DragEvent> listener, AddEventListenerOptions options) {
		addEventListener("dragover", listener, options);
	}

	/**
	 * Add drag over event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addDragOverEventListener(EventListener<DragEvent> listener, boolean options) {
		addEventListener("dragover", listener, options);
	}

	/**
	 * Add drag over event listener.
	 *
	 * @param listener the listener
	 */
	default void addDragOverEventListener(EventListener<DragEvent> listener) {
		addEventListener("dragover", listener);
	}

	/**
	 * Remove drag over event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removeDragOverEventListener(EventListener<DragEvent> listener, EventListenerOptions options) {
		removeEventListener("dragover", listener, options);
	}

	/**
	 * Remove drag over event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removeDragOverEventListener(EventListener<DragEvent> listener, boolean options) {
		removeEventListener("dragover", listener, options);
	}

	/**
	 * Remove drag over event listener.
	 *
	 * @param listener the listener
	 */
	default void removeDragOverEventListener(EventListener<DragEvent> listener) {
		removeEventListener("dragover", listener);
	}

	/**
	 * Fires on the source object when the user starts to drag a text selection or selected object.
	 *
	 * @return the ondragstart
	 */
	@JSProperty
	@Nullable
	EventListener<DragEvent> getOndragstart();

	/**
	 * Sets ondragstart.
	 *
	 * @param ondragstart the ondragstart
	 */
	@JSProperty
	void setOndragstart(EventListener<DragEvent> ondragstart);

	/**
	 * Add drag start event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addDragStartEventListener(EventListener<DragEvent> listener, AddEventListenerOptions options) {
		addEventListener("dragstart", listener, options);
	}

	/**
	 * Add drag start event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addDragStartEventListener(EventListener<DragEvent> listener, boolean options) {
		addEventListener("dragstart", listener, options);
	}

	/**
	 * Add drag start event listener.
	 *
	 * @param listener the listener
	 */
	default void addDragStartEventListener(EventListener<DragEvent> listener) {
		addEventListener("dragstart", listener);
	}

	/**
	 * Remove drag start event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removeDragStartEventListener(EventListener<DragEvent> listener, EventListenerOptions options) {
		removeEventListener("dragstart", listener, options);
	}

	/**
	 * Remove drag start event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removeDragStartEventListener(EventListener<DragEvent> listener, boolean options) {
		removeEventListener("dragstart", listener, options);
	}

	/**
	 * Remove drag start event listener.
	 *
	 * @param listener the listener
	 */
	default void removeDragStartEventListener(EventListener<DragEvent> listener) {
		removeEventListener("dragstart", listener);
	}

	/**
	 * Gets ondrop.
	 *
	 * @return the ondrop
	 */
	@JSProperty
	@Nullable
	EventListener<DragEvent> getOndrop();

	/**
	 * Sets ondrop.
	 *
	 * @param ondrop the ondrop
	 */
	@JSProperty
	void setOndrop(EventListener<DragEvent> ondrop);

	/**
	 * Add drop event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addDropEventListener(EventListener<DragEvent> listener, AddEventListenerOptions options) {
		addEventListener("drop", listener, options);
	}

	/**
	 * Add drop event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addDropEventListener(EventListener<DragEvent> listener, boolean options) {
		addEventListener("drop", listener, options);
	}

	/**
	 * Add drop event listener.
	 *
	 * @param listener the listener
	 */
	default void addDropEventListener(EventListener<DragEvent> listener) {
		addEventListener("drop", listener);
	}

	/**
	 * Remove drop event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removeDropEventListener(EventListener<DragEvent> listener, EventListenerOptions options) {
		removeEventListener("drop", listener, options);
	}

	/**
	 * Remove drop event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removeDropEventListener(EventListener<DragEvent> listener, boolean options) {
		removeEventListener("drop", listener, options);
	}

	/**
	 * Remove drop event listener.
	 *
	 * @param listener the listener
	 */
	default void removeDropEventListener(EventListener<DragEvent> listener) {
		removeEventListener("drop", listener);
	}

	/**
	 * Occurs when the duration attribute is updated.
	 *
	 * @return the ondurationchange
	 */
	@JSProperty
	@Nullable
	EventListener<Event> getOndurationchange();

	/**
	 * Sets ondurationchange.
	 *
	 * @param ondurationchange the ondurationchange
	 */
	@JSProperty
	void setOndurationchange(EventListener<Event> ondurationchange);

	/**
	 * Add duration change event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addDurationChangeEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
		addEventListener("durationchange", listener, options);
	}

	/**
	 * Add duration change event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addDurationChangeEventListener(EventListener<Event> listener, boolean options) {
		addEventListener("durationchange", listener, options);
	}

	/**
	 * Add duration change event listener.
	 *
	 * @param listener the listener
	 */
	default void addDurationChangeEventListener(EventListener<Event> listener) {
		addEventListener("durationchange", listener);
	}

	/**
	 * Remove duration change event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removeDurationChangeEventListener(EventListener<Event> listener, EventListenerOptions options) {
		removeEventListener("durationchange", listener, options);
	}

	/**
	 * Remove duration change event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removeDurationChangeEventListener(EventListener<Event> listener, boolean options) {
		removeEventListener("durationchange", listener, options);
	}

	/**
	 * Remove duration change event listener.
	 *
	 * @param listener the listener
	 */
	default void removeDurationChangeEventListener(EventListener<Event> listener) {
		removeEventListener("durationchange", listener);
	}

	/**
	 * Occurs when the media element is reset to its initial state.
	 *
	 * @return the onemptied
	 */
	@JSProperty
	@Nullable
	EventListener<Event> getOnemptied();

	/**
	 * Sets onemptied.
	 *
	 * @param onemptied the onemptied
	 */
	@JSProperty
	void setOnemptied(EventListener<Event> onemptied);

	/**
	 * Add emptied event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addEmptiedEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
		addEventListener("emptied", listener, options);
	}

	/**
	 * Add emptied event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addEmptiedEventListener(EventListener<Event> listener, boolean options) {
		addEventListener("emptied", listener, options);
	}

	/**
	 * Add emptied event listener.
	 *
	 * @param listener the listener
	 */
	default void addEmptiedEventListener(EventListener<Event> listener) {
		addEventListener("emptied", listener);
	}

	/**
	 * Remove emptied event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removeEmptiedEventListener(EventListener<Event> listener, EventListenerOptions options) {
		removeEventListener("emptied", listener, options);
	}

	/**
	 * Remove emptied event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removeEmptiedEventListener(EventListener<Event> listener, boolean options) {
		removeEventListener("emptied", listener, options);
	}

	/**
	 * Remove emptied event listener.
	 *
	 * @param listener the listener
	 */
	default void removeEmptiedEventListener(EventListener<Event> listener) {
		removeEventListener("emptied", listener);
	}

	/**
	 * Occurs when the end of playback is reached.
	 *
	 *
	 *
	 * @return the onended
	 */


	@JSProperty
	@Nullable
	EventListener<Event> getOnended();

	/**
	 * Sets onended.
	 *
	 * @param onended the onended
	 */
	@JSProperty
	void setOnended(EventListener<Event> onended);

	/**
	 * Add ended event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addEndedEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
		addEventListener("ended", listener, options);
	}

	/**
	 * Add ended event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addEndedEventListener(EventListener<Event> listener, boolean options) {
		addEventListener("ended", listener, options);
	}

	/**
	 * Add ended event listener.
	 *
	 * @param listener the listener
	 */
	default void addEndedEventListener(EventListener<Event> listener) {
		addEventListener("ended", listener);
	}

	/**
	 * Remove ended event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removeEndedEventListener(EventListener<Event> listener, EventListenerOptions options) {
		removeEventListener("ended", listener, options);
	}

	/**
	 * Remove ended event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removeEndedEventListener(EventListener<Event> listener, boolean options) {
		removeEventListener("ended", listener, options);
	}

	/**
	 * Remove ended event listener.
	 *
	 * @param listener the listener
	 */
	default void removeEndedEventListener(EventListener<Event> listener) {
		removeEventListener("ended", listener);
	}

	/**
	 * Fires when an error occurs during object loading.
	 *
	 * @return the onerror
	 */
	@JSProperty
	OnErrorEventHandler getOnerror();

	/**
	 * Sets onerror.
	 *
	 * @param onerror the onerror
	 */
	@JSProperty
	void setOnerror(OnErrorEventHandler onerror);

	/**
	 * Add error event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addErrorEventListener(EventListener<ErrorEvent> listener, AddEventListenerOptions options) {
		addEventListener("error", listener, options);
	}

	/**
	 * Add error event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addErrorEventListener(EventListener<ErrorEvent> listener, boolean options) {
		addEventListener("error", listener, options);
	}

	/**
	 * Add error event listener.
	 *
	 * @param listener the listener
	 */
	default void addErrorEventListener(EventListener<ErrorEvent> listener) {
		addEventListener("error", listener);
	}

	/**
	 * Remove error event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removeErrorEventListener(EventListener<ErrorEvent> listener, EventListenerOptions options) {
		removeEventListener("error", listener, options);
	}

	/**
	 * Remove error event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removeErrorEventListener(EventListener<ErrorEvent> listener, boolean options) {
		removeEventListener("error", listener, options);
	}

	/**
	 * Remove error event listener.
	 *
	 * @param listener the listener
	 */
	default void removeErrorEventListener(EventListener<ErrorEvent> listener) {
		removeEventListener("error", listener);
	}

	/**
	 * Fires when the object receives focus.
	 *
	 * @return the onfocus
	 */
	@JSProperty
	@Nullable
	EventListener<FocusEvent> getOnfocus();

	/**
	 * Sets onfocus.
	 *
	 * @param onfocus the onfocus
	 */
	@JSProperty
	void setOnfocus(EventListener<FocusEvent> onfocus);

	/**
	 * Add focus event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addFocusEventListener(EventListener<FocusEvent> listener, AddEventListenerOptions options) {
		addEventListener("focus", listener, options);
	}

	/**
	 * Add focus event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addFocusEventListener(EventListener<FocusEvent> listener, boolean options) {
		addEventListener("focus", listener, options);
	}

	/**
	 * Add focus event listener.
	 *
	 * @param listener the listener
	 */
	default void addFocusEventListener(EventListener<FocusEvent> listener) {
		addEventListener("focus", listener);
	}

	/**
	 * Remove focus event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removeFocusEventListener(EventListener<FocusEvent> listener, EventListenerOptions options) {
		removeEventListener("focus", listener, options);
	}

	/**
	 * Remove focus event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removeFocusEventListener(EventListener<FocusEvent> listener, boolean options) {
		removeEventListener("focus", listener, options);
	}

	/**
	 * Remove focus event listener.
	 *
	 * @param listener the listener
	 */
	default void removeFocusEventListener(EventListener<FocusEvent> listener) {
		removeEventListener("focus", listener);
	}

	/**
	 * Gets onfocusin.
	 *
	 * @return the onfocusin
	 */
	@JSProperty
	@Nullable
	EventListener<FocusEvent> getOnfocusin();

	/**
	 * Sets onfocusin.
	 *
	 * @param onfocusin the onfocusin
	 */
	@JSProperty
	void setOnfocusin(EventListener<FocusEvent> onfocusin);

	/**
	 * Add focus in event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addFocusInEventListener(EventListener<FocusEvent> listener, AddEventListenerOptions options) {
		addEventListener("focusin", listener, options);
	}

	/**
	 * Add focus in event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addFocusInEventListener(EventListener<FocusEvent> listener, boolean options) {
		addEventListener("focusin", listener, options);
	}

	/**
	 * Add focus in event listener.
	 *
	 * @param listener the listener
	 */
	default void addFocusInEventListener(EventListener<FocusEvent> listener) {
		addEventListener("focusin", listener);
	}

	/**
	 * Remove focus in event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removeFocusInEventListener(EventListener<FocusEvent> listener, EventListenerOptions options) {
		removeEventListener("focusin", listener, options);
	}

	/**
	 * Remove focus in event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removeFocusInEventListener(EventListener<FocusEvent> listener, boolean options) {
		removeEventListener("focusin", listener, options);
	}

	/**
	 * Remove focus in event listener.
	 *
	 * @param listener the listener
	 */
	default void removeFocusInEventListener(EventListener<FocusEvent> listener) {
		removeEventListener("focusin", listener);
	}

	/**
	 * Gets onfocusout.
	 *
	 * @return the onfocusout
	 */
	@JSProperty
	@Nullable
	EventListener<FocusEvent> getOnfocusout();

	/**
	 * Sets onfocusout.
	 *
	 * @param onfocusout the onfocusout
	 */
	@JSProperty
	void setOnfocusout(EventListener<FocusEvent> onfocusout);

	/**
	 * Add focus out event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addFocusOutEventListener(EventListener<FocusEvent> listener, AddEventListenerOptions options) {
		addEventListener("focusout", listener, options);
	}

	/**
	 * Add focus out event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addFocusOutEventListener(EventListener<FocusEvent> listener, boolean options) {
		addEventListener("focusout", listener, options);
	}

	/**
	 * Add focus out event listener.
	 *
	 * @param listener the listener
	 */
	default void addFocusOutEventListener(EventListener<FocusEvent> listener) {
		addEventListener("focusout", listener);
	}

	/**
	 * Remove focus out event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removeFocusOutEventListener(EventListener<FocusEvent> listener, EventListenerOptions options) {
		removeEventListener("focusout", listener, options);
	}

	/**
	 * Remove focus out event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removeFocusOutEventListener(EventListener<FocusEvent> listener, boolean options) {
		removeEventListener("focusout", listener, options);
	}

	/**
	 * Remove focus out event listener.
	 *
	 * @param listener the listener
	 */
	default void removeFocusOutEventListener(EventListener<FocusEvent> listener) {
		removeEventListener("focusout", listener);
	}

	/**
	 * Gets ongotpointercapture.
	 *
	 * @return the ongotpointercapture
	 */
	@JSProperty
	@Nullable
	EventListener<PointerEvent> getOngotpointercapture();

	/**
	 * Sets ongotpointercapture.
	 *
	 * @param ongotpointercapture the ongotpointercapture
	 */
	@JSProperty
	void setOngotpointercapture(EventListener<PointerEvent> ongotpointercapture);

	/**
	 * Add got pointer capture event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addGotPointerCaptureEventListener(EventListener<PointerEvent> listener,
												   AddEventListenerOptions options) {
		addEventListener("gotpointercapture", listener, options);
	}

	/**
	 * Add got pointer capture event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addGotPointerCaptureEventListener(EventListener<PointerEvent> listener, boolean options) {
		addEventListener("gotpointercapture", listener, options);
	}

	/**
	 * Add got pointer capture event listener.
	 *
	 * @param listener the listener
	 */
	default void addGotPointerCaptureEventListener(EventListener<PointerEvent> listener) {
		addEventListener("gotpointercapture", listener);
	}

	/**
	 * Remove got pointer capture event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removeGotPointerCaptureEventListener(EventListener<PointerEvent> listener,
													  EventListenerOptions options) {
		removeEventListener("gotpointercapture", listener, options);
	}

	/**
	 * Remove got pointer capture event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removeGotPointerCaptureEventListener(EventListener<PointerEvent> listener, boolean options) {
		removeEventListener("gotpointercapture", listener, options);
	}

	/**
	 * Remove got pointer capture event listener.
	 *
	 * @param listener the listener
	 */
	default void removeGotPointerCaptureEventListener(EventListener<PointerEvent> listener) {
		removeEventListener("gotpointercapture", listener);
	}

	/**
	 * Gets oninput.
	 *
	 * @return the oninput
	 */
	@JSProperty
	@Nullable
	EventListener<InputEvent> getOninput();

	/**
	 * Sets oninput.
	 *
	 * @param oninput the oninput
	 */
	@JSProperty
	void setOninput(EventListener<InputEvent> oninput);

	/**
	 * Add input event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addInputEventListener(EventListener<InputEvent> listener, AddEventListenerOptions options) {
		addEventListener("input", listener, options);
	}

	/**
	 * Add input event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addInputEventListener(EventListener<InputEvent> listener, boolean options) {
		addEventListener("input", listener, options);
	}

	/**
	 * Add input event listener.
	 *
	 * @param listener the listener
	 */
	default void addInputEventListener(EventListener<InputEvent> listener) {
		addEventListener("input", listener);
	}

	/**
	 * Remove input event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removeInputEventListener(EventListener<InputEvent> listener, EventListenerOptions options) {
		removeEventListener("input", listener, options);
	}

	/**
	 * Remove input event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removeInputEventListener(EventListener<InputEvent> listener, boolean options) {
		removeEventListener("input", listener, options);
	}

	/**
	 * Remove input event listener.
	 *
	 * @param listener the listener
	 */
	default void removeInputEventListener(EventListener<InputEvent> listener) {
		removeEventListener("input", listener);
	}

	/**
	 * Gets oninvalid.
	 *
	 * @return the oninvalid
	 */
	@JSProperty
	@Nullable
	EventListener<Event> getOninvalid();

	/**
	 * Sets oninvalid.
	 *
	 * @param oninvalid the oninvalid
	 */
	@JSProperty
	void setOninvalid(EventListener<Event> oninvalid);

	/**
	 * Add invalid event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addInvalidEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
		addEventListener("invalid", listener, options);
	}

	/**
	 * Add invalid event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addInvalidEventListener(EventListener<Event> listener, boolean options) {
		addEventListener("invalid", listener, options);
	}

	/**
	 * Add invalid event listener.
	 *
	 * @param listener the listener
	 */
	default void addInvalidEventListener(EventListener<Event> listener) {
		addEventListener("invalid", listener);
	}

	/**
	 * Remove invalid event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removeInvalidEventListener(EventListener<Event> listener, EventListenerOptions options) {
		removeEventListener("invalid", listener, options);
	}

	/**
	 * Remove invalid event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removeInvalidEventListener(EventListener<Event> listener, boolean options) {
		removeEventListener("invalid", listener, options);
	}

	/**
	 * Remove invalid event listener.
	 *
	 * @param listener the listener
	 */
	default void removeInvalidEventListener(EventListener<Event> listener) {
		removeEventListener("invalid", listener);
	}

	/**
	 * Fires when the user presses a key.
	 *
	 *
	 *
	 * @return the onkeydown
	 */
	@JSProperty
	@Nullable
	EventListener<KeyboardEvent> getOnkeydown();

	/**
	 * Sets onkeydown.
	 *
	 * @param onkeydown the onkeydown
	 */
	@JSProperty
	void setOnkeydown(EventListener<KeyboardEvent> onkeydown);

	/**
	 * Add key down event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addKeyDownEventListener(EventListener<KeyboardEvent> listener, AddEventListenerOptions options) {
		addEventListener("keydown", listener, options);
	}

	/**
	 * Add key down event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addKeyDownEventListener(EventListener<KeyboardEvent> listener, boolean options) {
		addEventListener("keydown", listener, options);
	}

	/**
	 * Add key down event listener.
	 *
	 * @param listener the listener
	 */
	default void addKeyDownEventListener(EventListener<KeyboardEvent> listener) {
		addEventListener("keydown", listener);
	}

	/**
	 * Remove key down event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removeKeyDownEventListener(EventListener<KeyboardEvent> listener, EventListenerOptions options) {
		removeEventListener("keydown", listener, options);
	}

	/**
	 * Remove key down event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removeKeyDownEventListener(EventListener<KeyboardEvent> listener, boolean options) {
		removeEventListener("keydown", listener, options);
	}

	/**
	 * Remove key down event listener.
	 *
	 * @param listener the listener
	 */
	default void removeKeyDownEventListener(EventListener<KeyboardEvent> listener) {
		removeEventListener("keydown", listener);
	}

	/**
	 * Fires when the user presses an alphanumeric key.
	 *
	 * @return the onkeypress
	 */
	@JSProperty
	@Nullable
	EventListener<KeyboardEvent> getOnkeypress();

	/**
	 * Sets onkeypress.
	 *
	 * @param onkeypress the onkeypress
	 */
	@JSProperty
	void setOnkeypress(EventListener<KeyboardEvent> onkeypress);

	/**
	 * Add key press event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addKeyPressEventListener(EventListener<KeyboardEvent> listener, AddEventListenerOptions options) {
		addEventListener("keypress", listener, options);
	}

	/**
	 * Add key press event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addKeyPressEventListener(EventListener<KeyboardEvent> listener, boolean options) {
		addEventListener("keypress", listener, options);
	}

	/**
	 * Add key press event listener.
	 *
	 * @param listener the listener
	 */
	default void addKeyPressEventListener(EventListener<KeyboardEvent> listener) {
		addEventListener("keypress", listener);
	}

	/**
	 * Remove key press event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removeKeyPressEventListener(EventListener<KeyboardEvent> listener, EventListenerOptions options) {
		removeEventListener("keypress", listener, options);
	}

	/**
	 * Remove key press event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removeKeyPressEventListener(EventListener<KeyboardEvent> listener, boolean options) {
		removeEventListener("keypress", listener, options);
	}

	/**
	 * Remove key press event listener.
	 *
	 * @param listener the listener
	 */
	default void removeKeyPressEventListener(EventListener<KeyboardEvent> listener) {
		removeEventListener("keypress", listener);
	}

	/**
	 * Fires when the user releases a key.
	 *
	 *
	 *
	 * @return the onkeyup
	 */
	@JSProperty
	@Nullable
	EventListener<KeyboardEvent> getOnkeyup();

	/**
	 * Sets onkeyup.
	 *
	 * @param onkeyup the onkeyup
	 */
	@JSProperty
	void setOnkeyup(EventListener<KeyboardEvent> onkeyup);

	/**
	 * Add key up event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addKeyUpEventListener(EventListener<KeyboardEvent> listener, AddEventListenerOptions options) {
		addEventListener("keyup", listener, options);
	}

	/**
	 * Add key up event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addKeyUpEventListener(EventListener<KeyboardEvent> listener, boolean options) {
		addEventListener("keyup", listener, options);
	}

	/**
	 * Add key up event listener.
	 *
	 * @param listener the listener
	 */
	default void addKeyUpEventListener(EventListener<KeyboardEvent> listener) {
		addEventListener("keyup", listener);
	}

	/**
	 * Remove key up event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removeKeyUpEventListener(EventListener<KeyboardEvent> listener, EventListenerOptions options) {
		removeEventListener("keyup", listener, options);
	}

	/**
	 * Remove key up event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removeKeyUpEventListener(EventListener<KeyboardEvent> listener, boolean options) {
		removeEventListener("keyup", listener, options);
	}

	/**
	 * Remove key up event listener.
	 *
	 * @param listener the listener
	 */
	default void removeKeyUpEventListener(EventListener<KeyboardEvent> listener) {
		removeEventListener("keyup", listener);
	}

	/**
	 * Fires immediately after the browser loads the object.
	 *
	 * @return the onload
	 */
	@JSProperty
	@Nullable
	EventListener<Event> getOnload();

	/**
	 * Sets onload.
	 *
	 * @param onload the onload
	 */
	@JSProperty
	void setOnload(EventListener<Event> onload);

	/**
	 * Add load event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addLoadEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
		addEventListener("load", listener, options);
	}

	/**
	 * Add load event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addLoadEventListener(EventListener<Event> listener, boolean options) {
		addEventListener("load", listener, options);
	}

	/**
	 * Add load event listener.
	 *
	 * @param listener the listener
	 */
	default void addLoadEventListener(EventListener<Event> listener) {
		addEventListener("load", listener);
	}

	/**
	 * Remove load event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removeLoadEventListener(EventListener<Event> listener, EventListenerOptions options) {
		removeEventListener("load", listener, options);
	}

	/**
	 * Remove load event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removeLoadEventListener(EventListener<Event> listener, boolean options) {
		removeEventListener("load", listener, options);
	}

	/**
	 * Remove load event listener.
	 *
	 * @param listener the listener
	 */
	default void removeLoadEventListener(EventListener<Event> listener) {
		removeEventListener("load", listener);
	}

	/**
	 * Occurs when media data is loaded at the current playback position.
	 *
	 * @return the onloadeddata
	 */
	@JSProperty
	@Nullable
	EventListener<Event> getOnloadeddata();

	/**
	 * Sets onloadeddata.
	 *
	 * @param onloadeddata the onloadeddata
	 */
	@JSProperty
	void setOnloadeddata(EventListener<Event> onloadeddata);

	/**
	 * Add loaded data event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addLoadedDataEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
		addEventListener("loadeddata", listener, options);
	}

	/**
	 * Add loaded data event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addLoadedDataEventListener(EventListener<Event> listener, boolean options) {
		addEventListener("loadeddata", listener, options);
	}

	/**
	 * Add loaded data event listener.
	 *
	 * @param listener the listener
	 */
	default void addLoadedDataEventListener(EventListener<Event> listener) {
		addEventListener("loadeddata", listener);
	}

	/**
	 * Remove loaded data event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removeLoadedDataEventListener(EventListener<Event> listener, EventListenerOptions options) {
		removeEventListener("loadeddata", listener, options);
	}

	/**
	 * Remove loaded data event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removeLoadedDataEventListener(EventListener<Event> listener, boolean options) {
		removeEventListener("loadeddata", listener, options);
	}

	/**
	 * Remove loaded data event listener.
	 *
	 * @param listener the listener
	 */
	default void removeLoadedDataEventListener(EventListener<Event> listener) {
		removeEventListener("loadeddata", listener);
	}

	/**
	 * Occurs when the duration and dimensions of the media have been determined.
	 *
	 * @return the onloadedmetadata
	 */
	@JSProperty
	@Nullable
	EventListener<Event> getOnloadedmetadata();

	/**
	 * Sets onloadedmetadata.
	 *
	 * @param onloadedmetadata the onloadedmetadata
	 */
	@JSProperty
	void setOnloadedmetadata(EventListener<Event> onloadedmetadata);

	/**
	 * Add loaded meta data event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addLoadedMetaDataEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
		addEventListener("loadedmetadata", listener, options);
	}

	/**
	 * Add loaded meta data event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addLoadedMetaDataEventListener(EventListener<Event> listener, boolean options) {
		addEventListener("loadedmetadata", listener, options);
	}

	/**
	 * Add loaded meta data event listener.
	 *
	 * @param listener the listener
	 */
	default void addLoadedMetaDataEventListener(EventListener<Event> listener) {
		addEventListener("loadedmetadata", listener);
	}

	/**
	 * Remove loaded meta data event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removeLoadedMetaDataEventListener(EventListener<Event> listener, EventListenerOptions options) {
		removeEventListener("loadedmetadata", listener, options);
	}

	/**
	 * Remove loaded meta data event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removeLoadedMetaDataEventListener(EventListener<Event> listener, boolean options) {
		removeEventListener("loadedmetadata", listener, options);
	}

	/**
	 * Remove loaded meta data event listener.
	 *
	 * @param listener the listener
	 */
	default void removeLoadedMetaDataEventListener(EventListener<Event> listener) {
		removeEventListener("loadedmetadata", listener);
	}

	/**
	 * Gets onloadend.
	 *
	 * @return the onloadend
	 */
	@JSProperty
	@Nullable
	EventListener<ProgressEvent> getOnloadend();

	/**
	 * Sets onloadend.
	 *
	 * @param onloadend the onloadend
	 */
	@JSProperty
	void setOnloadend(EventListener<ProgressEvent> onloadend);

	/**
	 * Add load end event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addLoadEndEventListener(EventListener<ProgressEvent> listener, AddEventListenerOptions options) {
		addEventListener("loadend", listener, options);
	}

	/**
	 * Add load end event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addLoadEndEventListener(EventListener<ProgressEvent> listener, boolean options) {
		addEventListener("loadend", listener, options);
	}

	/**
	 * Add load end event listener.
	 *
	 * @param listener the listener
	 */
	default void addLoadEndEventListener(EventListener<ProgressEvent> listener) {
		addEventListener("loadend", listener);
	}

	/**
	 * Remove load end event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removeLoadEndEventListener(EventListener<ProgressEvent> listener, EventListenerOptions options) {
		removeEventListener("loadend", listener, options);
	}

	/**
	 * Remove load end event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removeLoadEndEventListener(EventListener<ProgressEvent> listener, boolean options) {
		removeEventListener("loadend", listener, options);
	}

	/**
	 * Remove load end event listener.
	 *
	 * @param listener the listener
	 */
	default void removeLoadEndEventListener(EventListener<ProgressEvent> listener) {
		removeEventListener("loadend", listener);
	}

	/**
	 * Occurs when Internet Explorer begins looking for media data.
	 *
	 * @return the onloadstart
	 */
	@JSProperty
	@Nullable
	EventListener<Event> getOnloadstart();

	/**
	 * Sets onloadstart.
	 *
	 * @param onloadstart the onloadstart
	 */
	@JSProperty
	void setOnloadstart(EventListener<Event> onloadstart);

	/**
	 * Add load start event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addLoadStartEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
		addEventListener("loadstart", listener, options);
	}

	/**
	 * Add load start event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addLoadStartEventListener(EventListener<Event> listener, boolean options) {
		addEventListener("loadstart", listener, options);
	}

	/**
	 * Add load start event listener.
	 *
	 * @param listener the listener
	 */
	default void addLoadStartEventListener(EventListener<Event> listener) {
		addEventListener("loadstart", listener);
	}

	/**
	 * Remove load start event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removeLoadStartEventListener(EventListener<Event> listener, EventListenerOptions options) {
		removeEventListener("loadstart", listener, options);
	}

	/**
	 * Remove load start event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removeLoadStartEventListener(EventListener<Event> listener, boolean options) {
		removeEventListener("loadstart", listener, options);
	}

	/**
	 * Remove load start event listener.
	 *
	 * @param listener the listener
	 */
	default void removeLoadStartEventListener(EventListener<Event> listener) {
		removeEventListener("loadstart", listener);
	}

	/**
	 * Gets onlostpointercapture.
	 *
	 * @return the onlostpointercapture
	 */
	@JSProperty
	@Nullable
	EventListener<PointerEvent> getOnlostpointercapture();

	/**
	 * Sets onlostpointercapture.
	 *
	 * @param onlostpointercapture the onlostpointercapture
	 */
	@JSProperty
	void setOnlostpointercapture(EventListener<PointerEvent> onlostpointercapture);

	/**
	 * Add lost pointer capture event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addLostPointerCaptureEventListener(EventListener<PointerEvent> listener,
													AddEventListenerOptions options) {
		addEventListener("lostpointercapture", listener, options);
	}

	/**
	 * Add lost pointer capture event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addLostPointerCaptureEventListener(EventListener<PointerEvent> listener, boolean options) {
		addEventListener("lostpointercapture", listener, options);
	}

	/**
	 * Add lost pointer capture event listener.
	 *
	 * @param listener the listener
	 */
	default void addLostPointerCaptureEventListener(EventListener<PointerEvent> listener) {
		addEventListener("lostpointercapture", listener);
	}

	/**
	 * Remove lost pointer capture event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removeLostPointerCaptureEventListener(EventListener<PointerEvent> listener,
													   EventListenerOptions options) {
		removeEventListener("lostpointercapture", listener, options);
	}

	/**
	 * Remove lost pointer capture event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removeLostPointerCaptureEventListener(EventListener<PointerEvent> listener, boolean options) {
		removeEventListener("lostpointercapture", listener, options);
	}

	/**
	 * Remove lost pointer capture event listener.
	 *
	 * @param listener the listener
	 */
	default void removeLostPointerCaptureEventListener(EventListener<PointerEvent> listener) {
		removeEventListener("lostpointercapture", listener);
	}

	/**
	 * Fires when the user clicks the object with either mouse button.
	 *
	 *
	 *
	 * @return the onmousedown
	 */
	@JSProperty
	@Nullable
	EventListener<MouseEvent> getOnmousedown();

	/**
	 * Sets onmousedown.
	 *
	 * @param onmousedown the onmousedown
	 */
	@JSProperty
	void setOnmousedown(EventListener<MouseEvent> onmousedown);

	/**
	 * Add mouse down event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addMouseDownEventListener(EventListener<MouseEvent> listener, AddEventListenerOptions options) {
		addEventListener("mousedown", listener, options);
	}

	/**
	 * Add mouse down event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addMouseDownEventListener(EventListener<MouseEvent> listener, boolean options) {
		addEventListener("mousedown", listener, options);
	}

	/**
	 * Add mouse down event listener.
	 *
	 * @param listener the listener
	 */
	default void addMouseDownEventListener(EventListener<MouseEvent> listener) {
		addEventListener("mousedown", listener);
	}

	/**
	 * Remove mouse down event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removeMouseDownEventListener(EventListener<MouseEvent> listener, EventListenerOptions options) {
		removeEventListener("mousedown", listener, options);
	}

	/**
	 * Remove mouse down event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removeMouseDownEventListener(EventListener<MouseEvent> listener, boolean options) {
		removeEventListener("mousedown", listener, options);
	}

	/**
	 * Remove mouse down event listener.
	 *
	 * @param listener the listener
	 */
	default void removeMouseDownEventListener(EventListener<MouseEvent> listener) {
		removeEventListener("mousedown", listener);
	}

	/**
	 * Gets onmouseenter.
	 *
	 * @return the onmouseenter
	 */
	@JSProperty
	@Nullable
	EventListener<MouseEvent> getOnmouseenter();

	/**
	 * Sets onmouseenter.
	 *
	 * @param onmouseenter the onmouseenter
	 */
	@JSProperty
	void setOnmouseenter(EventListener<MouseEvent> onmouseenter);

	/**
	 * Add mouse enter event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addMouseEnterEventListener(EventListener<MouseEvent> listener, AddEventListenerOptions options) {
		addEventListener("mouseenter", listener, options);
	}

	/**
	 * Add mouse enter event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addMouseEnterEventListener(EventListener<MouseEvent> listener, boolean options) {
		addEventListener("mouseenter", listener, options);
	}

	/**
	 * Add mouse enter event listener.
	 *
	 * @param listener the listener
	 */
	default void addMouseEnterEventListener(EventListener<MouseEvent> listener) {
		addEventListener("mouseenter", listener);
	}

	/**
	 * Remove mouse enter event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removeMouseEnterEventListener(EventListener<MouseEvent> listener, EventListenerOptions options) {
		removeEventListener("mouseenter", listener, options);
	}

	/**
	 * Remove mouse enter event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removeMouseEnterEventListener(EventListener<MouseEvent> listener, boolean options) {
		removeEventListener("mouseenter", listener, options);
	}

	/**
	 * Remove mouse enter event listener.
	 *
	 * @param listener the listener
	 */
	default void removeMouseEnterEventListener(EventListener<MouseEvent> listener) {
		removeEventListener("mouseenter", listener);
	}

	/**
	 * Gets onmouseleave.
	 *
	 * @return the onmouseleave
	 */
	@JSProperty
	@Nullable
	EventListener<MouseEvent> getOnmouseleave();

	/**
	 * Sets onmouseleave.
	 *
	 * @param onmouseleave the onmouseleave
	 */
	@JSProperty
	void setOnmouseleave(EventListener<MouseEvent> onmouseleave);

	/**
	 * Add mouse leave event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addMouseLeaveEventListener(EventListener<MouseEvent> listener, AddEventListenerOptions options) {
		addEventListener("mouseleave", listener, options);
	}

	/**
	 * Add mouse leave event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addMouseLeaveEventListener(EventListener<MouseEvent> listener, boolean options) {
		addEventListener("mouseleave", listener, options);
	}

	/**
	 * Add mouse leave event listener.
	 *
	 * @param listener the listener
	 */
	default void addMouseLeaveEventListener(EventListener<MouseEvent> listener) {
		addEventListener("mouseleave", listener);
	}

	/**
	 * Remove mouse leave event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removeMouseLeaveEventListener(EventListener<MouseEvent> listener, EventListenerOptions options) {
		removeEventListener("mouseleave", listener, options);
	}

	/**
	 * Remove mouse leave event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removeMouseLeaveEventListener(EventListener<MouseEvent> listener, boolean options) {
		removeEventListener("mouseleave", listener, options);
	}

	/**
	 * Remove mouse leave event listener.
	 *
	 * @param listener the listener
	 */
	default void removeMouseLeaveEventListener(EventListener<MouseEvent> listener) {
		removeEventListener("mouseleave", listener);
	}

	/**
	 * Fires when the user moves the mouse over the object.
	 *
	 *
	 *
	 * @return the onmousemove
	 */
	@JSProperty
	@Nullable
	EventListener<MouseEvent> getOnmousemove();

	/**
	 * Sets onmousemove.
	 *
	 * @param onmousemove the onmousemove
	 */
	@JSProperty
	void setOnmousemove(EventListener<MouseEvent> onmousemove);

	/**
	 * Add mouse move event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addMouseMoveEventListener(EventListener<MouseEvent> listener, AddEventListenerOptions options) {
		addEventListener("mousemove", listener, options);
	}

	/**
	 * Add mouse move event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addMouseMoveEventListener(EventListener<MouseEvent> listener, boolean options) {
		addEventListener("mousemove", listener, options);
	}

	/**
	 * Add mouse move event listener.
	 *
	 * @param listener the listener
	 */
	default void addMouseMoveEventListener(EventListener<MouseEvent> listener) {
		addEventListener("mousemove", listener);
	}

	/**
	 * Remove mouse move event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removeMouseMoveEventListener(EventListener<MouseEvent> listener, EventListenerOptions options) {
		removeEventListener("mousemove", listener, options);
	}

	/**
	 * Remove mouse move event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removeMouseMoveEventListener(EventListener<MouseEvent> listener, boolean options) {
		removeEventListener("mousemove", listener, options);
	}

	/**
	 * Remove mouse move event listener.
	 *
	 * @param listener the listener
	 */
	default void removeMouseMoveEventListener(EventListener<MouseEvent> listener) {
		removeEventListener("mousemove", listener);
	}

	/**
	 * Fires when the user moves the mouse pointer outside the boundaries of the object.
	 *
	 *
	 *
	 * @return the onmouseout
	 */
	@JSProperty
	@Nullable
	EventListener<MouseEvent> getOnmouseout();

	/**
	 * Sets onmouseout.
	 *
	 * @param onmouseout the onmouseout
	 */
	@JSProperty
	void setOnmouseout(EventListener<MouseEvent> onmouseout);

	/**
	 * Add mouse out event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addMouseOutEventListener(EventListener<MouseEvent> listener, AddEventListenerOptions options) {
		addEventListener("mouseout", listener, options);
	}

	/**
	 * Add mouse out event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addMouseOutEventListener(EventListener<MouseEvent> listener, boolean options) {
		addEventListener("mouseout", listener, options);
	}

	/**
	 * Add mouse out event listener.
	 *
	 * @param listener the listener
	 */
	default void addMouseOutEventListener(EventListener<MouseEvent> listener) {
		addEventListener("mouseout", listener);
	}

	/**
	 * Remove mouse out event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removeMouseOutEventListener(EventListener<MouseEvent> listener, EventListenerOptions options) {
		removeEventListener("mouseout", listener, options);
	}

	/**
	 * Remove mouse out event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removeMouseOutEventListener(EventListener<MouseEvent> listener, boolean options) {
		removeEventListener("mouseout", listener, options);
	}

	/**
	 * Remove mouse out event listener.
	 *
	 * @param listener the listener
	 */
	default void removeMouseOutEventListener(EventListener<MouseEvent> listener) {
		removeEventListener("mouseout", listener);
	}

	/**
	 * Fires when the user moves the mouse pointer into the object.
	 *
	 *
	 *
	 * @return the onmouseover
	 */
	@JSProperty
	@Nullable
	EventListener<MouseEvent> getOnmouseover();

	/**
	 * Sets onmouseover.
	 *
	 * @param onmouseover the onmouseover
	 */
	@JSProperty
	void setOnmouseover(EventListener<MouseEvent> onmouseover);

	/**
	 * Add mouse over event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addMouseOverEventListener(EventListener<MouseEvent> listener, AddEventListenerOptions options) {
		addEventListener("mouseover", listener, options);
	}

	/**
	 * Add mouse over event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addMouseOverEventListener(EventListener<MouseEvent> listener, boolean options) {
		addEventListener("mouseover", listener, options);
	}

	/**
	 * Add mouse over event listener.
	 *
	 * @param listener the listener
	 */
	default void addMouseOverEventListener(EventListener<MouseEvent> listener) {
		addEventListener("mouseover", listener);
	}

	/**
	 * Remove mouse over event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removeMouseOverEventListener(EventListener<MouseEvent> listener, EventListenerOptions options) {
		removeEventListener("mouseover", listener, options);
	}

	/**
	 * Remove mouse over event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removeMouseOverEventListener(EventListener<MouseEvent> listener, boolean options) {
		removeEventListener("mouseover", listener, options);
	}

	/**
	 * Remove mouse over event listener.
	 *
	 * @param listener the listener
	 */
	default void removeMouseOverEventListener(EventListener<MouseEvent> listener) {
		removeEventListener("mouseover", listener);
	}

	/**
	 * Fires when the user releases a mouse button while the mouse is over the object.
	 *
	 *
	 *
	 * @return the onmouseup
	 */
	@JSProperty
	@Nullable
	EventListener<MouseEvent> getOnmouseup();

	/**
	 * Sets onmouseup.
	 *
	 * @param onmouseup the onmouseup
	 */
	@JSProperty
	void setOnmouseup(EventListener<MouseEvent> onmouseup);

	/**
	 * Add mouse up event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addMouseUpEventListener(EventListener<MouseEvent> listener, AddEventListenerOptions options) {
		addEventListener("mouseup", listener, options);
	}

	/**
	 * Add mouse up event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addMouseUpEventListener(EventListener<MouseEvent> listener, boolean options) {
		addEventListener("mouseup", listener, options);
	}

	/**
	 * Add mouse up event listener.
	 *
	 * @param listener the listener
	 */
	default void addMouseUpEventListener(EventListener<MouseEvent> listener) {
		addEventListener("mouseup", listener);
	}

	/**
	 * Remove mouse up event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removeMouseUpEventListener(EventListener<MouseEvent> listener, EventListenerOptions options) {
		removeEventListener("mouseup", listener, options);
	}

	/**
	 * Remove mouse up event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removeMouseUpEventListener(EventListener<MouseEvent> listener, boolean options) {
		removeEventListener("mouseup", listener, options);
	}

	/**
	 * Remove mouse up event listener.
	 *
	 * @param listener the listener
	 */
	default void removeMouseUpEventListener(EventListener<MouseEvent> listener) {
		removeEventListener("mouseup", listener);
	}

	/**
	 * Occurs when playback is paused.
	 *
	 * @return the onpause
	 */
	@JSProperty
	@Nullable
	EventListener<Event> getOnpause();

	/**
	 * Sets onpause.
	 *
	 * @param onpause the onpause
	 */
	@JSProperty
	void setOnpause(EventListener<Event> onpause);

	/**
	 * Add pause event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addPauseEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
		addEventListener("pause", listener, options);
	}

	/**
	 * Add pause event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addPauseEventListener(EventListener<Event> listener, boolean options) {
		addEventListener("pause", listener, options);
	}

	/**
	 * Add pause event listener.
	 *
	 * @param listener the listener
	 */
	default void addPauseEventListener(EventListener<Event> listener) {
		addEventListener("pause", listener);
	}

	/**
	 * Remove pause event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removePauseEventListener(EventListener<Event> listener, EventListenerOptions options) {
		removeEventListener("pause", listener, options);
	}

	/**
	 * Remove pause event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removePauseEventListener(EventListener<Event> listener, boolean options) {
		removeEventListener("pause", listener, options);
	}

	/**
	 * Remove pause event listener.
	 *
	 * @param listener the listener
	 */
	default void removePauseEventListener(EventListener<Event> listener) {
		removeEventListener("pause", listener);
	}

	/**
	 * Occurs when the play method is requested.
	 *
	 * @return the onplay
	 */
	@JSProperty
	@Nullable
	EventListener<Event> getOnplay();

	/**
	 * Sets onplay.
	 *
	 * @param onplay the onplay
	 */
	@JSProperty
	void setOnplay(EventListener<Event> onplay);

	/**
	 * Add play event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addPlayEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
		addEventListener("play", listener, options);
	}

	/**
	 * Add play event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addPlayEventListener(EventListener<Event> listener, boolean options) {
		addEventListener("play", listener, options);
	}

	/**
	 * Add play event listener.
	 *
	 * @param listener the listener
	 */
	default void addPlayEventListener(EventListener<Event> listener) {
		addEventListener("play", listener);
	}

	/**
	 * Remove play event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removePlayEventListener(EventListener<Event> listener, EventListenerOptions options) {
		removeEventListener("play", listener, options);
	}

	/**
	 * Remove play event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removePlayEventListener(EventListener<Event> listener, boolean options) {
		removeEventListener("play", listener, options);
	}

	/**
	 * Remove play event listener.
	 *
	 * @param listener the listener
	 */
	default void removePlayEventListener(EventListener<Event> listener) {
		removeEventListener("play", listener);
	}

	/**
	 * Occurs when the audio or video has started playing.
	 *
	 * @return the onplaying
	 */
	@JSProperty
	@Nullable
	EventListener<Event> getOnplaying();

	/**
	 * Sets onplaying.
	 *
	 * @param onplaying the onplaying
	 */
	@JSProperty
	void setOnplaying(EventListener<Event> onplaying);

	/**
	 * Add playing event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addPlayingEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
		addEventListener("playing", listener, options);
	}

	/**
	 * Add playing event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addPlayingEventListener(EventListener<Event> listener, boolean options) {
		addEventListener("playing", listener, options);
	}

	/**
	 * Add playing event listener.
	 *
	 * @param listener the listener
	 */
	default void addPlayingEventListener(EventListener<Event> listener) {
		addEventListener("playing", listener);
	}

	/**
	 * Remove playing event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removePlayingEventListener(EventListener<Event> listener, EventListenerOptions options) {
		removeEventListener("playing", listener, options);
	}

	/**
	 * Remove playing event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removePlayingEventListener(EventListener<Event> listener, boolean options) {
		removeEventListener("playing", listener, options);
	}

	/**
	 * Remove playing event listener.
	 *
	 * @param listener the listener
	 */
	default void removePlayingEventListener(EventListener<Event> listener) {
		removeEventListener("playing", listener);
	}

	/**
	 * Gets onpointercancel.
	 *
	 * @return the onpointercancel
	 */
	@JSProperty
	@Nullable
	EventListener<PointerEvent> getOnpointercancel();

	/**
	 * Sets onpointercancel.
	 *
	 * @param onpointercancel the onpointercancel
	 */
	@JSProperty
	void setOnpointercancel(EventListener<PointerEvent> onpointercancel);

	/**
	 * Add pointer cancel event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addPointerCancelEventListener(EventListener<PointerEvent> listener, AddEventListenerOptions options) {
		addEventListener("pointercancel", listener, options);
	}

	/**
	 * Add pointer cancel event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addPointerCancelEventListener(EventListener<PointerEvent> listener, boolean options) {
		addEventListener("pointercancel", listener, options);
	}

	/**
	 * Add pointer cancel event listener.
	 *
	 * @param listener the listener
	 */
	default void addPointerCancelEventListener(EventListener<PointerEvent> listener) {
		addEventListener("pointercancel", listener);
	}

	/**
	 * Remove pointer cancel event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removePointerCancelEventListener(EventListener<PointerEvent> listener, EventListenerOptions options) {
		removeEventListener("pointercancel", listener, options);
	}

	/**
	 * Remove pointer cancel event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removePointerCancelEventListener(EventListener<PointerEvent> listener, boolean options) {
		removeEventListener("pointercancel", listener, options);
	}

	/**
	 * Remove pointer cancel event listener.
	 *
	 * @param listener the listener
	 */
	default void removePointerCancelEventListener(EventListener<PointerEvent> listener) {
		removeEventListener("pointercancel", listener);
	}

	/**
	 * Gets onpointerdown.
	 *
	 * @return the onpointerdown
	 */
	@JSProperty
	@Nullable
	EventListener<PointerEvent> getOnpointerdown();

	/**
	 * Sets onpointerdown.
	 *
	 * @param onpointerdown the onpointerdown
	 */
	@JSProperty
	void setOnpointerdown(EventListener<PointerEvent> onpointerdown);

	/**
	 * Add pointer down event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addPointerDownEventListener(EventListener<PointerEvent> listener, AddEventListenerOptions options) {
		addEventListener("pointerdown", listener, options);
	}

	/**
	 * Add pointer down event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addPointerDownEventListener(EventListener<PointerEvent> listener, boolean options) {
		addEventListener("pointerdown", listener, options);
	}

	/**
	 * Add pointer down event listener.
	 *
	 * @param listener the listener
	 */
	default void addPointerDownEventListener(EventListener<PointerEvent> listener) {
		addEventListener("pointerdown", listener);
	}

	/**
	 * Remove pointer down event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removePointerDownEventListener(EventListener<PointerEvent> listener, EventListenerOptions options) {
		removeEventListener("pointerdown", listener, options);
	}

	/**
	 * Remove pointer down event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removePointerDownEventListener(EventListener<PointerEvent> listener, boolean options) {
		removeEventListener("pointerdown", listener, options);
	}

	/**
	 * Remove pointer down event listener.
	 *
	 * @param listener the listener
	 */
	default void removePointerDownEventListener(EventListener<PointerEvent> listener) {
		removeEventListener("pointerdown", listener);
	}

	/**
	 * Gets onpointerenter.
	 *
	 * @return the onpointerenter
	 */
	@JSProperty
	@Nullable
	EventListener<PointerEvent> getOnpointerenter();

	/**
	 * Sets onpointerenter.
	 *
	 * @param onpointerenter the onpointerenter
	 */
	@JSProperty
	void setOnpointerenter(EventListener<PointerEvent> onpointerenter);

	/**
	 * Add pointer enter event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addPointerEnterEventListener(EventListener<PointerEvent> listener, AddEventListenerOptions options) {
		addEventListener("pointerenter", listener, options);
	}

	/**
	 * Add pointer enter event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addPointerEnterEventListener(EventListener<PointerEvent> listener, boolean options) {
		addEventListener("pointerenter", listener, options);
	}

	/**
	 * Add pointer enter event listener.
	 *
	 * @param listener the listener
	 */
	default void addPointerEnterEventListener(EventListener<PointerEvent> listener) {
		addEventListener("pointerenter", listener);
	}

	/**
	 * Remove pointer enter event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removePointerEnterEventListener(EventListener<PointerEvent> listener, EventListenerOptions options) {
		removeEventListener("pointerenter", listener, options);
	}

	/**
	 * Remove pointer enter event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removePointerEnterEventListener(EventListener<PointerEvent> listener, boolean options) {
		removeEventListener("pointerenter", listener, options);
	}

	/**
	 * Remove pointer enter event listener.
	 *
	 * @param listener the listener
	 */
	default void removePointerEnterEventListener(EventListener<PointerEvent> listener) {
		removeEventListener("pointerenter", listener);
	}

	/**
	 * Gets onpointerleave.
	 *
	 * @return the onpointerleave
	 */
	@JSProperty
	@Nullable
	EventListener<PointerEvent> getOnpointerleave();

	/**
	 * Sets onpointerleave.
	 *
	 * @param onpointerleave the onpointerleave
	 */
	@JSProperty
	void setOnpointerleave(EventListener<PointerEvent> onpointerleave);

	/**
	 * Add pointer leave event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addPointerLeaveEventListener(EventListener<PointerEvent> listener, AddEventListenerOptions options) {
		addEventListener("pointerleave", listener, options);
	}

	/**
	 * Add pointer leave event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addPointerLeaveEventListener(EventListener<PointerEvent> listener, boolean options) {
		addEventListener("pointerleave", listener, options);
	}

	/**
	 * Add pointer leave event listener.
	 *
	 * @param listener the listener
	 */
	default void addPointerLeaveEventListener(EventListener<PointerEvent> listener) {
		addEventListener("pointerleave", listener);
	}

	/**
	 * Remove pointer leave event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removePointerLeaveEventListener(EventListener<PointerEvent> listener, EventListenerOptions options) {
		removeEventListener("pointerleave", listener, options);
	}

	/**
	 * Remove pointer leave event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removePointerLeaveEventListener(EventListener<PointerEvent> listener, boolean options) {
		removeEventListener("pointerleave", listener, options);
	}

	/**
	 * Remove pointer leave event listener.
	 *
	 * @param listener the listener
	 */
	default void removePointerLeaveEventListener(EventListener<PointerEvent> listener) {
		removeEventListener("pointerleave", listener);
	}

	/**
	 * Gets onpointermove.
	 *
	 * @return the onpointermove
	 */
	@JSProperty
	@Nullable
	EventListener<PointerEvent> getOnpointermove();

	/**
	 * Sets onpointermove.
	 *
	 * @param onpointermove the onpointermove
	 */
	@JSProperty
	void setOnpointermove(EventListener<PointerEvent> onpointermove);

	/**
	 * Add pointer move event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addPointerMoveEventListener(EventListener<PointerEvent> listener, AddEventListenerOptions options) {
		addEventListener("pointermove", listener, options);
	}

	/**
	 * Add pointer move event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addPointerMoveEventListener(EventListener<PointerEvent> listener, boolean options) {
		addEventListener("pointermove", listener, options);
	}

	/**
	 * Add pointer move event listener.
	 *
	 * @param listener the listener
	 */
	default void addPointerMoveEventListener(EventListener<PointerEvent> listener) {
		addEventListener("pointermove", listener);
	}

	/**
	 * Remove pointer move event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removePointerMoveEventListener(EventListener<PointerEvent> listener, EventListenerOptions options) {
		removeEventListener("pointermove", listener, options);
	}

	/**
	 * Remove pointer move event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removePointerMoveEventListener(EventListener<PointerEvent> listener, boolean options) {
		removeEventListener("pointermove", listener, options);
	}

	/**
	 * Remove pointer move event listener.
	 *
	 * @param listener the listener
	 */
	default void removePointerMoveEventListener(EventListener<PointerEvent> listener) {
		removeEventListener("pointermove", listener);
	}

	/**
	 * Gets onpointerout.
	 *
	 * @return the onpointerout
	 */
	@JSProperty
	@Nullable
	EventListener<PointerEvent> getOnpointerout();

	/**
	 * Sets onpointerout.
	 *
	 * @param onpointerout the onpointerout
	 */
	@JSProperty
	void setOnpointerout(EventListener<PointerEvent> onpointerout);

	/**
	 * Add pointer out event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addPointerOutEventListener(EventListener<PointerEvent> listener, AddEventListenerOptions options) {
		addEventListener("pointerout", listener, options);
	}

	/**
	 * Add pointer out event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addPointerOutEventListener(EventListener<PointerEvent> listener, boolean options) {
		addEventListener("pointerout", listener, options);
	}

	/**
	 * Add pointer out event listener.
	 *
	 * @param listener the listener
	 */
	default void addPointerOutEventListener(EventListener<PointerEvent> listener) {
		addEventListener("pointerout", listener);
	}

	/**
	 * Remove pointer out event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removePointerOutEventListener(EventListener<PointerEvent> listener, EventListenerOptions options) {
		removeEventListener("pointerout", listener, options);
	}

	/**
	 * Remove pointer out event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removePointerOutEventListener(EventListener<PointerEvent> listener, boolean options) {
		removeEventListener("pointerout", listener, options);
	}

	/**
	 * Remove pointer out event listener.
	 *
	 * @param listener the listener
	 */
	default void removePointerOutEventListener(EventListener<PointerEvent> listener) {
		removeEventListener("pointerout", listener);
	}

	/**
	 * Gets onpointerover.
	 *
	 * @return the onpointerover
	 */
	@JSProperty
	@Nullable
	EventListener<PointerEvent> getOnpointerover();

	/**
	 * Sets onpointerover.
	 *
	 * @param onpointerover the onpointerover
	 */
	@JSProperty
	void setOnpointerover(EventListener<PointerEvent> onpointerover);

	/**
	 * Add pointer over event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addPointerOverEventListener(EventListener<PointerEvent> listener, AddEventListenerOptions options) {
		addEventListener("pointerover", listener, options);
	}

	/**
	 * Add pointer over event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addPointerOverEventListener(EventListener<PointerEvent> listener, boolean options) {
		addEventListener("pointerover", listener, options);
	}

	/**
	 * Add pointer over event listener.
	 *
	 * @param listener the listener
	 */
	default void addPointerOverEventListener(EventListener<PointerEvent> listener) {
		addEventListener("pointerover", listener);
	}

	/**
	 * Remove pointer over event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removePointerOverEventListener(EventListener<PointerEvent> listener, EventListenerOptions options) {
		removeEventListener("pointerover", listener, options);
	}

	/**
	 * Remove pointer over event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removePointerOverEventListener(EventListener<PointerEvent> listener, boolean options) {
		removeEventListener("pointerover", listener, options);
	}

	/**
	 * Remove pointer over event listener.
	 *
	 * @param listener the listener
	 */
	default void removePointerOverEventListener(EventListener<PointerEvent> listener) {
		removeEventListener("pointerover", listener);
	}

	/**
	 * Gets onpointerup.
	 *
	 * @return the onpointerup
	 */
	@JSProperty
	@Nullable
	EventListener<PointerEvent> getOnpointerup();

	/**
	 * Sets onpointerup.
	 *
	 * @param onpointerup the onpointerup
	 */
	@JSProperty
	void setOnpointerup(EventListener<PointerEvent> onpointerup);

	/**
	 * Add pointer up event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addPointerUpEventListener(EventListener<PointerEvent> listener, AddEventListenerOptions options) {
		addEventListener("pointerup", listener, options);
	}

	/**
	 * Add pointer up event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addPointerUpEventListener(EventListener<PointerEvent> listener, boolean options) {
		addEventListener("pointerup", listener, options);
	}

	/**
	 * Add pointer up event listener.
	 *
	 * @param listener the listener
	 */
	default void addPointerUpEventListener(EventListener<PointerEvent> listener) {
		addEventListener("pointerup", listener);
	}

	/**
	 * Remove pointer up event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removePointerUpEventListener(EventListener<PointerEvent> listener, EventListenerOptions options) {
		removeEventListener("pointerup", listener, options);
	}

	/**
	 * Remove pointer up event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removePointerUpEventListener(EventListener<PointerEvent> listener, boolean options) {
		removeEventListener("pointerup", listener, options);
	}

	/**
	 * Remove pointer up event listener.
	 *
	 * @param listener the listener
	 */
	default void removePointerUpEventListener(EventListener<PointerEvent> listener) {
		removeEventListener("pointerup", listener);
	}

	/**
	 * Occurs to indicate progress while downloading media data.
	 *
	 * @return the onprogress
	 */
	@JSProperty
	@Nullable
	EventListener<ProgressEvent> getOnprogress();

	/**
	 * Sets onprogress.
	 *
	 * @param onprogress the onprogress
	 */
	@JSProperty
	void setOnprogress(EventListener<ProgressEvent> onprogress);

	/**
	 * Add progress event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addProgressEventListener(EventListener<ProgressEvent> listener, AddEventListenerOptions options) {
		addEventListener("progress", listener, options);
	}

	/**
	 * Add progress event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addProgressEventListener(EventListener<ProgressEvent> listener, boolean options) {
		addEventListener("progress", listener, options);
	}

	/**
	 * Add progress event listener.
	 *
	 * @param listener the listener
	 */
	default void addProgressEventListener(EventListener<ProgressEvent> listener) {
		addEventListener("progress", listener);
	}

	/**
	 * Remove progress event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removeProgressEventListener(EventListener<ProgressEvent> listener, EventListenerOptions options) {
		removeEventListener("progress", listener, options);
	}

	/**
	 * Remove progress event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removeProgressEventListener(EventListener<ProgressEvent> listener, boolean options) {
		removeEventListener("progress", listener, options);
	}

	/**
	 * Remove progress event listener.
	 *
	 * @param listener the listener
	 */
	default void removeProgressEventListener(EventListener<ProgressEvent> listener) {
		removeEventListener("progress", listener);
	}

	/**
	 * Occurs when the playback rate is increased or decreased.
	 *
	 * @return the onratechange
	 */
	@JSProperty
	@Nullable
	EventListener<Event> getOnratechange();

	/**
	 * Sets onratechange.
	 *
	 * @param onratechange the onratechange
	 */
	@JSProperty
	void setOnratechange(EventListener<Event> onratechange);

	/**
	 * Add rate change event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addRateChangeEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
		addEventListener("ratechange", listener, options);
	}

	/**
	 * Add rate change event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addRateChangeEventListener(EventListener<Event> listener, boolean options) {
		addEventListener("ratechange", listener, options);
	}

	/**
	 * Add rate change event listener.
	 *
	 * @param listener the listener
	 */
	default void addRateChangeEventListener(EventListener<Event> listener) {
		addEventListener("ratechange", listener);
	}

	/**
	 * Remove rate change event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removeRateChangeEventListener(EventListener<Event> listener, EventListenerOptions options) {
		removeEventListener("ratechange", listener, options);
	}

	/**
	 * Remove rate change event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removeRateChangeEventListener(EventListener<Event> listener, boolean options) {
		removeEventListener("ratechange", listener, options);
	}

	/**
	 * Remove rate change event listener.
	 *
	 * @param listener the listener
	 */
	default void removeRateChangeEventListener(EventListener<Event> listener) {
		removeEventListener("ratechange", listener);
	}

	/**
	 * Fires when the user resets a form.
	 *
	 * @return the onreset
	 */
	@JSProperty
	@Nullable
	EventListener<Event> getOnreset();

	/**
	 * Sets onreset.
	 *
	 * @param onreset the onreset
	 */
	@JSProperty
	void setOnreset(EventListener<Event> onreset);

	/**
	 * Add reset event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addResetEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
		addEventListener("reset", listener, options);
	}

	/**
	 * Add reset event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addResetEventListener(EventListener<Event> listener, boolean options) {
		addEventListener("reset", listener, options);
	}

	/**
	 * Add reset event listener.
	 *
	 * @param listener the listener
	 */
	default void addResetEventListener(EventListener<Event> listener) {
		addEventListener("reset", listener);
	}

	/**
	 * Remove reset event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removeResetEventListener(EventListener<Event> listener, EventListenerOptions options) {
		removeEventListener("reset", listener, options);
	}

	/**
	 * Remove reset event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removeResetEventListener(EventListener<Event> listener, boolean options) {
		removeEventListener("reset", listener, options);
	}

	/**
	 * Remove reset event listener.
	 *
	 * @param listener the listener
	 */
	default void removeResetEventListener(EventListener<Event> listener) {
		removeEventListener("reset", listener);
	}

	/**
	 * Gets onresize.
	 *
	 * @return the onresize
	 */
	@JSProperty
	@Nullable
	EventListener<UIEvent> getOnresize();

	/**
	 * Sets onresize.
	 *
	 * @param onresize the onresize
	 */
	@JSProperty
	void setOnresize(EventListener<UIEvent> onresize);

	/**
	 * Add resize event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addResizeEventListener(EventListener<UIEvent> listener, AddEventListenerOptions options) {
		addEventListener("resize", listener, options);
	}

	/**
	 * Add resize event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addResizeEventListener(EventListener<UIEvent> listener, boolean options) {
		addEventListener("resize", listener, options);
	}

	/**
	 * Add resize event listener.
	 *
	 * @param listener the listener
	 */
	default void addResizeEventListener(EventListener<UIEvent> listener) {
		addEventListener("resize", listener);
	}

	/**
	 * Remove resize event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removeResizeEventListener(EventListener<UIEvent> listener, EventListenerOptions options) {
		removeEventListener("resize", listener, options);
	}

	/**
	 * Remove resize event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removeResizeEventListener(EventListener<UIEvent> listener, boolean options) {
		removeEventListener("resize", listener, options);
	}

	/**
	 * Remove resize event listener.
	 *
	 * @param listener the listener
	 */
	default void removeResizeEventListener(EventListener<UIEvent> listener) {
		removeEventListener("resize", listener);
	}

	/**
	 * Fires when the user repositions the scroll box in the scroll bar on the object.
	 *
	 * @return the onscroll
	 */
	@JSProperty
	@Nullable
	EventListener<Event> getOnscroll();

	/**
	 * Sets onscroll.
	 *
	 * @param onscroll the onscroll
	 */
	@JSProperty
	void setOnscroll(EventListener<Event> onscroll);

	/**
	 * Add scroll event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addScrollEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
		addEventListener("scroll", listener, options);
	}

	/**
	 * Add scroll event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addScrollEventListener(EventListener<Event> listener, boolean options) {
		addEventListener("scroll", listener, options);
	}

	/**
	 * Add scroll event listener.
	 *
	 * @param listener the listener
	 */
	default void addScrollEventListener(EventListener<Event> listener) {
		addEventListener("scroll", listener);
	}

	/**
	 * Remove scroll event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removeScrollEventListener(EventListener<Event> listener, EventListenerOptions options) {
		removeEventListener("scroll", listener, options);
	}

	/**
	 * Remove scroll event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removeScrollEventListener(EventListener<Event> listener, boolean options) {
		removeEventListener("scroll", listener, options);
	}

	/**
	 * Remove scroll event listener.
	 *
	 * @param listener the listener
	 */
	default void removeScrollEventListener(EventListener<Event> listener) {
		removeEventListener("scroll", listener);
	}

	/**
	 * Gets onsecuritypolicyviolation.
	 *
	 * @return the onsecuritypolicyviolation
	 */
	@JSProperty
	@Nullable
	EventListener<SecurityPolicyViolationEvent> getOnsecuritypolicyviolation();

	/**
	 * Sets onsecuritypolicyviolation.
	 *
	 * @param onsecuritypolicyviolation the onsecuritypolicyviolation
	 */
	@JSProperty
	void setOnsecuritypolicyviolation(EventListener<SecurityPolicyViolationEvent> onsecuritypolicyviolation);

	/**
	 * Add security policy violation event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addSecurityPolicyViolationEventListener(EventListener<SecurityPolicyViolationEvent> listener,
														 AddEventListenerOptions options) {
		addEventListener("securitypolicyviolation", listener, options);
	}

	/**
	 * Add security policy violation event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addSecurityPolicyViolationEventListener(EventListener<SecurityPolicyViolationEvent> listener,
														 boolean options) {
		addEventListener("securitypolicyviolation", listener, options);
	}

	/**
	 * Add security policy violation event listener.
	 *
	 * @param listener the listener
	 */
	default void addSecurityPolicyViolationEventListener(EventListener<SecurityPolicyViolationEvent> listener) {
		addEventListener("securitypolicyviolation", listener);
	}

	/**
	 * Remove security policy violation event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removeSecurityPolicyViolationEventListener(EventListener<SecurityPolicyViolationEvent> listener,
															EventListenerOptions options) {
		removeEventListener("securitypolicyviolation", listener, options);
	}

	/**
	 * Remove security policy violation event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removeSecurityPolicyViolationEventListener(EventListener<SecurityPolicyViolationEvent> listener,
															boolean options) {
		removeEventListener("securitypolicyviolation", listener, options);
	}

	/**
	 * Remove security policy violation event listener.
	 *
	 * @param listener the listener
	 */
	default void removeSecurityPolicyViolationEventListener(EventListener<SecurityPolicyViolationEvent> listener) {
		removeEventListener("securitypolicyviolation", listener);
	}

	/**
	 * Occurs when the seek operation ends.
	 *
	 * @return the onseeked
	 */
	@JSProperty
	@Nullable
	EventListener<Event> getOnseeked();

	/**
	 * Sets onseeked.
	 *
	 * @param onseeked the onseeked
	 */
	@JSProperty
	void setOnseeked(EventListener<Event> onseeked);

	/**
	 * Add seeked event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addSeekedEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
		addEventListener("seeked", listener, options);
	}

	/**
	 * Add seeked event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addSeekedEventListener(EventListener<Event> listener, boolean options) {
		addEventListener("seeked", listener, options);
	}

	/**
	 * Add seeked event listener.
	 *
	 * @param listener the listener
	 */
	default void addSeekedEventListener(EventListener<Event> listener) {
		addEventListener("seeked", listener);
	}

	/**
	 * Remove seeked event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removeSeekedEventListener(EventListener<Event> listener, EventListenerOptions options) {
		removeEventListener("seeked", listener, options);
	}

	/**
	 * Remove seeked event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removeSeekedEventListener(EventListener<Event> listener, boolean options) {
		removeEventListener("seeked", listener, options);
	}

	/**
	 * Remove seeked event listener.
	 *
	 * @param listener the listener
	 */
	default void removeSeekedEventListener(EventListener<Event> listener) {
		removeEventListener("seeked", listener);
	}

	/**
	 * Occurs when the current playback position is moved.
	 *
	 * @return the onseeking
	 */
	@JSProperty
	@Nullable
	EventListener<Event> getOnseeking();

	/**
	 * Sets onseeking.
	 *
	 * @param onseeking the onseeking
	 */
	@JSProperty
	void setOnseeking(EventListener<Event> onseeking);

	/**
	 * Add seeking event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addSeekingEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
		addEventListener("seeking", listener, options);
	}

	/**
	 * Add seeking event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addSeekingEventListener(EventListener<Event> listener, boolean options) {
		addEventListener("seeking", listener, options);
	}

	/**
	 * Add seeking event listener.
	 *
	 * @param listener the listener
	 */
	default void addSeekingEventListener(EventListener<Event> listener) {
		addEventListener("seeking", listener);
	}

	/**
	 * Remove seeking event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removeSeekingEventListener(EventListener<Event> listener, EventListenerOptions options) {
		removeEventListener("seeking", listener, options);
	}

	/**
	 * Remove seeking event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removeSeekingEventListener(EventListener<Event> listener, boolean options) {
		removeEventListener("seeking", listener, options);
	}

	/**
	 * Remove seeking event listener.
	 *
	 * @param listener the listener
	 */
	default void removeSeekingEventListener(EventListener<Event> listener) {
		removeEventListener("seeking", listener);
	}

	/**
	 * Fires when the current selection changes.
	 *
	 * @return the onselect
	 */
	@JSProperty
	@Nullable
	EventListener<Event> getOnselect();

	/**
	 * Sets onselect.
	 *
	 * @param onselect the onselect
	 */
	@JSProperty
	void setOnselect(EventListener<Event> onselect);

	/**
	 * Add select event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addSelectEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
		addEventListener("select", listener, options);
	}

	/**
	 * Add select event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addSelectEventListener(EventListener<Event> listener, boolean options) {
		addEventListener("select", listener, options);
	}

	/**
	 * Add select event listener.
	 *
	 * @param listener the listener
	 */
	default void addSelectEventListener(EventListener<Event> listener) {
		addEventListener("select", listener);
	}

	/**
	 * Remove select event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removeSelectEventListener(EventListener<Event> listener, EventListenerOptions options) {
		removeEventListener("select", listener, options);
	}

	/**
	 * Remove select event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removeSelectEventListener(EventListener<Event> listener, boolean options) {
		removeEventListener("select", listener, options);
	}

	/**
	 * Remove select event listener.
	 *
	 * @param listener the listener
	 */
	default void removeSelectEventListener(EventListener<Event> listener) {
		removeEventListener("select", listener);
	}

	/**
	 * Gets onselectionchange.
	 *
	 * @return the onselectionchange
	 */
	@JSProperty
	@Nullable
	EventListener<Event> getOnselectionchange();

	/**
	 * Sets onselectionchange.
	 *
	 * @param onselectionchange the onselectionchange
	 */
	@JSProperty
	void setOnselectionchange(EventListener<Event> onselectionchange);

	/**
	 * Add selection change event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addSelectionChangeEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
		addEventListener("selectionchange", listener, options);
	}

	/**
	 * Add selection change event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addSelectionChangeEventListener(EventListener<Event> listener, boolean options) {
		addEventListener("selectionchange", listener, options);
	}

	/**
	 * Add selection change event listener.
	 *
	 * @param listener the listener
	 */
	default void addSelectionChangeEventListener(EventListener<Event> listener) {
		addEventListener("selectionchange", listener);
	}

	/**
	 * Remove selection change event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removeSelectionChangeEventListener(EventListener<Event> listener, EventListenerOptions options) {
		removeEventListener("selectionchange", listener, options);
	}

	/**
	 * Remove selection change event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removeSelectionChangeEventListener(EventListener<Event> listener, boolean options) {
		removeEventListener("selectionchange", listener, options);
	}

	/**
	 * Remove selection change event listener.
	 *
	 * @param listener the listener
	 */
	default void removeSelectionChangeEventListener(EventListener<Event> listener) {
		removeEventListener("selectionchange", listener);
	}

	/**
	 * Gets onselectstart.
	 *
	 * @return the onselectstart
	 */
	@JSProperty
	@Nullable
	EventListener<Event> getOnselectstart();

	/**
	 * Sets onselectstart.
	 *
	 * @param onselectstart the onselectstart
	 */
	@JSProperty
	void setOnselectstart(EventListener<Event> onselectstart);

	/**
	 * Add select start event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addSelectStartEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
		addEventListener("selectstart", listener, options);
	}

	/**
	 * Add select start event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addSelectStartEventListener(EventListener<Event> listener, boolean options) {
		addEventListener("selectstart", listener, options);
	}

	/**
	 * Add select start event listener.
	 *
	 * @param listener the listener
	 */
	default void addSelectStartEventListener(EventListener<Event> listener) {
		addEventListener("selectstart", listener);
	}

	/**
	 * Remove select start event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removeSelectStartEventListener(EventListener<Event> listener, EventListenerOptions options) {
		removeEventListener("selectstart", listener, options);
	}

	/**
	 * Remove select start event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removeSelectStartEventListener(EventListener<Event> listener, boolean options) {
		removeEventListener("selectstart", listener, options);
	}

	/**
	 * Remove select start event listener.
	 *
	 * @param listener the listener
	 */
	default void removeSelectStartEventListener(EventListener<Event> listener) {
		removeEventListener("selectstart", listener);
	}

	/**
	 * Occurs when the download has stopped.
	 *
	 * @return the onstalled
	 */
	@JSProperty
	@Nullable
	EventListener<Event> getOnstalled();

	/**
	 * Sets onstalled.
	 *
	 * @param onstalled the onstalled
	 */
	@JSProperty
	void setOnstalled(EventListener<Event> onstalled);

	/**
	 * Add stalled event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addStalledEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
		addEventListener("stalled", listener, options);
	}

	/**
	 * Add stalled event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addStalledEventListener(EventListener<Event> listener, boolean options) {
		addEventListener("stalled", listener, options);
	}

	/**
	 * Add stalled event listener.
	 *
	 * @param listener the listener
	 */
	default void addStalledEventListener(EventListener<Event> listener) {
		addEventListener("stalled", listener);
	}

	/**
	 * Remove stalled event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removeStalledEventListener(EventListener<Event> listener, EventListenerOptions options) {
		removeEventListener("stalled", listener, options);
	}

	/**
	 * Remove stalled event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removeStalledEventListener(EventListener<Event> listener, boolean options) {
		removeEventListener("stalled", listener, options);
	}

	/**
	 * Remove stalled event listener.
	 *
	 * @param listener the listener
	 */
	default void removeStalledEventListener(EventListener<Event> listener) {
		removeEventListener("stalled", listener);
	}

	/**
	 * Gets onsubmit.
	 *
	 * @return the onsubmit
	 */
	@JSProperty
	@Nullable
	EventListener<Event> getOnsubmit();

	/**
	 * Sets onsubmit.
	 *
	 * @param onsubmit the onsubmit
	 */
	@JSProperty
	void setOnsubmit(EventListener<Event> onsubmit);

	/**
	 * Add submit event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addSubmitEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
		addEventListener("submit", listener, options);
	}

	/**
	 * Add submit event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addSubmitEventListener(EventListener<Event> listener, boolean options) {
		addEventListener("submit", listener, options);
	}

	/**
	 * Add submit event listener.
	 *
	 * @param listener the listener
	 */
	default void addSubmitEventListener(EventListener<Event> listener) {
		addEventListener("submit", listener);
	}

	/**
	 * Remove submit event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removeSubmitEventListener(EventListener<Event> listener, EventListenerOptions options) {
		removeEventListener("submit", listener, options);
	}

	/**
	 * Remove submit event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removeSubmitEventListener(EventListener<Event> listener, boolean options) {
		removeEventListener("submit", listener, options);
	}

	/**
	 * Remove submit event listener.
	 *
	 * @param listener the listener
	 */
	default void removeSubmitEventListener(EventListener<Event> listener) {
		removeEventListener("submit", listener);
	}

	/**
	 * Occurs if the load operation has been intentionally halted.
	 *
	 * @return the onsuspend
	 */
	@JSProperty
	@Nullable
	EventListener<Event> getOnsuspend();

	/**
	 * Sets onsuspend.
	 *
	 * @param onsuspend the onsuspend
	 */
	@JSProperty
	void setOnsuspend(EventListener<Event> onsuspend);

	/**
	 * Add suspend event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addSuspendEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
		addEventListener("suspend", listener, options);
	}

	/**
	 * Add suspend event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addSuspendEventListener(EventListener<Event> listener, boolean options) {
		addEventListener("suspend", listener, options);
	}

	/**
	 * Add suspend event listener.
	 *
	 * @param listener the listener
	 */
	default void addSuspendEventListener(EventListener<Event> listener) {
		addEventListener("suspend", listener);
	}

	/**
	 * Remove suspend event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removeSuspendEventListener(EventListener<Event> listener, EventListenerOptions options) {
		removeEventListener("suspend", listener, options);
	}

	/**
	 * Remove suspend event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removeSuspendEventListener(EventListener<Event> listener, boolean options) {
		removeEventListener("suspend", listener, options);
	}

	/**
	 * Remove suspend event listener.
	 *
	 * @param listener the listener
	 */
	default void removeSuspendEventListener(EventListener<Event> listener) {
		removeEventListener("suspend", listener);
	}

	/**
	 * Occurs to indicate the current playback position.
	 *
	 * @return the ontimeupdate
	 */
	@JSProperty
	@Nullable
	EventListener<Event> getOntimeupdate();

	/**
	 * Sets ontimeupdate.
	 *
	 * @param ontimeupdate the ontimeupdate
	 */
	@JSProperty
	void setOntimeupdate(EventListener<Event> ontimeupdate);

	/**
	 * Add time update event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addTimeUpdateEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
		addEventListener("timeupdate", listener, options);
	}

	/**
	 * Add time update event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addTimeUpdateEventListener(EventListener<Event> listener, boolean options) {
		addEventListener("timeupdate", listener, options);
	}

	/**
	 * Add time update event listener.
	 *
	 * @param listener the listener
	 */
	default void addTimeUpdateEventListener(EventListener<Event> listener) {
		addEventListener("timeupdate", listener);
	}

	/**
	 * Remove time update event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removeTimeUpdateEventListener(EventListener<Event> listener, EventListenerOptions options) {
		removeEventListener("timeupdate", listener, options);
	}

	/**
	 * Remove time update event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removeTimeUpdateEventListener(EventListener<Event> listener, boolean options) {
		removeEventListener("timeupdate", listener, options);
	}

	/**
	 * Remove time update event listener.
	 *
	 * @param listener the listener
	 */
	default void removeTimeUpdateEventListener(EventListener<Event> listener) {
		removeEventListener("timeupdate", listener);
	}

	/**
	 * Gets ontoggle.
	 *
	 * @return the ontoggle
	 */
	@JSProperty
	@Nullable
	EventListener<Event> getOntoggle();

	/**
	 * Sets ontoggle.
	 *
	 * @param ontoggle the ontoggle
	 */
	@JSProperty
	void setOntoggle(EventListener<Event> ontoggle);

	/**
	 * Add toggle event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addToggleEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
		addEventListener("toggle", listener, options);
	}

	/**
	 * Add toggle event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addToggleEventListener(EventListener<Event> listener, boolean options) {
		addEventListener("toggle", listener, options);
	}

	/**
	 * Add toggle event listener.
	 *
	 * @param listener the listener
	 */
	default void addToggleEventListener(EventListener<Event> listener) {
		addEventListener("toggle", listener);
	}

	/**
	 * Remove toggle event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removeToggleEventListener(EventListener<Event> listener, EventListenerOptions options) {
		removeEventListener("toggle", listener, options);
	}

	/**
	 * Remove toggle event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removeToggleEventListener(EventListener<Event> listener, boolean options) {
		removeEventListener("toggle", listener, options);
	}

	/**
	 * Remove toggle event listener.
	 *
	 * @param listener the listener
	 */
	default void removeToggleEventListener(EventListener<Event> listener) {
		removeEventListener("toggle", listener);
	}

	/**
	 * Gets ontouchcancel.
	 *
	 * @return the ontouchcancel
	 */
	@JSProperty
	@Nullable
	EventListener<TouchEvent> getOntouchcancel();

	/**
	 * Sets ontouchcancel.
	 *
	 * @param ontouchcancel the ontouchcancel
	 */
	@JSProperty
	void setOntouchcancel(EventListener<TouchEvent> ontouchcancel);

	/**
	 * Add touch cancel event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addTouchCancelEventListener(EventListener<TouchEvent> listener, AddEventListenerOptions options) {
		addEventListener("touchcancel", listener, options);
	}

	/**
	 * Add touch cancel event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addTouchCancelEventListener(EventListener<TouchEvent> listener, boolean options) {
		addEventListener("touchcancel", listener, options);
	}

	/**
	 * Add touch cancel event listener.
	 *
	 * @param listener the listener
	 */
	default void addTouchCancelEventListener(EventListener<TouchEvent> listener) {
		addEventListener("touchcancel", listener);
	}

	/**
	 * Remove touch cancel event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removeTouchCancelEventListener(EventListener<TouchEvent> listener, EventListenerOptions options) {
		removeEventListener("touchcancel", listener, options);
	}

	/**
	 * Remove touch cancel event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removeTouchCancelEventListener(EventListener<TouchEvent> listener, boolean options) {
		removeEventListener("touchcancel", listener, options);
	}

	/**
	 * Remove touch cancel event listener.
	 *
	 * @param listener the listener
	 */
	default void removeTouchCancelEventListener(EventListener<TouchEvent> listener) {
		removeEventListener("touchcancel", listener);
	}

	/**
	 * Gets ontouchend.
	 *
	 * @return the ontouchend
	 */
	@JSProperty
	@Nullable
	EventListener<TouchEvent> getOntouchend();

	/**
	 * Sets ontouchend.
	 *
	 * @param ontouchend the ontouchend
	 */
	@JSProperty
	void setOntouchend(EventListener<TouchEvent> ontouchend);

	/**
	 * Add touch end event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addTouchEndEventListener(EventListener<TouchEvent> listener, AddEventListenerOptions options) {
		addEventListener("touchend", listener, options);
	}

	/**
	 * Add touch end event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addTouchEndEventListener(EventListener<TouchEvent> listener, boolean options) {
		addEventListener("touchend", listener, options);
	}

	/**
	 * Add touch end event listener.
	 *
	 * @param listener the listener
	 */
	default void addTouchEndEventListener(EventListener<TouchEvent> listener) {
		addEventListener("touchend", listener);
	}

	/**
	 * Remove touch end event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removeTouchEndEventListener(EventListener<TouchEvent> listener, EventListenerOptions options) {
		removeEventListener("touchend", listener, options);
	}

	/**
	 * Remove touch end event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removeTouchEndEventListener(EventListener<TouchEvent> listener, boolean options) {
		removeEventListener("touchend", listener, options);
	}

	/**
	 * Remove touch end event listener.
	 *
	 * @param listener the listener
	 */
	default void removeTouchEndEventListener(EventListener<TouchEvent> listener) {
		removeEventListener("touchend", listener);
	}

	/**
	 * Gets ontouchmove.
	 *
	 * @return the ontouchmove
	 */
	@JSProperty
	@Nullable
	EventListener<TouchEvent> getOntouchmove();

	/**
	 * Sets ontouchmove.
	 *
	 * @param ontouchmove the ontouchmove
	 */
	@JSProperty
	void setOntouchmove(EventListener<TouchEvent> ontouchmove);

	/**
	 * Add touch move event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addTouchMoveEventListener(EventListener<TouchEvent> listener, AddEventListenerOptions options) {
		addEventListener("touchmove", listener, options);
	}

	/**
	 * Add touch move event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addTouchMoveEventListener(EventListener<TouchEvent> listener, boolean options) {
		addEventListener("touchmove", listener, options);
	}

	/**
	 * Add touch move event listener.
	 *
	 * @param listener the listener
	 */
	default void addTouchMoveEventListener(EventListener<TouchEvent> listener) {
		addEventListener("touchmove", listener);
	}

	/**
	 * Remove touch move event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removeTouchMoveEventListener(EventListener<TouchEvent> listener, EventListenerOptions options) {
		removeEventListener("touchmove", listener, options);
	}

	/**
	 * Remove touch move event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removeTouchMoveEventListener(EventListener<TouchEvent> listener, boolean options) {
		removeEventListener("touchmove", listener, options);
	}

	/**
	 * Remove touch move event listener.
	 *
	 * @param listener the listener
	 */
	default void removeTouchMoveEventListener(EventListener<TouchEvent> listener) {
		removeEventListener("touchmove", listener);
	}

	/**
	 * Gets ontouchstart.
	 *
	 * @return the ontouchstart
	 */
	@JSProperty
	@Nullable
	EventListener<TouchEvent> getOntouchstart();

	/**
	 * Sets ontouchstart.
	 *
	 * @param ontouchstart the ontouchstart
	 */
	@JSProperty
	void setOntouchstart(EventListener<TouchEvent> ontouchstart);

	/**
	 * Add touch start event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addTouchStartEventListener(EventListener<TouchEvent> listener, AddEventListenerOptions options) {
		addEventListener("touchstart", listener, options);
	}

	/**
	 * Add touch start event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addTouchStartEventListener(EventListener<TouchEvent> listener, boolean options) {
		addEventListener("touchstart", listener, options);
	}

	/**
	 * Add touch start event listener.
	 *
	 * @param listener the listener
	 */
	default void addTouchStartEventListener(EventListener<TouchEvent> listener) {
		addEventListener("touchstart", listener);
	}

	/**
	 * Remove touch start event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removeTouchStartEventListener(EventListener<TouchEvent> listener, EventListenerOptions options) {
		removeEventListener("touchstart", listener, options);
	}

	/**
	 * Remove touch start event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removeTouchStartEventListener(EventListener<TouchEvent> listener, boolean options) {
		removeEventListener("touchstart", listener, options);
	}

	/**
	 * Remove touch start event listener.
	 *
	 * @param listener the listener
	 */
	default void removeTouchStartEventListener(EventListener<TouchEvent> listener) {
		removeEventListener("touchstart", listener);
	}

	/**
	 * Gets ontransitioncancel.
	 *
	 * @return the ontransitioncancel
	 */
	@JSProperty
	@Nullable
	EventListener<TransitionEvent> getOntransitioncancel();

	/**
	 * Sets ontransitioncancel.
	 *
	 * @param ontransitioncancel the ontransitioncancel
	 */
	@JSProperty
	void setOntransitioncancel(EventListener<TransitionEvent> ontransitioncancel);

	/**
	 * Add transition cancel event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addTransitionCancelEventListener(EventListener<TransitionEvent> listener,
												  AddEventListenerOptions options) {
		addEventListener("transitioncancel", listener, options);
	}

	/**
	 * Add transition cancel event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addTransitionCancelEventListener(EventListener<TransitionEvent> listener, boolean options) {
		addEventListener("transitioncancel", listener, options);
	}

	/**
	 * Add transition cancel event listener.
	 *
	 * @param listener the listener
	 */
	default void addTransitionCancelEventListener(EventListener<TransitionEvent> listener) {
		addEventListener("transitioncancel", listener);
	}

	/**
	 * Remove transition cancel event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removeTransitionCancelEventListener(EventListener<TransitionEvent> listener,
													 EventListenerOptions options) {
		removeEventListener("transitioncancel", listener, options);
	}

	/**
	 * Remove transition cancel event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removeTransitionCancelEventListener(EventListener<TransitionEvent> listener, boolean options) {
		removeEventListener("transitioncancel", listener, options);
	}

	/**
	 * Remove transition cancel event listener.
	 *
	 * @param listener the listener
	 */
	default void removeTransitionCancelEventListener(EventListener<TransitionEvent> listener) {
		removeEventListener("transitioncancel", listener);
	}

	/**
	 * Gets ontransitionend.
	 *
	 * @return the ontransitionend
	 */
	@JSProperty
	@Nullable
	EventListener<TransitionEvent> getOntransitionend();

	/**
	 * Sets ontransitionend.
	 *
	 * @param ontransitionend the ontransitionend
	 */
	@JSProperty
	void setOntransitionend(EventListener<TransitionEvent> ontransitionend);

	/**
	 * Add transition end event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addTransitionEndEventListener(EventListener<TransitionEvent> listener,
											   AddEventListenerOptions options) {
		addEventListener("transitionend", listener, options);
	}

	/**
	 * Add transition end event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addTransitionEndEventListener(EventListener<TransitionEvent> listener, boolean options) {
		addEventListener("transitionend", listener, options);
	}

	/**
	 * Add transition end event listener.
	 *
	 * @param listener the listener
	 */
	default void addTransitionEndEventListener(EventListener<TransitionEvent> listener) {
		addEventListener("transitionend", listener);
	}

	/**
	 * Remove transition end event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removeTransitionEndEventListener(EventListener<TransitionEvent> listener,
												  EventListenerOptions options) {
		removeEventListener("transitionend", listener, options);
	}

	/**
	 * Remove transition end event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removeTransitionEndEventListener(EventListener<TransitionEvent> listener, boolean options) {
		removeEventListener("transitionend", listener, options);
	}

	/**
	 * Remove transition end event listener.
	 *
	 * @param listener the listener
	 */
	default void removeTransitionEndEventListener(EventListener<TransitionEvent> listener) {
		removeEventListener("transitionend", listener);
	}

	/**
	 * Gets ontransitionrun.
	 *
	 * @return the ontransitionrun
	 */
	@JSProperty
	@Nullable
	EventListener<TransitionEvent> getOntransitionrun();

	/**
	 * Sets ontransitionrun.
	 *
	 * @param ontransitionrun the ontransitionrun
	 */
	@JSProperty
	void setOntransitionrun(EventListener<TransitionEvent> ontransitionrun);

	/**
	 * Add transition run event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addTransitionRunEventListener(EventListener<TransitionEvent> listener,
											   AddEventListenerOptions options) {
		addEventListener("transitionrun", listener, options);
	}

	/**
	 * Add transition run event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addTransitionRunEventListener(EventListener<TransitionEvent> listener, boolean options) {
		addEventListener("transitionrun", listener, options);
	}

	/**
	 * Add transition run event listener.
	 *
	 * @param listener the listener
	 */
	default void addTransitionRunEventListener(EventListener<TransitionEvent> listener) {
		addEventListener("transitionrun", listener);
	}

	/**
	 * Remove transition run event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removeTransitionRunEventListener(EventListener<TransitionEvent> listener,
												  EventListenerOptions options) {
		removeEventListener("transitionrun", listener, options);
	}

	/**
	 * Remove transition run event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removeTransitionRunEventListener(EventListener<TransitionEvent> listener, boolean options) {
		removeEventListener("transitionrun", listener, options);
	}

	/**
	 * Remove transition run event listener.
	 *
	 * @param listener the listener
	 */
	default void removeTransitionRunEventListener(EventListener<TransitionEvent> listener) {
		removeEventListener("transitionrun", listener);
	}

	/**
	 * Gets ontransitionstart.
	 *
	 * @return the ontransitionstart
	 */
	@JSProperty
	@Nullable
	EventListener<TransitionEvent> getOntransitionstart();

	/**
	 * Sets ontransitionstart.
	 *
	 * @param ontransitionstart the ontransitionstart
	 */
	@JSProperty
	void setOntransitionstart(EventListener<TransitionEvent> ontransitionstart);

	/**
	 * Add transition start event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addTransitionStartEventListener(EventListener<TransitionEvent> listener,
												 AddEventListenerOptions options) {
		addEventListener("transitionstart", listener, options);
	}

	/**
	 * Add transition start event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addTransitionStartEventListener(EventListener<TransitionEvent> listener, boolean options) {
		addEventListener("transitionstart", listener, options);
	}

	/**
	 * Add transition start event listener.
	 *
	 * @param listener the listener
	 */
	default void addTransitionStartEventListener(EventListener<TransitionEvent> listener) {
		addEventListener("transitionstart", listener);
	}

	/**
	 * Remove transition start event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removeTransitionStartEventListener(EventListener<TransitionEvent> listener,
													EventListenerOptions options) {
		removeEventListener("transitionstart", listener, options);
	}

	/**
	 * Remove transition start event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removeTransitionStartEventListener(EventListener<TransitionEvent> listener, boolean options) {
		removeEventListener("transitionstart", listener, options);
	}

	/**
	 * Remove transition start event listener.
	 *
	 * @param listener the listener
	 */
	default void removeTransitionStartEventListener(EventListener<TransitionEvent> listener) {
		removeEventListener("transitionstart", listener);
	}

	/**
	 * Occurs when the volume is changed, or playback is muted or unmuted.
	 *
	 * @return the onvolumechange
	 */
	@JSProperty
	@Nullable
	EventListener<Event> getOnvolumechange();

	/**
	 * Sets onvolumechange.
	 *
	 * @param onvolumechange the onvolumechange
	 */
	@JSProperty
	void setOnvolumechange(EventListener<Event> onvolumechange);

	/**
	 * Add volume change event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addVolumeChangeEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
		addEventListener("volumechange", listener, options);
	}

	/**
	 * Add volume change event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addVolumeChangeEventListener(EventListener<Event> listener, boolean options) {
		addEventListener("volumechange", listener, options);
	}

	/**
	 * Add volume change event listener.
	 *
	 * @param listener the listener
	 */
	default void addVolumeChangeEventListener(EventListener<Event> listener) {
		addEventListener("volumechange", listener);
	}

	/**
	 * Remove volume change event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removeVolumeChangeEventListener(EventListener<Event> listener, EventListenerOptions options) {
		removeEventListener("volumechange", listener, options);
	}

	/**
	 * Remove volume change event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removeVolumeChangeEventListener(EventListener<Event> listener, boolean options) {
		removeEventListener("volumechange", listener, options);
	}

	/**
	 * Remove volume change event listener.
	 *
	 * @param listener the listener
	 */
	default void removeVolumeChangeEventListener(EventListener<Event> listener) {
		removeEventListener("volumechange", listener);
	}

	/**
	 * Occurs when playback stops because the next frame of a video resource is not available.
	 *
	 * @return the onwaiting
	 */
	@JSProperty
	@Nullable
	EventListener<Event> getOnwaiting();

	/**
	 * Sets onwaiting.
	 *
	 * @param onwaiting the onwaiting
	 */
	@JSProperty
	void setOnwaiting(EventListener<Event> onwaiting);

	/**
	 * Add waiting event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addWaitingEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
		addEventListener("waiting", listener, options);
	}

	/**
	 * Add waiting event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addWaitingEventListener(EventListener<Event> listener, boolean options) {
		addEventListener("waiting", listener, options);
	}

	/**
	 * Add waiting event listener.
	 *
	 * @param listener the listener
	 */
	default void addWaitingEventListener(EventListener<Event> listener) {
		addEventListener("waiting", listener);
	}

	/**
	 * Remove waiting event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removeWaitingEventListener(EventListener<Event> listener, EventListenerOptions options) {
		removeEventListener("waiting", listener, options);
	}

	/**
	 * Remove waiting event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removeWaitingEventListener(EventListener<Event> listener, boolean options) {
		removeEventListener("waiting", listener, options);
	}

	/**
	 * Remove waiting event listener.
	 *
	 * @param listener the listener
	 */
	default void removeWaitingEventListener(EventListener<Event> listener) {
		removeEventListener("waiting", listener);
	}

	/**
	 * Gets onwheel.
	 *
	 * @return the onwheel
	 */
	@JSProperty
	@Nullable
	EventListener<WheelEvent> getOnwheel();

	/**
	 * Sets onwheel.
	 *
	 * @param onwheel the onwheel
	 */
	@JSProperty
	void setOnwheel(EventListener<WheelEvent> onwheel);

	/**
	 * Add wheel event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addWheelEventListener(EventListener<WheelEvent> listener, AddEventListenerOptions options) {
		addEventListener("wheel", listener, options);
	}

	/**
	 * Add wheel event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void addWheelEventListener(EventListener<WheelEvent> listener, boolean options) {
		addEventListener("wheel", listener, options);
	}

	/**
	 * Add wheel event listener.
	 *
	 * @param listener the listener
	 */
	default void addWheelEventListener(EventListener<WheelEvent> listener) {
		addEventListener("wheel", listener);
	}

	/**
	 * Remove wheel event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removeWheelEventListener(EventListener<WheelEvent> listener, EventListenerOptions options) {
		removeEventListener("wheel", listener, options);
	}

	/**
	 * Remove wheel event listener.
	 *
	 * @param listener the listener
	 * @param options  the options
	 */
	default void removeWheelEventListener(EventListener<WheelEvent> listener, boolean options) {
		removeEventListener("wheel", listener, options);
	}

	/**
	 * Remove wheel event listener.
	 *
	 * @param listener the listener
	 */
	default void removeWheelEventListener(EventListener<WheelEvent> listener) {
		removeEventListener("wheel", listener);
	}
}
