package org.vaadin.disconnect.demo.client.views;

import org.vaadin.disconnect.core.client.*;
import org.vaadin.disconnect.demo.client.material.MaterialUIButton;

/**
 * Created by Artem Godin on 8/23/2019.
 */
public class NotImplementedView extends Component<NoProperties, NotImplementedView.State> {
    public static final Constructor CONSTRUCTOR = Component.register(NotImplementedView.class, NotImplementedView::new);

    public interface State extends NoState {
        void setMessage(String message);

        String getMessage();
    }

    @Override
    public ElementPrototype<?> render(NoProperties properties, State state) {
        return Elements.create(MaterialUIButton.button()).text(state.getMessage());
    }

    public NotImplementedView(JsInstance instance) {
        super(instance);
    }

    @Override
    public void initInitialState(State state) {
        state.setMessage("Not implemented yet");
    }
}
