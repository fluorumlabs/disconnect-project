package org.vaadin.disconnect.demo.client.views;

import org.vaadin.disconnect.core.annotations.PWA;
import org.vaadin.disconnect.demo.client.ApplicationConfiguration;
import org.vaadin.disconnect.demo.client.LoadingState;
import org.vaadin.disconnect.demo.client.VaadinThemeColors;
import org.vaadin.disconnect.vue.annotations.InjectState;
import org.vaadin.disconnect.vue.annotations.VueComponent;
import org.vaadin.disconnect.vue.client.elements.Element;
import org.vaadin.disconnect.vue.client.elements.RouterView;
import org.vaadin.disconnect.vue.client.ui.Component;
import org.vaadin.disconnect.vuetify.Vuetify;
import org.vaadin.disconnect.vuetify.elements.ApplicationShell;
import org.vaadin.disconnect.vuetify.elements.ProgressIndicator;
import org.vaadin.disconnect.vuetify.elements.bars.AppBar;
import org.vaadin.disconnect.vuetify.elements.bars.ToolbarTitle;
import org.vaadin.disconnect.vuetify.theme.MaterialColor;


@VueComponent
@PWA
public class DemoApplicationShell extends Component {
    @InjectState
    private LoadingState loadingState;

    @InjectState
    private ApplicationConfiguration applicationConfiguration;

    @Override
    public Element init() {
        ApplicationShell appShell = new ApplicationShell();

        ToolbarTitle toolbarTitle = new ToolbarTitle("Work Hours");

        ProgressIndicator.Linear loadingIndicator = new ProgressIndicator.Linear();
        loadingIndicator.setAbsolute(true);
        loadingIndicator.setQuery(true);
        loadingIndicator.setTop(true);
        loadingIndicator.setIndeterminate(true);
        loadingIndicator.setColor(MaterialColor.LIME);
        loadingIndicator.setActive(false);

        AppBar appBar = new AppBar(toolbarTitle, loadingIndicator);
        appBar.setColor(VaadinThemeColors.WATER.darken(3)).useDarkTheme();

        appShell.setAppBar(appBar);

        appShell.add(new RouterView());

        observe(() -> loadingState.hasActiveRequests()).then(loadingIndicator::setActive);
        observe(() -> applicationConfiguration.isDarkTheme()).then(Vuetify::useDarkTheme);

        return appShell;
    }
}
