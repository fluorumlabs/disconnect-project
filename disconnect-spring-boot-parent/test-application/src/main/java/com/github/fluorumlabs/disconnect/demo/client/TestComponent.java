package com.github.fluorumlabs.disconnect.demo.client;

import com.github.fluorumlabs.disconnect.preact.client.*;
import org.teavm.jso.JSObject;

/**
 * Created by Artem Godin on 8/23/2019.
 */
public class TestComponent extends ReactComponent<NoProperties, TestComponent.State> {
    public static final JSObject CLASS = ReactComponent.register(TestComponent.class, TestComponent::new);

    public interface State extends NoState {
        void setMessage(String message);

        String getMessage();
    }

    @Override
    public ElementPrototype<?> render(NoProperties properties, State state) {
        return Elements.create(MaterialUIButton.button()).withText(state.getMessage());
    }

    public TestComponent(JsInstance instance) {
        super(instance);
    }

    @Override
    public void initInitialState(State state) {
        state.setMessage("Whatever");
    }
}
