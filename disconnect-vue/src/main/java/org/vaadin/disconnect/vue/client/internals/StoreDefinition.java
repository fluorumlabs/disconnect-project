package org.vaadin.disconnect.vue.client.internals;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSFunctor;
import org.teavm.jso.JSObject;
import org.teavm.jso.JSProperty;
import org.teavm.jso.core.JSArray;
import org.teavm.jso.core.JSMapLike;
import org.teavm.platform.PlatformObject;

/**
 * Created by Artem Godin on 9/20/2019.
 */
public interface StoreDefinition extends JSObject {
    @JSProperty
    void setState(PlatformObject object);

    @JSProperty
    void setMutations(JSMapLike<JSObject> actions);

    @JSBody(params = {"id","handler"}, script = "this.mutations[id] = handler;")
    void registerMutation(String id, Handler handler);

    @JSFunctor
    interface Handler extends JSObject{
        void handle(PlatformObject state, JSArray<PlatformObject> payload);
    }
}
