package com.github.fluorumlabs.disconnect.zero.component;

import com.github.fluorumlabs.disconnect.zero.observable.ObservableEvent;
import js.web.cssom.AnimationEvent;
import js.web.cssom.TransitionEvent;
import js.web.dom.*;
import js.web.htmldraganddrop.DragEvent;
import js.web.pointerevents.PointerEvent;
import js.web.touchevents.TouchEvent;


public interface GlobalEvents<T extends GlobalEventHandlers> extends EventInitializer<T> {
	default ObservableEvent<UIEvent> abortEvent() {
		return createEvent(GlobalEventHandlers::addAbortEventListener);
	}

	default ObservableEvent<AnimationEvent> animationCancelEvent() {
		return createEvent(GlobalEventHandlers::addAnimationCancelEventListener);
	}

	default ObservableEvent<AnimationEvent> animationEndEvent() {
		return createEvent(GlobalEventHandlers::addAnimationEndEventListener);
	}

	default ObservableEvent<AnimationEvent> animationIterationEvent() {
		return createEvent(GlobalEventHandlers::addAnimationIterationEventListener);
	}

	default ObservableEvent<AnimationEvent> animationStartEvent() {
		return createEvent(GlobalEventHandlers::addAnimationStartEventListener);
	}

	default ObservableEvent<MouseEvent> auxClickEvent() {
		return createEvent(GlobalEventHandlers::addAuxClickEventListener);
	}

	default ObservableEvent<FocusEvent> blurEvent() {
		return createEvent(GlobalEventHandlers::addBlurEventListener);
	}

	default ObservableEvent<Event> cancelEvent() {
		return createEvent(GlobalEventHandlers::addCancelEventListener);
	}

	default ObservableEvent<Event> canPlayEvent() {
		return createEvent(GlobalEventHandlers::addCanPlayEventListener);
	}

	default ObservableEvent<Event> canPlayThroughEvent() {
		return createEvent(GlobalEventHandlers::addCanPlayThroughEventListener);
	}

	default ObservableEvent<Event> changeEvent() {
		return createEvent(GlobalEventHandlers::addChangeEventListener);
	}

	default ObservableEvent<MouseEvent> clickEvent() {
		return createEvent(GlobalEventHandlers::addClickEventListener);
	}

	default ObservableEvent<Event> closeEvent() {
		return createEvent(GlobalEventHandlers::addCloseEventListener);
	}

	default ObservableEvent<MouseEvent> contextMenuEvent() {
		return createEvent(GlobalEventHandlers::addContextMenuEventListener);
	}

	default ObservableEvent<Event> cueChangeEvent() {
		return createEvent(GlobalEventHandlers::addCueChangeEventListener);
	}

	default ObservableEvent<MouseEvent> dblClickEvent() {
		return createEvent(GlobalEventHandlers::addDblClickEventListener);
	}

	default ObservableEvent<DragEvent> dragEvent() {
		return createEvent(GlobalEventHandlers::addDragEventListener);
	}

	default ObservableEvent<DragEvent> dragEndEvent() {
		return createEvent(GlobalEventHandlers::addDragEndEventListener);
	}

	default ObservableEvent<DragEvent> dragEnterEvent() {
		return createEvent(GlobalEventHandlers::addDragEnterEventListener);
	}

	default ObservableEvent<Event> dragExitEvent() {
		return createEvent(GlobalEventHandlers::addDragExitEventListener);
	}

	default ObservableEvent<DragEvent> dragLeaveEvent() {
		return createEvent(GlobalEventHandlers::addDragLeaveEventListener);
	}

	default ObservableEvent<DragEvent> dragOverEvent() {
		return createEvent(GlobalEventHandlers::addDragOverEventListener);
	}

	default ObservableEvent<DragEvent> dragStartEvent() {
		return createEvent(GlobalEventHandlers::addDragStartEventListener);
	}

	default ObservableEvent<DragEvent> dropEvent() {
		return createEvent(GlobalEventHandlers::addDropEventListener);
	}

	default ObservableEvent<Event> durationChangeEvent() {
		return createEvent(GlobalEventHandlers::addDurationChangeEventListener);
	}

	default ObservableEvent<Event> emptiedEvent() {
		return createEvent(GlobalEventHandlers::addEmptiedEventListener);
	}

	default ObservableEvent<Event> endedEvent() {
		return createEvent(GlobalEventHandlers::addEndedEventListener);
	}

	default ObservableEvent<ErrorEvent> errorEvent() {
		return createEvent(GlobalEventHandlers::addErrorEventListener);
	}

	default ObservableEvent<FocusEvent> focusEvent() {
		return createEvent(GlobalEventHandlers::addFocusEventListener);
	}

	default ObservableEvent<FocusEvent> focusInEvent() {
		return createEvent(GlobalEventHandlers::addFocusInEventListener);
	}

	default ObservableEvent<FocusEvent> focusOutEvent() {
		return createEvent(GlobalEventHandlers::addFocusOutEventListener);
	}

	default ObservableEvent<PointerEvent> gotPointerCaptureEvent() {
		return createEvent(GlobalEventHandlers::addGotPointerCaptureEventListener);
	}

	default ObservableEvent<InputEvent> inputEvent() {
		return createEvent(GlobalEventHandlers::addInputEventListener);
	}

	default ObservableEvent<Event> invalidEvent() {
		return createEvent(GlobalEventHandlers::addInvalidEventListener);
	}

	default ObservableEvent<KeyboardEvent> keyDownEvent() {
		return createEvent(GlobalEventHandlers::addKeyDownEventListener);
	}

	default ObservableEvent<KeyboardEvent> keyPressEvent() {
		return createEvent(GlobalEventHandlers::addKeyPressEventListener);
	}

	default ObservableEvent<KeyboardEvent> keyUpEvent() {
		return createEvent(GlobalEventHandlers::addKeyUpEventListener);
	}

	default ObservableEvent<Event> loadEvent() {
		return createEvent(GlobalEventHandlers::addLoadEventListener);
	}

	default ObservableEvent<Event> loadedDataEvent() {
		return createEvent(GlobalEventHandlers::addLoadedDataEventListener);
	}

	default ObservableEvent<Event> loadedMetaDataEvent() {
		return createEvent(GlobalEventHandlers::addLoadedMetaDataEventListener);
	}

	default ObservableEvent<ProgressEvent> loadEndEvent() {
		return createEvent(GlobalEventHandlers::addLoadEndEventListener);
	}

	default ObservableEvent<Event> loadStartEvent() {
		return createEvent(GlobalEventHandlers::addLoadStartEventListener);
	}

	default ObservableEvent<PointerEvent> lostPointerCaptureEvent() {
		return createEvent(GlobalEventHandlers::addLostPointerCaptureEventListener);
	}

	default ObservableEvent<MouseEvent> mouseDownEvent() {
		return createEvent(GlobalEventHandlers::addMouseDownEventListener);
	}

	default ObservableEvent<MouseEvent> mouseEnterEvent() {
		return createEvent(GlobalEventHandlers::addMouseEnterEventListener);
	}

	default ObservableEvent<MouseEvent> mouseLeaveEvent() {
		return createEvent(GlobalEventHandlers::addMouseLeaveEventListener);
	}

	default ObservableEvent<MouseEvent> mouseMoveEvent() {
		return createEvent(GlobalEventHandlers::addMouseMoveEventListener);
	}

	default ObservableEvent<MouseEvent> mouseOutEvent() {
		return createEvent(GlobalEventHandlers::addMouseOutEventListener);
	}

	default ObservableEvent<MouseEvent> mouseOverEvent() {
		return createEvent(GlobalEventHandlers::addMouseOverEventListener);
	}

	default ObservableEvent<MouseEvent> mouseUpEvent() {
		return createEvent(GlobalEventHandlers::addMouseUpEventListener);
	}

	default ObservableEvent<Event> pauseEvent() {
		return createEvent(GlobalEventHandlers::addPauseEventListener);
	}

	default ObservableEvent<Event> playEvent() {
		return createEvent(GlobalEventHandlers::addPlayEventListener);
	}

	default ObservableEvent<Event> playingEvent() {
		return createEvent(GlobalEventHandlers::addPlayingEventListener);
	}

	default ObservableEvent<PointerEvent> pointerCancelEvent() {
		return createEvent(GlobalEventHandlers::addPointerCancelEventListener);
	}

	default ObservableEvent<PointerEvent> pointerDownEvent() {
		return createEvent(GlobalEventHandlers::addPointerDownEventListener);
	}

	default ObservableEvent<PointerEvent> pointerEnterEvent() {
		return createEvent(GlobalEventHandlers::addPointerEnterEventListener);
	}

	default ObservableEvent<PointerEvent> pointerLeaveEvent() {
		return createEvent(GlobalEventHandlers::addPointerLeaveEventListener);
	}

	default ObservableEvent<PointerEvent> pointerMoveEvent() {
		return createEvent(GlobalEventHandlers::addPointerMoveEventListener);
	}

	default ObservableEvent<PointerEvent> pointerOutEvent() {
		return createEvent(GlobalEventHandlers::addPointerOutEventListener);
	}

	default ObservableEvent<PointerEvent> pointerOverEvent() {
		return createEvent(GlobalEventHandlers::addPointerOverEventListener);
	}

	default ObservableEvent<PointerEvent> pointerUpEvent() {
		return createEvent(GlobalEventHandlers::addPointerUpEventListener);
	}

	default ObservableEvent<ProgressEvent> progressEvent() {
		return createEvent(GlobalEventHandlers::addProgressEventListener);
	}

	default ObservableEvent<Event> rateChangeEvent() {
		return createEvent(GlobalEventHandlers::addRateChangeEventListener);
	}

	default ObservableEvent<Event> resetEvent() {
		return createEvent(GlobalEventHandlers::addResetEventListener);
	}

	default ObservableEvent<UIEvent> resizeEvent() {
		return createEvent(GlobalEventHandlers::addResizeEventListener);
	}

	default ObservableEvent<Event> scrollEvent() {
		return createEvent(GlobalEventHandlers::addScrollEventListener);
	}

	default ObservableEvent<SecurityPolicyViolationEvent> securityPolicyViolationEvent() {
		return createEvent(GlobalEventHandlers::addSecurityPolicyViolationEventListener);
	}

	default ObservableEvent<Event> seekedEvent() {
		return createEvent(GlobalEventHandlers::addSeekedEventListener);
	}

	default ObservableEvent<Event> seekingEvent() {
		return createEvent(GlobalEventHandlers::addSeekingEventListener);
	}

	default ObservableEvent<Event> selectEvent() {
		return createEvent(GlobalEventHandlers::addSelectEventListener);
	}

	default ObservableEvent<Event> selectionChangeEvent() {
		return createEvent(GlobalEventHandlers::addSelectionChangeEventListener);
	}

	default ObservableEvent<Event> selectStartEvent() {
		return createEvent(GlobalEventHandlers::addSelectStartEventListener);
	}

	default ObservableEvent<Event> stalledEvent() {
		return createEvent(GlobalEventHandlers::addStalledEventListener);
	}

	default ObservableEvent<Event> submitEvent() {
		return createEvent(GlobalEventHandlers::addSubmitEventListener);
	}

	default ObservableEvent<Event> suspendEvent() {
		return createEvent(GlobalEventHandlers::addSuspendEventListener);
	}

	default ObservableEvent<Event> timeUpdateEvent() {
		return createEvent(GlobalEventHandlers::addTimeUpdateEventListener);
	}

	default ObservableEvent<Event> toggleEvent() {
		return createEvent(GlobalEventHandlers::addToggleEventListener);
	}

	default ObservableEvent<TouchEvent> touchCancelEvent() {
		return createEvent(GlobalEventHandlers::addTouchCancelEventListener);
	}

	default ObservableEvent<TouchEvent> touchEndEvent() {
		return createEvent(GlobalEventHandlers::addTouchEndEventListener);
	}

	default ObservableEvent<TouchEvent> touchMoveEvent() {
		return createEvent(GlobalEventHandlers::addTouchMoveEventListener);
	}

	default ObservableEvent<TouchEvent> touchStartEvent() {
		return createEvent(GlobalEventHandlers::addTouchStartEventListener);
	}

	default ObservableEvent<TransitionEvent> transitionCancelEvent() {
		return createEvent(GlobalEventHandlers::addTransitionCancelEventListener);
	}

	default ObservableEvent<TransitionEvent> transitionEndEvent() {
		return createEvent(GlobalEventHandlers::addTransitionEndEventListener);
	}

	default ObservableEvent<TransitionEvent> transitionRunEvent() {
		return createEvent(GlobalEventHandlers::addTransitionRunEventListener);
	}

	default ObservableEvent<TransitionEvent> transitionStartEvent() {
		return createEvent(GlobalEventHandlers::addTransitionStartEventListener);
	}

	default ObservableEvent<Event> volumeChangeEvent() {
		return createEvent(GlobalEventHandlers::addVolumeChangeEventListener);
	}

	default ObservableEvent<Event> waitingEvent() {
		return createEvent(GlobalEventHandlers::addWaitingEventListener);
	}

	default ObservableEvent<WheelEvent> wheelEvent() {
		return createEvent(GlobalEventHandlers::addWheelEventListener);
	}
}
