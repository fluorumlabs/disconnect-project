package js.lang.external.vaadin.vaadin_list_mixin;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import org.teavm.jso.JSProperty;

@NpmPackage(
    name = "@vaadin/vaadin-list-mixin",
    version = "^2.5.0"
)
@Import(
    module = "@vaadin/vaadin-list-mixin/vaadin-multi-select-list-mixin.js"
)
public interface MultiSelectListMixin extends ListMixin {
  /**
   * Specifies that multiple options can be selected at once.
   *
   */
  @JSProperty("multiple")
  boolean getMultiple();

  /**
   * Specifies that multiple options can be selected at once.
   *
   */
  @JSProperty("multiple")
  void setMultiple(boolean value);

  /**
   * Array of indexes of the items selected in the items array
   * Note: Not updated when used in single selection mode.
   *
   */
  @JSProperty("selectedValues")
  @Nullable
  String[] getSelectedValues();

  /**
   * Array of indexes of the items selected in the items array
   * Note: Not updated when used in single selection mode.
   *
   */
  @JSProperty("selectedValues")
  void setSelectedValues(String[] value);

  void ready();
}
