package js.web.paymentrequest;


import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


public interface PaymentDetailsUpdate extends PaymentDetailsBase {
    @JSProperty
    @Nullable
    String getError();

    @JSProperty
    void setError(String error);

    @JSProperty
    @Nullable
    PaymentItem getTotal();

    @JSProperty
    void setTotal(PaymentItem total);

}
