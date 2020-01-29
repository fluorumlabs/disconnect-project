package js.web.dom;


import js.web.cssom.AnimationEvent;
import js.web.cssom.TransitionEvent;
import js.web.htmldraganddrop.DragEvent;
import js.web.pointerevents.PointerEvent;
import js.web.touchevents.TouchEvent;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


public interface GlobalEventHandlers extends EventTarget {
    /**
     * Fires when the user aborts the download.
     * @param ev The event.
     */
     @JSProperty
     @Nullable
     EventListener<UIEvent> getOnabort();

     @JSProperty
     void setOnabort(EventListener<UIEvent> onabort);

     default void addAbortEventListener(EventListener<UIEvent> listener, AddEventListenerOptions options) {
         addEventListener("abort", listener, options);
     }
     default void addAbortEventListener(EventListener<UIEvent> listener, boolean options) {
         addEventListener("abort", listener, options);
     }
     default void addAbortEventListener(EventListener<UIEvent> listener) {
         addEventListener("abort", listener);
     }

     default void removeAbortEventListener(EventListener<UIEvent> listener, EventListenerOptions options) {
         removeEventListener("abort", listener, options);
     }
     default void removeAbortEventListener(EventListener<UIEvent> listener, boolean options) {
         removeEventListener("abort", listener, options);
     }
     default void removeAbortEventListener(EventListener<UIEvent> listener) {
         removeEventListener("abort", listener);
     }
     @JSProperty
     @Nullable
     EventListener<AnimationEvent> getOnanimationcancel();

     @JSProperty
     void setOnanimationcancel(EventListener<AnimationEvent> onanimationcancel);

     default void addAnimationCancelEventListener(EventListener<AnimationEvent> listener, AddEventListenerOptions options) {
         addEventListener("animationcancel", listener, options);
     }
     default void addAnimationCancelEventListener(EventListener<AnimationEvent> listener, boolean options) {
         addEventListener("animationcancel", listener, options);
     }
     default void addAnimationCancelEventListener(EventListener<AnimationEvent> listener) {
         addEventListener("animationcancel", listener);
     }

     default void removeAnimationCancelEventListener(EventListener<AnimationEvent> listener, EventListenerOptions options) {
         removeEventListener("animationcancel", listener, options);
     }
     default void removeAnimationCancelEventListener(EventListener<AnimationEvent> listener, boolean options) {
         removeEventListener("animationcancel", listener, options);
     }
     default void removeAnimationCancelEventListener(EventListener<AnimationEvent> listener) {
         removeEventListener("animationcancel", listener);
     }
     @JSProperty
     @Nullable
     EventListener<AnimationEvent> getOnanimationend();

     @JSProperty
     void setOnanimationend(EventListener<AnimationEvent> onanimationend);

     default void addAnimationEndEventListener(EventListener<AnimationEvent> listener, AddEventListenerOptions options) {
         addEventListener("animationend", listener, options);
     }
     default void addAnimationEndEventListener(EventListener<AnimationEvent> listener, boolean options) {
         addEventListener("animationend", listener, options);
     }
     default void addAnimationEndEventListener(EventListener<AnimationEvent> listener) {
         addEventListener("animationend", listener);
     }

     default void removeAnimationEndEventListener(EventListener<AnimationEvent> listener, EventListenerOptions options) {
         removeEventListener("animationend", listener, options);
     }
     default void removeAnimationEndEventListener(EventListener<AnimationEvent> listener, boolean options) {
         removeEventListener("animationend", listener, options);
     }
     default void removeAnimationEndEventListener(EventListener<AnimationEvent> listener) {
         removeEventListener("animationend", listener);
     }
     @JSProperty
     @Nullable
     EventListener<AnimationEvent> getOnanimationiteration();

     @JSProperty
     void setOnanimationiteration(EventListener<AnimationEvent> onanimationiteration);

     default void addAnimationIterationEventListener(EventListener<AnimationEvent> listener, AddEventListenerOptions options) {
         addEventListener("animationiteration", listener, options);
     }
     default void addAnimationIterationEventListener(EventListener<AnimationEvent> listener, boolean options) {
         addEventListener("animationiteration", listener, options);
     }
     default void addAnimationIterationEventListener(EventListener<AnimationEvent> listener) {
         addEventListener("animationiteration", listener);
     }

     default void removeAnimationIterationEventListener(EventListener<AnimationEvent> listener, EventListenerOptions options) {
         removeEventListener("animationiteration", listener, options);
     }
     default void removeAnimationIterationEventListener(EventListener<AnimationEvent> listener, boolean options) {
         removeEventListener("animationiteration", listener, options);
     }
     default void removeAnimationIterationEventListener(EventListener<AnimationEvent> listener) {
         removeEventListener("animationiteration", listener);
     }

     @JSProperty
     @Nullable
     EventListener<AnimationEvent> getOnanimationstart();

     @JSProperty
     void setOnanimationstart(EventListener<AnimationEvent> onanimationstart);

     default void addAnimationStartEventListener(EventListener<AnimationEvent> listener, AddEventListenerOptions options) {
         addEventListener("animationstart", listener, options);
     }
     default void addAnimationStartEventListener(EventListener<AnimationEvent> listener, boolean options) {
         addEventListener("animationstart", listener, options);
     }
     default void addAnimationStartEventListener(EventListener<AnimationEvent> listener) {
         addEventListener("animationstart", listener);
     }

     default void removeAnimationStartEventListener(EventListener<AnimationEvent> listener, EventListenerOptions options) {
         removeEventListener("animationstart", listener, options);
     }
     default void removeAnimationStartEventListener(EventListener<AnimationEvent> listener, boolean options) {
         removeEventListener("animationstart", listener, options);
     }
     default void removeAnimationStartEventListener(EventListener<AnimationEvent> listener) {
         removeEventListener("animationstart", listener);
     }

     @JSProperty
     @Nullable
     EventListener<MouseEvent> getOnauxclick();

     @JSProperty
     void setOnauxclick(EventListener<MouseEvent> onauxclick);

     default void addAuxClickEventListener(EventListener<MouseEvent> listener, AddEventListenerOptions options) {
         addEventListener("auxclick", listener, options);
     }
     default void addAuxClickEventListener(EventListener<MouseEvent> listener, boolean options) {
         addEventListener("auxclick", listener, options);
     }
     default void addAuxClickEventListener(EventListener<MouseEvent> listener) {
         addEventListener("auxclick", listener);
     }

     default void removeAuxClickEventListener(EventListener<MouseEvent> listener, EventListenerOptions options) {
         removeEventListener("auxclick", listener, options);
     }
     default void removeAuxClickEventListener(EventListener<MouseEvent> listener, boolean options) {
         removeEventListener("auxclick", listener, options);
     }
     default void removeAuxClickEventListener(EventListener<MouseEvent> listener) {
         removeEventListener("auxclick", listener);
     }
    /**
     * Fires when the object loses the input focus.
     * @param ev The focus event.
     */

     @JSProperty
     @Nullable
     EventListener<FocusEvent> getOnblur();

     @JSProperty
     void setOnblur(EventListener<FocusEvent> onblur);

     default void addBlurEventListener(EventListener<FocusEvent> listener, AddEventListenerOptions options) {
         addEventListener("blur", listener, options);
     }
     default void addBlurEventListener(EventListener<FocusEvent> listener, boolean options) {
         addEventListener("blur", listener, options);
     }
     default void addBlurEventListener(EventListener<FocusEvent> listener) {
         addEventListener("blur", listener);
     }

     default void removeBlurEventListener(EventListener<FocusEvent> listener, EventListenerOptions options) {
         removeEventListener("blur", listener, options);
     }
     default void removeBlurEventListener(EventListener<FocusEvent> listener, boolean options) {
         removeEventListener("blur", listener, options);
     }
     default void removeBlurEventListener(EventListener<FocusEvent> listener) {
         removeEventListener("blur", listener);
     }

     @JSProperty
     @Nullable
     EventListener<Event> getOncancel();

     @JSProperty
     void setOncancel(EventListener<Event> oncancel);

     default void addCancelEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
         addEventListener("cancel", listener, options);
     }
     default void addCancelEventListener(EventListener<Event> listener, boolean options) {
         addEventListener("cancel", listener, options);
     }
     default void addCancelEventListener(EventListener<Event> listener) {
         addEventListener("cancel", listener);
     }

     default void removeCancelEventListener(EventListener<Event> listener, EventListenerOptions options) {
         removeEventListener("cancel", listener, options);
     }
     default void removeCancelEventListener(EventListener<Event> listener, boolean options) {
         removeEventListener("cancel", listener, options);
     }
     default void removeCancelEventListener(EventListener<Event> listener) {
         removeEventListener("cancel", listener);
     }
    /**
     * Occurs when playback is possible, but would require further buffering.
     * @param ev The event.
     */

     @JSProperty
     @Nullable
     EventListener<Event> getOncanplay();

     @JSProperty
     void setOncanplay(EventListener<Event> oncanplay);

     default void addCanPlayEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
         addEventListener("canplay", listener, options);
     }
     default void addCanPlayEventListener(EventListener<Event> listener, boolean options) {
         addEventListener("canplay", listener, options);
     }
     default void addCanPlayEventListener(EventListener<Event> listener) {
         addEventListener("canplay", listener);
     }

     default void removeCanPlayEventListener(EventListener<Event> listener, EventListenerOptions options) {
         removeEventListener("canplay", listener, options);
     }
     default void removeCanPlayEventListener(EventListener<Event> listener, boolean options) {
         removeEventListener("canplay", listener, options);
     }
     default void removeCanPlayEventListener(EventListener<Event> listener) {
         removeEventListener("canplay", listener);
     }

     @JSProperty
     @Nullable
     EventListener<Event> getOncanplaythrough();

     @JSProperty
     void setOncanplaythrough(EventListener<Event> oncanplaythrough);

     default void addCanPlayThroughEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
         addEventListener("canplaythrough", listener, options);
     }
     default void addCanPlayThroughEventListener(EventListener<Event> listener, boolean options) {
         addEventListener("canplaythrough", listener, options);
     }
     default void addCanPlayThroughEventListener(EventListener<Event> listener) {
         addEventListener("canplaythrough", listener);
     }

     default void removeCanPlayThroughEventListener(EventListener<Event> listener, EventListenerOptions options) {
         removeEventListener("canplaythrough", listener, options);
     }
     default void removeCanPlayThroughEventListener(EventListener<Event> listener, boolean options) {
         removeEventListener("canplaythrough", listener, options);
     }
     default void removeCanPlayThroughEventListener(EventListener<Event> listener) {
         removeEventListener("canplaythrough", listener);
     }
    /**
     * Fires when the contents of the object or selection have changed.
     * @param ev The event.
     */

     @JSProperty
     @Nullable
     EventListener<Event> getOnchange();

     @JSProperty
     void setOnchange(EventListener<Event> onchange);

     default void addChangeEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
         addEventListener("change", listener, options);
     }
     default void addChangeEventListener(EventListener<Event> listener, boolean options) {
         addEventListener("change", listener, options);
     }
     default void addChangeEventListener(EventListener<Event> listener) {
         addEventListener("change", listener);
     }

     default void removeChangeEventListener(EventListener<Event> listener, EventListenerOptions options) {
         removeEventListener("change", listener, options);
     }
     default void removeChangeEventListener(EventListener<Event> listener, boolean options) {
         removeEventListener("change", listener, options);
     }
     default void removeChangeEventListener(EventListener<Event> listener) {
         removeEventListener("change", listener);
     }
    /**
     * Fires when the user clicks the left mouse button on the object
     * @param ev The mouse event.
     */

     @JSProperty
     @Nullable
     EventListener<MouseEvent> getOnclick();

     @JSProperty
     void setOnclick(EventListener<MouseEvent> onclick);

     default void addClickEventListener(EventListener<MouseEvent> listener, AddEventListenerOptions options) {
         addEventListener("click", listener, options);
     }
     default void addClickEventListener(EventListener<MouseEvent> listener, boolean options) {
         addEventListener("click", listener, options);
     }
     default void addClickEventListener(EventListener<MouseEvent> listener) {
         addEventListener("click", listener);
     }

     default void removeClickEventListener(EventListener<MouseEvent> listener, EventListenerOptions options) {
         removeEventListener("click", listener, options);
     }
     default void removeClickEventListener(EventListener<MouseEvent> listener, boolean options) {
         removeEventListener("click", listener, options);
     }
     default void removeClickEventListener(EventListener<MouseEvent> listener) {
         removeEventListener("click", listener);
     }

     @JSProperty
     @Nullable
     EventListener<Event> getOnclose();

     @JSProperty
     void setOnclose(EventListener<Event> onclose);

     default void addCloseEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
         addEventListener("close", listener, options);
     }
     default void addCloseEventListener(EventListener<Event> listener, boolean options) {
         addEventListener("close", listener, options);
     }
     default void addCloseEventListener(EventListener<Event> listener) {
         addEventListener("close", listener);
     }

     default void removeCloseEventListener(EventListener<Event> listener, EventListenerOptions options) {
         removeEventListener("close", listener, options);
     }
     default void removeCloseEventListener(EventListener<Event> listener, boolean options) {
         removeEventListener("close", listener, options);
     }
     default void removeCloseEventListener(EventListener<Event> listener) {
         removeEventListener("close", listener);
     }
    /**
     * Fires when the user clicks the right mouse button in the client area, opening the context menu.
     * @param ev The mouse event.
     */

     @JSProperty
     @Nullable
     EventListener<MouseEvent> getOncontextmenu();

     @JSProperty
     void setOncontextmenu(EventListener<MouseEvent> oncontextmenu);

     default void addContextMenuEventListener(EventListener<MouseEvent> listener, AddEventListenerOptions options) {
         addEventListener("contextmenu", listener, options);
     }
     default void addContextMenuEventListener(EventListener<MouseEvent> listener, boolean options) {
         addEventListener("contextmenu", listener, options);
     }
     default void addContextMenuEventListener(EventListener<MouseEvent> listener) {
         addEventListener("contextmenu", listener);
     }

     default void removeContextMenuEventListener(EventListener<MouseEvent> listener, EventListenerOptions options) {
         removeEventListener("contextmenu", listener, options);
     }
     default void removeContextMenuEventListener(EventListener<MouseEvent> listener, boolean options) {
         removeEventListener("contextmenu", listener, options);
     }
     default void removeContextMenuEventListener(EventListener<MouseEvent> listener) {
         removeEventListener("contextmenu", listener);
     }

     @JSProperty
     @Nullable
     EventListener<Event> getOncuechange();

     @JSProperty
     void setOncuechange(EventListener<Event> oncuechange);

     default void addCueChangeEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
         addEventListener("cuechange", listener, options);
     }
     default void addCueChangeEventListener(EventListener<Event> listener, boolean options) {
         addEventListener("cuechange", listener, options);
     }
     default void addCueChangeEventListener(EventListener<Event> listener) {
         addEventListener("cuechange", listener);
     }

     default void removeCueChangeEventListener(EventListener<Event> listener, EventListenerOptions options) {
         removeEventListener("cuechange", listener, options);
     }
     default void removeCueChangeEventListener(EventListener<Event> listener, boolean options) {
         removeEventListener("cuechange", listener, options);
     }
     default void removeCueChangeEventListener(EventListener<Event> listener) {
         removeEventListener("cuechange", listener);
     }
    /**
     * Fires when the user double-clicks the object.
     * @param ev The mouse event.
     */

     @JSProperty
     @Nullable
     EventListener<MouseEvent> getOndblclick();

     @JSProperty
     void setOndblclick(EventListener<MouseEvent> ondblclick);

     default void addDblClickEventListener(EventListener<MouseEvent> listener, AddEventListenerOptions options) {
         addEventListener("dblclick", listener, options);
     }
     default void addDblClickEventListener(EventListener<MouseEvent> listener, boolean options) {
         addEventListener("dblclick", listener, options);
     }
     default void addDblClickEventListener(EventListener<MouseEvent> listener) {
         addEventListener("dblclick", listener);
     }

     default void removeDblClickEventListener(EventListener<MouseEvent> listener, EventListenerOptions options) {
         removeEventListener("dblclick", listener, options);
     }
     default void removeDblClickEventListener(EventListener<MouseEvent> listener, boolean options) {
         removeEventListener("dblclick", listener, options);
     }
     default void removeDblClickEventListener(EventListener<MouseEvent> listener) {
         removeEventListener("dblclick", listener);
     }
    /**
     * Fires on the source object continuously during a drag operation.
     * @param ev The event.
     */

     @JSProperty
     @Nullable
     EventListener<DragEvent> getOndrag();

     @JSProperty
     void setOndrag(EventListener<DragEvent> ondrag);

     default void addDragEventListener(EventListener<DragEvent> listener, AddEventListenerOptions options) {
         addEventListener("drag", listener, options);
     }
     default void addDragEventListener(EventListener<DragEvent> listener, boolean options) {
         addEventListener("drag", listener, options);
     }
     default void addDragEventListener(EventListener<DragEvent> listener) {
         addEventListener("drag", listener);
     }

     default void removeDragEventListener(EventListener<DragEvent> listener, EventListenerOptions options) {
         removeEventListener("drag", listener, options);
     }
     default void removeDragEventListener(EventListener<DragEvent> listener, boolean options) {
         removeEventListener("drag", listener, options);
     }
     default void removeDragEventListener(EventListener<DragEvent> listener) {
         removeEventListener("drag", listener);
     }
    /**
     * Fires on the source object when the user releases the mouse at the close of a drag operation.
     * @param ev The event.
     */

     @JSProperty
     @Nullable
     EventListener<DragEvent> getOndragend();

     @JSProperty
     void setOndragend(EventListener<DragEvent> ondragend);

     default void addDragEndEventListener(EventListener<DragEvent> listener, AddEventListenerOptions options) {
         addEventListener("dragend", listener, options);
     }
     default void addDragEndEventListener(EventListener<DragEvent> listener, boolean options) {
         addEventListener("dragend", listener, options);
     }
     default void addDragEndEventListener(EventListener<DragEvent> listener) {
         addEventListener("dragend", listener);
     }

     default void removeDragEndEventListener(EventListener<DragEvent> listener, EventListenerOptions options) {
         removeEventListener("dragend", listener, options);
     }
     default void removeDragEndEventListener(EventListener<DragEvent> listener, boolean options) {
         removeEventListener("dragend", listener, options);
     }
     default void removeDragEndEventListener(EventListener<DragEvent> listener) {
         removeEventListener("dragend", listener);
     }
    /**
     * Fires on the target element when the user drags the object to a valid drop target.
     * @param ev The drag event.
     */

     @JSProperty
     @Nullable
     EventListener<DragEvent> getOndragenter();

     @JSProperty
     void setOndragenter(EventListener<DragEvent> ondragenter);

     default void addDragEnterEventListener(EventListener<DragEvent> listener, AddEventListenerOptions options) {
         addEventListener("dragenter", listener, options);
     }
     default void addDragEnterEventListener(EventListener<DragEvent> listener, boolean options) {
         addEventListener("dragenter", listener, options);
     }
     default void addDragEnterEventListener(EventListener<DragEvent> listener) {
         addEventListener("dragenter", listener);
     }

     default void removeDragEnterEventListener(EventListener<DragEvent> listener, EventListenerOptions options) {
         removeEventListener("dragenter", listener, options);
     }
     default void removeDragEnterEventListener(EventListener<DragEvent> listener, boolean options) {
         removeEventListener("dragenter", listener, options);
     }
     default void removeDragEnterEventListener(EventListener<DragEvent> listener) {
         removeEventListener("dragenter", listener);
     }

     @JSProperty
     @Nullable
     EventListener<Event> getOndragexit();

     @JSProperty
     void setOndragexit(EventListener<Event> ondragexit);

     default void addDragExitEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
         addEventListener("dragexit", listener, options);
     }
     default void addDragExitEventListener(EventListener<Event> listener, boolean options) {
         addEventListener("dragexit", listener, options);
     }
     default void addDragExitEventListener(EventListener<Event> listener) {
         addEventListener("dragexit", listener);
     }

     default void removeDragExitEventListener(EventListener<Event> listener, EventListenerOptions options) {
         removeEventListener("dragexit", listener, options);
     }
     default void removeDragExitEventListener(EventListener<Event> listener, boolean options) {
         removeEventListener("dragexit", listener, options);
     }
     default void removeDragExitEventListener(EventListener<Event> listener) {
         removeEventListener("dragexit", listener);
     }
    /**
     * Fires on the target object when the user moves the mouse out of a valid drop target during a drag operation.
     * @param ev The drag event.
     */

     @JSProperty
     @Nullable
     EventListener<DragEvent> getOndragleave();

     @JSProperty
     void setOndragleave(EventListener<DragEvent> ondragleave);

     default void addDragLeaveEventListener(EventListener<DragEvent> listener, AddEventListenerOptions options) {
         addEventListener("dragleave", listener, options);
     }
     default void addDragLeaveEventListener(EventListener<DragEvent> listener, boolean options) {
         addEventListener("dragleave", listener, options);
     }
     default void addDragLeaveEventListener(EventListener<DragEvent> listener) {
         addEventListener("dragleave", listener);
     }

     default void removeDragLeaveEventListener(EventListener<DragEvent> listener, EventListenerOptions options) {
         removeEventListener("dragleave", listener, options);
     }
     default void removeDragLeaveEventListener(EventListener<DragEvent> listener, boolean options) {
         removeEventListener("dragleave", listener, options);
     }
     default void removeDragLeaveEventListener(EventListener<DragEvent> listener) {
         removeEventListener("dragleave", listener);
     }
    /**
     * Fires on the target element continuously while the user drags the object over a valid drop target.
     * @param ev The event.
     */

     @JSProperty
     @Nullable
     EventListener<DragEvent> getOndragover();

     @JSProperty
     void setOndragover(EventListener<DragEvent> ondragover);

     default void addDragOverEventListener(EventListener<DragEvent> listener, AddEventListenerOptions options) {
         addEventListener("dragover", listener, options);
     }
     default void addDragOverEventListener(EventListener<DragEvent> listener, boolean options) {
         addEventListener("dragover", listener, options);
     }
     default void addDragOverEventListener(EventListener<DragEvent> listener) {
         addEventListener("dragover", listener);
     }

     default void removeDragOverEventListener(EventListener<DragEvent> listener, EventListenerOptions options) {
         removeEventListener("dragover", listener, options);
     }
     default void removeDragOverEventListener(EventListener<DragEvent> listener, boolean options) {
         removeEventListener("dragover", listener, options);
     }
     default void removeDragOverEventListener(EventListener<DragEvent> listener) {
         removeEventListener("dragover", listener);
     }
    /**
     * Fires on the source object when the user starts to drag a text selection or selected object.
     * @param ev The event.
     */

     @JSProperty
     @Nullable
     EventListener<DragEvent> getOndragstart();

     @JSProperty
     void setOndragstart(EventListener<DragEvent> ondragstart);

     default void addDragStartEventListener(EventListener<DragEvent> listener, AddEventListenerOptions options) {
         addEventListener("dragstart", listener, options);
     }
     default void addDragStartEventListener(EventListener<DragEvent> listener, boolean options) {
         addEventListener("dragstart", listener, options);
     }
     default void addDragStartEventListener(EventListener<DragEvent> listener) {
         addEventListener("dragstart", listener);
     }

     default void removeDragStartEventListener(EventListener<DragEvent> listener, EventListenerOptions options) {
         removeEventListener("dragstart", listener, options);
     }
     default void removeDragStartEventListener(EventListener<DragEvent> listener, boolean options) {
         removeEventListener("dragstart", listener, options);
     }
     default void removeDragStartEventListener(EventListener<DragEvent> listener) {
         removeEventListener("dragstart", listener);
     }

     @JSProperty
     @Nullable
     EventListener<DragEvent> getOndrop();

     @JSProperty
     void setOndrop(EventListener<DragEvent> ondrop);

     default void addDropEventListener(EventListener<DragEvent> listener, AddEventListenerOptions options) {
         addEventListener("drop", listener, options);
     }
     default void addDropEventListener(EventListener<DragEvent> listener, boolean options) {
         addEventListener("drop", listener, options);
     }
     default void addDropEventListener(EventListener<DragEvent> listener) {
         addEventListener("drop", listener);
     }

     default void removeDropEventListener(EventListener<DragEvent> listener, EventListenerOptions options) {
         removeEventListener("drop", listener, options);
     }
     default void removeDropEventListener(EventListener<DragEvent> listener, boolean options) {
         removeEventListener("drop", listener, options);
     }
     default void removeDropEventListener(EventListener<DragEvent> listener) {
         removeEventListener("drop", listener);
     }
    /**
     * Occurs when the duration attribute is updated.
     * @param ev The event.
     */

     @JSProperty
     @Nullable
     EventListener<Event> getOndurationchange();

     @JSProperty
     void setOndurationchange(EventListener<Event> ondurationchange);

     default void addDurationChangeEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
         addEventListener("durationchange", listener, options);
     }
     default void addDurationChangeEventListener(EventListener<Event> listener, boolean options) {
         addEventListener("durationchange", listener, options);
     }
     default void addDurationChangeEventListener(EventListener<Event> listener) {
         addEventListener("durationchange", listener);
     }

     default void removeDurationChangeEventListener(EventListener<Event> listener, EventListenerOptions options) {
         removeEventListener("durationchange", listener, options);
     }
     default void removeDurationChangeEventListener(EventListener<Event> listener, boolean options) {
         removeEventListener("durationchange", listener, options);
     }
     default void removeDurationChangeEventListener(EventListener<Event> listener) {
         removeEventListener("durationchange", listener);
     }
    /**
     * Occurs when the media element is reset to its initial state.
     * @param ev The event.
     */

     @JSProperty
     @Nullable
     EventListener<Event> getOnemptied();

     @JSProperty
     void setOnemptied(EventListener<Event> onemptied);

     default void addEmptiedEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
         addEventListener("emptied", listener, options);
     }
     default void addEmptiedEventListener(EventListener<Event> listener, boolean options) {
         addEventListener("emptied", listener, options);
     }
     default void addEmptiedEventListener(EventListener<Event> listener) {
         addEventListener("emptied", listener);
     }

     default void removeEmptiedEventListener(EventListener<Event> listener, EventListenerOptions options) {
         removeEventListener("emptied", listener, options);
     }
     default void removeEmptiedEventListener(EventListener<Event> listener, boolean options) {
         removeEventListener("emptied", listener, options);
     }
     default void removeEmptiedEventListener(EventListener<Event> listener) {
         removeEventListener("emptied", listener);
     }
    /**
     * Occurs when the end of playback is reached.
     * @param ev The event
     */


     @JSProperty
     @Nullable
     EventListener<Event> getOnended();

     @JSProperty
     void setOnended(EventListener<Event> onended);

     default void addEndedEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
         addEventListener("ended", listener, options);
     }
     default void addEndedEventListener(EventListener<Event> listener, boolean options) {
         addEventListener("ended", listener, options);
     }
     default void addEndedEventListener(EventListener<Event> listener) {
         addEventListener("ended", listener);
     }

     default void removeEndedEventListener(EventListener<Event> listener, EventListenerOptions options) {
         removeEventListener("ended", listener, options);
     }
     default void removeEndedEventListener(EventListener<Event> listener, boolean options) {
         removeEventListener("ended", listener, options);
     }
     default void removeEndedEventListener(EventListener<Event> listener) {
         removeEventListener("ended", listener);
     }
    /**
     * Fires when an error occurs during object loading.
     * @param ev The event.
     */
    @JSProperty
    OnErrorEventHandler getOnerror();

    @JSProperty
    void setOnerror(OnErrorEventHandler onerror);

    /**
     * Fires when the object receives focus.
     * @param ev The event.
     */

     @JSProperty
     @Nullable
     EventListener<FocusEvent> getOnfocus();

     @JSProperty
     void setOnfocus(EventListener<FocusEvent> onfocus);

     default void addFocusEventListener(EventListener<FocusEvent> listener, AddEventListenerOptions options) {
         addEventListener("focus", listener, options);
     }
     default void addFocusEventListener(EventListener<FocusEvent> listener, boolean options) {
         addEventListener("focus", listener, options);
     }
     default void addFocusEventListener(EventListener<FocusEvent> listener) {
         addEventListener("focus", listener);
     }

     default void removeFocusEventListener(EventListener<FocusEvent> listener, EventListenerOptions options) {
         removeEventListener("focus", listener, options);
     }
     default void removeFocusEventListener(EventListener<FocusEvent> listener, boolean options) {
         removeEventListener("focus", listener, options);
     }
     default void removeFocusEventListener(EventListener<FocusEvent> listener) {
         removeEventListener("focus", listener);
     }

     @JSProperty
     @Nullable
     EventListener<FocusEvent> getOnfocusin();

     @JSProperty
     void setOnfocusin(EventListener<FocusEvent> onfocusin);

     default void addFocusInEventListener(EventListener<FocusEvent> listener, AddEventListenerOptions options) {
         addEventListener("focusin", listener, options);
     }
     default void addFocusInEventListener(EventListener<FocusEvent> listener, boolean options) {
         addEventListener("focusin", listener, options);
     }
     default void addFocusInEventListener(EventListener<FocusEvent> listener) {
         addEventListener("focusin", listener);
     }

     default void removeFocusInEventListener(EventListener<FocusEvent> listener, EventListenerOptions options) {
         removeEventListener("focusin", listener, options);
     }
     default void removeFocusInEventListener(EventListener<FocusEvent> listener, boolean options) {
         removeEventListener("focusin", listener, options);
     }
     default void removeFocusInEventListener(EventListener<FocusEvent> listener) {
         removeEventListener("focusin", listener);
     }

     @JSProperty
     @Nullable
     EventListener<FocusEvent> getOnfocusout();

     @JSProperty
     void setOnfocusout(EventListener<FocusEvent> onfocusout);

     default void addFocusOutEventListener(EventListener<FocusEvent> listener, AddEventListenerOptions options) {
         addEventListener("focusout", listener, options);
     }
     default void addFocusOutEventListener(EventListener<FocusEvent> listener, boolean options) {
         addEventListener("focusout", listener, options);
     }
     default void addFocusOutEventListener(EventListener<FocusEvent> listener) {
         addEventListener("focusout", listener);
     }

     default void removeFocusOutEventListener(EventListener<FocusEvent> listener, EventListenerOptions options) {
         removeEventListener("focusout", listener, options);
     }
     default void removeFocusOutEventListener(EventListener<FocusEvent> listener, boolean options) {
         removeEventListener("focusout", listener, options);
     }
     default void removeFocusOutEventListener(EventListener<FocusEvent> listener) {
         removeEventListener("focusout", listener);
     }

     @JSProperty
     @Nullable
     EventListener<PointerEvent> getOngotpointercapture();

     @JSProperty
     void setOngotpointercapture(EventListener<PointerEvent> ongotpointercapture);

     default void addGotPointerCaptureEventListener(EventListener<PointerEvent> listener, AddEventListenerOptions options) {
         addEventListener("gotpointercapture", listener, options);
     }
     default void addGotPointerCaptureEventListener(EventListener<PointerEvent> listener, boolean options) {
         addEventListener("gotpointercapture", listener, options);
     }
     default void addGotPointerCaptureEventListener(EventListener<PointerEvent> listener) {
         addEventListener("gotpointercapture", listener);
     }

     default void removeGotPointerCaptureEventListener(EventListener<PointerEvent> listener, EventListenerOptions options) {
         removeEventListener("gotpointercapture", listener, options);
     }
     default void removeGotPointerCaptureEventListener(EventListener<PointerEvent> listener, boolean options) {
         removeEventListener("gotpointercapture", listener, options);
     }
     default void removeGotPointerCaptureEventListener(EventListener<PointerEvent> listener) {
         removeEventListener("gotpointercapture", listener);
     }

     @JSProperty
     @Nullable
     EventListener<InputEvent> getOninput();

     @JSProperty
     void setOninput(EventListener<InputEvent> oninput);

     default void addInputEventListener(EventListener<InputEvent> listener, AddEventListenerOptions options) {
         addEventListener("input", listener, options);
     }
     default void addInputEventListener(EventListener<InputEvent> listener, boolean options) {
         addEventListener("input", listener, options);
     }
     default void addInputEventListener(EventListener<InputEvent> listener) {
         addEventListener("input", listener);
     }

     default void removeInputEventListener(EventListener<InputEvent> listener, EventListenerOptions options) {
         removeEventListener("input", listener, options);
     }
     default void removeInputEventListener(EventListener<InputEvent> listener, boolean options) {
         removeEventListener("input", listener, options);
     }
     default void removeInputEventListener(EventListener<InputEvent> listener) {
         removeEventListener("input", listener);
     }

     @JSProperty
     @Nullable
     EventListener<Event> getOninvalid();

     @JSProperty
     void setOninvalid(EventListener<Event> oninvalid);

     default void addInvalidEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
         addEventListener("invalid", listener, options);
     }
     default void addInvalidEventListener(EventListener<Event> listener, boolean options) {
         addEventListener("invalid", listener, options);
     }
     default void addInvalidEventListener(EventListener<Event> listener) {
         addEventListener("invalid", listener);
     }

     default void removeInvalidEventListener(EventListener<Event> listener, EventListenerOptions options) {
         removeEventListener("invalid", listener, options);
     }
     default void removeInvalidEventListener(EventListener<Event> listener, boolean options) {
         removeEventListener("invalid", listener, options);
     }
     default void removeInvalidEventListener(EventListener<Event> listener) {
         removeEventListener("invalid", listener);
     }
    /**
     * Fires when the user presses a key.
     * @param ev The keyboard event
     */

     @JSProperty
     @Nullable
     EventListener<KeyboardEvent> getOnkeydown();

     @JSProperty
     void setOnkeydown(EventListener<KeyboardEvent> onkeydown);

     default void addKeyDownEventListener(EventListener<KeyboardEvent> listener, AddEventListenerOptions options) {
         addEventListener("keydown", listener, options);
     }
     default void addKeyDownEventListener(EventListener<KeyboardEvent> listener, boolean options) {
         addEventListener("keydown", listener, options);
     }
     default void addKeyDownEventListener(EventListener<KeyboardEvent> listener) {
         addEventListener("keydown", listener);
     }

     default void removeKeyDownEventListener(EventListener<KeyboardEvent> listener, EventListenerOptions options) {
         removeEventListener("keydown", listener, options);
     }
     default void removeKeyDownEventListener(EventListener<KeyboardEvent> listener, boolean options) {
         removeEventListener("keydown", listener, options);
     }
     default void removeKeyDownEventListener(EventListener<KeyboardEvent> listener) {
         removeEventListener("keydown", listener);
     }
    /**
     * Fires when the user presses an alphanumeric key.
     * @param ev The event.
     */

     @JSProperty
     @Nullable
     EventListener<KeyboardEvent> getOnkeypress();

     @JSProperty
     void setOnkeypress(EventListener<KeyboardEvent> onkeypress);

     default void addKeyPressEventListener(EventListener<KeyboardEvent> listener, AddEventListenerOptions options) {
         addEventListener("keypress", listener, options);
     }
     default void addKeyPressEventListener(EventListener<KeyboardEvent> listener, boolean options) {
         addEventListener("keypress", listener, options);
     }
     default void addKeyPressEventListener(EventListener<KeyboardEvent> listener) {
         addEventListener("keypress", listener);
     }

     default void removeKeyPressEventListener(EventListener<KeyboardEvent> listener, EventListenerOptions options) {
         removeEventListener("keypress", listener, options);
     }
     default void removeKeyPressEventListener(EventListener<KeyboardEvent> listener, boolean options) {
         removeEventListener("keypress", listener, options);
     }
     default void removeKeyPressEventListener(EventListener<KeyboardEvent> listener) {
         removeEventListener("keypress", listener);
     }
    /**
     * Fires when the user releases a key.
     * @param ev The keyboard event
     */

     @JSProperty
     @Nullable
     EventListener<KeyboardEvent> getOnkeyup();

     @JSProperty
     void setOnkeyup(EventListener<KeyboardEvent> onkeyup);

     default void addKeyUpEventListener(EventListener<KeyboardEvent> listener, AddEventListenerOptions options) {
         addEventListener("keyup", listener, options);
     }
     default void addKeyUpEventListener(EventListener<KeyboardEvent> listener, boolean options) {
         addEventListener("keyup", listener, options);
     }
     default void addKeyUpEventListener(EventListener<KeyboardEvent> listener) {
         addEventListener("keyup", listener);
     }

     default void removeKeyUpEventListener(EventListener<KeyboardEvent> listener, EventListenerOptions options) {
         removeEventListener("keyup", listener, options);
     }
     default void removeKeyUpEventListener(EventListener<KeyboardEvent> listener, boolean options) {
         removeEventListener("keyup", listener, options);
     }
     default void removeKeyUpEventListener(EventListener<KeyboardEvent> listener) {
         removeEventListener("keyup", listener);
     }
    /**
     * Fires immediately after the browser loads the object.
     * @param ev The event.
     */

     @JSProperty
     @Nullable
     EventListener<Event> getOnload();

     @JSProperty
     void setOnload(EventListener<Event> onload);

     default void addLoadEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
         addEventListener("load", listener, options);
     }
     default void addLoadEventListener(EventListener<Event> listener, boolean options) {
         addEventListener("load", listener, options);
     }
     default void addLoadEventListener(EventListener<Event> listener) {
         addEventListener("load", listener);
     }

     default void removeLoadEventListener(EventListener<Event> listener, EventListenerOptions options) {
         removeEventListener("load", listener, options);
     }
     default void removeLoadEventListener(EventListener<Event> listener, boolean options) {
         removeEventListener("load", listener, options);
     }
     default void removeLoadEventListener(EventListener<Event> listener) {
         removeEventListener("load", listener);
     }
    /**
     * Occurs when media data is loaded at the current playback position.
     * @param ev The event.
     */

     @JSProperty
     @Nullable
     EventListener<Event> getOnloadeddata();

     @JSProperty
     void setOnloadeddata(EventListener<Event> onloadeddata);

     default void addLoadedDataEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
         addEventListener("loadeddata", listener, options);
     }
     default void addLoadedDataEventListener(EventListener<Event> listener, boolean options) {
         addEventListener("loadeddata", listener, options);
     }
     default void addLoadedDataEventListener(EventListener<Event> listener) {
         addEventListener("loadeddata", listener);
     }

     default void removeLoadedDataEventListener(EventListener<Event> listener, EventListenerOptions options) {
         removeEventListener("loadeddata", listener, options);
     }
     default void removeLoadedDataEventListener(EventListener<Event> listener, boolean options) {
         removeEventListener("loadeddata", listener, options);
     }
     default void removeLoadedDataEventListener(EventListener<Event> listener) {
         removeEventListener("loadeddata", listener);
     }
    /**
     * Occurs when the duration and dimensions of the media have been determined.
     * @param ev The event.
     */

     @JSProperty
     @Nullable
     EventListener<Event> getOnloadedmetadata();

     @JSProperty
     void setOnloadedmetadata(EventListener<Event> onloadedmetadata);

     default void addLoadedMetaDataEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
         addEventListener("loadedmetadata", listener, options);
     }
     default void addLoadedMetaDataEventListener(EventListener<Event> listener, boolean options) {
         addEventListener("loadedmetadata", listener, options);
     }
     default void addLoadedMetaDataEventListener(EventListener<Event> listener) {
         addEventListener("loadedmetadata", listener);
     }

     default void removeLoadedMetaDataEventListener(EventListener<Event> listener, EventListenerOptions options) {
         removeEventListener("loadedmetadata", listener, options);
     }
     default void removeLoadedMetaDataEventListener(EventListener<Event> listener, boolean options) {
         removeEventListener("loadedmetadata", listener, options);
     }
     default void removeLoadedMetaDataEventListener(EventListener<Event> listener) {
         removeEventListener("loadedmetadata", listener);
     }

     @JSProperty
     @Nullable
     EventListener<ProgressEvent> getOnloadend();

     @JSProperty
     void setOnloadend(EventListener<ProgressEvent> onloadend);

     default void addLoadEndEventListener(EventListener<ProgressEvent> listener, AddEventListenerOptions options) {
         addEventListener("loadend", listener, options);
     }
     default void addLoadEndEventListener(EventListener<ProgressEvent> listener, boolean options) {
         addEventListener("loadend", listener, options);
     }
     default void addLoadEndEventListener(EventListener<ProgressEvent> listener) {
         addEventListener("loadend", listener);
     }

     default void removeLoadEndEventListener(EventListener<ProgressEvent> listener, EventListenerOptions options) {
         removeEventListener("loadend", listener, options);
     }
     default void removeLoadEndEventListener(EventListener<ProgressEvent> listener, boolean options) {
         removeEventListener("loadend", listener, options);
     }
     default void removeLoadEndEventListener(EventListener<ProgressEvent> listener) {
         removeEventListener("loadend", listener);
     }
    /**
     * Occurs when Internet Explorer begins looking for media data.
     * @param ev The event.
     */

     @JSProperty
     @Nullable
     EventListener<Event> getOnloadstart();

     @JSProperty
     void setOnloadstart(EventListener<Event> onloadstart);

     default void addLoadStartEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
         addEventListener("loadstart", listener, options);
     }
     default void addLoadStartEventListener(EventListener<Event> listener, boolean options) {
         addEventListener("loadstart", listener, options);
     }
     default void addLoadStartEventListener(EventListener<Event> listener) {
         addEventListener("loadstart", listener);
     }

     default void removeLoadStartEventListener(EventListener<Event> listener, EventListenerOptions options) {
         removeEventListener("loadstart", listener, options);
     }
     default void removeLoadStartEventListener(EventListener<Event> listener, boolean options) {
         removeEventListener("loadstart", listener, options);
     }
     default void removeLoadStartEventListener(EventListener<Event> listener) {
         removeEventListener("loadstart", listener);
     }

     @JSProperty
     @Nullable
     EventListener<PointerEvent> getOnlostpointercapture();

     @JSProperty
     void setOnlostpointercapture(EventListener<PointerEvent> onlostpointercapture);

     default void addLostPointerCaptureEventListener(EventListener<PointerEvent> listener, AddEventListenerOptions options) {
         addEventListener("lostpointercapture", listener, options);
     }
     default void addLostPointerCaptureEventListener(EventListener<PointerEvent> listener, boolean options) {
         addEventListener("lostpointercapture", listener, options);
     }
     default void addLostPointerCaptureEventListener(EventListener<PointerEvent> listener) {
         addEventListener("lostpointercapture", listener);
     }

     default void removeLostPointerCaptureEventListener(EventListener<PointerEvent> listener, EventListenerOptions options) {
         removeEventListener("lostpointercapture", listener, options);
     }
     default void removeLostPointerCaptureEventListener(EventListener<PointerEvent> listener, boolean options) {
         removeEventListener("lostpointercapture", listener, options);
     }
     default void removeLostPointerCaptureEventListener(EventListener<PointerEvent> listener) {
         removeEventListener("lostpointercapture", listener);
     }
    /**
     * Fires when the user clicks the object with either mouse button.
     * @param ev The mouse event.
     */

     @JSProperty
     @Nullable
     EventListener<MouseEvent> getOnmousedown();

     @JSProperty
     void setOnmousedown(EventListener<MouseEvent> onmousedown);

     default void addMouseDownEventListener(EventListener<MouseEvent> listener, AddEventListenerOptions options) {
         addEventListener("mousedown", listener, options);
     }
     default void addMouseDownEventListener(EventListener<MouseEvent> listener, boolean options) {
         addEventListener("mousedown", listener, options);
     }
     default void addMouseDownEventListener(EventListener<MouseEvent> listener) {
         addEventListener("mousedown", listener);
     }

     default void removeMouseDownEventListener(EventListener<MouseEvent> listener, EventListenerOptions options) {
         removeEventListener("mousedown", listener, options);
     }
     default void removeMouseDownEventListener(EventListener<MouseEvent> listener, boolean options) {
         removeEventListener("mousedown", listener, options);
     }
     default void removeMouseDownEventListener(EventListener<MouseEvent> listener) {
         removeEventListener("mousedown", listener);
     }

     @JSProperty
     @Nullable
     EventListener<MouseEvent> getOnmouseenter();

     @JSProperty
     void setOnmouseenter(EventListener<MouseEvent> onmouseenter);

     default void addMouseEnterEventListener(EventListener<MouseEvent> listener, AddEventListenerOptions options) {
         addEventListener("mouseenter", listener, options);
     }
     default void addMouseEnterEventListener(EventListener<MouseEvent> listener, boolean options) {
         addEventListener("mouseenter", listener, options);
     }
     default void addMouseEnterEventListener(EventListener<MouseEvent> listener) {
         addEventListener("mouseenter", listener);
     }

     default void removeMouseEnterEventListener(EventListener<MouseEvent> listener, EventListenerOptions options) {
         removeEventListener("mouseenter", listener, options);
     }
     default void removeMouseEnterEventListener(EventListener<MouseEvent> listener, boolean options) {
         removeEventListener("mouseenter", listener, options);
     }
     default void removeMouseEnterEventListener(EventListener<MouseEvent> listener) {
         removeEventListener("mouseenter", listener);
     }

     @JSProperty
     @Nullable
     EventListener<MouseEvent> getOnmouseleave();

     @JSProperty
     void setOnmouseleave(EventListener<MouseEvent> onmouseleave);

     default void addMouseLeaveEventListener(EventListener<MouseEvent> listener, AddEventListenerOptions options) {
         addEventListener("mouseleave", listener, options);
     }
     default void addMouseLeaveEventListener(EventListener<MouseEvent> listener, boolean options) {
         addEventListener("mouseleave", listener, options);
     }
     default void addMouseLeaveEventListener(EventListener<MouseEvent> listener) {
         addEventListener("mouseleave", listener);
     }

     default void removeMouseLeaveEventListener(EventListener<MouseEvent> listener, EventListenerOptions options) {
         removeEventListener("mouseleave", listener, options);
     }
     default void removeMouseLeaveEventListener(EventListener<MouseEvent> listener, boolean options) {
         removeEventListener("mouseleave", listener, options);
     }
     default void removeMouseLeaveEventListener(EventListener<MouseEvent> listener) {
         removeEventListener("mouseleave", listener);
     }
    /**
     * Fires when the user moves the mouse over the object.
     * @param ev The mouse event.
     */

     @JSProperty
     @Nullable
     EventListener<MouseEvent> getOnmousemove();

     @JSProperty
     void setOnmousemove(EventListener<MouseEvent> onmousemove);

     default void addMouseMoveEventListener(EventListener<MouseEvent> listener, AddEventListenerOptions options) {
         addEventListener("mousemove", listener, options);
     }
     default void addMouseMoveEventListener(EventListener<MouseEvent> listener, boolean options) {
         addEventListener("mousemove", listener, options);
     }
     default void addMouseMoveEventListener(EventListener<MouseEvent> listener) {
         addEventListener("mousemove", listener);
     }

     default void removeMouseMoveEventListener(EventListener<MouseEvent> listener, EventListenerOptions options) {
         removeEventListener("mousemove", listener, options);
     }
     default void removeMouseMoveEventListener(EventListener<MouseEvent> listener, boolean options) {
         removeEventListener("mousemove", listener, options);
     }
     default void removeMouseMoveEventListener(EventListener<MouseEvent> listener) {
         removeEventListener("mousemove", listener);
     }
    /**
     * Fires when the user moves the mouse pointer outside the boundaries of the object.
     * @param ev The mouse event.
     */

     @JSProperty
     @Nullable
     EventListener<MouseEvent> getOnmouseout();

     @JSProperty
     void setOnmouseout(EventListener<MouseEvent> onmouseout);

     default void addMouseOutEventListener(EventListener<MouseEvent> listener, AddEventListenerOptions options) {
         addEventListener("mouseout", listener, options);
     }
     default void addMouseOutEventListener(EventListener<MouseEvent> listener, boolean options) {
         addEventListener("mouseout", listener, options);
     }
     default void addMouseOutEventListener(EventListener<MouseEvent> listener) {
         addEventListener("mouseout", listener);
     }

     default void removeMouseOutEventListener(EventListener<MouseEvent> listener, EventListenerOptions options) {
         removeEventListener("mouseout", listener, options);
     }
     default void removeMouseOutEventListener(EventListener<MouseEvent> listener, boolean options) {
         removeEventListener("mouseout", listener, options);
     }
     default void removeMouseOutEventListener(EventListener<MouseEvent> listener) {
         removeEventListener("mouseout", listener);
     }
    /**
     * Fires when the user moves the mouse pointer into the object.
     * @param ev The mouse event.
     */

     @JSProperty
     @Nullable
     EventListener<MouseEvent> getOnmouseover();

     @JSProperty
     void setOnmouseover(EventListener<MouseEvent> onmouseover);

     default void addMouseOverEventListener(EventListener<MouseEvent> listener, AddEventListenerOptions options) {
         addEventListener("mouseover", listener, options);
     }
     default void addMouseOverEventListener(EventListener<MouseEvent> listener, boolean options) {
         addEventListener("mouseover", listener, options);
     }
     default void addMouseOverEventListener(EventListener<MouseEvent> listener) {
         addEventListener("mouseover", listener);
     }

     default void removeMouseOverEventListener(EventListener<MouseEvent> listener, EventListenerOptions options) {
         removeEventListener("mouseover", listener, options);
     }
     default void removeMouseOverEventListener(EventListener<MouseEvent> listener, boolean options) {
         removeEventListener("mouseover", listener, options);
     }
     default void removeMouseOverEventListener(EventListener<MouseEvent> listener) {
         removeEventListener("mouseover", listener);
     }
    /**
     * Fires when the user releases a mouse button while the mouse is over the object.
     * @param ev The mouse event.
     */

     @JSProperty
     @Nullable
     EventListener<MouseEvent> getOnmouseup();

     @JSProperty
     void setOnmouseup(EventListener<MouseEvent> onmouseup);

     default void addMouseUpEventListener(EventListener<MouseEvent> listener, AddEventListenerOptions options) {
         addEventListener("mouseup", listener, options);
     }
     default void addMouseUpEventListener(EventListener<MouseEvent> listener, boolean options) {
         addEventListener("mouseup", listener, options);
     }
     default void addMouseUpEventListener(EventListener<MouseEvent> listener) {
         addEventListener("mouseup", listener);
     }

     default void removeMouseUpEventListener(EventListener<MouseEvent> listener, EventListenerOptions options) {
         removeEventListener("mouseup", listener, options);
     }
     default void removeMouseUpEventListener(EventListener<MouseEvent> listener, boolean options) {
         removeEventListener("mouseup", listener, options);
     }
     default void removeMouseUpEventListener(EventListener<MouseEvent> listener) {
         removeEventListener("mouseup", listener);
     }
    /**
     * Occurs when playback is paused.
     * @param ev The event.
     */

     @JSProperty
     @Nullable
     EventListener<Event> getOnpause();

     @JSProperty
     void setOnpause(EventListener<Event> onpause);

     default void addPauseEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
         addEventListener("pause", listener, options);
     }
     default void addPauseEventListener(EventListener<Event> listener, boolean options) {
         addEventListener("pause", listener, options);
     }
     default void addPauseEventListener(EventListener<Event> listener) {
         addEventListener("pause", listener);
     }

     default void removePauseEventListener(EventListener<Event> listener, EventListenerOptions options) {
         removeEventListener("pause", listener, options);
     }
     default void removePauseEventListener(EventListener<Event> listener, boolean options) {
         removeEventListener("pause", listener, options);
     }
     default void removePauseEventListener(EventListener<Event> listener) {
         removeEventListener("pause", listener);
     }
    /**
     * Occurs when the play method is requested.
     * @param ev The event.
     */

     @JSProperty
     @Nullable
     EventListener<Event> getOnplay();

     @JSProperty
     void setOnplay(EventListener<Event> onplay);

     default void addPlayEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
         addEventListener("play", listener, options);
     }
     default void addPlayEventListener(EventListener<Event> listener, boolean options) {
         addEventListener("play", listener, options);
     }
     default void addPlayEventListener(EventListener<Event> listener) {
         addEventListener("play", listener);
     }

     default void removePlayEventListener(EventListener<Event> listener, EventListenerOptions options) {
         removeEventListener("play", listener, options);
     }
     default void removePlayEventListener(EventListener<Event> listener, boolean options) {
         removeEventListener("play", listener, options);
     }
     default void removePlayEventListener(EventListener<Event> listener) {
         removeEventListener("play", listener);
     }
    /**
     * Occurs when the audio or video has started playing.
     * @param ev The event.
     */

     @JSProperty
     @Nullable
     EventListener<Event> getOnplaying();

     @JSProperty
     void setOnplaying(EventListener<Event> onplaying);

     default void addPlayingEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
         addEventListener("playing", listener, options);
     }
     default void addPlayingEventListener(EventListener<Event> listener, boolean options) {
         addEventListener("playing", listener, options);
     }
     default void addPlayingEventListener(EventListener<Event> listener) {
         addEventListener("playing", listener);
     }

     default void removePlayingEventListener(EventListener<Event> listener, EventListenerOptions options) {
         removeEventListener("playing", listener, options);
     }
     default void removePlayingEventListener(EventListener<Event> listener, boolean options) {
         removeEventListener("playing", listener, options);
     }
     default void removePlayingEventListener(EventListener<Event> listener) {
         removeEventListener("playing", listener);
     }

     @JSProperty
     @Nullable
     EventListener<PointerEvent> getOnpointercancel();

     @JSProperty
     void setOnpointercancel(EventListener<PointerEvent> onpointercancel);

     default void addPointerCancelEventListener(EventListener<PointerEvent> listener, AddEventListenerOptions options) {
         addEventListener("pointercancel", listener, options);
     }
     default void addPointerCancelEventListener(EventListener<PointerEvent> listener, boolean options) {
         addEventListener("pointercancel", listener, options);
     }
     default void addPointerCancelEventListener(EventListener<PointerEvent> listener) {
         addEventListener("pointercancel", listener);
     }

     default void removePointerCancelEventListener(EventListener<PointerEvent> listener, EventListenerOptions options) {
         removeEventListener("pointercancel", listener, options);
     }
     default void removePointerCancelEventListener(EventListener<PointerEvent> listener, boolean options) {
         removeEventListener("pointercancel", listener, options);
     }
     default void removePointerCancelEventListener(EventListener<PointerEvent> listener) {
         removeEventListener("pointercancel", listener);
     }

     @JSProperty
     @Nullable
     EventListener<PointerEvent> getOnpointerdown();

     @JSProperty
     void setOnpointerdown(EventListener<PointerEvent> onpointerdown);

     default void addPointerDownEventListener(EventListener<PointerEvent> listener, AddEventListenerOptions options) {
         addEventListener("pointerdown", listener, options);
     }
     default void addPointerDownEventListener(EventListener<PointerEvent> listener, boolean options) {
         addEventListener("pointerdown", listener, options);
     }
     default void addPointerDownEventListener(EventListener<PointerEvent> listener) {
         addEventListener("pointerdown", listener);
     }

     default void removePointerDownEventListener(EventListener<PointerEvent> listener, EventListenerOptions options) {
         removeEventListener("pointerdown", listener, options);
     }
     default void removePointerDownEventListener(EventListener<PointerEvent> listener, boolean options) {
         removeEventListener("pointerdown", listener, options);
     }
     default void removePointerDownEventListener(EventListener<PointerEvent> listener) {
         removeEventListener("pointerdown", listener);
     }

     @JSProperty
     @Nullable
     EventListener<PointerEvent> getOnpointerenter();

     @JSProperty
     void setOnpointerenter(EventListener<PointerEvent> onpointerenter);

     default void addPointerEnterEventListener(EventListener<PointerEvent> listener, AddEventListenerOptions options) {
         addEventListener("pointerenter", listener, options);
     }
     default void addPointerEnterEventListener(EventListener<PointerEvent> listener, boolean options) {
         addEventListener("pointerenter", listener, options);
     }
     default void addPointerEnterEventListener(EventListener<PointerEvent> listener) {
         addEventListener("pointerenter", listener);
     }

     default void removePointerEnterEventListener(EventListener<PointerEvent> listener, EventListenerOptions options) {
         removeEventListener("pointerenter", listener, options);
     }
     default void removePointerEnterEventListener(EventListener<PointerEvent> listener, boolean options) {
         removeEventListener("pointerenter", listener, options);
     }
     default void removePointerEnterEventListener(EventListener<PointerEvent> listener) {
         removeEventListener("pointerenter", listener);
     }

     @JSProperty
     @Nullable
     EventListener<PointerEvent> getOnpointerleave();

     @JSProperty
     void setOnpointerleave(EventListener<PointerEvent> onpointerleave);

     default void addPointerLeaveEventListener(EventListener<PointerEvent> listener, AddEventListenerOptions options) {
         addEventListener("pointerleave", listener, options);
     }
     default void addPointerLeaveEventListener(EventListener<PointerEvent> listener, boolean options) {
         addEventListener("pointerleave", listener, options);
     }
     default void addPointerLeaveEventListener(EventListener<PointerEvent> listener) {
         addEventListener("pointerleave", listener);
     }

     default void removePointerLeaveEventListener(EventListener<PointerEvent> listener, EventListenerOptions options) {
         removeEventListener("pointerleave", listener, options);
     }
     default void removePointerLeaveEventListener(EventListener<PointerEvent> listener, boolean options) {
         removeEventListener("pointerleave", listener, options);
     }
     default void removePointerLeaveEventListener(EventListener<PointerEvent> listener) {
         removeEventListener("pointerleave", listener);
     }

     @JSProperty
     @Nullable
     EventListener<PointerEvent> getOnpointermove();

     @JSProperty
     void setOnpointermove(EventListener<PointerEvent> onpointermove);

     default void addPointerMoveEventListener(EventListener<PointerEvent> listener, AddEventListenerOptions options) {
         addEventListener("pointermove", listener, options);
     }
     default void addPointerMoveEventListener(EventListener<PointerEvent> listener, boolean options) {
         addEventListener("pointermove", listener, options);
     }
     default void addPointerMoveEventListener(EventListener<PointerEvent> listener) {
         addEventListener("pointermove", listener);
     }

     default void removePointerMoveEventListener(EventListener<PointerEvent> listener, EventListenerOptions options) {
         removeEventListener("pointermove", listener, options);
     }
     default void removePointerMoveEventListener(EventListener<PointerEvent> listener, boolean options) {
         removeEventListener("pointermove", listener, options);
     }
     default void removePointerMoveEventListener(EventListener<PointerEvent> listener) {
         removeEventListener("pointermove", listener);
     }

     @JSProperty
     @Nullable
     EventListener<PointerEvent> getOnpointerout();

     @JSProperty
     void setOnpointerout(EventListener<PointerEvent> onpointerout);

     default void addPointerOutEventListener(EventListener<PointerEvent> listener, AddEventListenerOptions options) {
         addEventListener("pointerout", listener, options);
     }
     default void addPointerOutEventListener(EventListener<PointerEvent> listener, boolean options) {
         addEventListener("pointerout", listener, options);
     }
     default void addPointerOutEventListener(EventListener<PointerEvent> listener) {
         addEventListener("pointerout", listener);
     }

     default void removePointerOutEventListener(EventListener<PointerEvent> listener, EventListenerOptions options) {
         removeEventListener("pointerout", listener, options);
     }
     default void removePointerOutEventListener(EventListener<PointerEvent> listener, boolean options) {
         removeEventListener("pointerout", listener, options);
     }
     default void removePointerOutEventListener(EventListener<PointerEvent> listener) {
         removeEventListener("pointerout", listener);
     }

     @JSProperty
     @Nullable
     EventListener<PointerEvent> getOnpointerover();

     @JSProperty
     void setOnpointerover(EventListener<PointerEvent> onpointerover);

     default void addPointerOverEventListener(EventListener<PointerEvent> listener, AddEventListenerOptions options) {
         addEventListener("pointerover", listener, options);
     }
     default void addPointerOverEventListener(EventListener<PointerEvent> listener, boolean options) {
         addEventListener("pointerover", listener, options);
     }
     default void addPointerOverEventListener(EventListener<PointerEvent> listener) {
         addEventListener("pointerover", listener);
     }

     default void removePointerOverEventListener(EventListener<PointerEvent> listener, EventListenerOptions options) {
         removeEventListener("pointerover", listener, options);
     }
     default void removePointerOverEventListener(EventListener<PointerEvent> listener, boolean options) {
         removeEventListener("pointerover", listener, options);
     }
     default void removePointerOverEventListener(EventListener<PointerEvent> listener) {
         removeEventListener("pointerover", listener);
     }

     @JSProperty
     @Nullable
     EventListener<PointerEvent> getOnpointerup();

     @JSProperty
     void setOnpointerup(EventListener<PointerEvent> onpointerup);

     default void addPointerUpEventListener(EventListener<PointerEvent> listener, AddEventListenerOptions options) {
         addEventListener("pointerup", listener, options);
     }
     default void addPointerUpEventListener(EventListener<PointerEvent> listener, boolean options) {
         addEventListener("pointerup", listener, options);
     }
     default void addPointerUpEventListener(EventListener<PointerEvent> listener) {
         addEventListener("pointerup", listener);
     }

     default void removePointerUpEventListener(EventListener<PointerEvent> listener, EventListenerOptions options) {
         removeEventListener("pointerup", listener, options);
     }
     default void removePointerUpEventListener(EventListener<PointerEvent> listener, boolean options) {
         removeEventListener("pointerup", listener, options);
     }
     default void removePointerUpEventListener(EventListener<PointerEvent> listener) {
         removeEventListener("pointerup", listener);
     }
    /**
     * Occurs to indicate progress while downloading media data.
     * @param ev The event.
     */

     @JSProperty
     @Nullable
     EventListener<ProgressEvent> getOnprogress();

     @JSProperty
     void setOnprogress(EventListener<ProgressEvent> onprogress);

     default void addProgressEventListener(EventListener<ProgressEvent> listener, AddEventListenerOptions options) {
         addEventListener("progress", listener, options);
     }
     default void addProgressEventListener(EventListener<ProgressEvent> listener, boolean options) {
         addEventListener("progress", listener, options);
     }
     default void addProgressEventListener(EventListener<ProgressEvent> listener) {
         addEventListener("progress", listener);
     }

     default void removeProgressEventListener(EventListener<ProgressEvent> listener, EventListenerOptions options) {
         removeEventListener("progress", listener, options);
     }
     default void removeProgressEventListener(EventListener<ProgressEvent> listener, boolean options) {
         removeEventListener("progress", listener, options);
     }
     default void removeProgressEventListener(EventListener<ProgressEvent> listener) {
         removeEventListener("progress", listener);
     }
    /**
     * Occurs when the playback rate is increased or decreased.
     * @param ev The event.
     */

     @JSProperty
     @Nullable
     EventListener<Event> getOnratechange();

     @JSProperty
     void setOnratechange(EventListener<Event> onratechange);

     default void addRateChangeEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
         addEventListener("ratechange", listener, options);
     }
     default void addRateChangeEventListener(EventListener<Event> listener, boolean options) {
         addEventListener("ratechange", listener, options);
     }
     default void addRateChangeEventListener(EventListener<Event> listener) {
         addEventListener("ratechange", listener);
     }

     default void removeRateChangeEventListener(EventListener<Event> listener, EventListenerOptions options) {
         removeEventListener("ratechange", listener, options);
     }
     default void removeRateChangeEventListener(EventListener<Event> listener, boolean options) {
         removeEventListener("ratechange", listener, options);
     }
     default void removeRateChangeEventListener(EventListener<Event> listener) {
         removeEventListener("ratechange", listener);
     }
    /**
     * Fires when the user resets a form.
     * @param ev The event.
     */

     @JSProperty
     @Nullable
     EventListener<Event> getOnreset();

     @JSProperty
     void setOnreset(EventListener<Event> onreset);

     default void addResetEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
         addEventListener("reset", listener, options);
     }
     default void addResetEventListener(EventListener<Event> listener, boolean options) {
         addEventListener("reset", listener, options);
     }
     default void addResetEventListener(EventListener<Event> listener) {
         addEventListener("reset", listener);
     }

     default void removeResetEventListener(EventListener<Event> listener, EventListenerOptions options) {
         removeEventListener("reset", listener, options);
     }
     default void removeResetEventListener(EventListener<Event> listener, boolean options) {
         removeEventListener("reset", listener, options);
     }
     default void removeResetEventListener(EventListener<Event> listener) {
         removeEventListener("reset", listener);
     }

     @JSProperty
     @Nullable
     EventListener<UIEvent> getOnresize();

     @JSProperty
     void setOnresize(EventListener<UIEvent> onresize);

     default void addResizeEventListener(EventListener<UIEvent> listener, AddEventListenerOptions options) {
         addEventListener("resize", listener, options);
     }
     default void addResizeEventListener(EventListener<UIEvent> listener, boolean options) {
         addEventListener("resize", listener, options);
     }
     default void addResizeEventListener(EventListener<UIEvent> listener) {
         addEventListener("resize", listener);
     }

     default void removeResizeEventListener(EventListener<UIEvent> listener, EventListenerOptions options) {
         removeEventListener("resize", listener, options);
     }
     default void removeResizeEventListener(EventListener<UIEvent> listener, boolean options) {
         removeEventListener("resize", listener, options);
     }
     default void removeResizeEventListener(EventListener<UIEvent> listener) {
         removeEventListener("resize", listener);
     }
    /**
     * Fires when the user repositions the scroll box in the scroll bar on the object.
     * @param ev The event.
     */

     @JSProperty
     @Nullable
     EventListener<Event> getOnscroll();

     @JSProperty
     void setOnscroll(EventListener<Event> onscroll);

     default void addScrollEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
         addEventListener("scroll", listener, options);
     }
     default void addScrollEventListener(EventListener<Event> listener, boolean options) {
         addEventListener("scroll", listener, options);
     }
     default void addScrollEventListener(EventListener<Event> listener) {
         addEventListener("scroll", listener);
     }

     default void removeScrollEventListener(EventListener<Event> listener, EventListenerOptions options) {
         removeEventListener("scroll", listener, options);
     }
     default void removeScrollEventListener(EventListener<Event> listener, boolean options) {
         removeEventListener("scroll", listener, options);
     }
     default void removeScrollEventListener(EventListener<Event> listener) {
         removeEventListener("scroll", listener);
     }

     @JSProperty
     @Nullable
     EventListener<SecurityPolicyViolationEvent> getOnsecuritypolicyviolation();

     @JSProperty
     void setOnsecuritypolicyviolation(EventListener<SecurityPolicyViolationEvent> onsecuritypolicyviolation);

     default void addSecurityPolicyViolationEventListener(EventListener<SecurityPolicyViolationEvent> listener, AddEventListenerOptions options) {
         addEventListener("securitypolicyviolation", listener, options);
     }
     default void addSecurityPolicyViolationEventListener(EventListener<SecurityPolicyViolationEvent> listener, boolean options) {
         addEventListener("securitypolicyviolation", listener, options);
     }
     default void addSecurityPolicyViolationEventListener(EventListener<SecurityPolicyViolationEvent> listener) {
         addEventListener("securitypolicyviolation", listener);
     }

     default void removeSecurityPolicyViolationEventListener(EventListener<SecurityPolicyViolationEvent> listener, EventListenerOptions options) {
         removeEventListener("securitypolicyviolation", listener, options);
     }
     default void removeSecurityPolicyViolationEventListener(EventListener<SecurityPolicyViolationEvent> listener, boolean options) {
         removeEventListener("securitypolicyviolation", listener, options);
     }
     default void removeSecurityPolicyViolationEventListener(EventListener<SecurityPolicyViolationEvent> listener) {
         removeEventListener("securitypolicyviolation", listener);
     }
    /**
     * Occurs when the seek operation ends.
     * @param ev The event.
     */

     @JSProperty
     @Nullable
     EventListener<Event> getOnseeked();

     @JSProperty
     void setOnseeked(EventListener<Event> onseeked);

     default void addSeekedEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
         addEventListener("seeked", listener, options);
     }
     default void addSeekedEventListener(EventListener<Event> listener, boolean options) {
         addEventListener("seeked", listener, options);
     }
     default void addSeekedEventListener(EventListener<Event> listener) {
         addEventListener("seeked", listener);
     }

     default void removeSeekedEventListener(EventListener<Event> listener, EventListenerOptions options) {
         removeEventListener("seeked", listener, options);
     }
     default void removeSeekedEventListener(EventListener<Event> listener, boolean options) {
         removeEventListener("seeked", listener, options);
     }
     default void removeSeekedEventListener(EventListener<Event> listener) {
         removeEventListener("seeked", listener);
     }
    /**
     * Occurs when the current playback position is moved.
     * @param ev The event.
     */

     @JSProperty
     @Nullable
     EventListener<Event> getOnseeking();

     @JSProperty
     void setOnseeking(EventListener<Event> onseeking);

     default void addSeekingEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
         addEventListener("seeking", listener, options);
     }
     default void addSeekingEventListener(EventListener<Event> listener, boolean options) {
         addEventListener("seeking", listener, options);
     }
     default void addSeekingEventListener(EventListener<Event> listener) {
         addEventListener("seeking", listener);
     }

     default void removeSeekingEventListener(EventListener<Event> listener, EventListenerOptions options) {
         removeEventListener("seeking", listener, options);
     }
     default void removeSeekingEventListener(EventListener<Event> listener, boolean options) {
         removeEventListener("seeking", listener, options);
     }
     default void removeSeekingEventListener(EventListener<Event> listener) {
         removeEventListener("seeking", listener);
     }
    /**
     * Fires when the current selection changes.
     * @param ev The event.
     */

     @JSProperty
     @Nullable
     EventListener<Event> getOnselect();

     @JSProperty
     void setOnselect(EventListener<Event> onselect);

     default void addSelectEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
         addEventListener("select", listener, options);
     }
     default void addSelectEventListener(EventListener<Event> listener, boolean options) {
         addEventListener("select", listener, options);
     }
     default void addSelectEventListener(EventListener<Event> listener) {
         addEventListener("select", listener);
     }

     default void removeSelectEventListener(EventListener<Event> listener, EventListenerOptions options) {
         removeEventListener("select", listener, options);
     }
     default void removeSelectEventListener(EventListener<Event> listener, boolean options) {
         removeEventListener("select", listener, options);
     }
     default void removeSelectEventListener(EventListener<Event> listener) {
         removeEventListener("select", listener);
     }

     @JSProperty
     @Nullable
     EventListener<Event> getOnselectionchange();

     @JSProperty
     void setOnselectionchange(EventListener<Event> onselectionchange);

     default void addSelectionChangeEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
         addEventListener("selectionchange", listener, options);
     }
     default void addSelectionChangeEventListener(EventListener<Event> listener, boolean options) {
         addEventListener("selectionchange", listener, options);
     }
     default void addSelectionChangeEventListener(EventListener<Event> listener) {
         addEventListener("selectionchange", listener);
     }

     default void removeSelectionChangeEventListener(EventListener<Event> listener, EventListenerOptions options) {
         removeEventListener("selectionchange", listener, options);
     }
     default void removeSelectionChangeEventListener(EventListener<Event> listener, boolean options) {
         removeEventListener("selectionchange", listener, options);
     }
     default void removeSelectionChangeEventListener(EventListener<Event> listener) {
         removeEventListener("selectionchange", listener);
     }

     @JSProperty
     @Nullable
     EventListener<Event> getOnselectstart();

     @JSProperty
     void setOnselectstart(EventListener<Event> onselectstart);

     default void addSelectStartEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
         addEventListener("selectstart", listener, options);
     }
     default void addSelectStartEventListener(EventListener<Event> listener, boolean options) {
         addEventListener("selectstart", listener, options);
     }
     default void addSelectStartEventListener(EventListener<Event> listener) {
         addEventListener("selectstart", listener);
     }

     default void removeSelectStartEventListener(EventListener<Event> listener, EventListenerOptions options) {
         removeEventListener("selectstart", listener, options);
     }
     default void removeSelectStartEventListener(EventListener<Event> listener, boolean options) {
         removeEventListener("selectstart", listener, options);
     }
     default void removeSelectStartEventListener(EventListener<Event> listener) {
         removeEventListener("selectstart", listener);
     }
    /**
     * Occurs when the download has stopped.
     * @param ev The event.
     */

     @JSProperty
     @Nullable
     EventListener<Event> getOnstalled();

     @JSProperty
     void setOnstalled(EventListener<Event> onstalled);

     default void addStalledEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
         addEventListener("stalled", listener, options);
     }
     default void addStalledEventListener(EventListener<Event> listener, boolean options) {
         addEventListener("stalled", listener, options);
     }
     default void addStalledEventListener(EventListener<Event> listener) {
         addEventListener("stalled", listener);
     }

     default void removeStalledEventListener(EventListener<Event> listener, EventListenerOptions options) {
         removeEventListener("stalled", listener, options);
     }
     default void removeStalledEventListener(EventListener<Event> listener, boolean options) {
         removeEventListener("stalled", listener, options);
     }
     default void removeStalledEventListener(EventListener<Event> listener) {
         removeEventListener("stalled", listener);
     }

     @JSProperty
     @Nullable
     EventListener<Event> getOnsubmit();

     @JSProperty
     void setOnsubmit(EventListener<Event> onsubmit);

     default void addSubmitEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
         addEventListener("submit", listener, options);
     }
     default void addSubmitEventListener(EventListener<Event> listener, boolean options) {
         addEventListener("submit", listener, options);
     }
     default void addSubmitEventListener(EventListener<Event> listener) {
         addEventListener("submit", listener);
     }

     default void removeSubmitEventListener(EventListener<Event> listener, EventListenerOptions options) {
         removeEventListener("submit", listener, options);
     }
     default void removeSubmitEventListener(EventListener<Event> listener, boolean options) {
         removeEventListener("submit", listener, options);
     }
     default void removeSubmitEventListener(EventListener<Event> listener) {
         removeEventListener("submit", listener);
     }
    /**
     * Occurs if the load operation has been intentionally halted.
     * @param ev The event.
     */

     @JSProperty
     @Nullable
     EventListener<Event> getOnsuspend();

     @JSProperty
     void setOnsuspend(EventListener<Event> onsuspend);

     default void addSuspendEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
         addEventListener("suspend", listener, options);
     }
     default void addSuspendEventListener(EventListener<Event> listener, boolean options) {
         addEventListener("suspend", listener, options);
     }
     default void addSuspendEventListener(EventListener<Event> listener) {
         addEventListener("suspend", listener);
     }

     default void removeSuspendEventListener(EventListener<Event> listener, EventListenerOptions options) {
         removeEventListener("suspend", listener, options);
     }
     default void removeSuspendEventListener(EventListener<Event> listener, boolean options) {
         removeEventListener("suspend", listener, options);
     }
     default void removeSuspendEventListener(EventListener<Event> listener) {
         removeEventListener("suspend", listener);
     }
    /**
     * Occurs to indicate the current playback position.
     * @param ev The event.
     */

     @JSProperty
     @Nullable
     EventListener<Event> getOntimeupdate();

     @JSProperty
     void setOntimeupdate(EventListener<Event> ontimeupdate);

     default void addTimeUpdateEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
         addEventListener("timeupdate", listener, options);
     }
     default void addTimeUpdateEventListener(EventListener<Event> listener, boolean options) {
         addEventListener("timeupdate", listener, options);
     }
     default void addTimeUpdateEventListener(EventListener<Event> listener) {
         addEventListener("timeupdate", listener);
     }

     default void removeTimeUpdateEventListener(EventListener<Event> listener, EventListenerOptions options) {
         removeEventListener("timeupdate", listener, options);
     }
     default void removeTimeUpdateEventListener(EventListener<Event> listener, boolean options) {
         removeEventListener("timeupdate", listener, options);
     }
     default void removeTimeUpdateEventListener(EventListener<Event> listener) {
         removeEventListener("timeupdate", listener);
     }

     @JSProperty
     @Nullable
     EventListener<Event> getOntoggle();

     @JSProperty
     void setOntoggle(EventListener<Event> ontoggle);

     default void addToggleEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
         addEventListener("toggle", listener, options);
     }
     default void addToggleEventListener(EventListener<Event> listener, boolean options) {
         addEventListener("toggle", listener, options);
     }
     default void addToggleEventListener(EventListener<Event> listener) {
         addEventListener("toggle", listener);
     }

     default void removeToggleEventListener(EventListener<Event> listener, EventListenerOptions options) {
         removeEventListener("toggle", listener, options);
     }
     default void removeToggleEventListener(EventListener<Event> listener, boolean options) {
         removeEventListener("toggle", listener, options);
     }
     default void removeToggleEventListener(EventListener<Event> listener) {
         removeEventListener("toggle", listener);
     }

     @JSProperty
     @Nullable
     EventListener<TouchEvent> getOntouchcancel();

     @JSProperty
     void setOntouchcancel(EventListener<TouchEvent> ontouchcancel);

     default void addTouchCancelEventListener(EventListener<TouchEvent> listener, AddEventListenerOptions options) {
         addEventListener("touchcancel", listener, options);
     }
     default void addTouchCancelEventListener(EventListener<TouchEvent> listener, boolean options) {
         addEventListener("touchcancel", listener, options);
     }
     default void addTouchCancelEventListener(EventListener<TouchEvent> listener) {
         addEventListener("touchcancel", listener);
     }

     default void removeTouchCancelEventListener(EventListener<TouchEvent> listener, EventListenerOptions options) {
         removeEventListener("touchcancel", listener, options);
     }
     default void removeTouchCancelEventListener(EventListener<TouchEvent> listener, boolean options) {
         removeEventListener("touchcancel", listener, options);
     }
     default void removeTouchCancelEventListener(EventListener<TouchEvent> listener) {
         removeEventListener("touchcancel", listener);
     }

     @JSProperty
     @Nullable
     EventListener<TouchEvent> getOntouchend();

     @JSProperty
     void setOntouchend(EventListener<TouchEvent> ontouchend);

     default void addTouchEndEventListener(EventListener<TouchEvent> listener, AddEventListenerOptions options) {
         addEventListener("touchend", listener, options);
     }
     default void addTouchEndEventListener(EventListener<TouchEvent> listener, boolean options) {
         addEventListener("touchend", listener, options);
     }
     default void addTouchEndEventListener(EventListener<TouchEvent> listener) {
         addEventListener("touchend", listener);
     }

     default void removeTouchEndEventListener(EventListener<TouchEvent> listener, EventListenerOptions options) {
         removeEventListener("touchend", listener, options);
     }
     default void removeTouchEndEventListener(EventListener<TouchEvent> listener, boolean options) {
         removeEventListener("touchend", listener, options);
     }
     default void removeTouchEndEventListener(EventListener<TouchEvent> listener) {
         removeEventListener("touchend", listener);
     }

     @JSProperty
     @Nullable
     EventListener<TouchEvent> getOntouchmove();

     @JSProperty
     void setOntouchmove(EventListener<TouchEvent> ontouchmove);

     default void addTouchMoveEventListener(EventListener<TouchEvent> listener, AddEventListenerOptions options) {
         addEventListener("touchmove", listener, options);
     }
     default void addTouchMoveEventListener(EventListener<TouchEvent> listener, boolean options) {
         addEventListener("touchmove", listener, options);
     }
     default void addTouchMoveEventListener(EventListener<TouchEvent> listener) {
         addEventListener("touchmove", listener);
     }

     default void removeTouchMoveEventListener(EventListener<TouchEvent> listener, EventListenerOptions options) {
         removeEventListener("touchmove", listener, options);
     }
     default void removeTouchMoveEventListener(EventListener<TouchEvent> listener, boolean options) {
         removeEventListener("touchmove", listener, options);
     }
     default void removeTouchMoveEventListener(EventListener<TouchEvent> listener) {
         removeEventListener("touchmove", listener);
     }

     @JSProperty
     @Nullable
     EventListener<TouchEvent> getOntouchstart();

     @JSProperty
     void setOntouchstart(EventListener<TouchEvent> ontouchstart);

     default void addTouchStartEventListener(EventListener<TouchEvent> listener, AddEventListenerOptions options) {
         addEventListener("touchstart", listener, options);
     }
     default void addTouchStartEventListener(EventListener<TouchEvent> listener, boolean options) {
         addEventListener("touchstart", listener, options);
     }
     default void addTouchStartEventListener(EventListener<TouchEvent> listener) {
         addEventListener("touchstart", listener);
     }

     default void removeTouchStartEventListener(EventListener<TouchEvent> listener, EventListenerOptions options) {
         removeEventListener("touchstart", listener, options);
     }
     default void removeTouchStartEventListener(EventListener<TouchEvent> listener, boolean options) {
         removeEventListener("touchstart", listener, options);
     }
     default void removeTouchStartEventListener(EventListener<TouchEvent> listener) {
         removeEventListener("touchstart", listener);
     }

     @JSProperty
     @Nullable
     EventListener<TransitionEvent> getOntransitioncancel();

     @JSProperty
     void setOntransitioncancel(EventListener<TransitionEvent> ontransitioncancel);

     default void addTransitionCancelEventListener(EventListener<TransitionEvent> listener, AddEventListenerOptions options) {
         addEventListener("transitioncancel", listener, options);
     }
     default void addTransitionCancelEventListener(EventListener<TransitionEvent> listener, boolean options) {
         addEventListener("transitioncancel", listener, options);
     }
     default void addTransitionCancelEventListener(EventListener<TransitionEvent> listener) {
         addEventListener("transitioncancel", listener);
     }

     default void removeTransitionCancelEventListener(EventListener<TransitionEvent> listener, EventListenerOptions options) {
         removeEventListener("transitioncancel", listener, options);
     }
     default void removeTransitionCancelEventListener(EventListener<TransitionEvent> listener, boolean options) {
         removeEventListener("transitioncancel", listener, options);
     }
     default void removeTransitionCancelEventListener(EventListener<TransitionEvent> listener) {
         removeEventListener("transitioncancel", listener);
     }

     @JSProperty
     @Nullable
     EventListener<TransitionEvent> getOntransitionend();

     @JSProperty
     void setOntransitionend(EventListener<TransitionEvent> ontransitionend);

     default void addTransitionEndEventListener(EventListener<TransitionEvent> listener, AddEventListenerOptions options) {
         addEventListener("transitionend", listener, options);
     }
     default void addTransitionEndEventListener(EventListener<TransitionEvent> listener, boolean options) {
         addEventListener("transitionend", listener, options);
     }
     default void addTransitionEndEventListener(EventListener<TransitionEvent> listener) {
         addEventListener("transitionend", listener);
     }

     default void removeTransitionEndEventListener(EventListener<TransitionEvent> listener, EventListenerOptions options) {
         removeEventListener("transitionend", listener, options);
     }
     default void removeTransitionEndEventListener(EventListener<TransitionEvent> listener, boolean options) {
         removeEventListener("transitionend", listener, options);
     }
     default void removeTransitionEndEventListener(EventListener<TransitionEvent> listener) {
         removeEventListener("transitionend", listener);
     }

     @JSProperty
     @Nullable
     EventListener<TransitionEvent> getOntransitionrun();

     @JSProperty
     void setOntransitionrun(EventListener<TransitionEvent> ontransitionrun);

     default void addTransitionRunEventListener(EventListener<TransitionEvent> listener, AddEventListenerOptions options) {
         addEventListener("transitionrun", listener, options);
     }
     default void addTransitionRunEventListener(EventListener<TransitionEvent> listener, boolean options) {
         addEventListener("transitionrun", listener, options);
     }
     default void addTransitionRunEventListener(EventListener<TransitionEvent> listener) {
         addEventListener("transitionrun", listener);
     }

     default void removeTransitionRunEventListener(EventListener<TransitionEvent> listener, EventListenerOptions options) {
         removeEventListener("transitionrun", listener, options);
     }
     default void removeTransitionRunEventListener(EventListener<TransitionEvent> listener, boolean options) {
         removeEventListener("transitionrun", listener, options);
     }
     default void removeTransitionRunEventListener(EventListener<TransitionEvent> listener) {
         removeEventListener("transitionrun", listener);
     }

     @JSProperty
     @Nullable
     EventListener<TransitionEvent> getOntransitionstart();

     @JSProperty
     void setOntransitionstart(EventListener<TransitionEvent> ontransitionstart);

     default void addTransitionStartEventListener(EventListener<TransitionEvent> listener, AddEventListenerOptions options) {
         addEventListener("transitionstart", listener, options);
     }
     default void addTransitionStartEventListener(EventListener<TransitionEvent> listener, boolean options) {
         addEventListener("transitionstart", listener, options);
     }
     default void addTransitionStartEventListener(EventListener<TransitionEvent> listener) {
         addEventListener("transitionstart", listener);
     }

     default void removeTransitionStartEventListener(EventListener<TransitionEvent> listener, EventListenerOptions options) {
         removeEventListener("transitionstart", listener, options);
     }
     default void removeTransitionStartEventListener(EventListener<TransitionEvent> listener, boolean options) {
         removeEventListener("transitionstart", listener, options);
     }
     default void removeTransitionStartEventListener(EventListener<TransitionEvent> listener) {
         removeEventListener("transitionstart", listener);
     }
    /**
     * Occurs when the volume is changed, or playback is muted or unmuted.
     * @param ev The event.
     */

     @JSProperty
     @Nullable
     EventListener<Event> getOnvolumechange();

     @JSProperty
     void setOnvolumechange(EventListener<Event> onvolumechange);

     default void addVolumeChangeEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
         addEventListener("volumechange", listener, options);
     }
     default void addVolumeChangeEventListener(EventListener<Event> listener, boolean options) {
         addEventListener("volumechange", listener, options);
     }
     default void addVolumeChangeEventListener(EventListener<Event> listener) {
         addEventListener("volumechange", listener);
     }

     default void removeVolumeChangeEventListener(EventListener<Event> listener, EventListenerOptions options) {
         removeEventListener("volumechange", listener, options);
     }
     default void removeVolumeChangeEventListener(EventListener<Event> listener, boolean options) {
         removeEventListener("volumechange", listener, options);
     }
     default void removeVolumeChangeEventListener(EventListener<Event> listener) {
         removeEventListener("volumechange", listener);
     }
    /**
     * Occurs when playback stops because the next frame of a video resource is not available.
     * @param ev The event.
     */

     @JSProperty
     @Nullable
     EventListener<Event> getOnwaiting();

     @JSProperty
     void setOnwaiting(EventListener<Event> onwaiting);

     default void addWaitingEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
         addEventListener("waiting", listener, options);
     }
     default void addWaitingEventListener(EventListener<Event> listener, boolean options) {
         addEventListener("waiting", listener, options);
     }
     default void addWaitingEventListener(EventListener<Event> listener) {
         addEventListener("waiting", listener);
     }

     default void removeWaitingEventListener(EventListener<Event> listener, EventListenerOptions options) {
         removeEventListener("waiting", listener, options);
     }
     default void removeWaitingEventListener(EventListener<Event> listener, boolean options) {
         removeEventListener("waiting", listener, options);
     }
     default void removeWaitingEventListener(EventListener<Event> listener) {
         removeEventListener("waiting", listener);
     }

     @JSProperty
     @Nullable
     EventListener<WheelEvent> getOnwheel();

     @JSProperty
     void setOnwheel(EventListener<WheelEvent> onwheel);

     default void addWheelEventListener(EventListener<WheelEvent> listener, AddEventListenerOptions options) {
         addEventListener("wheel", listener, options);
     }
     default void addWheelEventListener(EventListener<WheelEvent> listener, boolean options) {
         addEventListener("wheel", listener, options);
     }
     default void addWheelEventListener(EventListener<WheelEvent> listener) {
         addEventListener("wheel", listener);
     }

     default void removeWheelEventListener(EventListener<WheelEvent> listener, EventListenerOptions options) {
         removeEventListener("wheel", listener, options);
     }
     default void removeWheelEventListener(EventListener<WheelEvent> listener, boolean options) {
         removeEventListener("wheel", listener, options);
     }
     default void removeWheelEventListener(EventListener<WheelEvent> listener) {
         removeEventListener("wheel", listener);
     }
}
