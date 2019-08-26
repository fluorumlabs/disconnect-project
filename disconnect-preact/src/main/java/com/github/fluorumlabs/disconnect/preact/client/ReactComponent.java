package com.github.fluorumlabs.disconnect.preact.client;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.preact.client.internals.*;
import org.teavm.jso.*;
import org.teavm.jso.core.JSObjects;
import org.teavm.platform.Platform;

import java.util.function.Function;

/**
 * Created by Artem Godin on 8/23/2019.
 */
@NpmPackage(name = "react", version = "latest")
@Import(symbols = "React", module = "react")
@Import(symbols = "renderElementPrototype", module = "./disconnect-react/render-elementprototype.js")
@Import(symbols = "createReactComponent", module = "./disconnect-react/create-react-component.js")
public abstract class ReactComponent<P extends NoProperties, S extends NoState> {
    private final JsInstance instance;

    public ReactComponent(JsInstance instance) {
        this.instance = instance;

        JSObject state = JSObjects.create();

        initInitialState(writeOnlyState(state));

        instance.setRenderFunction((_props, _state, _context) -> render(readOnlyProperties(_props), readOnlyState(_state)));
        instance.set("state", state);
    }

    public ElementPrototype<?> render(P properties, S state) {
        throw new UnsupportedOperationException();
    }

    protected AccessorBase stateAccessor(JSObject reader, JSObject writer) {
        throw new UnsupportedOperationException();
    }

    protected AccessorBase propertiesAccessor(JSObject reader, JSObject writer) {
        throw new UnsupportedOperationException();
    }

    public void initInitialState(S state) {
    }

    public void setState(StateUpdater updater) {
        instance.setState((state, props) -> {
            JSObject newState = JSObjects.create();
            updater.update(readWriteState(state, newState), readOnlyProperties(props));
            return newState;
        });
    }

    public static JSObject register(Class<? extends ReactComponent> clazz, Function<JsInstance, ReactComponent> instantiator) {
        return JsInstance.registration(clazz.getSimpleName(), (jsInstance) -> Platform.getPlatformObject(instantiator.apply(jsInstance)));
    }

    @FunctionalInterface
    public interface StateUpdater {
        void update(NoState state, NoProperties props);
    }

    @SuppressWarnings("unchecked")
    public final static class Accessor implements AccessorBase {
        private final JSObject reader;
        private final JSObject writer;

        private final JSObject get(String key) {
            return ((ObjectReader)reader).get(key);
        }

        private final void set(String key, JSObject value) {
            ((ObjectWriter)writer).set(key, value);
        }

        private Accessor(JSObject reader, JSObject writer) {
            this.reader = reader;
            this.writer = writer;
        }
    }

    public static abstract class JsInstance implements JSObject {
        @JSBody(params = {"name","instantiator"},
                script = "return createReactComponent(name, instantiator)")
        private static native JSObject registration(String name, Instantiator instantiator);

        @JSIndexer
        private native void set(String property, JSObject value);

        @JSIndexer
        private native void set(String property, VoidCallback callback);

        @JSBody(params = {"renderer"},
                script = "this.render = function() { return renderElementPrototype(renderer(this.props, this.state, this.context)); }")
        private native void setRenderFunction(StatefulRenderFunction renderer);

        @JSMethod
        private native void setState(StateUpdaterCallback updater);
    }

    private S readOnlyState(JSObject reader) {
        return (S)stateAccessor(reader, null);
    }

    private P readOnlyProperties(JSObject reader) {
        return (P)propertiesAccessor(reader, null);
    }

    private S writeOnlyState(JSObject writer) {
        return (S)stateAccessor(null, writer);
    }

    private S readWriteState(JSObject reader, JSObject writer) {
        return (S)stateAccessor(reader, writer);
    }

    @JSFunctor
    private interface Instantiator extends JSObject {
        JSObject create(JsInstance instance);
    }

    @JSFunctor
    private interface VoidCallback extends JSObject {
        void apply();
    }

    @JSFunctor
    private interface StateUpdaterCallback extends JSObject {
        JSObject update(JSObject state, JSObject props);
    }
}
