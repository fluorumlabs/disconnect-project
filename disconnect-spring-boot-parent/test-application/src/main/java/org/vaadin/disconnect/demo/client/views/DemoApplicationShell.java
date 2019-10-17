package org.vaadin.disconnect.demo.client.views;

import org.vaadin.disconnect.demo.client.LoadingState;
import org.vaadin.disconnect.vue.annotations.InjectState;
import org.vaadin.disconnect.vue.annotations.VueComponent;
import org.vaadin.disconnect.vue.client.elements.Element;
import org.vaadin.disconnect.vue.client.elements.RouterView;
import org.vaadin.disconnect.vue.client.ui.Component;
import org.vaadin.disconnect.vuetify.elements.ApplicationShell;
import org.vaadin.disconnect.vuetify.elements.ProgressIndicator;
import org.vaadin.disconnect.vuetify.elements.bars.AppBar;
import org.vaadin.disconnect.vuetify.elements.bars.ToolbarTitle;

/**
 * Created by Artem Godin on 9/20/2019.
 */
@VueComponent
public class DemoApplicationShell extends Component {
    @InjectState
    private LoadingState loadingState;

    @Override
    public Element init() {
        ApplicationShell appShell = new ApplicationShell();

        ToolbarTitle toolbarTitle = new ToolbarTitle("Demo Application");

        ProgressIndicator.Linear loadingIndicator = new ProgressIndicator.Linear();
        loadingIndicator.setAbsolute(true);
        loadingIndicator.setQuery(true);
        loadingIndicator.setTop(true);
        loadingIndicator.setIndeterminate(true);
        loadingIndicator.setColor("yellow");
        loadingIndicator.setActive(false);

        observe(() -> loadingState.hasActiveRequests())
                .then(loadingIndicator::setActive);

        AppBar appBar = new AppBar(toolbarTitle, loadingIndicator);
        appBar.setColor("primary");
        appBar.dark();

        appShell.setAppBar(appBar);

        appShell.add(new RouterView().set("defaultName", "XpeHoBa"));

        return appShell;
    }
}
