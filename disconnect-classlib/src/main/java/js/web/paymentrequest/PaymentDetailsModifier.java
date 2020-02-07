package js.web.paymentrequest;

import js.lang.Any;
import js.lang.Unknown;
import js.util.collections.Array;
import org.teavm.jso.JSByRef;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


public interface PaymentDetailsModifier extends Any {
    @JSProperty
    @Nullable
    Array<PaymentItem> getAdditionalDisplayItems();

    @JSProperty
    void setAdditionalDisplayItems(PaymentItem... additionalDisplayItems);

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
    void setSupportedMethods(String... supportedMethods);

    @JSProperty
    @Nullable
    PaymentItem getTotal();

    @JSProperty
    void setTotal(PaymentItem total);

}
