package js.web.paymentrequest;

import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;import js.lang.Any;


public interface PaymentOptions extends Any {
    @JSProperty
    boolean isRequestPayerEmail();

    @JSProperty
    void setRequestPayerEmail(boolean requestPayerEmail);

    @JSProperty
    boolean isRequestPayerName();

    @JSProperty
    void setRequestPayerName(boolean requestPayerName);

    @JSProperty
    boolean isRequestPayerPhone();

    @JSProperty
    void setRequestPayerPhone(boolean requestPayerPhone);

    @JSProperty
    boolean isRequestShipping();

    @JSProperty
    void setRequestShipping(boolean requestShipping);

    @JSProperty
    @Nullable
    String getShippingType();

    @JSProperty
    void setShippingType(String shippingType);

}
