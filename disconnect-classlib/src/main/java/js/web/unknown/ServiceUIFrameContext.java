package js.web.unknown;

import js.lang.Any;
import org.teavm.jso.JSBody;


public abstract class ServiceUIFrameContext implements Any {
    @JSBody(params = "key", script = "return ServiceUIFrameContext.getCachedFrameMessage(key)")
    public native String getCachedFrameMessage(String key);

    @JSBody(params = {"key", "data"}, script = "ServiceUIFrameContext.postFrameMessage(key, data)")
    public native void postFrameMessage(String key, String data);
}
