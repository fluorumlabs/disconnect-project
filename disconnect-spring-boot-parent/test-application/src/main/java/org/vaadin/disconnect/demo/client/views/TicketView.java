package org.vaadin.disconnect.demo.client.views;

import org.vaadin.disconnect.core.client.*;
import org.vaadin.disconnect.demo.client.material.*;
import org.vaadin.disconnect.demo.client.vaadin.CheckBox;

import static org.vaadin.disconnect.demo.client.material.Typography.Variant.H6;

/**
 * Created by Artem Godin on 8/23/2019.
 */
public class TicketView extends Component<NoProperties, NoState> {
    public static final Constructor CONSTRUCTOR = Component.register(TicketView.class, TicketView::new);

    public interface State extends NoState {
        void setMessage(String message);

        String getMessage();
    }

    @Override
    public ElementPrototype<?> render(NoProperties properties, NoState state) {
        return Elements.create("div").add(
                AppBar.create().position(Position.STATIC).add(
                        ToolBar.create().add(
                                IconButton.create("Clear").edge(IconButton.Edge.START).color(Color.INHERIT),
                                Typography.create().variant(H6).text("Create ticket"),
                                Button.create("Save").color(Color.INHERIT)
                        )
                ),
                GridContainer.create().spacing(3).add(
                        GridItem.create()
                                .breakpoint(GridItem.Breakpoint.XS, 12)
                                .breakpoint(GridItem.Breakpoint.MD, 6),
                        GridItem.create()
                                .breakpoint(GridItem.Breakpoint.XS, 12)
                                .breakpoint(GridItem.Breakpoint.MD, 6)
                                .add(
                                        CheckBox.create().text("Use location")
                                )
                )
        );
    }

    public TicketView(JsInstance instance) {
        super(instance);
    }

}
