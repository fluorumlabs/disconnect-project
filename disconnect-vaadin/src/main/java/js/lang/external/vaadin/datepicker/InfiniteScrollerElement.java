package js.lang.external.vaadin.datepicker;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.web.dom.HTMLElement;

/**
 * <strong>Mixins:</strong> ElementMixin
 */
@NpmPackage(name = "@vaadin/vaadin-date-picker", version = "^4.3.0-alpha3")
@Import(module = "@vaadin/vaadin-date-picker/src/vaadin-infinite-scroller.js")
public interface InfiniteScrollerElement extends HTMLElement {

    // !wca! get active: boolean

    // !wca! set active: boolean

    // !wca! get bufferSize: number

    // !wca! set bufferSize: number

    // !wca! get itemHeight: number
}
