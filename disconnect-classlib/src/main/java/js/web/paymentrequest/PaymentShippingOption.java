package js.web.paymentrequest;

import org.teavm.jso.JSProperty;

import js.lang.Any;


public interface PaymentShippingOption extends Any {
    @JSProperty
    PaymentCurrencyAmount getAmount();

    @JSProperty
    void setAmount(PaymentCurrencyAmount amount);

    @JSProperty
    String getId();

    @JSProperty
    void setId(String id);

    @JSProperty
    String getLabel();

    @JSProperty
    void setLabel(String label);

    @JSProperty
    boolean isSelected();

    @JSProperty
    void setSelected(boolean selected);

}
