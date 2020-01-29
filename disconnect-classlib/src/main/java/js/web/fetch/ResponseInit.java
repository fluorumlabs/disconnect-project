package js.web.fetch;

import js.lang.Any;
import js.lang.Unknown;
import js.util.StringRecord;
import org.teavm.jso.JSByRef;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


public interface ResponseInit extends Any {
    @JSProperty
    @Nullable
    Unknown getHeaders();

    @JSProperty
    void setHeaders(Headers headers);

    @JSProperty
    void setHeaders(@JSByRef String... headers);

    @JSProperty
    void setHeaders(StringRecord headers);

    @JSProperty
    int getStatus();

    @JSProperty
    void setStatus(int status);

    @JSProperty
    @Nullable
    String getStatusText();

    @JSProperty
    void setStatusText(String statusText);

}
