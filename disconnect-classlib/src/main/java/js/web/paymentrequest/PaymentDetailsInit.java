package js.web.paymentrequest;


import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


public interface PaymentDetailsInit extends PaymentDetailsBase {
    @JSProperty
    @Nullable
    String getId();

    @JSProperty
    void setId(String id);

    @JSProperty
    PaymentItem getTotal();

    @JSProperty
    void setTotal(PaymentItem total);

}
