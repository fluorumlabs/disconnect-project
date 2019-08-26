package org.vaadin.disconnect.core.client;

import org.vaadin.disconnect.core.annotations.Import;
import org.vaadin.disconnect.core.annotations.NpmPackage;
import org.teavm.jso.*;
import org.teavm.jso.core.JSObjects;
import org.teavm.platform.Platform;
import org.vaadin.disconnect.core.client.internals.AccessorBase;
import org.vaadin.disconnect.core.client.internals.ObjectReader;
import org.vaadin.disconnect.core.client.internals.ObjectWriter;
import org.vaadin.disconnect.core.client.internals.StateAwareRenderFunction;

import java.util.function.Function;

/**
 * Created by Artem Godin on 8/23/2019.
 */
@NpmPackage(name = "react", version = "latest")
@Import(symbols = "UI", module = "react")
@Import(symbols = "renderElementPrototype", module = "./disconnect-react/render-elementprototype.js")
@Import(symbols = "createReactComponent", module = "./disconnect-react/create-react-component.js")
public abstract class Component<P extends NoProperties, S extends NoState> {
    private final JsInstance instance;

    public Component(JsInstance instance) {
        this.instance = instance;

        JSObject state = JSObjects.create();

        initInitialState(writeOnlyState(state));

        instance.setRenderFunction((_props, _state, _context) -> render(readOnlyProperties(_props), readOnlyState(_state)));
        instance.set("state", state);
    }

    public ElementPrototype render(P properties, S state) {
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

    public S getState() {
        return readOnlyState(instance.getState());
    }

    public void setState(StateUpdater updater) {
        instance.setState((state, props) -> {
            JSObject newState = JSObjects.create();
            updater.update(readWriteState(state, newState), readOnlyProperties(props));
            return newState;
        });
    }

    public static Constructor register(Class<? extends Component> clazz, Function<JsInstance, Component> instantiator) {
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
        private static native Constructor registration(String name, Instantiator instantiator);

        @JSIndexer
        private native void set(String property, JSObject value);

        @JSIndexer
        private native void set(String property, VoidCallback callback);

        @JSBody(params = {"renderer"},
                script = "this.render = function() { return renderElementPrototype(renderer(this.props, this.state, this.context)); }")
        private native void setRenderFunction(StateAwareRenderFunction renderer);

        @JSBody(script = "return this.state")
        private native JSObject getState();

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
