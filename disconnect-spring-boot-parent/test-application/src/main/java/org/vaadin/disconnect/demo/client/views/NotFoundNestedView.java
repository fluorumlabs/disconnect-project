package org.vaadin.disconnect.demo.client.views;

import org.vaadin.disconnect.vue.annotations.Route;
import org.vaadin.disconnect.vue.annotations.VueComponent;
import org.vaadin.disconnect.vue.client.elements.Element;
import org.vaadin.disconnect.vue.client.elements.Text;
import org.vaadin.disconnect.vue.client.ui.Component;
import org.vaadin.disconnect.vuetify.elements.wrappers.VerticalLayout;

/**
 * Created by Artem Godin on 9/27/2019.
 */
@VueComponent
@Route(value = "*", parent = TestView.class)
public class NotFoundNestedView extends Component {
    @Override
    public Element init() {
        VerticalLayout verticalLayout = new VerticalLayout();

        verticalLayout.add(new Text("Nothing to see here, move along"));

        return verticalLayout;
    }
}
