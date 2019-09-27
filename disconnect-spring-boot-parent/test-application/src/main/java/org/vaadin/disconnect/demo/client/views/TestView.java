package org.vaadin.disconnect.demo.client.views;

import org.teavm.jso.core.JSDate;
import org.vaadin.disconnect.demo.backend.GreeterService;
import org.vaadin.disconnect.demo.client.LoadingState;
import org.vaadin.disconnect.vue.annotations.State;
import org.vaadin.disconnect.vue.annotations.VueComponent;
import org.vaadin.disconnect.vue.client.elements.Element;
import org.vaadin.disconnect.vue.client.elements.HtmlElement;
import org.vaadin.disconnect.vue.client.ui.Component;
import org.vaadin.disconnect.vuetify.elements.Button;
import org.vaadin.disconnect.vuetify.elements.inputs.TextField;
import org.vaadin.disconnect.vuetify.elements.transitions.FadeTransition;
import org.vaadin.disconnect.vuetify.elements.wrappers.VerticalLayout;

import javax.annotation.Resource;

/**
 * Created by Artem Godin on 9/27/2019.
 */
@VueComponent
public class TestView extends Component {
    private FadeTransition log;

    private String userName = "";

    @Resource
    private GreeterService greeter;

    @State
    private LoadingState loadingState;

    @Override
    public Element init() {
        VerticalLayout verticalLayout = new VerticalLayout();

        TextField textField = new TextField("Enter your name");
        textField.bind(this::getUserName, this::setUserName, true);

        HtmlElement div = Element.of("div");
        observe(this::getUserName)
                .then((userName) -> div.setText("You typed: " + userName));

        Button button = new Button("Send to server");
        button.onClick(() -> {
            logMessage("Hello server, my name is " + userName, false);

            try {
                loadingState.beginRequest();

                String greeting = greeter.hello(userName);
                logMessage(greeting, true);
            } finally {
                loadingState.endRequest();
            }
        });

        log = new FadeTransition();
        log.setGroup(true);

        verticalLayout.add(textField, div, button, log);

        return verticalLayout;
    }

    private String getUserName() {
        return userName;
    }

    private void setUserName(String userName) {
        this.userName = userName;
    }

    private void logMessage(String message, boolean fromServer) {
        String formattedMessage = (fromServer ? "⯇ " : "⯈ ")
                + JSDate.create().toISOString() + " "
                + message;
        log.insert(Element.of("pre").setText(formattedMessage));
    }
}
