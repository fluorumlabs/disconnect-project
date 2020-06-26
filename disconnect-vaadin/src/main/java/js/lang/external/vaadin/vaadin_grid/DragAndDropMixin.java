package js.lang.external.vaadin.vaadin_grid;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

@NpmPackage(
    name = "@vaadin/vaadin-grid",
    version = "^5.7.0-alpha4"
)
@Import(
    module = "@vaadin/vaadin-grid/src/vaadin-grid-drag-and-drop-mixin.js"
)
public interface DragAndDropMixin extends Any {
  /**
   * Defines the locations within the Grid row where an element can be dropped.
   *
   * Possible values are:
   *
   * <ul>
   * <li><code>between</code>: The drop event can happen between Grid rows.</li>
   * <li><code>on-top</code>: The drop event can happen on top of Grid rows.</li>
   * <li><code>on-top-or-between</code>: The drop event can happen either on top of or between Grid rows.</li>
   * <li><code>on-grid</code>: The drop event will not happen on any specific row, it will show the drop target outline around the whole grid.</li>
   * </ul>
   */
  @JSProperty("dropMode")
  @Nullable
  GridDropMode getDropMode();

  /**
   * Defines the locations within the Grid row where an element can be dropped.
   *
   * Possible values are:
   *
   * <ul>
   * <li><code>between</code>: The drop event can happen between Grid rows.</li>
   * <li><code>on-top</code>: The drop event can happen on top of Grid rows.</li>
   * <li><code>on-top-or-between</code>: The drop event can happen either on top of or between Grid rows.</li>
   * <li><code>on-grid</code>: The drop event will not happen on any specific row, it will show the drop target outline around the whole grid.</li>
   * </ul>
   */
  @JSProperty("dropMode")
  void setDropMode(@Nullable GridDropMode value);

  /**
   * Marks the grid's rows to be available for dragging.
   *
   */
  @JSProperty("rowsDraggable")
  boolean getRowsDraggable();

  /**
   * Marks the grid's rows to be available for dragging.
   *
   */
  @JSProperty("rowsDraggable")
  void setRowsDraggable(boolean value);

  /**
   * A function that filters dragging of specific grid rows. The return value should be false
   * if dragging of the row should be disabled.
   *
   * Receives one argument:
   *
   * <ul>
   * <li><code>model</code> The object with the properties related with
   * the rendered item, contains:
   * <ul>
   * <li><code>model.index</code> The index of the item.</li>
   * <li><code>model.item</code> The item.</li>
   * <li><code>model.expanded</code> Sublevel toggle state.</li>
   * <li><code>model.level</code> Level of the tree represented with a horizontal offset of the toggle button.</li>
   * <li><code>model.selected</code> Selected state.</li>
   * </ul>
   * </li>
   * </ul>
   */
  @JSProperty("dragFilter")
  @Nullable
  GridDragAndDropFilter getDragFilter();

  /**
   * A function that filters dragging of specific grid rows. The return value should be false
   * if dragging of the row should be disabled.
   *
   * Receives one argument:
   *
   * <ul>
   * <li><code>model</code> The object with the properties related with
   * the rendered item, contains:
   * <ul>
   * <li><code>model.index</code> The index of the item.</li>
   * <li><code>model.item</code> The item.</li>
   * <li><code>model.expanded</code> Sublevel toggle state.</li>
   * <li><code>model.level</code> Level of the tree represented with a horizontal offset of the toggle button.</li>
   * <li><code>model.selected</code> Selected state.</li>
   * </ul>
   * </li>
   * </ul>
   */
  @JSProperty("dragFilter")
  void setDragFilter(@Nullable GridDragAndDropFilter value);

  /**
   * A function that filters dropping on specific grid rows. The return value should be false
   * if dropping on the row should be disabled.
   *
   * Receives one argument:
   *
   * <ul>
   * <li><code>model</code> The object with the properties related with
   * the rendered item, contains:
   * <ul>
   * <li><code>model.index</code> The index of the item.</li>
   * <li><code>model.item</code> The item.</li>
   * <li><code>model.expanded</code> Sublevel toggle state.</li>
   * <li><code>model.level</code> Level of the tree represented with a horizontal offset of the toggle button.</li>
   * <li><code>model.selected</code> Selected state.</li>
   * </ul>
   * </li>
   * </ul>
   */
  @JSProperty("dropFilter")
  @Nullable
  GridDragAndDropFilter getDropFilter();

  /**
   * A function that filters dropping on specific grid rows. The return value should be false
   * if dropping on the row should be disabled.
   *
   * Receives one argument:
   *
   * <ul>
   * <li><code>model</code> The object with the properties related with
   * the rendered item, contains:
   * <ul>
   * <li><code>model.index</code> The index of the item.</li>
   * <li><code>model.item</code> The item.</li>
   * <li><code>model.expanded</code> Sublevel toggle state.</li>
   * <li><code>model.level</code> Level of the tree represented with a horizontal offset of the toggle button.</li>
   * <li><code>model.selected</code> Selected state.</li>
   * </ul>
   * </li>
   * </ul>
   */
  @JSProperty("dropFilter")
  void setDropFilter(@Nullable GridDragAndDropFilter value);

  void ready();

  /**
   * Runs the <code>dragFilter</code> and <code>dropFilter</code> hooks for the visible cells.
   * If the filter depends on varying conditions, you may need to
   * call this function manually in order to update the draggability when
   * the conditions change.
   *
   */
  void filterDragAndDrop();
}
