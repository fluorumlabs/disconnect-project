package js.lang.external.vaadin.vaadin_combo_box;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

@NpmPackage(
    name = "@vaadin/vaadin-combo-box",
    version = "^5.3.0-alpha4"
)
@Import(
    module = "@vaadin/vaadin-combo-box/src/vaadin-combo-box-data-provider-mixin.js"
)
public interface ComboBoxDataProviderMixin extends Any {
  /**
   * Number of items fetched at a time from the dataprovider.
   *
   */
  @JSProperty("pageSize")
  double getPageSize();

  /**
   * Number of items fetched at a time from the dataprovider.
   *
   */
  @JSProperty("pageSize")
  void setPageSize(double value);

  /**
   * Total number of items.
   *
   */
  @JSProperty("size")
  double getSize();

  /**
   * Total number of items.
   *
   */
  @JSProperty("size")
  void setSize(double value);

  /**
   * Function that provides items lazily. Receives arguments <code>params</code>, <code>callback</code>
   *
   * <code>params.page</code> Requested page index
   *
   * <code>params.pageSize</code> Current page size
   *
   * <code>params.filter</code> Currently applied filter
   *
   * <code>callback(items, size)</code> Callback function with arguments:
   *
   * <ul>
   * <li><code>items</code> Current page of items</li>
   * <li><code>size</code> Total number of items.</li>
   * </ul>
   */
  @JSProperty("dataProvider")
  @Nullable
  ComboBoxDataProvider getDataProvider();

  /**
   * Function that provides items lazily. Receives arguments <code>params</code>, <code>callback</code>
   *
   * <code>params.page</code> Requested page index
   *
   * <code>params.pageSize</code> Current page size
   *
   * <code>params.filter</code> Currently applied filter
   *
   * <code>callback(items, size)</code> Callback function with arguments:
   *
   * <ul>
   * <li><code>items</code> Current page of items</li>
   * <li><code>size</code> Total number of items.</li>
   * </ul>
   */
  @JSProperty("dataProvider")
  void setDataProvider(@Nullable ComboBoxDataProvider value);

  void ready();

  /**
   * Clears the cached pages and reloads data from dataprovider when needed.
   *
   */
  void clearCache();
}
