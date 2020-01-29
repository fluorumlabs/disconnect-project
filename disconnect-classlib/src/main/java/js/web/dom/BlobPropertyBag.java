package js.web.dom;

import js.lang.Any;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


public interface BlobPropertyBag extends Any {
    @JSProperty
    @Nullable
    EndingType getEndings();

    @JSProperty
    void setEndings(EndingType endings);

    @JSProperty
    @Nullable
    String getType();

    @JSProperty
    void setType(String type);

}
