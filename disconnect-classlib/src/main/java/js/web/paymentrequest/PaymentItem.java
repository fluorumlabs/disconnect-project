package js.web.paymentrequest;

import js.lang.Any;
import org.teavm.jso.JSProperty;


public interface PaymentItem extends Any {
    @JSProperty
    PaymentCurrencyAmount getAmount();

    @JSProperty
    void setAmount(PaymentCurrencyAmount amount);

    @JSProperty
    String getLabel();

    @JSProperty
    void setLabel(String label);

    @JSProperty
    boolean isPending();

    @JSProperty
    void setPending(boolean pending);

}
