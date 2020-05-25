package com.github.fluorumlabs.disconnect.zero.component;

import com.github.fluorumlabs.disconnect.zero.EventInitializer;
import com.github.fluorumlabs.disconnect.zero.observable.ObservableEvent;
import js.web.dom.ClipboardEvent;
import js.web.dom.DocumentAndElementEventHandlers;


public interface ClipboardEvents<T extends DocumentAndElementEventHandlers> extends EventInitializer<T> {
	default ObservableEvent<ClipboardEvent> copyEvent() {
		return createEvent(DocumentAndElementEventHandlers::addCopyEventListener);
	}

	default ObservableEvent<ClipboardEvent> cutEvent() {
		return createEvent(DocumentAndElementEventHandlers::addCutEventListener);
	}

	default ObservableEvent<ClipboardEvent> pasteEvent() {
		return createEvent(DocumentAndElementEventHandlers::addPasteEventListener);
	}
}
