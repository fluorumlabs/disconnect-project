package com.github.fluorumlabs.disconnect.vaadin;

import com.github.fluorumlabs.disconnect.polymer.types.BooleanPropertyChangeEvent;
import com.github.fluorumlabs.disconnect.polymer.types.PropertyChangeEvent;
import com.github.fluorumlabs.disconnect.vaadin.constants.PrimarySection;
import com.github.fluorumlabs.disconnect.vaadin.elements.AppLayoutElement;
import com.github.fluorumlabs.disconnect.vaadin.mixins.HasElementMixin;
import com.github.fluorumlabs.disconnect.vaadin.mixins.HasThemableMixin;
import com.github.fluorumlabs.disconnect.zero.component.AbstractComponent;
import com.github.fluorumlabs.disconnect.zero.component.Component;
import com.github.fluorumlabs.disconnect.zero.component.HasSlottedComponents;
import com.github.fluorumlabs.disconnect.zero.observable.ObservableEvent;
import js.web.dom.Element;
import js.web.dom.Event;

import javax.annotation.Nullable;

/**
 * `<vaadin-app-layout>` is a Web Component providing a quick and easy way to get a common application layout
 * structure done.
 * <p>
 * ```
 * <vaadin-app-layout primary-section="navbar|drawer">
 * <vaadin-drawer-toggle slot="navbar [touch-optimized]"></vaadin-drawer-toggle>
 * <h3 slot="navbar [touch-optimized]">Company Name</h3>
 * <vaadin-tabs orientation="vertical" slot="drawer">
 * <vaadin-tab>Menu item 1</vaadin-tab>
 * </vaadin-tabs>
 * <!-- Everything else will be the page content -->
 * <div>
 * <h3>Page title</h3>
 * <p>Page content</p>
 * </div>
 * </vaadin-app-layout>
 * ```
 * <p>
 * For best results, the component should be added to the root level of your application (i.e., as a direct child of
 * `<body>`).
 * <p>
 * The page should include a viewport meta tag which contains `viewport-fit=cover`, like the following:
 * ```
 * <meta name="viewport" content="width=device-width, initial-scale=1, viewport-fit=cover">
 * ```
 * This causes the viewport to be scaled to fill the device display.
 * To ensure that important content is displayed, use the provided css variables.
 * ```
 * --safe-area-inset-top
 * --safe-area-inset-right
 * --safe-area-inset-bottom
 * --safe-area-inset-left
 * ```
 * <p>
 * ### Styling
 * <p>
 * The following Shadow DOM parts of the `<vaadin-app-layout>` are available for styling:
 * <p>
 * Part name     | Description
 * --------------|---------------------------------------------------------|
 * `navbar`      | Container for the navigation bar
 * `drawer`      | Container for the drawer area
 * `content`     | Container for page content.
 * <p>
 * See [ThemableMixin – how to apply styles for shadow parts](https://github.com/vaadin/vaadin-themable-mixin/wiki)
 * <p>
 * ### Component's slots
 * <p>
 * The following slots are available to be set
 * <p>
 * Slot name          | Description
 * -------------------|---------------------------------------------------|
 * no name            | Default container for the page content
 * `navbar `          | Container for the top navbar area
 * `drawer`           | Container for an application menu
 * `touch-optimized`  | Container for the bottom navbar area (only visible for mobile devices)
 * <p>
 * <p>
 * See examples of setting the content into slots in the live demos.
 * <p>
 * #### Touch optimized
 * <p>
 * App Layout has a pseudo-slot `touch-optimized` in order to give more control of the presentation of
 * elements with `slot[navbar]`. Internally, when the user is interacting with App Layout from a
 * touchscreen device, the component will search for elements with `slot[navbar touch-optimized]` and move
 * them to the bottom of the page.
 * <p>
 * ### Navigation
 * <p>
 * As the drawer opens as an overlay in small devices, it makes sense to close it once a navigation happens.
 * <p>
 * In order to do so, there are two options:
 * - If the `vaadin-app-layout` instance is available, then `drawerOpened` can be set to `false`
 * - If not, a custom event `close-overlay-drawer` can be dispatched either by calling
 * `window.dispatchEvent(new CustomEvent('close-overlay-drawer'))` or by calling
 * `Vaadin.AppLayoutElement.dispatchCloseOverlayDrawerEvent()`
 * <p>
 * ### Scrolling areas
 * <p>
 * By default, the component will act with the "body scrolling", so on mobile (iOS Safari and Android Chrome),
 * the toolbars will collapse when a scroll happens.
 * <p>
 * To use the "content scrolling", in case of the content of the page relies on a pre-defined height (for instance,
 * it has a `height:100%`), then the developer can set `height: 100%` to both `html` and `body`.
 * That will make the `[content]` element of app layout scrollable.
 * On this case, the toolbars on mobile device won't collapse.
 */
public class VaadinAppLayout extends AbstractComponent<AppLayoutElement>
		implements HasElementMixin<AppLayoutElement, VaadinAppLayout>,
		HasThemableMixin<AppLayoutElement, VaadinAppLayout>,
		HasSlottedComponents<AppLayoutElement, VaadinAppLayout, Component<? extends Element>> {
	public VaadinAppLayout() {
		super("vaadin-app-layout");
	}

	/**
	 * Helper static method that dispatches a `close-overlay-drawer` event
	 */
	public static void dispatchCloseOverlayDrawerEvent() {
		AppLayoutElement.dispatchCloseOverlayDrawerEvent();
	}

	/**
	 * Defines whether navbar or drawer will come first visually.
	 * - By default (`primary-section="navbar"`), the navbar takes the full available width and moves the drawer down.
	 * - If `primary-section="drawer"` is set, then the drawer will move the navbar, taking the full available height.
	 */
	@Nullable
	public PrimarySection primarySection() {
		return getNode().getPrimarySection();
	}

	/**
	 * Defines whether navbar or drawer will come first visually.
	 * - By default (`primary-section="navbar"`), the navbar takes the full available width and moves the drawer down.
	 * - If `primary-section="drawer"` is set, then the drawer will move the navbar, taking the full available height.
	 */
	public VaadinAppLayout primarySection(PrimarySection primarySection) {
		getNode().setPrimarySection(primarySection);
		return this;
	}

	/**
	 * Controls whether the drawer is opened (visible) or not.
	 * Its default value depends on the viewport:
	 * - `true`, for desktop size views
	 * - `false`, for mobile size views
	 */
	public boolean drawerOpened() {
		return getNode().isDrawerOpened();
	}

	/**
	 * Controls whether the drawer is opened (visible) or not.
	 * Its default value depends on the viewport:
	 * - `true`, for desktop size views
	 * - `false`, for mobile size views
	 */
	public VaadinAppLayout drawerOpened(boolean drawerOpened) {
		getNode().setDrawerOpened(drawerOpened);
		return this;
	}

	/**
	 * Drawer is an overlay on top of the content
	 * Controlled via CSS using `--vaadin-app-layout-drawer-overlay: true|false`;
	 */
	public boolean overlay() {
		return getNode().isOverlay();
	}

	/**
	 * App Layout listens to `close-overlay-drawer` on the window level.
	 * A custom event can be dispatched and the App Layout will close the drawer in overlay.
	 * <p>
	 * That can be used, for instance, when a navigation occurs when user clicks in a menu item inside the drawer.
	 * <p>
	 * See `dispatchCloseOverlayDrawerEvent()` helper method.
	 */
	public ObservableEvent<Event> closeOverlayDrawerEvent() {
		return createEvent("close-overlay-drawer");
	}

	/**
	 * Fired when the `primarySection` property changes.
	 */
	public ObservableEvent<PropertyChangeEvent<PrimarySection>> primarySectionChangedEvent() {
		return createEvent("primary-section-changed");
	}

	/**
	 * Fired when the `drawerOpened` property changes.
	 */
	public ObservableEvent<BooleanPropertyChangeEvent> drawerOpenedChangedEvent() {
		return createEvent("drawer-opened-changed");
	}

	/**
	 * Fired when the `overlay` property changes.
	 */
	public ObservableEvent<BooleanPropertyChangeEvent> overlayChangedEvent() {
		return createEvent("overlay-changed");
	}

	public VaadinAppLayout setNavbar(Component<? extends Element> component) {
		return replaceSlotted("navbar", component);
	}

	public VaadinAppLayout setNavbar(Component<? extends Element>... components) {
		return replaceSlotted("navbar", components);
	}

	public VaadinAppLayout addToNavbar(Component<? extends Element> component) {
		return addSlotted("navbar", component);
	}

	public VaadinAppLayout addToNavbar(Component<? extends Element>... components) {
		return addSlotted("navbar", components);
	}

	public VaadinAppLayout insertToNavbar(Component<? extends Element> component) {
		return insertSlotted("navbar", component);
	}

	public VaadinAppLayout insertToNavbar(Component<? extends Element>... components) {
		return insertSlotted("navbar", components);
	}

	public VaadinAppLayout clearNavbar() {
		return removeAllSlotted("navbar");
	}

	public VaadinAppLayout setDrawer(Component<? extends Element> component) {
		return replaceSlotted("drawer", component);
	}

	public VaadinAppLayout setDrawer(Component<? extends Element>... components) {
		return replaceSlotted("drawer", components);
	}

	public VaadinAppLayout addToDrawer(Component<? extends Element> component) {
		return addSlotted("drawer", component);
	}

	public VaadinAppLayout addToDrawer(Component<? extends Element>... components) {
		return addSlotted("drawer", components);
	}

	public VaadinAppLayout insertToDrawer(Component<? extends Element> component) {
		return insertSlotted("drawer", component);
	}

	public VaadinAppLayout insertToDrawer(Component<? extends Element>... components) {
		return insertSlotted("drawer", components);
	}

	public VaadinAppLayout clearDrawer() {
		return removeAllSlotted("drawer");
	}

	public VaadinAppLayout setNavbarBottom(Component<? extends Element> component) {
		return replaceSlotted("navbar-bottom", component);
	}

	public VaadinAppLayout setNavbarBottom(Component<? extends Element>... components) {
		return replaceSlotted("navbar-bottom", components);
	}

	public VaadinAppLayout addToNavbarBottom(Component<? extends Element> component) {
		return addSlotted("navbar-bottom", component);
	}

	public VaadinAppLayout addToNavbarBottom(Component<? extends Element>... components) {
		return addSlotted("navbar-bottom", components);
	}

	public VaadinAppLayout insertToNavbarBottom(Component<? extends Element> component) {
		return insertSlotted("navbar-bottom", component);
	}

	public VaadinAppLayout insertToNavbarBottom(Component<? extends Element>... components) {
		return insertSlotted("navbar-bottom", components);
	}

	public VaadinAppLayout clearNavbarBottom() {
		return removeAllSlotted("navbar-bottom");
	}
}
