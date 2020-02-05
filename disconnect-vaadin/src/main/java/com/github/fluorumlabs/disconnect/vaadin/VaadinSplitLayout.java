package com.github.fluorumlabs.disconnect.vaadin;

import com.github.fluorumlabs.disconnect.polymer.mixins.HasGestureEventListeners;
import com.github.fluorumlabs.disconnect.vaadin.constants.Orientation;
import com.github.fluorumlabs.disconnect.vaadin.elements.SplitLayoutElement;
import com.github.fluorumlabs.disconnect.vaadin.mixins.HasThemableMixin;
import com.github.fluorumlabs.disconnect.zero.component.AbstractComponent;
import com.github.fluorumlabs.disconnect.zero.component.Component;
import com.github.fluorumlabs.disconnect.zero.component.HasSlottedComponents;
import com.github.fluorumlabs.disconnect.zero.observable.ObservableEvent;
import js.web.dom.Element;
import js.web.dom.Event;

import javax.annotation.Nullable;

/**
 * `<vaadin-split-layout>` is a Web Component implementing a split layout for two
 * content elements with a draggable splitter between them.
 * <p>
 * ```html
 * <vaadin-split-layout>
 * <div>First content element</div>
 * <div>Second content element</div>
 * </vaadin-split-layout>
 * ```
 * <p>
 * ### Horizontal and Vertical Layouts
 * <p>
 * By default, the split's orientation is horizontal, meaning that the content elements are
 * positioned side by side in a flex container with a horizontal layout.
 * <p>
 * You can change the split mode to vertical by setting the `orientation` attribute to `"vertical"`:
 * <p>
 * ```html
 * <vaadin-split-layout orientation="vertical">
 * <div>Content on the top</div>
 * <div>Content on the bottom</div>
 * </vaadin-split-layout>
 * ```
 * <p>
 * ### Layouts Combination
 * <p>
 * For the layout contents, we usually use `<div>` elements in the examples,
 * although you can use any other elements as well.
 * <p>
 * For instance, in order to have a nested vertical split layout inside a
 * horizontal one, you can include `<vaadin-split-layout>` as a content element
 * inside another split layout:
 * <p>
 * ```html
 * <vaadin-split-layout>
 * <div>First content element</div>
 * <vaadin-split-layout orientation="vertical">
 * <div>Second content element</div>
 * <div>Third content element</div>
 * </vaadin-split-layout>
 * </vaadin-split-layout>
 * ```
 * <p>
 * You can also trigger the vertical mode in JavaScript by setting the property:
 * `splitLayout.orientation = "vertical";`.
 * <p>
 * ### Split Layout Element Height
 * <p>
 * `<vaadin-split-layout>` element itself is a flex container. It does not inherit
 * the parent height by default, but rather sets its height depending on the
 * content.
 * <p>
 * You can use CSS to set the fixed height for the split layout, as usual with any
 * block element:
 * <p>
 * ```html
 * <vaadin-split-layout style="height: 200px;">
 * <div>First content element</div>
 * <div>Second content element</div>
 * </vaadin-split-layout>
 * ```
 * <p>
 * It is possible to define percentage height as well. Note that you have to set
 * the parent height in order to make percentages work correctly. In the following
 * example, the `<body>` is resized to fill the entire viewport, and the
 * `<vaadin-split-layout>` element is set to take 100% height of the `<body>`:
 * <p>
 * ```html
 * <body style="height: 100vh; margin: 0;">
 * <vaadin-split-layout style="height: 100%;">
 * <div>First</div>
 * <div>Second</div>
 * </vaadin-split-layout>
 * </body>
 * ```
 * <p>
 * Alternatively, you can use a flexbox layout to make `<vaadin-split-layout>`
 * fill up the parent:
 * <p>
 * ```html
 * <body style="height: 100vh; margin: 0; display: flex;">
 * <vaadin-split-layout style="flex: 1;">
 * <div>First</div>
 * <div>Second</div>
 * </vaadin-split-layout>
 * </body>
 * ```
 * <p>
 * ### Initial Splitter Position
 * <p>
 * The initial splitter position is determined from the sizes of the content elements
 * inside the split layout. Therefore, changing `width` on the content elements
 * affects the initial splitter position for the horizontal layouts, while `height`
 * affects the vertical ones.
 * <p>
 * Note that when the total size of the content elements does not fit the layout,
 * the content elements are scaled proportionally.
 * <p>
 * When setting initial sizes with relative units, such as percentages, it is
 * recommended to assign the size for both content elements:
 * <p>
 * ```html
 * <vaadin-split-layout>
 * <div style="width: 75%;">Three fourths</div>
 * <div style="width: 25%;">One fourth</div>
 * </vaadin-split-layout>
 * ```
 * <p>
 * ### Size Limits
 * <p>
 * The `min-width`/`min-height`, and `max-width`/`max-height` CSS size values
 * for the content elements are respected and used to limit the splitter position
 * when it is dragged.
 * <p>
 * It is preferred to set the limits only for a single content element, in order
 * to avoid size conflicts:
 * <p>
 * ```html
 * <vaadin-split-layout>
 * <div style="min-width: 50px; max-width: 150px;">First</div>
 * <div>Second</div>
 * </vaadin-split-layout>
 * ```
 * <p>
 * ### Resize Notification
 * <p>
 * This element implements `IronResizableBehavior` to notify the nested resizables
 * when the splitter is dragged. In order to define a resizable and receive that
 * notification in a nested element, include `IronResizableBehavior` and listen
 * for the `iron-resize` event.
 * <p>
 * ### Styling
 * <p>
 * The following shadow DOM parts are available for styling:
 * <p>
 * Part name | Description | Theme for Element
 * ----------------|----------------|----------------
 * `splitter` | Split element | vaadin-split-layout
 * `handle` | The handle of the splitter | vaadin-split-layout
 * <p>
 * See [ThemableMixin – how to apply styles for shadow parts](https://github.com/vaadin/vaadin-themable-mixin/wiki)
 */
public class VaadinSplitLayout extends AbstractComponent<SplitLayoutElement>
        implements HasThemableMixin<SplitLayoutElement, VaadinSplitLayout>,
        HasGestureEventListeners<SplitLayoutElement, VaadinSplitLayout>,
        HasSlottedComponents<SplitLayoutElement, VaadinSplitLayout, Component<? extends Element>> {
    public VaadinSplitLayout() {
        super("vaadin-split-layout");
    }

    /**
     * The split layout's orientation. Possible values are: `horizontal|vertical`.
     */
    @Nullable
    public Orientation orientation() {
        return getNode().getOrientation();
    }

    /**
     * The split layout's orientation. Possible values are: `horizontal|vertical`.
     */
    public VaadinSplitLayout orientation(Orientation orientation) {
        getNode().setOrientation(orientation);
        return this;
    }

    /**
     * Fired when the splitter is dragged. Non-bubbling. Fired for the splitter
     * element and any nested elements with `IronResizableBehavior`.
     */
    public ObservableEvent<Event> ironResizeEvent() {
        return createEvent("iron-resize");
    }

    /**
     * Fired after dragging the splitter have ended.
     */
    public ObservableEvent<Event> splitterDragendEvent() {
        return createEvent("splitter-dragend");
    }

    public VaadinSplitLayout setPrimary(Component<? extends Element> component) {
        return replaceSlotted("primary", component);
    }

    public VaadinSplitLayout setPrimary(Component<? extends Element>... components) {
        return replaceSlotted("primary", components);
    }

    public VaadinSplitLayout addToPrimary(Component<? extends Element> component) {
        return addSlotted("primary", component);
    }

    public VaadinSplitLayout addToPrimary(Component<? extends Element>... components) {
        return addSlotted("primary", components);
    }

    public VaadinSplitLayout insertToPrimary(Component<? extends Element> component) {
        return insertSlotted("primary", component);
    }

    public VaadinSplitLayout insertToPrimary(Component<? extends Element>... components) {
        return insertSlotted("primary", components);
    }

    public VaadinSplitLayout clearPrimary() {
        return removeAllSlotted("primary");
    }

    public VaadinSplitLayout setSecondary(Component<? extends Element> component) {
        return replaceSlotted("secondary", component);
    }

    public VaadinSplitLayout setSecondary(Component<? extends Element>... components) {
        return replaceSlotted("secondary", components);
    }

    public VaadinSplitLayout addToSecondary(Component<? extends Element> component) {
        return addSlotted("secondary", component);
    }

    public VaadinSplitLayout addToSecondary(Component<? extends Element>... components) {
        return addSlotted("secondary", components);
    }

    public VaadinSplitLayout insertToSecondary(Component<? extends Element> component) {
        return insertSlotted("secondary", component);
    }

    public VaadinSplitLayout insertToSecondary(Component<? extends Element>... components) {
        return insertSlotted("secondary", components);
    }

    public VaadinSplitLayout clearSecondary() {
        return removeAllSlotted("secondary");
    }
}
