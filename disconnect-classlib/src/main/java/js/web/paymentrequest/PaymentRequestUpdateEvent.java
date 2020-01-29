package js.web.paymentrequest;

import org.teavm.jso.JSBody;

import js.lang.Promise;
import js.web.dom.Event;

/** This Payment Request API interface enables a web page to update the details of a PaymentRequest in response to a user action. */
        public interface PaymentRequestUpdateEvent extends Event {
        void updateWith(PaymentDetailsUpdate detailsPromise);
        void updateWith(Promise<PaymentDetailsUpdate> detailsPromise);

        @JSBody(script = "return PaymentRequestUpdateEvent.prototype")
        static PaymentRequestUpdateEvent prototype() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(params={"type","eventInitDict"}, script = "return new PaymentRequestUpdateEvent(type, eventInitDict)")
        static PaymentRequestUpdateEvent create(String type, PaymentRequestUpdateEventInit eventInitDict) {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(params="type", script = "return new PaymentRequestUpdateEvent(type)")
        static PaymentRequestUpdateEvent create(String type) {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }


        interface PaymentRequestUpdateEventInit extends EventInit {
        }
}
