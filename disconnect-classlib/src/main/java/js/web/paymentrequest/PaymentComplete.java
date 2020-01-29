package js.web.paymentrequest;

import js.extras.JsEnum;

 //"equalpower" | "HRTF";
        public abstract class PaymentComplete extends JsEnum {
  public static final PaymentComplete SUCCESS = JsEnum.of("success");
  public static final PaymentComplete FAIL = JsEnum.of("fail");
  public static final PaymentComplete UNKNOWN = JsEnum.of("unknown");

}
