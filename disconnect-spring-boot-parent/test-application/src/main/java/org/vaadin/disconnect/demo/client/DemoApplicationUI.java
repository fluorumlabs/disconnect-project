package org.vaadin.disconnect.demo.client;

import org.vaadin.disconnect.core.annotations.EntryPoint;
import org.vaadin.disconnect.core.annotations.ImportStyleModule;
import org.vaadin.disconnect.core.client.Elements;
import org.vaadin.disconnect.core.client.HasStyleModule;
import org.vaadin.disconnect.core.client.UI;
import org.vaadin.disconnect.core.client.router.Route;
import org.vaadin.disconnect.core.client.router.Router;
import org.vaadin.disconnect.core.client.router.Switch;
import org.vaadin.disconnect.demo.client.material.BottomNavigation;
import org.vaadin.disconnect.demo.client.material.BottomNavigationAction;
import org.vaadin.disconnect.demo.client.material.Icon;
import org.vaadin.disconnect.demo.client.views.NotImplementedView;
import org.vaadin.disconnect.demo.client.views.TicketView;

/**
 * Created by Artem Godin on 8/19/2019.
 */
@EntryPoint
@ImportStyleModule(module = "./application-view.css")
public class DemoApplicationUI implements Runnable, HasStyleModule {
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
                    Elements.create("div").className(getClassName("main-area")).add(
                            Switch.create(
                                    Route.create("/", TicketView.CONSTRUCTOR).exact(),
                                    // If nothing matches
                                    Route.create(NotImplementedView.CONSTRUCTOR)
                            )
                    ),
                    Elements.create("div").className(getClassName("bottom-navigation-wrapper")).add(
                    BottomNavigation.create().showLabels().add(
                            BottomNavigationAction.create("new", "Ticket", Icon.Material.CREATE),
                            BottomNavigationAction.create("map", "24h Map", Icon.Material.MAP),
                            BottomNavigationAction.create("shifts", "Shifts", Icon.Material.DATE_RANGE),
                            BottomNavigationAction.create("stats", "Stats", Icon.Material.PIE_CHART)
                    ).with("value", "new").className(getClassName("bottom-navigation")))
            );
        });
    }
}
