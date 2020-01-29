package js.web.paymentrequest;

import js.util.collections.Array;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;import js.lang.Any;
import js.lang.Unknown;

import org.teavm.jso.JSByRef;


public interface PaymentDetailsModifier extends Any {
    @JSProperty
    @Nullable
    Array<PaymentItem> getAdditionalDisplayItems();

    @JSProperty
    void setAdditionalDisplayItems(@JSByRef PaymentItem... additionalDisplayItems);

    @JSProperty
    void setAdditionalDisplayItems(Array<PaymentItem> additionalDisplayItems);

    @JSProperty
    @Nullable
    Any getData();

    @JSProperty
    void setData(Any data);

    @JSProperty
    Unknown getSupportedMethods();

    @JSProperty
    void setSupportedMethods(String supportedMethods);

    @JSProperty
    void setSupportedMethods(@JSByRef String... supportedMethods);

    @JSProperty
    @Nullable
    PaymentItem getTotal();

    @JSProperty
    void setTotal(PaymentItem total);

}
