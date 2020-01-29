package org.vaadin.disconnect.demo.client;

import org.vaadin.disconnect.core.annotations.EntryPoint;
import org.vaadin.disconnect.core.annotations.PWA;
import org.vaadin.disconnect.demo.client.views.DemoApplicationShell;
import org.vaadin.disconnect.vue.client.ui.UI;
import org.vaadin.disconnect.vuetify.Vuetify;
import org.vaadin.disconnect.vuetify.VuetifyConfiguration;
import org.vaadin.disconnect.vuetify.theme.Theme;
import org.vaadin.disconnect.vuetify.theme.VuetifyColor;


@EntryPoint
public class DemoApplicationEntryPoint implements Runnable {

    @Override
    public void run() {
        VuetifyConfiguration configuration = VuetifyConfiguration.create();

        Theme darkTheme = configuration.buildDarkTheme();
        VaadinThemeColors.applyTo(darkTheme);

        Theme lightTheme = configuration.buildLightTheme();
        VaadinThemeColors.applyTo(lightTheme);

        configuration.useLightTheme();

        UI.addConfiguration("vuetify", Vuetify.configure(configuration));

        UI.run(DemoApplicationShell.class);
    }

}
