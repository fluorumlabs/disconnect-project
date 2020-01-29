package js.web.push;

import js.util.StringRecord;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;import js.lang.Any;


public interface PushSubscriptionJSON extends Any {
    @JSProperty
    @Nullable
    String getEndpoint();

    @JSProperty
    void setEndpoint(String endpoint);

    @JSProperty
    double  getExpirationTime();

    @JSProperty
    void setExpirationTime(double expirationTime);

    @JSProperty
    @Nullable
    StringRecord getKeys();

    @JSProperty
    void setKeys(StringRecord keys);
}
