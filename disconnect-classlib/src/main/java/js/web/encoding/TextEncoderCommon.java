package js.web.encoding;

import js.lang.Any;
import org.teavm.jso.JSProperty;


public interface TextEncoderCommon extends Any {
    /**
     * Returns "utf-8".
     */
    @JSProperty
    String getEncoding();

}
