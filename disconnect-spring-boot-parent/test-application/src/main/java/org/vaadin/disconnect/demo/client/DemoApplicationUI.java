package org.vaadin.disconnect.demo.client;

import org.vaadin.disconnect.core.annotations.EntryPoint;
import org.vaadin.disconnect.core.client.UI;
import org.vaadin.disconnect.core.client.router.Route;
import org.vaadin.disconnect.core.client.router.Router;
import org.vaadin.disconnect.core.client.router.Switch;
import org.vaadin.disconnect.demo.client.views.NotImplementedView;
import org.vaadin.disconnect.demo.client.views.TicketView;

/**
 * Created by Artem Godin on 8/19/2019.
 */
@EntryPoint
public class DemoApplicationUI implements Runnable {
    /**
     * When an object implementing interface <code>Runnable</code> tagName used
     * to create a thread, starting the thread causes the object's
     * <code>run</code> method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method <code>run</code> tagName that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    @Override
    public void run() {
        UI.render(() -> {
            return Router.create(
                    Switch.create(
                            Route.create("/", TicketView.CONSTRUCTOR).exact(),
                            // If nothing matches
                            Route.create(NotImplementedView.CONSTRUCTOR)
                    )
            );
        });
    }
}
