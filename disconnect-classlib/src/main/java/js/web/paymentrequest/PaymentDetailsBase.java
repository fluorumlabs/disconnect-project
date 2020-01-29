package js.web.paymentrequest;

import js.lang.Any;
import js.util.collections.Array;
import org.teavm.jso.JSByRef;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


public interface PaymentDetailsBase extends Any {
    @JSProperty
    @Nullable
    Array<PaymentItem> getDisplayItems();

    @JSProperty
    void setDisplayItems(@JSByRef PaymentItem... displayItems);

    @JSProperty
    void setDisplayItems(Array<PaymentItem> displayItems);

    @JSProperty
    @Nullable
    Array<PaymentDetailsModifier> getModifiers();

    @JSProperty
    void setModifiers(@JSByRef PaymentDetailsModifier... modifiers);

    @JSProperty
    void setModifiers(Array<PaymentDetailsModifier> modifiers);

    @JSProperty
    @Nullable
    Array<PaymentShippingOption> getShippingOptions();

    @JSProperty
    void setShippingOptions(@JSByRef PaymentShippingOption... shippingOptions);

    @JSProperty
    void setShippingOptions(Array<PaymentShippingOption> shippingOptions);

}
