package js.web.paymentrequest;

import js.lang.Any;
import js.lang.Unknown;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/**
 * This Payment Request API interface is used to store shipping or payment address information.
 */
public interface PaymentAddress extends Any {
    @JSBody(script = "return PaymentAddress.prototype")
    static PaymentAddress prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new PaymentAddress()")
    static PaymentAddress create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    String[] getAddressLine();

    @JSProperty
    String getCity();

    @JSProperty
    String getCountry();

    @JSProperty
    String getDependentLocality();

    @JSProperty
    String getLanguageCode();

    @JSProperty
    String getOrganization();

    @JSProperty
    String getPhone();

    @JSProperty
    String getPostalCode();

    @JSProperty
    String getRecipient();

    @JSProperty
    String getRegion();

    @JSProperty
    String getSortingCode();

    Unknown toJSON();

}
