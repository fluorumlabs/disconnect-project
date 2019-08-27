package org.vaadin.disconnect.demo.client.views;

import org.vaadin.disconnect.core.client.*;
import org.vaadin.disconnect.demo.client.material.Typography;

/**
 * Created by Artem Godin on 8/23/2019.
 */
public class NotImplementedView extends Component<NoProperties, NoState> {
    public static final Constructor CONSTRUCTOR = Component.register(NotImplementedView.class, NotImplementedView::new);

    @Override
    public ElementPrototype<?> render(NoProperties properties, NoState state) {
        return Typography.create()
                .variant(Typography.Variant.H1)
                .text("View is not implemented");
    }

    public NotImplementedView(JsInstance instance) {
        super(instance);
    }

}
