package com.github.fluorumlabs.disconnect.vaadin.elements;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.vaadin.Vaadin;
import com.github.fluorumlabs.disconnect.vaadin.elements.mixins.ElementMixin;
import com.github.fluorumlabs.disconnect.vaadin.elements.mixins.ThemableMixin;
import js.util.collections.Array;
import js.web.dom.HTMLElement;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * `<vaadin-accordion>` is a Web Component implementing accordion widget —
 * a vertically stacked set of expandable panels. The component should be
 * used as a wrapper for two or more `<vaadin-accordion-panel>` components.
 * <p>
 * Panel headings function as controls that enable users to open (expand)
 * or hide (collapse) their associated sections of content. The user can
 * toggle panels by mouse click, Enter and Space keys.
 * <p>
 * Only one panel can be opened at a time, opening a new one forces
 * previous panel to close and hide its content.
 * <p>
 * ```
 * <vaadin-accordion>
 * <vaadin-accordion-panel>
 * <div slot="summary">Panel 1</div>
 * This panel is opened, so the text is visible by default.
 * </vaadin-accordion-panel>
 * <vaadin-accordion-panel>
 * <div slot="summary">Panel 2</div>
 * After opening this panel, the first one becomes closed.
 * </vaadin-accordion-panel>
 * </vaadin-accordion>
 * ```
 * <p>
 * ### Styling
 * <p>
 * See the [`<vaadin-accordion-panel>`](#/elements/vaadin-accordion-panel)
 * documentation for the available state attributes and stylable shadow parts.
 * <p>
 * **Note:** You can apply the theme to `<vaadin-accordion>` component itself,
 * especially by using the following CSS selector:
 * <p>
 * ```
 * :host ::slotted(vaadin-accordion-panel) {
 * margin-bottom: 5px;
 * }
 * ```
 * <p>
 * See [ThemableMixin – how to apply styles for shadow parts](https://github.com/vaadin/vaadin-themable-mixin/wiki)
 */
@NpmPackage(
        name = "@vaadin/vaadin",
        version = Vaadin.VERSION
)
@Import(
        symbols = "AccordionElement",
        module = "@vaadin/vaadin-accordion/src/vaadin-accordion.js"
)
public interface AccordionElement extends HTMLElement, ElementMixin, ThemableMixin {
    /**
     * The index of currently opened panel. First panel is opened by
     * default. Only one panel can be opened at the same time.
     * Setting null or undefined closes all the accordion panels.
     */
    @JSProperty
    double getOpened();

    /**
     * The index of currently opened panel. First panel is opened by
     * default. Only one panel can be opened at the same time.
     * Setting null or undefined closes all the accordion panels.
     */
    @JSProperty
    void setOpened(double opened);

    /**
     * The list of `<vaadin-accordion-panel>` child elements.
     * It is populated from the elements passed to the light DOM,
     * and updated dynamically when adding or removing panels.
     */
    @Nullable
    @JSProperty
    Array<AccordionPanelElement> getItems();
}
