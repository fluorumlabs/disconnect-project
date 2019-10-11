package org.vaadin.disconnect.demo.client.views;

import org.teavm.jso.core.JSDate;
import org.vaadin.disconnect.demo.backend.GreeterService;
import org.vaadin.disconnect.demo.client.LoadingState;
import org.vaadin.disconnect.vue.annotations.Route;
import org.vaadin.disconnect.vue.annotations.RouteAlias;
import org.vaadin.disconnect.vue.annotations.State;
import org.vaadin.disconnect.vue.annotations.VueComponent;
import org.vaadin.disconnect.vue.client.elements.Element;
import org.vaadin.disconnect.vue.client.elements.HtmlElement;
import org.vaadin.disconnect.vue.client.elements.Text;
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
@Route("/*")
public class NotFoundView extends Component {
    @Override
    public Element init() {
        VerticalLayout verticalLayout = new VerticalLayout();

        verticalLayout.add(new Text("Nothing to see here, move along"));

        return verticalLayout;
    }
}
