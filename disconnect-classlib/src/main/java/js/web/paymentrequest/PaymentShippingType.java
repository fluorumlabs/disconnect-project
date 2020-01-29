package js.web.paymentrequest;

import js.extras.JsEnum;

 //"success" | "fail" | "unknown";
        public abstract class PaymentShippingType extends JsEnum {
        public static final PaymentShippingType SHIPPING = JsEnum.of("shipping");
        public static final PaymentShippingType DELIVERY = JsEnum.of("delivery");
        public static final PaymentShippingType PICKUP = JsEnum.of("pickup");

}
