package com.github.fluorumlabs.disconnect.vaadin;

import com.github.fluorumlabs.disconnect.core.annotations.CustomElement;
import com.github.fluorumlabs.disconnect.core.components.Component;
import com.github.fluorumlabs.disconnect.core.components.HtmlComponent;
import com.github.fluorumlabs.disconnect.core.containers.ComponentList;
import com.github.fluorumlabs.disconnect.core.containers.SlotComponentList;
import js.lang.external.vaadin.vaadin_app_layout.AppLayoutElement;
import js.lang.external.vaadin.vaadin_app_layout.DrawerToggleElement;
import js.lang.external.vaadin.vaadin_app_layout.PrimarySection;
import lombok.Getter;

/**
 * Created by Artem Godin on 6/26/2020.
 */
@CustomElement(tagName = "vaadin-app-layout", external = true)
public class AppLayout extends HtmlComponent<AppLayoutElement> {
    @Getter
    private final ComponentList<Component<?>> navbar = new SlotComponentList<>(getElement(), "navbar");
    @Getter
    private final ComponentList<Component<?>> drawer = new SlotComponentList<>(getElement(), "drawer");

    public AppLayout() {
        super();
    }

    public AppLayout(String textContent) {
        super(textContent);
    }

    public AppLayout(Component<?>... components) {
        super(components);
    }

    /**
     * Defines whether navbar or drawer will come first visually.
     *
     * <ul>
     * <li>By default (<code>primary-section=&quot;navbar&quot;</code>), the navbar takes the full available width and moves the drawer down.</li>
     * <li>If <code>primary-section=&quot;drawer&quot;</code> is set, then the drawer will move the navbar, taking the full available height.</li>
     * </ul>
     */
    public PrimarySection getPrimarySection() {
        return getElement().getPrimarySection();
    }

    /**
     * Defines whether navbar or drawer will come first visually.
     *
     * <ul>
     * <li>By default (<code>primary-section=&quot;navbar&quot;</code>), the navbar takes the full available width and moves the drawer down.</li>
     * <li>If <code>primary-section=&quot;drawer&quot;</code> is set, then the drawer will move the navbar, taking the full available height.</li>
     * </ul>
     * @param value
     */
    public void setPrimarySection(PrimarySection value) {
        getElement().setPrimarySection(value);
    }

    /**
     * Controls whether the drawer is opened (visible) or not.
     * Its default value depends on the viewport:
     *
     * <ul>
     * <li><code>true</code>, for desktop size views</li>
     * <li><code>false</code>, for mobile size views</li>
     * </ul>
     */
    public boolean getDrawerOpened() {
        return getElement().getDrawerOpened();
    }

    /**
     * Controls whether the drawer is opened (visible) or not.
     * Its default value depends on the viewport:
     *
     * <ul>
     * <li><code>true</code>, for desktop size views</li>
     * <li><code>false</code>, for mobile size views</li>
     * </ul>
     * @param value
     */
    public void setDrawerOpened(boolean value) {
        getElement().setDrawerOpened(value);
    }

    /**
     * Drawer is an overlay on top of the content
     * Controlled via CSS using <code>--vaadin-app-layout-drawer-overlay: true|false</code>;
     *
     */
    public boolean getOverlay() {
        return getElement().getOverlay();
    }

    /**
     * Helper static method that dispatches a <code>close-overlay-drawer</code> event
     *
     */
    public static void dispatchCloseOverlayDrawerEvent() {
        AppLayoutElement.dispatchCloseOverlayDrawerEvent();
    }

    @CustomElement(tagName = "vaadin-drawer-toggle", external = true)
    public static class DrawerToggle extends HtmlComponent<DrawerToggleElement> {

    }
}
