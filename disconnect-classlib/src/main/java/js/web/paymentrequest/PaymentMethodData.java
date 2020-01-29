package js.web.paymentrequest;

import js.lang.Any;
import js.lang.Unknown;
import org.teavm.jso.JSByRef;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


public interface PaymentMethodData extends Any {
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

}
