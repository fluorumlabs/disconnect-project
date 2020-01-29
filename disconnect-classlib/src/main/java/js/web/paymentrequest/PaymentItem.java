package js.web.paymentrequest;

import org.teavm.jso.JSProperty;

import js.lang.Any;


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
