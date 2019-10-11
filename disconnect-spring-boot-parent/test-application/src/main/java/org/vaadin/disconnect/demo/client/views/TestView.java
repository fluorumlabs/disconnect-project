package org.vaadin.disconnect.demo.client.views;

import org.vaadin.disconnect.vue.annotations.Route;
import org.vaadin.disconnect.vue.annotations.VueComponent;
import org.vaadin.disconnect.vue.client.binding.Binder;
import org.vaadin.disconnect.vue.client.elements.Element;
import org.vaadin.disconnect.vue.client.ui.Component;
import org.vaadin.disconnect.vuetify.elements.Button;
import org.vaadin.disconnect.vuetify.elements.inputs.TextField;
import org.vaadin.disconnect.vuetify.elements.wrappers.VerticalLayout;

import java.util.Objects;

/**
 * Created by Artem Godin on 9/27/2019.
 */
@VueComponent
@Route("test")
public class TestView extends Component {

    private UserDetails details = new UserDetails();

    private TextField password = new TextField("Type password");
    private TextField confirmPassword = new TextField("Type password again");

    @Override
    public Element init() {
        Binder<UserDetails> binder = Binder.bind(details,this);

        Button button = new Button("Test validation").setEnabled(false);

        observe(() -> Objects.equals(details.getPassword(), details.getConfirmPassword()))
                .map(equals -> equals ? null : "passwords must match")
                .then(confirmPassword::setErrorMessage);

        observe(binder::isValid).then(button::setEnabled);

        return new VerticalLayout(password, confirmPassword, button);
    }
}
