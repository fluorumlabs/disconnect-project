package js.lang.external.vaadin.vaadin_grid;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown /* GridEventContext | object | null */;
import js.web.dom.Event;

@NpmPackage(
    name = "@vaadin/vaadin-grid",
    version = "^5.7.0-alpha4"
)
@Import(
    module = "@vaadin/vaadin-grid/src/vaadin-grid-event-context-mixin.js"
)
public interface EventContextMixin extends Any {
  /**
   * Returns an object with context information about the event target:
   *
   * <ul>
   * <li><code>item</code>: the data object corresponding to the targeted row (not specified when targeting header or footer)</li>
   * <li><code>column</code>: the column element corresponding to the targeted cell (not specified when targeting row details)</li>
   * <li><code>section</code>: whether the event targeted the body, header, footer or details of the grid</li>
   * </ul>
   * These additional properties are included when <code>item</code> is specified:
   *
   * <ul>
   * <li><code>index</code>: the index of the item</li>
   * <li><code>selected</code>: the selected state of the item</li>
   * <li><code>detailsOpened</code>: whether the row details are open for the item</li>
   * <li><code>expanded</code>: the expanded state of the tree toggle</li>
   * <li><code>level</code>: the tree hierarchy level</li>
   * </ul>
   * The returned object is populated only when a grid cell, header, footer or row details is found in <code>event.composedPath()</code>.
   * This means mostly mouse and keyboard events. If such a grid part is not found in the path, an empty object is returned.
   * This may be the case eg. if the event is fired on the <code>&lt;vaadin-grid&gt;</code> element and not any deeper in the DOM, or if
   * the event targets the empty part of the grid body.
   *
   */
  @Nullable
  Unknown /* GridEventContext | object | null */ getEventContext(Event event);
}
