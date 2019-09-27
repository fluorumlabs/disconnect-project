package org.vaadin.disconnect.vue.client.ui;

import org.teavm.jso.JSBody;
import org.teavm.platform.Platform;
import org.teavm.platform.PlatformObject;
import org.vaadin.disconnect.vue.client.Observer;
import org.vaadin.disconnect.vue.client.elements.Element;
import org.vaadin.disconnect.vue.client.elements.Text;
import org.vaadin.disconnect.vue.client.internals.ComponentInstance;

import java.util.Objects;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

/**
 * Created by Artem Godin on 9/20/2019.
 */
public abstract class Component {
    private ComponentInstance instance;
    private Element content = new Text(""); // Create empty text node as a placeholder
    private int changeCounter = 0;

    public ComponentInstance getInstance() {
        return instance;
    }

    public Component() {
    }

    public void linkInstance(ComponentInstance instance) {
        instance.setJavaInstance(Platform.getPlatformObject(this));
        instance.setRenderMethod(this::render);
        instance.registerCallback("created", () -> {
            this.instance = instance;
            ComponentInstance.registerWatches(Platform.getPlatformObject(this), instance);
            setContent(init());
            created();
        });
        instance.registerCallback("beforeMount", this::beforeMount);
        instance.registerCallback("mounted", this::mounted);
        instance.registerCallback("beforeUpdate", this::beforeUpdate);
        instance.registerCallback("updated", this::updated);
        instance.registerCallback("activated", this::activated);
        instance.registerCallback("deactivated", this::deactivated);
        instance.registerCallback("beforeDestroy", this::beforeDestroy);
        instance.registerCallback("destroyed", this::destroyed);
    }

    public void created() {
    }

    public void beforeMount() {
    }

    public void mounted() {
    }

    public void beforeUpdate() {
    }

    public void updated() {
    }

    public void activated() {
    }

    public void deactivated() {
    }

    public void beforeDestroy() {
    }

    public void destroyed() {
        instance.setJavaInstance(null);
        instance = null;
    }

    public abstract Element init();

    public void setContent(Element content) {
        this.content = content;
        content.setParentComponent(this);
    }

    public final <V> Observer<V> observe(Supplier<V> getter) {
        Observer<V> observer = new Observer<>();
        // Double evaluation, but no hardcore tricks
        instance.watch(() -> Platform.getPlatformObject(getter.get()), () -> new Thread(() -> observer.accept(getter.get())).start());
        return observer;
    }

    public void computed(Runnable compute) {
        ComponentInstance.enqueueCompute(
                Platform.getPlatformObject(this),
                compute::run);
    }

    public void watch(Supplier watch, Runnable action) {
        watch(watch, action, false);
    }

    public void watch(Supplier watch, Runnable action, boolean immediate) {
        ComponentInstance.enqueueWatch(Platform.getPlatformObject(this), () -> Objects.hashCode(watch.get()), action::run, immediate);
    }

    public void watch(IntSupplier watch, Runnable action) {
        watch(watch, action, false);
    }

    public void watch(IntSupplier watch, Runnable action, boolean immediate) {
        ComponentInstance.enqueueWatch(Platform.getPlatformObject(this), watch::getAsInt, action::run, immediate);
    }

    @JSBody(params = "result", script = "return;")
    private static native void ensure(int result);

    private PlatformObject render() {
        ensure(changeCounter);
        return Platform.getPlatformObject(content);
    }

    public final void markAsDirty() {
        changeCounter++;
    }
}
