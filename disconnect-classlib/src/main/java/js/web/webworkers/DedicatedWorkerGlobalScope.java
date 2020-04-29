package js.web.webworkers;

import js.lang.Any;
import js.util.buffers.Transferable;
import js.util.collections.Array;
import js.web.channelmessaging.MessageEvent;
import js.web.console.Console;
import js.web.dom.AddEventListenerOptions;
import js.web.dom.EventListener;
import js.web.dom.EventListenerOptions;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * A window containing a DOM document; the document property points to the DOM document loaded in that window.
 */
public interface DedicatedWorkerGlobalScope extends WorkerGlobalScope {
	DedicatedWorkerGlobalScope SELF = getDedicatedWorkerGlobalScopeInstance();

	Console CONSOLE = getConsoleInstance();

	WorkerLocation LOCATION = getLocationInstance();

	WorkerNavigator NAVIGATOR = getNavigatorInstance();

	@JSBody(script = "return self")
	static DedicatedWorkerGlobalScope getDedicatedWorkerGlobalScopeInstance() {
		throw new UnsupportedOperationException("Available only in JavaScript");
	}

	@JSBody(script = "return self.console")
	static Console getConsoleInstance() {
		throw new UnsupportedOperationException("Available only in JavaScript");
	}

	@JSBody(script = "return self.location")
	static WorkerLocation getLocationInstance() {
		throw new UnsupportedOperationException("Available only in JavaScript");
	}

	@JSBody(script = "return self.navigator")
	static WorkerNavigator getNavigatorInstance() {
		throw new UnsupportedOperationException("Available only in JavaScript");
	}

	@JSBody(script = "return DedicatedWorkerGlobalScope.prototype")
	static DedicatedWorkerGlobalScope prototype() {
		throw new UnsupportedOperationException("Available only in JavaScript");
	}

	@JSBody(script = "return new DedicatedWorkerGlobalScope()")
	static DedicatedWorkerGlobalScope create() {
		throw new UnsupportedOperationException("Available only in JavaScript");
	}

	@JSProperty
	@Nullable
	EventListener<MessageEvent> getOnmessage();

	@JSProperty
	void setOnmessage(EventListener<MessageEvent> onmessage);

	default void addMessageEventListener(EventListener<MessageEvent> listener, AddEventListenerOptions options) {
		addEventListener("message", listener, options);
	}

	default void addMessageEventListener(EventListener<MessageEvent> listener, boolean options) {
		addEventListener("message", listener, options);
	}

	default void addMessageEventListener(EventListener<MessageEvent> listener) {
		addEventListener("message", listener);
	}

	default void removeMessageEventListener(EventListener<MessageEvent> listener, EventListenerOptions options) {
		removeEventListener("message", listener, options);
	}

	default void removeMessageEventListener(EventListener<MessageEvent> listener, boolean options) {
		removeEventListener("message", listener, options);
	}

	default void removeMessageEventListener(EventListener<MessageEvent> listener) {
		removeEventListener("message", listener);
	}

	void postMessage(Any message, Transferable... transfer);

	void postMessage(Any message, Array<Transferable> transfer);

	void postMessage(Any message);
}
