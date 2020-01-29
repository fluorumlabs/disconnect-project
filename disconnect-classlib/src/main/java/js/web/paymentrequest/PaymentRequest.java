package js.web.paymentrequest;

import js.lang.BooleanPromise;
import js.lang.Promise;
import js.lang.VoidPromise;
import js.util.collections.Array;
import js.web.dom.*;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSByRef;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * This Payment Request API interface is the primary access point into the API, and lets web content and apps accept payments from the end user.
 */
public interface PaymentRequest extends EventTarget {
    @JSBody(script = "return PaymentRequest.prototype")
    static PaymentRequest prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = {"methodData", "details", "options"}, script = "return new PaymentRequest(methodData, details, options)")
    static PaymentRequest create(Array<PaymentMethodData> methodData, PaymentDetailsInit details, PaymentOptions options) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = {"methodData", "details", "options"}, script = "return new PaymentRequest(methodData, details, options)")
    static PaymentRequest create(@JSByRef PaymentMethodData[] methodData, PaymentDetailsInit details, PaymentOptions options) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = {"methodData", "details"}, script = "return new PaymentRequest(methodData, details)")
    static PaymentRequest create(Array<PaymentMethodData> methodData, PaymentDetailsInit details) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = {"methodData", "details"}, script = "return new PaymentRequest(methodData, details)")
    static PaymentRequest create(@JSByRef PaymentMethodData[] methodData, PaymentDetailsInit details) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    String getId();

    @JSProperty
    @Nullable
    EventListener<Event> getOnshippingaddresschange();

    @JSProperty
    void setOnshippingaddresschange(EventListener<Event> onshippingaddresschange);

    default void addShippingAddressChangeEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
        addEventListener("shippingaddresschange", listener, options);
    }

    default void addShippingAddressChangeEventListener(EventListener<Event> listener, boolean options) {
        addEventListener("shippingaddresschange", listener, options);
    }

    default void addShippingAddressChangeEventListener(EventListener<Event> listener) {
        addEventListener("shippingaddresschange", listener);
    }

    default void removeShippingAddressChangeEventListener(EventListener<Event> listener, EventListenerOptions options) {
        removeEventListener("shippingaddresschange", listener, options);
    }

    default void removeShippingAddressChangeEventListener(EventListener<Event> listener, boolean options) {
        removeEventListener("shippingaddresschange", listener, options);
    }

    default void removeShippingAddressChangeEventListener(EventListener<Event> listener) {
        removeEventListener("shippingaddresschange", listener);
    }

    @JSProperty
    @Nullable
    EventListener<Event> getOnshippingoptionchange();

    @JSProperty
    void setOnshippingoptionchange(EventListener<Event> onshippingoptionchange);

    default void addShippingOptionChangeEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
        addEventListener("shippingoptionchange", listener, options);
    }

    default void addShippingOptionChangeEventListener(EventListener<Event> listener, boolean options) {
        addEventListener("shippingoptionchange", listener, options);
    }

    default void addShippingOptionChangeEventListener(EventListener<Event> listener) {
        addEventListener("shippingoptionchange", listener);
    }

    default void removeShippingOptionChangeEventListener(EventListener<Event> listener, EventListenerOptions options) {
        removeEventListener("shippingoptionchange", listener, options);
    }

    default void removeShippingOptionChangeEventListener(EventListener<Event> listener, boolean options) {
        removeEventListener("shippingoptionchange", listener, options);
    }

    default void removeShippingOptionChangeEventListener(EventListener<Event> listener) {
        removeEventListener("shippingoptionchange", listener);
    }

    @JSProperty
    @Nullable
    PaymentAddress getShippingAddress();

    @JSProperty
    @Nullable
    String getShippingOption();

    @JSProperty
    @Nullable
    PaymentShippingType getShippingType();

    VoidPromise abort();

    BooleanPromise canMakePayment();

    Promise<PaymentResponse> show();

}
