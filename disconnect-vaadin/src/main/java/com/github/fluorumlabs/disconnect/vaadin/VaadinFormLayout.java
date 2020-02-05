package com.github.fluorumlabs.disconnect.vaadin;

import com.github.fluorumlabs.disconnect.vaadin.elements.FormLayoutElement;
import com.github.fluorumlabs.disconnect.vaadin.mixins.HasElementMixin;
import com.github.fluorumlabs.disconnect.vaadin.mixins.HasThemableMixin;
import com.github.fluorumlabs.disconnect.vaadin.types.ResponsiveStep;
import com.github.fluorumlabs.disconnect.zero.component.AbstractComponent;
import com.github.fluorumlabs.disconnect.zero.component.Component;
import com.github.fluorumlabs.disconnect.zero.component.HasComponents;
import js.util.StringRecord;
import js.util.collections.Array;

/**
 * `<vaadin-form-layout>` is a Web Component providing configurable responsive
 * layout for form elements.
 * <p>
 * ```html
 * <vaadin-form-layout>
 * <p>
 * <vaadin-form-item>
 * <label slot="label">First Name</label>
 * <input class="full-width" value="Jane">
 * </vaadin-form-item>
 * <p>
 * <vaadin-form-item>
 * <label slot="label">Last Name</label>
 * <input class="full-width" value="Doe">
 * </vaadin-form-item>
 * <p>
 * <vaadin-form-item>
 * <label slot="label">Email</label>
 * <input class="full-width" value="jane.doe@example.com">
 * </vaadin-form-item>
 * <p>
 * </vaadin-form-layout>
 * ```
 * <p>
 * It supports any child elements as layout items.
 * <p>
 * By default, it makes a layout of two columns if the element width is equal or
 * wider than 40em, and a single column layout otherwise.
 * <p>
 * The number of columns and the responsive behavior are customizable with
 * the `responsiveSteps` property.
 * <p>
 * ### Spanning Items on Multiple Columns
 * <p>
 * You can use `colspan` attribute on the items.
 * In the example below, the first text field spans on two columns:
 * <p>
 * ```html
 * <vaadin-form-layout>
 * <p>
 * <vaadin-form-item colspan="2">
 * <label slot="label">Address</label>
 * <input class="full-width">
 * </vaadin-form-item>
 * <p>
 * <vaadin-form-item>
 * <label slot="label">First Name</label>
 * <input class="full-width" value="Jane">
 * </vaadin-form-item>
 * <p>
 * <vaadin-form-item>
 * <label slot="label">Last Name</label>
 * <input class="full-width" value="Doe">
 * </vaadin-form-item>
 * <p>
 * </vaadin-form-layout>
 * ```
 * <p>
 * ### Explicit New Row
 * <p>
 * Use the `<br>` line break element to wrap the items on a new row:
 * <p>
 * ```html
 * <vaadin-form-layout>
 * <p>
 * <vaadin-form-item>
 * <label slot="label">Email</label>
 * <input class="full-width">
 * </vaadin-form-item>
 *
 * <br>
 * <p>
 * <vaadin-form-item>
 * <label slot="label">Confirm Email</label>
 * <input class="full-width">
 * </vaadin-form-item>
 * <p>
 * </vaadin-form-layout>
 * ```
 * <p>
 * ### CSS Properties Reference
 * <p>
 * The following custom CSS properties are available on the `<vaadin-form-layout>`
 * element:
 * <p>
 * Custom CSS property | Description | Default
 * ---|---|---
 * `--vaadin-form-layout-column-spacing` | Length of the spacing between columns | `2em`
 */
public class VaadinFormLayout extends AbstractComponent<FormLayoutElement>
        implements HasElementMixin<FormLayoutElement, VaadinFormLayout>,
        HasThemableMixin<FormLayoutElement, VaadinFormLayout>,
        HasComponents<FormLayoutElement, VaadinFormLayout, Component<?>> {
    public VaadinFormLayout() {
        super("vaadin-form-layout");
    }

    /**
     * Allows specifying a responsive behavior with the number of columns
     * and the label position depending on the layout width.
     * <p>
     * Format: array of objects, each object defines one responsive step
     * with `minWidth` CSS length, `columns` number, and optional
     * `labelsPosition` string of `"aside"` or `"top"`. At least one item is required.
     * <p>
     * #### Examples
     * <p>
     * ```javascript
     * formLayout.responsiveSteps = [{columns: 1}];
     * // The layout is always a single column, labels aside.
     * ```
     * <p>
     * ```javascript
     * formLayout.responsiveSteps = [
     * {minWidth: 0, columns: 1},
     * {minWidth: '40em', columns: 2}
     * ];
     * // Sets two responsive steps:
     * // 1. When the layout width is < 40em, one column, labels aside.
     * // 2. Width >= 40em, two columns, labels aside.
     * ```
     * <p>
     * ```javascript
     * formLayout.responsiveSteps = [
     * {minWidth: 0, columns: 1, labelsPosition: 'top'},
     * {minWidth: '20em', columns: 1},
     * {minWidth: '40em', columns: 2}
     * ];
     * // Default value. Three responsive steps:
     * // 1. Width < 20em, one column, labels on top.
     * // 2. 20em <= width < 40em, one column, labels aside.
     * // 3. Width >= 40em, two columns, labels aside.
     * ```
     */
    public Array<ResponsiveStep> responsiveSteps() {
        return getNode().getResponsiveSteps();
    }

    /**
     * Allows specifying a responsive behavior with the number of columns
     * and the label position depending on the layout width.
     * <p>
     * Format: array of objects, each object defines one responsive step
     * with `minWidth` CSS length, `columns` number, and optional
     * `labelsPosition` string of `"aside"` or `"top"`. At least one item is required.
     * <p>
     * #### Examples
     * <p>
     * ```javascript
     * formLayout.responsiveSteps = [{columns: 1}];
     * // The layout is always a single column, labels aside.
     * ```
     * <p>
     * ```javascript
     * formLayout.responsiveSteps = [
     * {minWidth: 0, columns: 1},
     * {minWidth: '40em', columns: 2}
     * ];
     * // Sets two responsive steps:
     * // 1. When the layout width is < 40em, one column, labels aside.
     * // 2. Width >= 40em, two columns, labels aside.
     * ```
     * <p>
     * ```javascript
     * formLayout.responsiveSteps = [
     * {minWidth: 0, columns: 1, labelsPosition: 'top'},
     * {minWidth: '20em', columns: 1},
     * {minWidth: '40em', columns: 2}
     * ];
     * // Default value. Three responsive steps:
     * // 1. Width < 20em, one column, labels on top.
     * // 2. 20em <= width < 40em, one column, labels aside.
     * // 3. Width >= 40em, two columns, labels aside.
     * ```
     */
    public VaadinFormLayout responsiveSteps(ResponsiveStep... responsiveSteps) {
        getNode().setResponsiveSteps(responsiveSteps);
        return this;
    }

    public VaadinFormLayout responsiveSteps(Array<ResponsiveStep> responsiveSteps) {
        getNode().setResponsiveSteps(responsiveSteps);
        return this;
    }

    /**
     * Set custom CSS property values and update the layout.
     */
    public void updateStyles(StringRecord args) {
        getNode().updateStyles(args);
    }
}
