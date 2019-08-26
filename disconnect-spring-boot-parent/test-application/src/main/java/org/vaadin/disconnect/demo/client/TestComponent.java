package org.vaadin.disconnect.demo.client;

import org.vaadin.disconnect.core.client.*;
import org.vaadin.disconnect.demo.client.material.Button;
import org.vaadin.disconnect.demo.client.material.MaterialUIButton;

/**
 * Created by Artem Godin on 8/23/2019.
 */
public class TestComponent extends Component<NoProperties, TestComponent.State> {
    public static final Constructor CONSTRUCTOR = Component.register(TestComponent.class, TestComponent::new);

    public interface State extends NoState {
        void setMessage(String message);

        String getMessage();
    }

    @Override
    public ElementPrototype<?> render(NoProperties properties, State state) {
        return Button.create(state.getMessage());
    }

    public TestComponent(JsInstance instance) {
        super(instance);
    }

    @Override
    public void initInitialState(State state) {
        state.setMessage("Test");
    }
}
