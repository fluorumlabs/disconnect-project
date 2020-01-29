package js.web.paymentrequest;

import js.lang.Any;
import js.lang.Unknown;
import js.lang.VoidPromise;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/** This Payment Request API interface is returned after a user selects a payment method and approves a payment request. */
        public interface PaymentResponse extends Any {
        @JSProperty
        Unknown getDetails();

        @JSProperty
        String getMethodName();

        @JSProperty
        @Nullable
        String  getPayerEmail();

        @JSProperty
        @Nullable
        String  getPayerName();

        @JSProperty
        @Nullable
        String  getPayerPhone();

        @JSProperty
        String getRequestId();

        @JSProperty
        @Nullable
        PaymentAddress  getShippingAddress();

        @JSProperty
        @Nullable
        String  getShippingOption();

        VoidPromise complete(PaymentComplete result);
        VoidPromise complete();
        Unknown toJSON();

        @JSBody(script = "return PaymentResponse.prototype")
        static PaymentResponse prototype() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(script = "return new PaymentResponse()")
        static PaymentResponse create() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        }
