package js.util;

import js.lang.Any;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;


public abstract class Proxy implements Any {
    @JSBody(params = {"target", "handler"}, script = "return new Proxy(target, handler)")
    public static native <T extends Any> T create(T target, ProxyHandler<T> handler);

    @JSBody(params = {"target", "handler"}, script = "return new Proxy(target, handler)")
    public static native <T extends Any> Revocable<T> revocable(T target, ProxyHandler<T> handler);

    public interface Revocable<T extends Any> extends Any {
        @JSProperty
        T getProxy();

        void revoke();
    }
}
