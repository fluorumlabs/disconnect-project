package js.web.serviceworker;

import js.lang.BooleanPromise;
import js.lang.Promise;
import js.lang.VoidPromise;
import js.util.collections.Array;
import js.web.dom.*;
import js.web.notifications.Notification;
import js.web.notifications.NotificationOptions;
import js.web.push.PushManager;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/** This ServiceWorker API interface represents the service worker registration. You register a service worker to control one or more pages that share the same origin. */
        public interface ServiceWorkerRegistration extends EventTarget {
        @JSProperty
        @Nullable
        ServiceWorker  getActive();

        @JSProperty
        @Nullable
        ServiceWorker  getInstalling();

        @JSProperty
        NavigationPreloadManager getNavigationPreload();

        @JSProperty
        @Nullable
        EventListener<Event> getOnupdatefound();

        @JSProperty
        void setOnupdatefound(EventListener<Event> onupdatefound);

        default void addUpdateFoundEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
            addEventListener("updatefound", listener, options);
        }
        default void addUpdateFoundEventListener(EventListener<Event> listener, boolean options) {
            addEventListener("updatefound", listener, options);
        }
        default void addUpdateFoundEventListener(EventListener<Event> listener) {
            addEventListener("updatefound", listener);
        }

        default void removeUpdateFoundEventListener(EventListener<Event> listener, EventListenerOptions options) {
            removeEventListener("updatefound", listener, options);
        }
        default void removeUpdateFoundEventListener(EventListener<Event> listener, boolean options) {
            removeEventListener("updatefound", listener, options);
        }
        default void removeUpdateFoundEventListener(EventListener<Event> listener) {
            removeEventListener("updatefound", listener);
        }

        @JSProperty
        PushManager getPushManager();

        @JSProperty
        String getScope();

        @JSProperty
        SyncManager getSync();

        @JSProperty
        ServiceWorkerUpdateViaCache getUpdateViaCache();

        @JSProperty
        @Nullable
        ServiceWorker  getWaiting();

        Promise<Array<Notification>> getNotifications(GetNotificationOptions filter);
        Promise<Array<Notification>> getNotifications();
        VoidPromise showNotification(String title, NotificationOptions options);
        VoidPromise showNotification(String title);
        BooleanPromise unregister();
        VoidPromise update();

        @JSBody(script = "return ServiceWorkerRegistration.prototype")
        static ServiceWorkerRegistration prototype() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(script = "return new ServiceWorkerRegistration()")
        static ServiceWorkerRegistration create() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        }
