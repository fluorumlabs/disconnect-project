package js.web.unknown;

import js.lang.Any;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


public interface ExceptionInformation extends Any {
    @JSProperty
    @Nullable
    String  getDomain();

    @JSProperty
    void setDomain(String domain);

}
