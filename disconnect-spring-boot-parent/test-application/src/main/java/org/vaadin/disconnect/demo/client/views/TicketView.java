package org.vaadin.disconnect.demo.client.views;

import org.vaadin.disconnect.core.annotations.ImportStyleModule;
import org.vaadin.disconnect.core.client.*;
import org.vaadin.disconnect.demo.backend.ExampleService;
import org.vaadin.disconnect.demo.client.material.*;

import javax.annotation.Resource;

import static org.vaadin.disconnect.demo.client.material.Typography.Variant.H6;

/**
 * Created by Artem Godin on 8/23/2019.
 */
@ImportStyleModule(module = "./ticket-view.css")
public class TicketView extends Component<NoProperties, TicketView.State> implements HasStyleModule {
    public static final Constructor CONSTRUCTOR = Component.register(TicketView.class, TicketView::new);

    public interface State extends NoState {
        void setUseLocation(boolean useLocation);

        boolean getUseLocation();
    }

    @Override
    public ElementPrototype<?> render(NoProperties properties, State state) {
        return Elements.create("div").add(
                renderAppBar(),
                renderMain(state)
        );
    }

    private GridContainer renderMain(State state) {
        GridContainer container = GridContainer.create();

        GridItem itemLeft = GridItem.create()
                .breakpoint(Breakpoint.XS, 12)
                .breakpoint(Breakpoint.MD, 6);

        GridItem itemRight = GridItem.create()
                .breakpoint(Breakpoint.XS, 12)
                .breakpoint(Breakpoint.MD, 6)
                .className(getClassName("grid-item-padding"));

        itemRight.add(renderForm(state));

        return container.add(itemLeft, itemRight);
    }

    @Resource
    private ExampleService exampleService;

    private Container renderForm(State state) {
        Container container = Container.create();

        Switch locationSwitch = Switch.create();
        locationSwitch.checked(state.getUseLocation());
        locationSwitch.onChange((evt) -> {
            exampleService.showState(getState().getUseLocation());
            System.out.println(exampleService.getCurrentDate());
            setState((s, p) -> s.setUseLocation(!s.getUseLocation()));
        });

        container.add(wrapSwitch("Use my location", locationSwitch).key("location"));

        if ( !state.getUseLocation() ) {
            TextField addressField = TextField.create();
            addressField.label("Address");
            addressField.fullWidth();
            addressField.variant(TextField.Variant.OUTLINED);
            addressField.margin(TextField.Margin.NORMAL);

            container.add(addressField);
        }

        TextField vehicleIdField = TextField.create();
        vehicleIdField.label("Vehicle ID");
        vehicleIdField.fullWidth();
        vehicleIdField.variant(TextField.Variant.OUTLINED);
        vehicleIdField.margin(TextField.Margin.NORMAL);

        container.add(vehicleIdField.key("vehicle"));

        container.add(renderViolation(state).key("violation"));
        container.add(renderArea(state).key("area"));

        return container;
    }

    private TextField renderViolation(State state) {
        TextField select = TextField.create().nativeSelect();
        select.label("Violation");
        select.fullWidth();
        select.variant(TextField.Variant.OUTLINED);
        select.margin(TextField.Margin.NORMAL);

        select.add(
                Elements.create("option").text(""),
                Elements.create("option").text("Prohibited space"),
                Elements.create("option").text("Handicapped zone"),
                Elements.create("option").text("Parking on a sidewalk"),
                Elements.create("option").text("Too close to crossing"),
                Elements.create("option").text("Unpaid parking meter"),
                Elements.create("option").text("No zone permit"),
                Elements.create("option").text("No special permit"),
                Elements.create("option").text("Permit not visible"),
                Elements.create("option").text("Snow emergency area"),
                Elements.create("option").text("Street sweeping area"),
                Elements.create("option").text("Against traffic direction")
        );

        return select;
    }

    private TextField renderArea(State state) {
        TextField select = TextField.create().nativeSelect();
        select.label("Area");
        select.fullWidth();
        select.variant(TextField.Variant.OUTLINED);
        select.margin(TextField.Margin.NORMAL);

        select.add(
                Elements.create("option").text(""),
                Elements.create("option").text("A1"),
                Elements.create("option").text("A2"),
                Elements.create("option").text("A3"),
                Elements.create("option").text("A4"),
                Elements.create("option").text("B1"),
                Elements.create("option").text("B2"),
                Elements.create("option").text("B3"),
                Elements.create("option").text("B4"),
                Elements.create("option").text("C1"),
                Elements.create("option").text("C2"),
                Elements.create("option").text("C3"),
                Elements.create("option").text("C4")
        );

        return select;
    }

    private AppBar renderAppBar() {
        AppBar appBar = AppBar.create().position(Position.STATIC);
        ToolBar toolBar = ToolBar.create();

        IconButton clearButton = IconButton.create(Icon.Material.CLEAR)
                .edge(IconButton.Edge.START)
                .color(Color.INHERIT)
                .className(getClassName("clear-button"));

        Typography title = Typography.create()
                .variant(H6)
                .text("Create ticket")
                .className(getClassName("title"));

        Button saveButton = Button.create("Save").color(Color.INHERIT);

        toolBar.add(clearButton, title, saveButton);

        return appBar.add(toolBar);
    }

    private FormControl wrapSwitch(String label, Switch component) {
        return FormControl.create()
                .fullWidth()
                .margin(FormControl.Margin.NORMAL)
                .add(
                        FormGroup.create().add(
                                FormControlLabel.create(label, component)
                        )
                );
    }

    public TicketView(JsInstance instance) {
        super(instance);
    }

    @Override
    public void initInitialState(State state) {
        state.setUseLocation(true);
    }
}
