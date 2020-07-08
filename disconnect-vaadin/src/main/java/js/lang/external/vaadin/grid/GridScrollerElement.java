package js.lang.external.vaadin.grid;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.web.dom.HTMLElement;

/**
 * This Element is used internally by vaadin-grid.
 *
 * <strong>Mixins:</strong> LegacyElementMixin
 */
@NpmPackage(name = "@vaadin/vaadin-grid", version = "^5.7.0-alpha4")
@Import(module = "@vaadin/vaadin-grid/src/vaadin-grid-scroller.js")
public interface GridScrollerElement extends HTMLElement {

    // !wca! assignParentResizable: (parentResizable: any): void

    // !wca! notifyResize: (): void

    // !wca! resizerShouldNotify: (element: HTMLElement | null): boolean

    // !wca! stopResizeNotificationsFor: (target: any): void

    // !wca! toggleScrollListener: (yes: boolean): void

    // !wca! get scrollTarget: HTMLElement | null

    // !wca! set scrollTarget: HTMLElement | null

    // !wca! get size: number

    // !wca! set size: number
}
