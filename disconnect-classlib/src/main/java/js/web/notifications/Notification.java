package js.web.notifications;

import js.lang.Promise;
import js.lang.Unknown;
import js.util.collections.ReadonlyArray;
import js.util.function.JsConsumer;
import js.web.dom.*;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/** This Notifications API interface is used to configure and display desktop notifications to the user. */
        public interface Notification extends EventTarget {
        @JSProperty
        ReadonlyArray<NotificationAction> getActions();

        @JSProperty
        String getBadge();

        @JSProperty
        String getBody();

        @JSProperty
        Unknown getData();

        @JSProperty
        NotificationDirection getDir();

        @JSProperty
        String getIcon();

        @JSProperty
        String getImage();

        @JSProperty
        String getLang();

        @JSProperty
        @Nullable
        EventListener<Event> getOnclick();

        @JSProperty
        void setOnclick(EventListener<Event> onclick);

        default void addClickEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
            addEventListener("click", listener, options);
        }
        default void addClickEventListener(EventListener<Event> listener, boolean options) {
            addEventListener("click", listener, options);
        }
        default void addClickEventListener(EventListener<Event> listener) {
            addEventListener("click", listener);
        }

        default void removeClickEventListener(EventListener<Event> listener, EventListenerOptions options) {
            removeEventListener("click", listener, options);
        }
        default void removeClickEventListener(EventListener<Event> listener, boolean options) {
            removeEventListener("click", listener, options);
        }
        default void removeClickEventListener(EventListener<Event> listener) {
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
        @JSProperty
        @Nullable
        EventListener<Event> getOnerror();

        @JSProperty
        void setOnerror(EventListener<Event> onerror);

        default void addErrorEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
            addEventListener("error", listener, options);
        }
        default void addErrorEventListener(EventListener<Event> listener, boolean options) {
            addEventListener("error", listener, options);
        }
        default void addErrorEventListener(EventListener<Event> listener) {
            addEventListener("error", listener);
        }

        default void removeErrorEventListener(EventListener<Event> listener, EventListenerOptions options) {
            removeEventListener("error", listener, options);
        }
        default void removeErrorEventListener(EventListener<Event> listener, boolean options) {
            removeEventListener("error", listener, options);
        }
        default void removeErrorEventListener(EventListener<Event> listener) {
            removeEventListener("error", listener);
        }

        @JSProperty
        @Nullable
        EventListener<Event> getOnshow();

        @JSProperty
        void setOnshow(EventListener<Event> onshow);

        default void addShowEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
            addEventListener("show", listener, options);
        }
        default void addShowEventListener(EventListener<Event> listener, boolean options) {
            addEventListener("show", listener, options);
        }
        default void addShowEventListener(EventListener<Event> listener) {
            addEventListener("show", listener);
        }

        default void removeShowEventListener(EventListener<Event> listener, EventListenerOptions options) {
            removeEventListener("show", listener, options);
        }
        default void removeShowEventListener(EventListener<Event> listener, boolean options) {
            removeEventListener("show", listener, options);
        }
        default void removeShowEventListener(EventListener<Event> listener) {
            removeEventListener("show", listener);
        }
        @JSProperty
        boolean isRenotify();

        @JSProperty
        boolean isRequireInteraction();

        @JSProperty
        boolean isSilent();

        @JSProperty
        String getTag();

        @JSProperty
        double getTimestamp();

        @JSProperty
        String getTitle();

        @JSProperty
        int[] getVibrate();

        void close();

        @JSBody(script = "return Notification.prototype")
        static Notification prototype() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(params={"title","options"}, script = "return new Notification(title, options)")
        static Notification create(String title, NotificationOptions options) {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }
        @JSBody(params={"title"}, script = "return new Notification(title)")
        static Notification create(String title) {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(script = "return Notification.maxActions")
        static int getMaxActions() {
                throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(script = "return Notification.permission")
        static NotificationPermission getPermission() {
                throw new UnsupportedOperationException("Available only in JavaScript");
        }

@Deprecated
@JSBody(params={"deprecatedCallback"}, script = "return Notification.requestPermission(deprecatedCallback)")
        static Promise<NotificationPermission> requestPermission(JsConsumer<NotificationPermission> deprecatedCallback) {
                throw new UnsupportedOperationException("Available only in JavaScript");
        }
        @JSBody(script = "return Notification.requestPermission()")
        static Promise<NotificationPermission> requestPermission() {
                throw new UnsupportedOperationException("Available only in JavaScript");
        }


}
