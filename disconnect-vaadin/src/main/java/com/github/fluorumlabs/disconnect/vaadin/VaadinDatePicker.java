package com.github.fluorumlabs.disconnect.vaadin;

import com.github.fluorumlabs.disconnect.polymer.mixins.HasGestureEventListeners;
import com.github.fluorumlabs.disconnect.polymer.types.BooleanPropertyChangeEvent;
import com.github.fluorumlabs.disconnect.vaadin.elements.DatePickerElement;
import com.github.fluorumlabs.disconnect.vaadin.mixins.HasControlStateMixin;
import com.github.fluorumlabs.disconnect.vaadin.mixins.HasDatePickerMixin;
import com.github.fluorumlabs.disconnect.vaadin.mixins.HasElementMixin;
import com.github.fluorumlabs.disconnect.vaadin.mixins.HasThemableMixin;
import com.github.fluorumlabs.disconnect.zero.component.AbstractComponent;
import com.github.fluorumlabs.disconnect.zero.component.Component;
import com.github.fluorumlabs.disconnect.zero.component.HasSlottedComponents;
import com.github.fluorumlabs.disconnect.zero.observable.ObservableEvent;
import js.web.dom.Element;

import javax.annotation.Nullable;

/**
 * `<vaadin-date-picker>` is a date selection field which includes a scrollable
 * month calendar view.
 * ```html
 * <vaadin-date-picker label="Birthday"></vaadin-date-picker>
 * ```
 * ```js
 * datePicker.value = '2016-03-02';
 * ```
 * When the selected `value` is changed, a `value-changed` event is triggered.
 * <p>
 * <p>
 * ### Styling
 * <p>
 * The following shadow DOM parts are available for styling:
 * <p>
 * Part name | Description | Theme for Element
 * ----------------|----------------|----------------
 * `text-field` | Input element | vaadin-date-picker
 * `clear-button` | Clear button | vaadin-date-picker
 * `toggle-button` | Toggle button | vaadin-date-picker
 * `overlay-content` | The overlay element | vaadin-date-picker
 * `overlay-header` | Fullscreen mode header | vaadin-date-picker-overlay-content
 * `label` | Fullscreen mode value/label | vaadin-date-picker-overlay-content
 * `clear-button` | Fullscreen mode clear button | vaadin-date-picker-overlay-content
 * `toggle-button` | Fullscreen mode toggle button | vaadin-date-picker-overlay-content
 * `years-toggle-button` | Fullscreen mode years scroller toggle | vaadin-date-picker-overlay-content
 * `months` | Months scroller | vaadin-date-picker-overlay-content
 * `years` | Years scroller | vaadin-date-picker-overlay-content
 * `toolbar` | Footer bar with buttons | vaadin-date-picker-overlay-content
 * `today-button` | Today button | vaadin-date-picker-overlay-content
 * `cancel-button` | Cancel button | vaadin-date-picker-overlay-content
 * `month` | Month calendar | vaadin-date-picker-overlay-content
 * `year-number` | Year number | vaadin-date-picker-overlay-content
 * `year-separator` | Year separator | vaadin-date-picker-overlay-content
 * `month-header` | Month title | vaadin-month-calendar
 * `weekdays` | Weekday container | vaadin-month-calendar
 * `weekday` | Weekday element | vaadin-month-calendar
 * `week-numbers` | Week numbers container | vaadin-month-calendar
 * `week-number` | Week number element | vaadin-month-calendar
 * `date` | Date element | vaadin-month-calendar
 * <p>
 * See [ThemableMixin – how to apply styles for shadow parts](https://github.com/vaadin/vaadin-themable-mixin/wiki)
 * <p>
 * The following state attributes are available for styling:
 * <p>
 * Attribute    | Description | Part name
 * -------------|-------------|------------
 * `invalid` | Set when the element is invalid | :host
 * `opened` | Set when the date selector overlay is opened | :host
 * `readonly` | Set when the element is readonly | :host
 * `disabled` | Set when the element is disabled | :host
 * `today` | Set on the date corresponding to the current day | date
 * `focused` | Set on the focused date | date
 * `disabled` | Set on the date out of the allowed range | date
 * `selected` | Set on the selected date | date
 * <p>
 * If you want to replace the default input field with a custom implementation, you should use the
 * [`<vaadin-date-picker-light>`](#vaadin-date-picker-light) element.
 * <p>
 * In addition to `<vaadin-date-picker>` itself, the following internal
 * components are themable:
 * <p>
 * - `<vaadin-text-field>`
 * - `<vaadin-date-picker-overlay>`
 * - `<vaadin-date-picker-overlay-content>`
 * - `<vaadin-month-calendar>`
 * <p>
 * Note: the `theme` attribute value set on `<vaadin-date-picker>` is
 * propagated to the internal themable components listed above.
 */
public class VaadinDatePicker extends AbstractComponent<DatePickerElement>
        implements HasElementMixin<DatePickerElement, VaadinDatePicker>,
        HasControlStateMixin<DatePickerElement, VaadinDatePicker>,
        HasThemableMixin<DatePickerElement, VaadinDatePicker>,
        HasDatePickerMixin<DatePickerElement, VaadinDatePicker>,
        HasGestureEventListeners<DatePickerElement, VaadinDatePicker>,
        HasSlottedComponents<DatePickerElement, VaadinDatePicker, Component<? extends Element>> {
    public VaadinDatePicker() {
        super("vaadin-date-picker");
    }

    /**
     * Focussable element used by vaadin-control-state-mixin
     */
    public Element focusElement() {
        return getNode().getFocusElement();
    }

    /**
     * Set to true to display the clear icon which clears the input.
     */
    public boolean clearButtonVisible() {
        return getNode().isClearButtonVisible();
    }

    /**
     * Set to true to display the clear icon which clears the input.
     */
    public VaadinDatePicker clearButtonVisible(boolean clearButtonVisible) {
        getNode().setClearButtonVisible(clearButtonVisible);
        return this;
    }

    /**
     * Set to true to disable this element.
     */
    public boolean disabled() {
        return getNode().isDisabled();
    }

    /**
     * Set to true to disable this element.
     */
    public VaadinDatePicker disabled(boolean disabled) {
        getNode().setDisabled(disabled);
        return this;
    }

    /**
     * The error message to display when the input is invalid.
     */
    @Nullable
    public String errorMessage() {
        return getNode().getErrorMessage();
    }

    /**
     * The error message to display when the input is invalid.
     */
    public VaadinDatePicker errorMessage(String errorMessage) {
        getNode().setErrorMessage(errorMessage);
        return this;
    }

    /**
     * A placeholder string in addition to the label. If this is set, the label will always float.
     */
    @Nullable
    public String placeholder() {
        return getNode().getPlaceholder();
    }

    /**
     * A placeholder string in addition to the label. If this is set, the label will always float.
     */
    public VaadinDatePicker placeholder(String placeholder) {
        getNode().setPlaceholder(placeholder);
        return this;
    }

    /**
     * Set to true to make this element read-only.
     */
    public boolean readonly() {
        return getNode().isReadonly();
    }

    /**
     * Set to true to make this element read-only.
     */
    public VaadinDatePicker readonly(boolean readonly) {
        getNode().setReadonly(readonly);
        return this;
    }

    /**
     * This property is set to true when the control value invalid.
     */
    public boolean invalid() {
        return getNode().isInvalid();
    }

    /**
     * This property is set to true when the control value invalid.
     */
    public VaadinDatePicker invalid(boolean invalid) {
        getNode().setInvalid(invalid);
        return this;
    }

    /**
     * Fired when the `invalid` property changes.
     */
    public ObservableEvent<BooleanPropertyChangeEvent> invalidChangedEvent() {
        return createEvent("invalid-changed");
    }

    public VaadinDatePicker setPrefix(Component<? extends Element> component) {
        return replaceSlotted("prefix", component);
    }

    public VaadinDatePicker setPrefix(Component<? extends Element>... components) {
        return replaceSlotted("prefix", components);
    }

    public VaadinDatePicker addToPrefix(Component<? extends Element> component) {
        return addSlotted("prefix", component);
    }

    public VaadinDatePicker addToPrefix(Component<? extends Element>... components) {
        return addSlotted("prefix", components);
    }

    public VaadinDatePicker insertToPrefix(Component<? extends Element> component) {
        return insertSlotted("prefix", component);
    }

    public VaadinDatePicker insertToPrefix(Component<? extends Element>... components) {
        return insertSlotted("prefix", components);
    }

    public VaadinDatePicker clearPrefix() {
        return removeAllSlotted("prefix");
    }
}
