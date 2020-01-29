package js.web.serviceworker;

import js.lang.Any;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


public interface GetNotificationOptions extends Any {
    @JSProperty
    @Nullable
    String getTag();

    @JSProperty
    void setTag(String tag);

}
