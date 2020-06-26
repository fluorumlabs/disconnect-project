package js.lang.external.vaadin.vaadin_grid;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown /* GridItem [ ] */;
import js.lang.Unknown /* GridItem | unknown */;
import js.lang.Unknown /* unknown */;
import org.teavm.jso.JSIndexer;
import org.teavm.jso.JSProperty;

@NpmPackage(
    name = "@vaadin/vaadin-grid",
    version = "^5.7.0-alpha4"
)
@Import(
    module = "@vaadin/vaadin-grid/src/vaadin-grid-data-provider-mixin.js"
)
public interface DataProviderMixin extends Any {
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
   * Function that provides items lazily. Receives arguments <code>params</code>, <code>callback</code>
   *
   * <code>params.page</code> Requested page index
   *
   * <code>params.pageSize</code> Current page size
   *
   * <code>params.filters</code> Currently applied filters
   *
   * <code>params.sortOrders</code> Currently applied sorting orders
   *
   * <code>params.parentItem</code> When tree is used, and sublevel items
   * are requested, reference to parent item of the requested sublevel.
   * Otherwise <code>undefined</code>.
   *
   * <code>callback(items, size)</code> Callback function with arguments:
   *
   * <ul>
   * <li><code>items</code> Current page of items</li>
   * <li><code>size</code> Total number of items. When tree sublevel items
   * are requested, total number of items in the requested sublevel.
   * Optional when tree is not used, required for tree.</li>
   * </ul>
   */
  @JSProperty("dataProvider")
  @Nullable
  GridDataProvider getDataProvider();

  /**
   * Function that provides items lazily. Receives arguments <code>params</code>, <code>callback</code>
   *
   * <code>params.page</code> Requested page index
   *
   * <code>params.pageSize</code> Current page size
   *
   * <code>params.filters</code> Currently applied filters
   *
   * <code>params.sortOrders</code> Currently applied sorting orders
   *
   * <code>params.parentItem</code> When tree is used, and sublevel items
   * are requested, reference to parent item of the requested sublevel.
   * Otherwise <code>undefined</code>.
   *
   * <code>callback(items, size)</code> Callback function with arguments:
   *
   * <ul>
   * <li><code>items</code> Current page of items</li>
   * <li><code>size</code> Total number of items. When tree sublevel items
   * are requested, total number of items in the requested sublevel.
   * Optional when tree is not used, required for tree.</li>
   * </ul>
   */
  @JSProperty("dataProvider")
  void setDataProvider(@Nullable GridDataProvider value);

  /**
   * <code>true</code> while data is being requested from the data provider.
   *
   */
  @JSProperty("loading")
  boolean getLoading();

  /**
   * Path to an item sub-property that identifies the item.
   *
   */
  @JSProperty("itemIdPath")
  @Nullable
  String getItemIdPath();

  /**
   * Path to an item sub-property that identifies the item.
   *
   */
  @JSProperty("itemIdPath")
  void setItemIdPath(@Nullable String value);

  /**
   * An array that contains the expanded items.
   *
   */
  @JSProperty("expandedItems")
  Unknown /* GridItem [ ] */ getExpandedItems();

  /**
   * An array that contains the expanded items.
   *
   */
  @JSProperty("expandedItems")
  void setExpandedItems(ExpandedItems[] value);

  /**
   * An array that contains the expanded items.
   *
   */
  @JSProperty("expandedItems")
  void setExpandedItems(String[] value);

  /**
   * Returns a value that identifies the item. Uses <code>itemIdPath</code> if available.
   * Can be customized by overriding.
   *
   */
  Unknown /* GridItem | unknown */ getItemId(GetItemIdItem item);

  /**
   * Returns a value that identifies the item. Uses <code>itemIdPath</code> if available.
   * Can be customized by overriding.
   *
   */
  Unknown /* GridItem | unknown */ getItemId(String item);

  /**
   * Expands the given item tree.
   *
   */
  void expandItem(ExpandItemItem item);

  /**
   * Expands the given item tree.
   *
   */
  void expandItem(String item);

  /**
   * Collapses the given item tree.
   *
   */
  void collapseItem(CollapseItemItem item);

  /**
   * Collapses the given item tree.
   *
   */
  void collapseItem(String item);

  /**
   * Clears the cached pages and reloads data from dataprovider when needed.
   *
   */
  void clearCache();

  interface ExpandedItems extends Any {
    @JSIndexer
    Unknown /* unknown */ get(String key);

    @JSIndexer
    void set(String key, Unknown /* unknown */ value);

    class Builder {
      private final ExpandedItems object = Any.empty();

      public ExpandedItems build() {
        return object;
      }

      public ExpandedItems.Builder set(String key, Unknown /* unknown */ value) {
        object.set(key, value);
        return this;
      }
    }
  }

  interface GetItemIdResult extends Any {
    @JSIndexer
    Unknown /* unknown */ get(String key);

    @JSIndexer
    void set(String key, Unknown /* unknown */ value);

    class Builder {
      private final GetItemIdResult object = Any.empty();

      public GetItemIdResult build() {
        return object;
      }

      public GetItemIdResult.Builder set(String key, Unknown /* unknown */ value) {
        object.set(key, value);
        return this;
      }
    }
  }

  interface GetItemIdItem extends Any {
    @JSIndexer
    Unknown /* unknown */ get(String key);

    @JSIndexer
    void set(String key, Unknown /* unknown */ value);

    class Builder {
      private final GetItemIdItem object = Any.empty();

      public GetItemIdItem build() {
        return object;
      }

      public GetItemIdItem.Builder set(String key, Unknown /* unknown */ value) {
        object.set(key, value);
        return this;
      }
    }
  }

  interface ExpandItemItem extends Any {
    @JSIndexer
    Unknown /* unknown */ get(String key);

    @JSIndexer
    void set(String key, Unknown /* unknown */ value);

    class Builder {
      private final ExpandItemItem object = Any.empty();

      public ExpandItemItem build() {
        return object;
      }

      public ExpandItemItem.Builder set(String key, Unknown /* unknown */ value) {
        object.set(key, value);
        return this;
      }
    }
  }

  interface CollapseItemItem extends Any {
    @JSIndexer
    Unknown /* unknown */ get(String key);

    @JSIndexer
    void set(String key, Unknown /* unknown */ value);

    class Builder {
      private final CollapseItemItem object = Any.empty();

      public CollapseItemItem build() {
        return object;
      }

      public CollapseItemItem.Builder set(String key, Unknown /* unknown */ value) {
        object.set(key, value);
        return this;
      }
    }
  }
}
