package js.lang.external.vaadin.vaadin_grid_pro;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import org.teavm.jso.JSProperty;

@NpmPackage(
    name = "@vaadin/vaadin-grid-pro",
    version = "^2.2.0-alpha3"
)
@Import(
    module = "@vaadin/vaadin-grid-pro/src/vaadin-grid-pro-inline-editing-mixin.js"
)
public interface InlineEditingMixin extends Any {
  /**
   * When true, pressing Enter while in cell edit mode
   * will move focus to the editable cell in the next row
   * (Shift + Enter - same, but for previous row).
   *
   */
  @JSProperty("enterNextRow")
  boolean getEnterNextRow();

  /**
   * When true, pressing Enter while in cell edit mode
   * will move focus to the editable cell in the next row
   * (Shift + Enter - same, but for previous row).
   *
   */
  @JSProperty("enterNextRow")
  void setEnterNextRow(boolean value);

  /**
   * When true, after moving to next or previous editable cell using
   * Tab / Shift+Tab, it will be focused without edit mode.
   *
   * When <code>enterNextRow</code> is true, pressing Enter will also
   * preserve edit mode, otherwise, it will have no effect.
   *
   */
  @JSProperty("singleCellEdit")
  boolean getSingleCellEdit();

  /**
   * When true, after moving to next or previous editable cell using
   * Tab / Shift+Tab, it will be focused without edit mode.
   *
   * When <code>enterNextRow</code> is true, pressing Enter will also
   * preserve edit mode, otherwise, it will have no effect.
   *
   */
  @JSProperty("singleCellEdit")
  void setSingleCellEdit(boolean value);

  void ready();
}
