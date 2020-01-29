package js.web.paymentrequest;

import js.lang.Any;
import org.teavm.jso.JSProperty;


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
