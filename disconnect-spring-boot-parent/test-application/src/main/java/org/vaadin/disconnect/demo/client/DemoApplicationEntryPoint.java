package org.vaadin.disconnect.demo.client;

import org.vaadin.disconnect.core.annotations.EntryPoint;
import org.vaadin.disconnect.demo.client.views.DemoApplicationShell;
import org.vaadin.disconnect.vue.client.ui.UI;
import org.vaadin.disconnect.vuetify.Vuetify;
import org.vaadin.disconnect.vuetify.VuetifyConfiguration;

/**
 * Created by Artem Godin on 8/19/2019.
 */
@EntryPoint
public class DemoApplicationEntryPoint implements Runnable {

    @Override
    public void run() {
        VuetifyConfiguration configuration = VuetifyConfiguration.create();

        UI.addConfiguration("vuetify", Vuetify.configure(configuration));

        UI.run(DemoApplicationShell.class);
    }

}
