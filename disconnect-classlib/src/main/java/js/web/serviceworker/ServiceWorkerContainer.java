package js.web.serviceworker;

import js.lang.Promise;
import js.util.collections.ReadonlyArray;
import js.web.channelmessaging.MessageEvent;
import js.web.dom.*;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * The ServiceWorkerContainer interface of the ServiceWorker API provides an object representing the service worker as an overall unit in the network ecosystem, including facilities to register, unregister and update service workers, and access the state of service workers and their registrations.
 */
public interface ServiceWorkerContainer extends EventTarget {
    @JSBody(script = "return ServiceWorkerContainer.prototype")
    static ServiceWorkerContainer prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new ServiceWorkerContainer()")
    static ServiceWorkerContainer create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    @Nullable
    ServiceWorker getController();

    @JSProperty
    @Nullable
    EventListener<Event> getOncontrollerchange();

    @JSProperty
    void setOncontrollerchange(EventListener<Event> oncontrollerchange);

    default void addControllerChangeEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
        addEventListener("controllerchange", listener, options);
    }

    default void addControllerChangeEventListener(EventListener<Event> listener, boolean options) {
        addEventListener("controllerchange", listener, options);
    }

    default void addControllerChangeEventListener(EventListener<Event> listener) {
        addEventListener("controllerchange", listener);
    }

    default void removeControllerChangeEventListener(EventListener<Event> listener, EventListenerOptions options) {
        removeEventListener("controllerchange", listener, options);
    }

    default void removeControllerChangeEventListener(EventListener<Event> listener, boolean options) {
        removeEventListener("controllerchange", listener, options);
    }

    default void removeControllerChangeEventListener(EventListener<Event> listener) {
        removeEventListener("controllerchange", listener);
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

    @JSProperty
    @Nullable
    EventListener<MessageEvent> getOnmessageerror();

    @JSProperty
    void setOnmessageerror(EventListener<MessageEvent> onmessageerror);

    default void addMessageErrorEventListener(EventListener<MessageEvent> listener, AddEventListenerOptions options) {
        addEventListener("messageerror", listener, options);
    }

    default void addMessageErrorEventListener(EventListener<MessageEvent> listener, boolean options) {
        addEventListener("messageerror", listener, options);
    }

    default void addMessageErrorEventListener(EventListener<MessageEvent> listener) {
        addEventListener("messageerror", listener);
    }

    default void removeMessageErrorEventListener(EventListener<MessageEvent> listener, EventListenerOptions options) {
        removeEventListener("messageerror", listener, options);
    }

    default void removeMessageErrorEventListener(EventListener<MessageEvent> listener, boolean options) {
        removeEventListener("messageerror", listener, options);
    }

    default void removeMessageErrorEventListener(EventListener<MessageEvent> listener) {
        removeEventListener("messageerror", listener);
    }

    @JSProperty
    Promise<ServiceWorkerRegistration> getReady();

    Promise<ServiceWorkerRegistration> getRegistration(String clientURL);

    Promise<ServiceWorkerRegistration> getRegistration();

    Promise<ReadonlyArray<ServiceWorkerRegistration>> getRegistrations();

    Promise<ServiceWorkerRegistration> register(String scriptURL, RegistrationOptions options);

    Promise<ServiceWorkerRegistration> register(String scriptURL);

    void startMessages();

}
